/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombres;
        String apellidos;
        String identificacion;
        int edad;
        int asignaturas;
        double costoAsignatura;
        int creditos;
        double costoCreditos;
        int opcion;
        System.out.print("Ingrese 1 para ingresar un estudiante a distancia\n"
                + "Ingrese 2 para ingresar un estudiante presencial\n>> ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                entrada.nextLine();
                System.out.println("Ingrese nombres");
                nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese edad");
                edad = entrada.nextInt();
                System.out.println("Ingrese número de asignaturas");
                asignaturas = entrada.nextInt();
                System.out.println("Ingrese costo asignatura");
                costoAsignatura = entrada.nextDouble();
                EstudianteDistancia estudianteD = new EstudianteDistancia();

                estudianteD.establecerNombresEstudiante(nombres);
                estudianteD.establecerApellidoEstudiante(apellidos);
                estudianteD.establecerEdadEstudiante(edad);
                estudianteD.establecerIdentificacionEstudiante(identificacion);
                estudianteD.establecerNumeroAsginaturas(asignaturas);
                estudianteD.establecerCostoAsignatura(costoAsignatura);
                estudianteD.calcularMatriculaDistancia();

                System.out.printf("%s\n", estudianteD);
                break;
                
            case 2:
                entrada.nextLine();
                System.out.println("Ingrese nombres");
                nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese edad");
                edad = entrada.nextInt();
                System.out.println("Ingrese número de creditos");
                creditos = entrada.nextInt();
                System.out.println("Ingrese costo de los creditos");
                costoCreditos = entrada.nextDouble();
                EstudiantePresencial estudianteP = new EstudiantePresencial();

                estudianteP.establecerNombresEstudiante(nombres);
                estudianteP.establecerApellidoEstudiante(apellidos);
                estudianteP.establecerEdadEstudiante(edad);
                estudianteP.establecerIdentificacionEstudiante(identificacion);
                estudianteP.establecerNumeroCreditos(creditos);
                estudianteP.establecerCostoCredito(costoCreditos);
                estudianteP.calcularMatriculaPresencial();

                System.out.printf("%s\n", estudianteP);
                break;
            default:
                System.err.println("Error, la opcion ingresada no existe.");
        }

    }
}
