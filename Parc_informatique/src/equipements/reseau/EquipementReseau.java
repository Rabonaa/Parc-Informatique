package equipements.reseau;

import equipements.base.Equipement;

public class EquipementReseau extends Equipement {
    private int nombrePorts;
    private int vitesseMax;
    private String adresseIP;

    public EquipementReseau(String marque, String modele, String numeroSerie,
                            double prixAchat, int anneeAchat,
                            int nombrePorts, int vitesseMax, String adresseIP){
        super(marque, modele, numeroSerie, prixAchat, anneeAchat);
        this.nombrePorts = nombrePorts;
        this.vitesseMax = vitesseMax;
        this.adresseIP = adresseIP;
    }
    public int getNombrePorts(){return nombrePorts;}
    public int getVitesseMax(){return vitesseMax;}
    public String adresseIP(){return adresseIP;}

    public void setNombrePorts(int nombrePorts){ this.nombrePorts = nombrePorts;}
    public void seVitesseMax(int vitesseMax){ this.vitesseMax = vitesseMax;}
    public void setAdresseIP(String adresseIP){ this.adresseIP = adresseIP;}

    @Override
    public String toString(){
        return super.toString() + "nombre ports = " + nombrePorts + "vitesseMax = " + vitesseMax + "Adresse IP = " + adresseIP;
    }



}
