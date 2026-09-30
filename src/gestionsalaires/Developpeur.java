/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employe{
    protected String language;

    public Developpeur (String nom, String prenom, int anciennete, String language) {
        super(nom, prenom, anciennete,"developpeur");
        this.language=language;
    }
    
    public int getprime(){
        int prime=0;
        if (language=="python")
            prime=prime+70;
        else if (language=="java")
            prime=prime=50;
        else if (language=="php")
            prime=prime+45;
        return prime;
    }
    public int getSalaire(){
        return (getprime()+1900+anciennete*100);
    }
    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" depuis "+anciennete+" ans, connais " + language + " et gagne " +getSalaire()+" €.";
    }
}
   
   

