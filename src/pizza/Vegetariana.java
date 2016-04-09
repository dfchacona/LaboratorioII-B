/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.ArrayList;

/**
 *
 * @author dieguischa
 */
public class Vegetariana implements Pizza{
    String masa; 
    String salsa; 
    ArrayList <String> ingredientes;
    
    public Vegetariana() {
        this.masa = ("Regular");
        this.salsa = ("Tomate");
        this.ingredientes= new ArrayList();
        ingredientes.add("Mozzarrella");
        ingredientes.add("Cebolla picada");
        ingredientes.add("Parmesano rallado");
        ingredientes.add("Hongos en Rebanadas");
        ingredientes.add("Pimienta Roja en Rodajas");
        ingredientes.add("Aceitunas negras rebanadas");
    }
    @Override
    public void Preparar() {
        System.out.println("Utilizar masa:" +this.masa);
        System.out.println("Utilizar salsa:" +this.salsa);
        System.out.println("Utilizar ingredientes");
        for (String ingrediente : ingredientes) {
            System.out.println(ingrediente);
        }
    }

    

    @Override
    public void Hornear(int tiempo) {
        System.out.println("Hornear "+tiempo+" minutos");
    }

    @Override
    public void Cortar(int tiempo) {
        System.out.println("Cortar "+tiempo+" minutos");
    }

    @Override
    public void Empacar(int tiempo) {
       System.out.println("Empacar "+tiempo+" minutos");
    }
    
}
