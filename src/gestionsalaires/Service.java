/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionsalaires;

import java.util.ArrayList;

/**
 *
 * @author CCHELLAL
 */
public class Service {
    private ArrayList <Employe> listEmploye;

    public Service(){
    this.listEmploye = new ArrayList<Employe>();
        }
        
    public void ajouterEmployes(Employe a){
        listEmploye.add(a);
    }

    public int calculeSalaire(){
        int total=0;
        for (Employe a: listEmploye){
            total=total+a.getSalaire();
        }
        return total;
        }

public void listerEmploye(){
    for (Employe a: listEmploye){
        System.out.println(a); 
        }
}
}
    

