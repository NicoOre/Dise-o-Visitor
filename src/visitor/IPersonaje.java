/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author GAMER PC
 */
public interface IPersonaje {
    
    public void accept(IVisitor visitor);
    
}
