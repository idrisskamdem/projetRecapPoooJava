public class Etudiant extends Personne{
    public String matricule;
    public String adrFac;


    public Etudiant(String nom,String prenom,int anneNais,String matricule,String adrFac){
        super(nom,prenom,anneNais);
        this.matricule=matricule;
        this.adrFac=adrFac;
    }

    @Override
    public void  ToString(){
        System.out.println(" heyy!! je m'appelle "+this.nom+" "+this.prenom+" ne en "+this.anneNais+" mon mtricule d'etudiant est "+this.matricule+"mon @ de fac "+this.adrFac);

    }
    }


