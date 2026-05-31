package equipements.base;

import equipements.peripheriques.Clavier;
import equipements.peripheriques.Ecran;
import equipements.peripheriques.Souris;

public class Ordinateur extends Equipement {
    private String processeur;
    private int ram;
    private int stockage;
    private String typeOS;
    private Ecran ecran;
    private Clavier clavier;
    private Souris souris;

    public Ordinateur(String marque, String modele, String numeroSerie, double prixAchat, int anneeAchat,  String processeur, int ram, int stockage, String typeOS){
        super(marque, modele, numeroSerie, prixAchat, anneeAchat);
        this.processeur = processeur;
        this.ram = ram;
        this.stockage = stockage;
        this.typeOS = typeOS;
        System.out.println("Ordinateur constructor");
    }
    public boolean verifierConfigMinimale(int ramMin, int stockageMin) {
        return this.ram >= ramMin && this.stockage >= stockageMin;
    }

    public String getProcesseur() { return processeur; }
    public int getRam() { return ram; }
    public int getStockage() { return stockage; }
    public String getTypeOS() { return typeOS; }

    public void attacherEcran(Ecran e){ this.ecran = e;}
    public void attacherClavier(Clavier c){ this.clavier = c;}
    public void attacherSouris(Souris s){ this.souris = s;}

    @Override
    public double calculerValeurActuelle(){
        int age = calculerAge();
        double remise;
        double valeur = getPrixAchat();
        for (int i = 0; i < age; i++){
            remise = valeur * 0.25;
            valeur -= remise;
        }
        return valeur;
    }
    @Override
    public String toString() {
        return super.toString() + " | Ordinateur [" +
                "processeur='" + processeur + '\'' +
                ", ram=" + ram + "Go" +
                ", stockage=" + stockage + "Go" +
                ", OS='" + typeOS + '\'' +
                ']' + "Peripheriques connectes : " + (ecran!=null ? " ecran = " + ecran : " ") +
                (clavier!=null ? " clavier = " + clavier : " ") +
                (souris!=null ? " souris = " + souris : " ");
    }
}
