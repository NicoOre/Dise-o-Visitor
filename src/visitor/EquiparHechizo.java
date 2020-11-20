/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.List;

/**
 *
 * @author GAMER PC
 */
public class EquiparHechizo implements IVisitor{

    @Override
    public void visit(Mago m) {
        
        if(m.getNivelMagia() <= 5){
            m.setHechizo("Bola de fuego");
        } else {
            m.setHechizo("Rayo de hielo");
        }
    }

    @Override
    public void visit(Guerrero g) {
    }

    @Override
    public void visit(List<IPersonaje> elementList) {
        for (IPersonaje p : elementList) {
            p.accept(this);
        }
    }
    
}
