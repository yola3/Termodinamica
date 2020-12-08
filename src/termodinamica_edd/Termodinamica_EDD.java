/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termodinamica_edd;

import java.util.Scanner;

public class Termodinamica_EDD {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // instanciacion 
        int opc; // se declara el tipo de dato de la variable 
        do { // secuencia iterativa
            System.out.println("Conversiones de Termodinamica");// mensaje 
            System.out.println("1.-Celsius a Kelvin"); 
            System.out.println("2.-Kelvin a celsius");
            System.out.println("3.-Celsius a Fahrenheit");
            System.out.println("4.-Fahrenheit a Celsius");
            System.out.println("5.-Salir");
            System.out.println("Elige la conversion de unidad que desea convertir:");
            opc = leer.nextInt(); // se lee la variable 

            switch (opc) { // para crear un menu 
                case 1:
                    float cels; // se declara el tipo de variable
                    float kelv; // se declara el tipo de variable a utilizar
                    System.out.println("Celsius a Kelvin");
                    System.out.println("Introduzca el valor del grado Celsius a covertir:");
                    cels = leer.nextFloat(); // se lee la variable 
                    kelv = cels + 273; // formula para la conversion dl grado
                    System.out.println("El valor del grado Kelvin es:" + kelv + " K");
                    break;
                case 2:
                    float celsius;
                    float kelvin;
                    System.out.println("Kelvin a celsius");
                    System.out.println("Ingrese el valor del grado Kelvin a covertir:");
                    kelvin = leer.nextFloat();
                    celsius = kelvin - 273; // formula a utilizar para la conversion 
                    System.out.println("El valor del grado Celsius es:" + celsius + " °C"); // se imprime el resultado que arrojara la formula 
                    break; // se cierra el case
                case 3: // opcion 3
                    float G_celsius; // se declara el tipo de la variable 
                    double Fahrenheit;// se declara el tipo de la variable 
                    System.out.println("Celsius a Fahrenheit");
                    System.out.println("Ingrese el valor del grado Celsius a covertir:");
                    G_celsius = leer.nextFloat();
                    Fahrenheit = 1.8 * G_celsius + 32;
                    System.out.println("El valor del grado Fahrenheit es:" + Fahrenheit + " °F");
                    break;
                case 4:// opcion 4
                    float F;//se declara el tipo de la variable 
                    float Celsius;// se declara el tipo de la variable 
                    System.out.println("Fahrenheit a Celsius");
                    System.out.println("Ingrese el valor del grado Fahrenheit a covertir:");
                    F = leer.nextFloat();
                    Celsius = (F - 32) * 5 / 9; // formula para calcular el grado
                    System.out.println("El valor en Celsius es:" + Celsius + " °C");// se imprime el valor del grado
                    break;
                case 5:// opcion 5
                    System.out.println("");
                    break;

            }
        } while (opc != 5); // secuencia iterativa
    }

}
