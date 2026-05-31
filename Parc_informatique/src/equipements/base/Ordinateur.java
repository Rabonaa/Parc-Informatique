package equipements.base;

public class Ordinateur extends Equipement {
    private String processeur;
    private int ram;
    private int stockage;
    private String typeOS;

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
    @Override
    public String toString() {
        return super.toString() + " | Ordinateur [" +
                "processeur='" + processeur + '\'' +
                ", ram=" + ram + "Go" +
                ", stockage=" + stockage + "Go" +
                ", OS='" + typeOS + '\'' +
                ']';
    }
    public String getProcesseur() { return processeur; }
    public int getRam() { return ram; }
    public int getStockage() { return stockage; }
    public String getTypeOS() { return typeOS; }
}
