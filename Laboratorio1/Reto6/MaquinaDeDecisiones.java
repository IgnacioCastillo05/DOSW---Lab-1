package Laboratorio1.Reto6;

import java.util.*;

public class MaquinaDeDecisiones {
    
    private static Map<String, Runnable> comandos = new HashMap<>();

    static {
        // Comandos Estudiante A
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
    }

    public static void ejecutarComando(String comando) {
        switch (comando.toUpperCase()) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
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
