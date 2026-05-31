package equipements.base;

public class StationDeTravail extends Ordinateur{
    private String carteGraphique;
    private String usage;
    public StationDeTravail(String marque, String modele, String numeroSerie, double prixAchat, int anneeAchat,  String processeur, int ram, int stockage, String typeOS, String carteGraphique, String usage){
        super(marque, modele, numeroSerie, prixAchat, anneeAchat, processeur, ram, stockage, typeOS);
    }
    @Override
    public double calculerValeurActuelle(){
        int age = calculerAge();
        double remise;
        double valeur = getPrixAchat();
        for (int i = 0; i < age; i++){
            remise = valeur * 0.15;
            valeur -= remise;
        }
        return valeur;
    }

    public boolean verifierConfiguration(){
        if (usage.equals("3D") || usage.equals("Design")){
            if (carteGraphique == null || getRam() < 32)
                return false;
            return true;
        }
        else if (usage.equals("Developpement")){
            if (getRam() < 16)
                return false;
            return true;
        }
        return true;
    }

}
