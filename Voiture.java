public class Voiture implements Vehicule{
    private String marque;
    private String modele;
    private int annee;
    public boolean pedale;
    public boolean caburant;
    public  boolean batterie;
    public Voiture(String marque,String modele,int annee,boolean pedale,boolean caburant, boolean batterie){
        this.marque=marque;
        this.modele=modele;
        this.annee=annee;
        this.batterie=batterie;
        this.pedale=pedale;
        this.caburant=caburant;
    }
    @Override
    public boolean Demarrer(){
        if(this.pedale==true && this.batterie==true && this.caburant==true)
        {
            System.out.println("demarrage .....");
            return  true;
        }else{
            System.out.println("cette voiture est en stop !!!");
            return  false;
        }

    }
    @Override
    public void Acelere(boolean pedal_lever,boolean accelerateur_lever){
        if(pedal_lever==true && accelerateur_lever==true && Demarrer()==true){
            System.out.println(" la voiture accelere .....");
        }else if(Demarrer()==false){
            System.out.println(" demarre d'abord la voiture ");
        }
        else{
            System.out.println(" la voiture ne peut accelerer");
        }
    }
    public boolean lever_pedale(){
        return  true;
    }
    public boolean lever_acc(){
        return true;
    }
    public void ToStringVoiture(){
        System.out.println(" cette voiture est une de marque "+this.marque+" de modele "+this.modele+" annee"+this.annee);
    }

    public String getMarque() {
        return marque;
    }

    public int getAnnee() {
        return annee;
    }

    public String getModele() {
        return modele;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCaburant(boolean caburant) {
        this.caburant = caburant;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}

