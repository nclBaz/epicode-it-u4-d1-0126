import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) { // E'il METODO PRINCIPALE
         // System.out.println("Hello world"); // Shortcut per System.out.println() -> sout
         System.out.println("************************* TIPI PRIMITIVI *********************");

         boolean a = false;

        // a = 3; NON SI PUO' FARE!!!!!!!!
         a = true;
         System.out.println(a);

         byte numeroInteroMoltoPiccolo = 10;
         short numeroInteroPiccolo = 1000;
         int numeroIntero = 10000;
         long numeroInteroGrande = 100000000;


         numeroInteroGrande = numeroInteroMoltoPiccolo; // CASTING IMPLICITO
         // System.out.println(numeroInteroGrande);
         numeroInteroMoltoPiccolo = (byte) numeroInteroGrande; // CASTING ESPLICITO cioè chiedo a Java di convertire
         // da un tipo all'altro. N.B. Non può funzionare nel 100% dei casi!
         System.out.println(numeroInteroMoltoPiccolo);

        double numeroDecimale = numeroInteroGrande;
         System.out.println(numeroDecimale);

         float numeroDecimale2 = 10.3f; // Sebbene i float occupino metà dello spazio rispetto
         // ai double, è meglio usare SEMPRE I DOUBLE in quanto i processori moderni li usano
         // più efficientemente per i calcoli

       // int x = (int) numeroDecimale;
       // System.out.println(x);

         final double UN_ALTRO_DECIMALE = 15.3; // <- Come const in JS
        //  unAltroNumDecimale = 3;

         char singoloCarattere = 'Y'; // <-- APICI SINGOLI per i CHAR


         System.out.println("******************************** STRINGHE ******************************");
         String text = "Hello World"; // <-- Le stringhe hanno sempre gli APICI DOPPI
         System.out.println(text);
         System.out.println(text.length());
         System.out.println(text.toUpperCase());
         System.out.println(text.charAt(0));


         System.out.println("******************************* ARRAYS ****************************************");
         int[] interi = new int[4];
        // System.out.println(interi[4]); // ArrayIndexOutOfBoundsException, cioè siamo andati fuori dai limiti dell'array

         String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
         System.out.println(seasons[1]);
         // System.out.println(seasons[4]); //  ArrayIndexOutOfBoundsException
         // seasons[4] = "Fifth Season"; //  ArrayIndexOutOfBoundsException

         System.out.println(seasons.length);

         String[] seasons2 = new String[4];
//         System.out.println(seasons2[0].toUpperCase()); // NullPointerException, cioè sto cercando di invocare il metodo .toUpperCase()
         // su un elemento NULL

         System.out.println(seasons2); // NON è il modo giusto per stampare gli Array
         System.out.println(Arrays.toString(seasons2)); // Questo si!

         System.out.println("********************************** METHODS ***************************");
         printSum(30, 40);

         int result = sum(30, 40);
         System.out.println(result);


         System.out.println("************************************* SCANNER *****************************");
	     Scanner scanner = new Scanner(System.in); // System.in è il terminale in lettura

         System.out.println("Ciao inserisci il tuo nome");
         String name = scanner.nextLine(); // <-- L'esecuzione si ferma attendendo che l'utente inserisca il nome
         System.out.println("Ciao " + name);

         System.out.println("Dammi un numero");
         int num1 = Integer.parseInt(scanner.nextLine()); // Integer.parseInt converte testo in numero intero
         // Consiglio di usare nextLine DAPPERTUTTO

         System.out.println("Dammi il secondo numero");
         int num2 = Integer.parseInt(scanner.nextLine());

         printSum(num1, num2);

     }

     public static int sum(int num1, int num2){
         int total = num1 + num2;
         return total;
     }

     public static void printSum(int num1, int num2){
         int total = num1 + num2;
         System.out.println("Il totale è: " + total);
     } // Void significa NO RETURN
}
