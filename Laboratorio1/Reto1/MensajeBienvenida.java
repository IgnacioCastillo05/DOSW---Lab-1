package Laboratorio1.Reto1;

import java.util.*;
import java.util.stream.Collectors;

public class MensajeBienvenida {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Ignacio Castillo", 19, "ignacio.castillo-r@mail.escuelaing.edu.co", 6),
            new Estudiante("Juan Diego Rodriguez", 20, "juan.rvelasquez@mail.escuelaing.edu.co", 6)
        );
        
        String mensaje = estudiantes.stream()
            .map(e -> e.getNombre() + " estudiante de la escuela de " + 
                     e.getSemestre() + " semestre de " + e.getEdad() + " años")
            .collect(Collectors.joining(" y "));
            
        String correos = estudiantes.stream()
            .map(Estudiante::getCorreo)
            .collect(Collectors.joining(" y "));
            
        System.out.println("¡Hola Bienvenidos! Nosotros somos la pareja conformada por " + 
                          mensaje + ", nuestros correos institucionales son " + correos);
    }
}