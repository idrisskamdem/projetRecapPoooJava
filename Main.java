import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Main
{
    public  static void AfficherEtudtiant(List<Etudiant> etudiants){
        System.out.println("Nous avons une liste de "+etudiants.size()+" etudiant qui seront presenter ici :");
        for(Etudiant etd:etudiants){
            etd.ToString();
        }
    }
    public static void AfficherEnseignant(List<Enseignant> enseignants){
        System.out.println("Nous avons une liste de "+enseignants.size()+" enseignant qui seront presenter ici :");
        for(Enseignant ens:enseignants){
            ens.ToString();
        }
    }
    public static List<Etudiant> RegisterEtd(int nbr){
        Scanner sc=new Scanner(System.in);
        List<Etudiant>etudiants=new ArrayList<>();
        System.out.println("Entrer les informations des etudiants: \t");
        for(int i=0;i<nbr;i++){
            System.out.println("Entrez les informations de l'etudiant n*"+(i+1)+" :");
            System.out.print("Entrez son nom:\t ");
            String nom=sc.nextLine();
            sc.nextLine();
            System.out.print("Entrez son prenom:\t");
            String prenom=sc.nextLine();
            System.out.print("Entrez son matricule:\t");
            String matricule=sc.nextLine();
            System.out.print("Entrez son adresse :\t");
            String adr=sc.nextLine();
            System.out.print("Entrez son date de naissance:\t");
            int annee=sc.nextInt();
            etudiants.add(new Etudiant(nom,prenom,annee,matricule,adr));
        }
        return etudiants;
    }
    public static List<Enseignant> RegisterEns(int nbr){
        Scanner sc=new Scanner(System.in);
        List<Enseignant>enseignants=new ArrayList<>();
        System.out.println("Entrer les informations des enseignants: \t");
        for(int i=0;i<nbr;i++){
            System.out.println("Entrez les informations de l'enseignant n* "+(i+1)+" :");
            System.out.print("Entrez son nom:\t ");
            String nom=sc.nextLine();
            System.out.print("Entrez son prenom:\t");
            String prenom=sc.nextLine();
            System.out.print("Entrez son date de naissance:\t");
            int annee=sc.nextInt();
            sc.nextLine();
            System.out.print("Entrez son matricule:\t");
            String matricule=sc.nextLine();
            System.out.print("Entrez sa specialite :\t");
            String spe=sc.nextLine();
            System.out.print("Entrez son grade :\t");
            String grade=sc.nextLine();
            enseignants.add(new Enseignant(nom,prenom,annee,matricule,spe,grade));
        }
        return enseignants;
    }
    public static void DeleteEnseignant(int indexe, List<Enseignant> e){
        Scanner sc=new Scanner(System.in);
        Enseignant E=e.get(indexe);
        System.out.print("L'enseignant "+E.nom+" "+E.prenom+" de "+E.grade+" sera supprime!! voulez vous executer cette action ?\t");
        String rep=sc.nextLine().toLowerCase();
        if(rep.equals("oui")) {
            e.remove(indexe);
            System.out.println("suppression reussie!!");
        }
    }
    public static void DeleteEtudiant(int indexe, List<Etudiant> e){
        Scanner sc=new Scanner(System.in);
        Etudiant E=e.get(indexe);
        System.out.print("L'etudiant "+E.nom+" "+E.prenom+" de "+E.matricule+" sera supprime!! voulez vous executer cette action ?\t");
        String rep=sc.nextLine().toLowerCase();
        if(rep.equals("oui")) {
            e.remove(indexe);
            System.out.println("suppression reussie!!");
        }
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("java.sql.Driver");
            System.out.println("JDBC est bien disponible");
        } catch (ClassNotFoundException e){
            System.out.println("JDBC est bien indisponible");
            e.printStackTrace();
        }
        Voiture voiture=new Voiture("LEXUS","PRADO",2020,true,true,true);
        Map<Enseignant,Etudiant> map=new HashMap<>();
        //map.put()
        voiture.ToStringVoiture();
        voiture.clackson();
        voiture.Demarrer();
        boolean pedale=voiture.lever_pedale();
        boolean acc=voiture.lever_acc();
        voiture.Acelere(pedale,acc);
        List<Enseignant>ens=RegisterEns(3);
        List<Etudiant>etd=RegisterEtd(3);
        System.out.println("1- AFFICHER LES ETUDIANTS");
        AfficherEtudtiant(etd);
        System.out.println();
        System.out.println("1- AFFICHER LES ENSEIGNANTS");
        AfficherEnseignant(ens);
        System.out.println("2- SUPPRIMER UN ENSEIGNANT");
        DeleteEnseignant(2,ens);
        AfficherEnseignant(ens);
        System.out.println("3- SUPPRIMER UN ETUDIANT");
        DeleteEtudiant(2,etd);
        AfficherEtudtiant(etd);
        sc.close();
    }
}
