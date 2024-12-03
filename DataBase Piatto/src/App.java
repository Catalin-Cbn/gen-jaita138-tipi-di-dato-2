import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Piatto personalizzato");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Descrizione: ");
        String descrizione = sc.nextLine();

        System.out.println("Prezzo: ");
        Double prezzo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Disponibile (Sì = true; No = false): ");
        Boolean disponibile = sc.nextBoolean();

        System.out.println("Tipologia (1_Pasta, 2_Zuppa, 3_Insalata): ");
        Byte tipologia = sc.nextByte();
        sc.nextLine();
        
        System.out.println("Allergeni: ");
        String allergeni = sc.nextLine();

        System.out.println("Foto: ");
        String foto = sc.nextLine();

        System.out.println("Calorie: ");
        short calorie = sc.nextShort();
        sc.nextLine();

        System.out.println("Variazioni: ");
        String variazioni = sc.nextLine();

        System.out.println("---------------------------------------");


        System.out.println("Il tuo piatto personalizzato");

        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo + " Euro");
        System.out.println("Disponibile: " + disponibile);
        System.out.println("Tipologia: " + tipologia);
        System.out.println("Allergeni: " + allergeni);
        System.out.println("Foto: " + foto);
        System.out.println("Calorie: " + calorie);
        System.out.println("Variazioni: " + variazioni);

        sc.close();
    }
}
