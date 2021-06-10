/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

public class Ejecutor1 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad, numAsignaturas, costoAsig);
        
        estDistancia.calcularMatriculaDistancia();
        
        
        // Creación de un objeto de tipo EstudiantePesencial
        String nombre2 = "Renny";
        String apellido2 = "Poma";
        String identificacion2 = "110520";
        int edad2 = 22;
        int numCreditos = 50;
        double costoCreditos = 30.5;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre2,
                apellido2, identificacion2, edad2, numCreditos,
                costoCreditos);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estDistancia);
        
        System.out.println(estPresencial);
    }
}
