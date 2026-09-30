/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionsalaires;

/**
 *
 * @author CCHELLAL
 */
public abstract class Employe {
   protected String nom;
   protected String prenom;
   protected int anciennete;
   protected String poste;

    public Employe(String nom, String prenom, int anciennete,String poste) {
        this.poste=poste;
        this.nom = nom;
        this.anciennete = anciennete;
        this.prenom = prenom;
    }
    
    public abstract int getSalaire();
    
    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
}
