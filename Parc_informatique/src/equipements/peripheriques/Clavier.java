package equipements.peripheriques;

public class Clavier {
    private String type;
    private String layout;
    public Clavier(String type, String layout){
        this.type = type;
        this.layout = layout;
    }
    public String getType(){ return type;}
    public String getLayout(){ return layout;}
    public void setType(String type){ this.type = type;}
    public void setLayout(String layout){ this.layout = layout;}

    @Override
    public String toString(){
        return "Type = " + type + " layout = " + layout;
    }
}
