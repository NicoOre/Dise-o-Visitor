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
public class EquiparArma implements IVisitor {
    
    @Override
    public void visit(Mago m) {
        m.setArma("Catalizador");
    }
    
    @Override
    public void visit(Guerrero g) {
        g.setArma(g.getArma());
    }
    
    @Override
    public void visit(List<IPersonaje> elementList) {
        for (IPersonaje p : elementList) {
            p.accept(this);
        }
    }
    
}
