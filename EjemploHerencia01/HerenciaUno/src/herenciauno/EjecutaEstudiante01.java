/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciauno;

import java.util.Locale;
import java.util.Scanner;

public class EjecutaEstudiante01 {

    public static void main(String[] args) {

        // a.  Declarar Variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        

        // Ingresar información para un objeto EstudiantePresencial
        System.out.println("Ingrese datos para estudiante presencial");
        
        System.out.println("Ingrese el nombre del estudiante");
        nombresEst = entrada.nextLine();

        System.out.println("Ingrese el apellido del estudiante");
        apellidosEst = entrada.nextLine();

        System.out.println("Ingrese la identificación del estudiante");
        identificacionEst = entrada.nextLine();

        System.out.println("Ingrese la edad del estudiante");
        edadEst = entrada.nextInt();

        // Declarar,crear e iniciar objeto tipo EstudiantePresencial
        EstudiantePresencial estudianteP = new EstudiantePresencial();
        // Solicitar ingreso de valores para variables 
        // numero de creditos, costo de cada credito
        // Solicitar numeroCreds, costoCred
        // Leer numeroCreds, costoCred
        System.out.println("Ingrese el número de créditos del "
                + "estudiante");
        numeroCreds = entrada.nextInt();

        System.out.println("Ingrese el costo de cada crédito "
                + "del estudiante");
        costoCred = entrada.nextDouble();
        
        entrada.nextLine();
        
        // se hace uso de los métodos establecer para asignar valores
        // a los datos (atributos) del objeto
        // Establecer:  
        estudianteP.establecerNombresEstudiante(nombresEst);
        estudianteP.establecerApellidoEstudiante(apellidosEst);
        estudianteP.establecerIdentificacionEstudiante(identificacionEst);
        estudianteP.establecerEdadEstudiante(edadEst);
        estudianteP.establecerNumeroCreditos(numeroCreds);
        estudianteP.establecerCostoCredito(costoCred);

        // Luego que se ha ingresado los datos, se hace uso del método
        // calcular Matricula Presencial para el objeto tipo
        // EstudiantePresencial
        // Calcular: 
        estudianteP.calcularMatriculaPresencial();

        // se hace uso de los métodos obtener del objeto para presentar
        // los valores que se necesite en pantalla
        // Imprimir:
        
        System.out.println("Datos del estudiante Presencial");
        
        System.out.printf("Nombre: %s\n",
                estudianteP.obtenerNombresEstudiante());
        System.out.printf("Apelllido: %s\n",
                estudianteP.obtenerApellidoEstudiante());
        System.out.printf("Identificación: %s\n",
                estudianteP.obtenerIdentificacionEstudiante());
        System.out.printf("Edad: %d\n",
                estudianteP.obtenerEdadEstudiante());
        System.out.printf("Matricula final $: %.2f\n",
                estudianteP.obtenerMatriculaPresencial());

        
        System.out.println("\nIngrese datos para estudiante distancia");
        // Declarar,crear e iniciar objeto tipo EstudianteDistancia
        EstudianteDistancia estudianteD = new EstudianteDistancia();

        System.out.println("Ingrese el nombre del estudiante");
        nombresEst = entrada.nextLine();

        System.out.println("Ingrese el apellido del estudiante");
        apellidosEst = entrada.nextLine();

        System.out.println("Ingrese la identificación del estudiante");
        identificacionEst = entrada.nextLine();

        System.out.println("Ingrese la edad del estudiante");
        edadEst = entrada.nextInt();

        // Solicitar ingreso de valores para variables 
        // numero de asignaturas, costo de cada asignatura 
        // Solicitar numeroAsigs, costoAsig 
        // Leer numeroAsigs, costoAsig
        System.out.println("Ingrese en el número de asignaturas del"
                + " estudiante");
        numeroAsigs = entrada.nextInt();
        System.out.println("Ingrese en el costo de cada asignaturas del"
                + " estudiante");
        costoAsig = entrada.nextDouble();

        // se hace uso de los métodos establecer para asignar valores
        // a los datos (atributos) del objeto
        // Establecer:  
        estudianteD.establecerNombresEstudiante(nombresEst);
        estudianteD.establecerApellidoEstudiante(apellidosEst);
        estudianteD.establecerIdentificacionEstudiante(identificacionEst);
        estudianteD.establecerEdadEstudiante(edadEst);
        estudianteD.establecerNumeroAsginaturas(numeroAsigs);
        estudianteD.establecerCostoAsignatura(costoAsig);

        // Luego que se ha ingresado los datos, se hace uso del método
        // calcular Matricula Distancia para el objeto tipo
        // EstudianteDistancia
        // Calcular: 
        estudianteD.calcularMatriculaDistancia();
        // se hace uso de los métodos obtener del objeto para presentar
        // los valores que se necesite en pantalla
        // Imprimir:
        System.out.println("Datos del estudiante a Distancia");
        System.out.printf("Nombre: %s\n",
                estudianteD.obtenerNombresEstudiante());
        System.out.printf("Apelllido: %s\n",
                estudianteD.obtenerApellidoEstudiante());
        System.out.printf("Identificación: %s\n",
                estudianteD.obtenerIdentificacionEstudiante());
        System.out.printf("Edad: %d\n",
                estudianteD.obtenerEdadEstudiante());
        System.out.printf("Matricula: %.2f\n",
                estudianteD.obtenerMatriculaDistancia());

    }
//    
}
