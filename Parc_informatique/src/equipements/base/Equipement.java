package equipements.base;

import java.time.Year;

public class Equipement {
    private String marque;
    private String modele;
    private String numeroSerie;
    private double prixAchat;
    private int anneeAchat;
    private static int anneeCourante = Year.now().getValue();

    public Equipement(String marque, String modele, String numeroSerie, double prixAchat, int anneeAchat){
        this.marque = marque;
        this.modele = modele;
        this.numeroSerie = numeroSerie;
        this.prixAchat = prixAchat;

        if (anneeAchat >= 2000 && anneeAchat <= anneeCourante)
            this.anneeAchat = anneeAchat;
        else this.anneeAchat = anneeCourante;

        System.out.println("Equipement constructor");
    }

    public String getMarque(){
        return marque;
    }
    public String getModele(){
        return modele;
    }
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public double getPrixAchat(){
        return prixAchat;
    }

    public int getAnneeAchat(){
        return anneeAchat;
    }

    public int calculerAge(){
        return anneeCourante - anneeAchat;
    }

    @Override
    public String toString() {
        return "Equipement [" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", prixAchat=" + prixAchat +
                ", anneeAchat=" + anneeAchat +
                ']';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if ( obj == null || getClass() != obj.getClass())
            return false;

        Equipement equipement = (Equipement) obj;
        return numeroSerie.equals(equipement.numeroSerie);
    }

    @Override
    public int hashCode(){
        return numeroSerie.hashCode();
    }

    public final String genererCodeInventaire () {
        return "EQ-" + anneeAchat + "-" + numeroSerie;
    }

    public double calculerValeurActuelle(){
        int age = calculerAge();
        double remise;
        double valeur = prixAchat;
        for (int i = 0; i < age; i++){
            remise = valeur * 0.2;
            valeur -= remise;
        }
        return valeur;
    }



}
