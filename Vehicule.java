public  interface Vehicule {
    public static String Color="noir";
    public boolean Demarrer();
    public void Acelere(boolean pedal_lever,boolean accelerateur_lever);
    public default void clackson(){
        System.out.println(" BIM BIM BIM!!!!!");
    }


}

