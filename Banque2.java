public class Banque2 {
    //taux d'interet du compte privee
    private static final double taux1=0.01;
    //taux d'interet du compte d'epagne
    private static final double taux2=0.02;
    //solde du compte du compte privee
    private double solde1;
    // solde du compte d'epagne
    private double solde2;
    // nom du client
    private String nomclient;
    //ville du client
    private String villeclient;
// constructeur qui permet d'initialiser un client
    public Banque2(String nomclient,String villeclient,double solde1, double solde2){
        this.nomclient=nomclient;
        this.villeclient=villeclient;
        this.solde1=solde1;
        this.solde2=solde2;
    }
    public double getTaux1(){
        return taux1;
    }
    public double getTaux2(){
        return taux2;
    }
    public String getNomclient(){
        return nomclient;
    }
    public String getVilleclient(){
        return villeclient;
    }
    public double getSolde1(){
        return solde1;
    }
    public double getSolde2(){
        return solde2;
    }
    public void setSolde1(double solde1){
        this.solde1=this.solde1+solde1;
    }

    public void setSolde2(double solde2){
        this.solde2=this.solde2+solde2;
    }
    // cette methode affiche les donnees d'un client
    public static void afficherclient(Banque2 client){
        System.out.println("client: " +client.nomclient +" de " +client.villeclient);
        System.out.println("compte prive: " +client.solde1);
        System.out.println("compte d'epagne: " +client.solde2);
    }
    //boucler un compte privee
    public static double bouclercompterprive(double solde, double taux1){
        double interet=solde*taux1;
        double nouveausolde=solde+interet;
        return nouveausolde;
    }
    // boucler un compte epagne
    public static double bouclercompterepagne(double solde, double taux2){
        double interet=solde*taux2;
        double nouveausolde=solde+interet;
        return nouveausolde;
    }
    public static void main(String[] args) {
        Banque2 client1=new Banque2("tekeu","douala",10000,20000);
        Banque2 client2=new Banque2("tsayim", "douala", 4000, 3000);
        afficherclient(client1);
        afficherclient(client2);

        client1.solde1=bouclercompterepagne(client1.solde1, taux1);
        client1.solde2=bouclercompterprive(client1.solde2, taux2);
        client2.solde1=bouclercompterepagne(client2.solde1, taux1);
        client2.solde2=bouclercompterprive(client2.solde2, taux2);
        System.out.println("\n Donnees apres bouclement \n");
        afficherclient(client1);
        afficherclient(client2);

    }
}