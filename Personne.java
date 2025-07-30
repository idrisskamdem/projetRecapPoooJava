public class Personne {
    public String nom ;
    public String prenom;
    public int anneNais;

    public Personne(String nom,String prenom,int anneNais){
        this.anneNais=anneNais;
        this.nom=nom;
        this.prenom=prenom;
    }
    public  void ToString(){
        System.out.println(" heyy!! je m'appelle "+this.nom+" "+this.prenom+" ne en "+this.anneNais);
    }
}
