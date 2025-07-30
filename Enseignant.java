public class Enseignant extends Personne{
    public String matricule;
    public String specialite;
    public String grade;
    public Enseignant(String nom,String prenom,int anneNais,String matricule,String specialite,String grade){
        super(nom,prenom,anneNais);
        this.grade=grade;
        this.specialite=specialite;
        this.matricule=matricule;
    }
    @Override
    public  void ToString(){
        System.out.println(" heyy!! je m'appelle "+this.nom+" "+this.prenom+" ne en "+this.anneNais+" mon mtricule d'enseignant est "+this.matricule+"ma specilite est "+this.specialite+" mon grade d'enseignant est "+this.grade);

    }
}
