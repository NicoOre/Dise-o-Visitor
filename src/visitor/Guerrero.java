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
public class Guerrero implements IPersonaje{
    
    private String arma = "";
    
    public Guerrero(){  
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    

    @Override
    public void accept(IVisitor visitor) {
        if(visitor.getClass().equals(EquiparArma.class)){
            visitor.visit(this);
        }
    }

    @Override
    public String toString() {
        return "Guerrero{" + "arma=" + arma + '}';
    }
    
}
