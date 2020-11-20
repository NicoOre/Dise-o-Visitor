/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER PC
 */
public class Main {

    public static void main(String[] args) {

        Guerrero g1 = new Guerrero();
        Guerrero g2 = new Guerrero();

        Mago m1 = new Mago();
        Mago m2 = new Mago();

        g1.setArma("sd");
        
        m1.setNivelMagia(3);
        m2.setNivelMagia(7);
        

        List<IPersonaje> personajes = new ArrayList<IPersonaje>();

        personajes.add(g1);
        personajes.add(g2);
        personajes.add(m1);
        personajes.add(m2);

        IVisitor visitorArma = new EquiparArma();
        visitorArma.visit(personajes);

        IVisitor visitorHechizo = new EquiparHechizo();
        visitorHechizo.visit(personajes);

        /*System.out.println("Arma del guerrero g1: " + g1.getArma());
        System.out.println("Arma del guerrero g2: " + g2.getArma());
        System.out.println("Arma del mago m1: " + m1.getArma());
        System.out.println("Arma del mago m2: " + m2.getArma() + "\n");
        System.out.println("Conjuro del mago m1: " + m1.getHechizo());
        System.out.println("Conjuro del mago m2: " + m2.getHechizo()+ "\n");*/
        
        for (IPersonaje personaje : personajes) {
            System.out.println(personaje.toString());
        }
    }

}
