package equipements.reseau;

public class Routeur extends EquipementReseau{
    private int nombreInterfacesWAN;
    public Routeur(String marque, String modele, String numeroSerie,
                  double prixAchat, int anneeAchat,
                  int nombrePorts, int vitesseMax, String adresseIP, int nombreInterfacesWAN){
        super(marque, modele, numeroSerie, prixAchat, anneeAchat, nombrePorts, vitesseMax, adresseIP);
        this.nombreInterfacesWAN = nombreInterfacesWAN;
        System.out.println(this.prixAchat);
        this.appliquerRemise(20);
        System.out.println(this.prixAchat);
    }
    public int getNombreInterfacesWAN(){return this.nombreInterfacesWAN;}
    public void setNombreInterfacesWAN(int nombreInterfacesWAN){this.nombreInterfacesWAN = nombreInterfacesWAN;}

    @Override
    public String toString(){
        return super.toString() + "nombre d interfaces WAN = " + nombreInterfacesWAN;
    }
}
