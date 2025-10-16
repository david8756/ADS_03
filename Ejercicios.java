package com.mycompany.ejercicios;
import java.util.Scanner;
public class Ejercicios {
static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
         int His;
        int edad;
        String sexo;
        int tipo;
        int urgencia = 0;
        int control = 0;
        int general = 0;
        System.out.println("Registrar numero consultas");
        dato.nextLine();
        System.out.println("Ingresar numero de historia clinica(-1 para finalizar");
        His = dato.nextInt();
        System.out.println("Ingrese edad del pasiente");
            edad = dato.nextInt();
            System.out.println("Ingrese tipo de sexo del pasiente");
            sexo = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingrese tipo de consulta(1 = urgencias, 2 = control, 3 = general);");
            tipo = dato.nextInt();
        while (His != -1) {
            
            if (tipo == 1){
                urgencia++;   
            }else if (tipo == 2){
                control++;
            }else if (tipo == 3){
                general++;
            }else {
             System.out.println("No valido");        
             
    } 
               System.out.println("Registrar numero consultas");
            dato.nextLine();
             dato.nextLine();
            System.out.println("Ingresar numero de historia clinica(-1 para finalizar");
            His = dato.nextInt();
            if(His==-1){
                break;
            }
            System.out.println("Ingrese edad del pasiente");
            edad = dato.nextInt();
            System.out.println("Ingrese tipo de sexo del pasiente");
            sexo = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingrese tipo de consulta(1 = urgencias, 2 = control, 3 = general);");
            tipo = dato.nextInt();
            
            
        }
        System.out.println("Resultados finales");
            System.out.println("Total de consultas de urgencia" + urgencia);
            System.out.println("Total de consultas de control;" + control);
            System.out.println("Total de consultas generales;" + general);
    }
}