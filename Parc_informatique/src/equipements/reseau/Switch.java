package equipements.reseau;

public class Switch extends EquipementReseau {
    private boolean supporteVLAN;
    public Switch(String marque, String modele, String numeroSerie,
                  double prixAchat, int anneeAchat,
                  int nombrePorts, int vitesseMax, String adresseIP, boolean supporteVLAN){
        super(marque, modele, numeroSerie, prixAchat, anneeAchat, nombrePorts, vitesseMax, adresseIP);
        this.supporteVLAN = supporteVLAN;
    }
    public boolean getSupporteVLAN(){return this.supporteVLAN;}
    public void setSupporteVLAN(boolean supporteVLAN){this.supporteVLAN = supporteVLAN;}

    @Override
    public String toString(){
        return super.toString() + "supporteVLAN = " + supporteVLAN;
    }
}
