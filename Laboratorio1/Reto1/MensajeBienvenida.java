package Laboratorio1.Reto1;

import java.util.*;
import java.util.stream.Collectors;

public class MensajeBienvenida {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Juan Pérez", 21, "juan.perez@mail.escuelaing.edu.co", 6),
            new Estudiante("Miguel Roncancio", 22, "miguel.roncancio@mail.escuelaing.edu.co", 5)
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