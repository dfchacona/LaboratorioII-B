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

public class Queso implements Pizza{
    String masa; 
    String salsa; 
    ArrayList <String> ingredientes;
    
    public Queso() {
        this.masa = ("Corteza regular");
        this.salsa = ("Tomate");
        this.ingredientes= new ArrayList();
        ingredientes.add("Queso mozzarella fresco");
        ingredientes.add("Queso parmesano ");
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