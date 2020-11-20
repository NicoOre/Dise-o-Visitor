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
public interface IVisitor {

    public void visit(Mago m);

    public void visit(Guerrero g);

    public void visit(List<IPersonaje> elementList);
}
