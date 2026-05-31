package gestion;

import equipements.base.Equipement;
import equipements.base.Ordinateur;
import equipements.base.Serveur;
import equipements.reseau.Routeur;
import equipements.reseau.Switch;

public class ParcInformatique {
    private Equipement[] inventaire;
    private int nbEq;

    public ParcInformatique(int taille){
        this.inventaire = new Equipement[taille];
        this.nbEq = 0;
    }
    public void ajouterEquipement(Equipement e){
        this.inventaire[nbEq] = e;
        nbEq++;
    }
    public void afficherInventaireComplet(){
        for (int i = 0; i < nbEq; i++){
            System.out.println(inventaire[i]);
        }
    }
    public double calculerValeurTotaleParc(){
        double somme = 0;
        for (int i = 0; i < nbEq; i++){
            somme += inventaire[i].calculerValeurActuelle();
        }
        return somme;
        /*System.out.println("Valeur actuelle : " + somme);
        somme = 0;
        for (int i = 0; i < nbEq; i++){
            somme += inventaire[i].getPrixAchat();
        }
        System.out.println("Valeur d achat : " + somme);
         */
    }
    public void compterParType(){
        int nbOrdi = 0;
        int nbServeur = 0;
        int nbSwitch = 0;
        int nbRouteur = 0;
        for (int i = 0; i < nbEq; i++){
            if(inventaire[i] instanceof Ordinateur)
                nbOrdi++;
            else if(inventaire[i] instanceof Serveur) {
                ((Serveur) inventaire[i]).demarrer();
                nbServeur++;
            }
            else if(inventaire[i] instanceof Switch)
                nbSwitch++;
            else if(inventaire[i] instanceof Routeur)
                nbRouteur++;
        }
    }

}
