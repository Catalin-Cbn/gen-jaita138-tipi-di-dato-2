import java.util.Scanner;

public class Ingredienti {
    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner (System.in);
    System.out.println("Informazioni sugli ingredienti");

    System.out.println("Nome: ");
    String nome = sc.nextLine();

    System.out.println("Descrizione: ");
    String descrizione = sc.nextLine();

    System.out.println("Tipologia: ");
    Byte tipologia = sc.nextByte();
    sc.nextLine();
    
    System.out.println("Disponibile: ");
    Boolean disponibile = sc.nextBoolean();
    
    System.out.println("Costo: ");
    Double costo = sc.nextDouble();
    sc.nextLine();
    
    System.out.println("Allergeni: ");
    String allergeni = sc.nextLine();
    
    System.out.println("Modalità di conservazione: ");
    String modConservazione = sc.nextLine();
    
    System.out.println("Foto: ");
    String foto = sc.nextLine();
//-------------------------------------------------------------------
    System.out.println("");
    System.out.println("---------------------------------------");
    System.out.println("");
//-------------------------------------------------------------------
    System.out.println("Nome: " + nome);
    System.out.println("Descrizione: " + descrizione );
    System.out.println("Tipologia: " + tipologia);
    System.out.println("Disponibile: " + disponibile);
    System.out.println("Costo: " + costo + "Euro");
    System.out.println("Allergeni: " + allergeni);
    System.out.println("Modalità di conservazione: " + modConservazione);
    System.out.println("Foto: " + foto);

    sc.close();

    }
}
