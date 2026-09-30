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
public class developpeurExpert extends Developpeur{

    public developpeurExpert(String nom, String prenom, String language, int anciennete) {
        super(nom, prenom, anciennete, language);
        this.poste="developpeur expert";
    }
    @Override
    public int getSalaire(){
        return (int)(super.getSalaire()*1.1);
    }
}
