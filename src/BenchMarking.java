import java.util.concurrent.Callable;

import javax.management.RuntimeErrorException;

import controllers.*;

import models.Results;

public class BenchMarking {

    public static Results MedirTiempo (Callable<Void> funcion){
        
        try {
        // -CALCULAR TIEMPO INICIO
            long inicio = System.nanoTime();
        // -EJECUTAR TIEMPO EJECUCION
            funcion.call();
        // -CALCULAR TIEMPO FIN
            long fin = System.nanoTime();
        // -CALCULAR TIEMPO EN EJECUCION
            double duracion = (fin - inicio)/1_000_000_000.0;
        // -DEVOLVER RESULTADOS 
            Results results = new Results(duracion);
            return results;
        
        } catch (Exception e) {

            throw new RuntimeException("Error en la funcion");
            // System.err.println("Error en la funcion");
            // return null;
        }
    }
    
}
