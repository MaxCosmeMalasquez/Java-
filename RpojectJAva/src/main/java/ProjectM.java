
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cosme
 */
import java.util.Scanner;

public class ProjectM {

    public static void main(String[] args) {
        String primera = "Ciencia";
        String segunda = "Datos";
        var car = "atributos o variables "
        var tip = "cuantitativas o cualitativas "        
        System.out.println(primera + " de " + segunda);
        System.out.println("Primer Concepto \n" + primera);
        System.out.println("Segundo Concepto " + segunda);
        System.out.println("Entender " + " " + segunda);
        System.out.print("Como representación simbólica de  " + " ")
        System.out.println(car + tip);
        System.out.println("Definición complicada de  \"" + primera + "\"");
        System.out.print("Es estudio , ");
        System.out.println("investigación e interpretación de fenómenos");
        System.out.println("Introduce tu nombre :");
        Scanner date = new Scanner(System.in);
        var usuario = date.nextLine();
        System.out.println("Introduce tu edad : ");
        Scanner info = new Scanner(System.in);
        var edad = info.nextLine();
        System.out.println("Introduce tu profesión :");
        Scanner ocu = new Scanner(System.in);
        var profesion = ocu.nextLine();
        System.out.println("Tu nombre es " + " " + usuario);
        System.out.println("Tu edad es :" + " " + edad + " años");
        System.out.println("Tu profesión es : " + profesion);
    }

}
