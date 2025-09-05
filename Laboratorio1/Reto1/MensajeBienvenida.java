package edu.escuelaing.bienvenida;

import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida {

    /**
     * Genera el mensaje de bienvenida usando streams, map y collect.
     */
    public static String generar(List<Estudiante> pareja) {
        if (pareja == null || pareja.isEmpty()) {
            return "¡Hola! (no hay estudiantes registrados)";
        }

        // Descripciones: "Ignacio Castillo estudiante de 6 semestre de 19 años"
        String descripciones = pareja.stream()
                .map(Estudiante::toString)
                .collect(Collectors.joining(" y "));

        // Correos: "correo1 y correo2"
        String correos = pareja.stream()
                .map(Estudiante::getCorreoInstitucional)
                .collect(Collectors.joining(" y "));

        return String.format(
            "¡Hola Bienvenidos! Nosotros somos la pareja conformada por %s, " +
            "nuestros correos institucionales son %s",
            descripciones, correos
        );
    }
}
