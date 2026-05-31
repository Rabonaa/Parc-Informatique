package equipements.peripheriques;

public class Souris {
    private int dpi;
    private boolean sansFil;
    public Souris(int dpi, boolean sansFil){
        this.dpi = dpi;
        this.sansFil = sansFil;
    }
    public int getDpi(){ return dpi;}
    public boolean getSansFil(){ return sansFil;}
    public void setDpi(){ this.dpi = dpi;}
    public void setSansFil(){ this.sansFil = sansFil;}

    @Override
    public String toString(){
        return "Dpi = " + dpi + " sansFil = " + sansFil;
    }
}
