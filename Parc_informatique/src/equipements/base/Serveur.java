package equipements.base;

public class Serveur extends Equipement {
    private int nombreCoeurs;
    private int ram;
    private int capaciteStockage;
    private boolean systemeRaid;
    private boolean estEnProduction;

    public Serveur(String marque, String modele, String numeroSerie, double prixAchat, int anneeAchat,
                   int nombreCoeurs, int ram, int capaciteStockage, boolean systemeRaid, boolean estEnProduction){
        super(marque, modele, numeroSerie, prixAchat, anneeAchat);
        this.nombreCoeurs = nombreCoeurs;
        this.ram = ram;
        this.capaciteStockage = capaciteStockage;
        this.systemeRaid = systemeRaid;
        this.estEnProduction = estEnProduction;
        System.out.println("Serveur constructor");
    }
    public void demarrer(){
        this.estEnProduction = true;
    }
    public void arreter(){
        this.estEnProduction = false;
    }
    public void afficherEtat(){
        System.out.println(estEnProduction);
    }

    @Override
    public String toString() {
        return super.toString() + " | Serveur [" +
                "coeurs=" + nombreCoeurs +
                ", ram=" + ram + "Go" +
                ", stockage=" + capaciteStockage + "Go" +
                ", RAID=" + (systemeRaid ? "Oui" : "Non") +
                ", enProduction=" + (estEnProduction ? "Oui" : "Non") +
                ']';
    }


}
