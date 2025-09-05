package edu.escuelaing.bienvenida;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Estudiante ignacio = new Estudiante(
                "Ignacio Castillo",
                19,
                "ignacio.castillo-r@mail.escuelaing.edu.co",
                6
        );

        Estudiante juanDiego = new Estudiante(
                "Juan Diego Rodriguez",
                20,
                "juan.rvelasquez@mail.escuelaing.edu.co",
                6
        );

        List<Estudiante> pareja = Arrays.asList(ignacio, juanDiego);

        String mensaje = MensajeBienvenida.generar(pareja);
        System.out.println(mensaje);
    }
}
