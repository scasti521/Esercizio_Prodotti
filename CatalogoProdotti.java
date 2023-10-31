import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoProdotti{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Prodotto> catalogo = new ArrayList<>();
        catalogo.add(new Prodotto("Prodotto1", 21.98, "Le scarpe più economiche", 9));
        catalogo.add(new Prodotto("Prodotto2", 45.98, "Le scarpe più costose", 12));


        Utente u= new Utente();

        int conta=0;

        System.out.println("Sei un utente registrato (si/no)?");
        String risp=sc.nextLine();


        if (risp.equalsIgnoreCase("si")) {
            while(conta<3){
                System.out.println("Inserisci username: ");
                String username=sc.nextLine();
                System.out.println("Inserisci password");
                String password=sc.nextLine();
                conta++;

                if (username.equals(u.username) && password.equals(u.getPassword())) {
                    System.out.println("Utente presente, buona navigazion!!");
                    break;
                }
            }
        }else{
            if (risp.equalsIgnoreCase("no")) {
                System.out.println("Inserisci username: ");
                String username=sc.nextLine();
                System.out.println("Inserisci password");
                String password=sc.nextLine();
                System.out.println("Utente o amministratore?");
                String tipo=sc.nextLine();
                if (tipo.equalsIgnoreCase("u")) {
                    u.registrati(username, password, true);
                }else{
                    u.registrati(username, password, false);
                }
            }
        }

        //Una volta verificato l'utente o registrato l'utente andiamo a far visualizzare il menù con le opzioni disponibili

        if (conta<3) {

            if (u.utente==true) {
            System.out.println("------------------------------MENU'--------------------------------");
            System.out.println("Premi 1 per visualizzare i prodotti: ");
            System.out.println("Premi 2 per uscire");
            int scelta=sc.nextInt();

            switch (scelta) {
                //Visualizzazione prodotti
                case 1:
                    // Utilizzo del ciclo for tradizionale per visualizzare gli elementi
                    System.out.println("-------------------------------------------------------------------------");
                    for (int i = 0; i < catalogo.size(); i++) {
                        System.out.println("-----------PRODOTTO------------------------");
                        System.out.println(catalogo.get(i).nome);
                        System.out.println(catalogo.get(i).descrizione);
                        System.out.println(catalogo.get(i).getPrezzo());
                        System.out.println(catalogo.get(i).getQuantità());
                    }
                    break;

                //Chiusura del programma
                case 2:
                    break;
            
                default:
                    break;
            }
        }else{
            //Operazioni sui prodotti da parte dell'amministratore
        }
           
        }else{
            System.out.println("Utente non presente");
        }

        


    }
}