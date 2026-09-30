package gestionsalaires;


import gestionsalaires.Employe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCHELLAL
 */
public class Administratif extends Employe{

    public Administratif( String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete,"administratif");
        
    }
    
    public int getSalaire(){
        return (1900);
    }
}
