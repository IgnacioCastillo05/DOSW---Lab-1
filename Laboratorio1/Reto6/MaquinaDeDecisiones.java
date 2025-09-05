package Laboratorio1.Reto6;

import java.util.*;
import java.util.function.Runnable;

public class MaquinaDeDecisiones {
    
    private static Map<String, Runnable> comandos = new HashMap<>();
    
    static {
        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));
    }
    
    public static void ejecutarComando(String comando) {
        switch (comando.toUpperCase()) {
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                comandos.get(comando.toUpperCase()).run();
                break;
            default:
                System.out.println("Comando no reconocido: " + comando);
        }
    }
    
    public static void main(String[] args) {
        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("DANZAR");
    }
}