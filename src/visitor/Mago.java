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
public class Mago implements IPersonaje {
    
    private int nivelMagia = 0;
    private String arma = "";
    private String hechizo = "";
    
    public Mago() {
    }
    
    public int getNivelMagia() {
        return nivelMagia;
    }
    
    public void setNivelMagia(int nivelMagia) {
        this.nivelMagia = nivelMagia;
    }
    
    public String getArma() {
        return arma;
    }
    
    public void setArma(String arma) {
        this.arma = arma;
    }
    
    public String getHechizo() {
        return hechizo;
    }
    
    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }
    
    @Override
    public void accept(IVisitor visitor) {
        
        visitor.visit(this);
        
    }

    @Override
    public String toString() {
        return "Mago{" + "nivelMagia=" + nivelMagia + ", arma=" + arma + ", hechizo=" + hechizo + '}';
    }
    
}
