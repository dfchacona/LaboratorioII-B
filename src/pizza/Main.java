/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.InputMismatchException;

/**
 *
 * @author dieguischa
 */
public class Main {
    public static void main(String[] args) {
        
    java.util.Scanner lectura= new java.util.Scanner (System.in);
    int bandera=1;
    int eleccion=1; 
    Pizza p1= null;
     do{  
    do{
    try{
        System.out.println("Bienvenido a la pizzeria"
                            + "\nDigite"
                            +"\n1. Para preparar una pizza de pepperoni"
                            +"\n2. Para preparar una pizza de queso "
                            +"\n3. Para preparar una pizza vegetariana"
            + "\n0 Para terminar el programa"
                            
                                );
            eleccion = Integer.parseInt(lectura.nextLine());
            bandera=1; 
    }catch (Exception e){
        System.out.println("Ingrese una opcion valida");
        bandera=0; 
       
    }
    }while (bandera==0);
        switch (eleccion){
            case 1:{
                p1=new Pepperoni();
                break; 
            }
            
            case 2:{
                p1= new Queso();
                break;
            }
            case 3:{
                p1= new Vegetariana(); 
                break;
            }
            }
        try{
            p1.Preparar();
            p1.Hornear(15);
            p1.Cortar(10);
            p1.Empacar(15);
            p1=null; 
        }catch (NullPointerException exc){
            System.out.println("Ingrese una opcion valida");
        }
        }while (eleccion !=0);
}
}
