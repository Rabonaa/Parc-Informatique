package equipements.peripheriques;

public class Ecran {
    private int taille;
    private String resolution;
    private String connectique;
    public Ecran(int taille, String resolution, String connectique){
        this.taille = taille;
        this.resolution = resolution;
        this.connectique = connectique;
    }
    public int getTaille(){return taille;}
    public String getResolution(){return resolution;}
    public String getConnectique(){return connectique;}
    public void setTaille(int taille){this.taille = taille;}
    public void setResolution(String resolution){this.resolution = resolution;}
    public void setConnectique(String connectique){this.connectique = connectique;}

    @Override
    public String toString(){
        return "taille = " + taille + " resolution = " + resolution + " connectique = " + connectique;
    }


}
