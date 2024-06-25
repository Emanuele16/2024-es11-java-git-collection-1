import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner scan;
    public static void main(String[] args) throws Exception {
        scan = new Scanner(System.in);
        TestRandomInteger();
        TestRandomUniqueInteger();
        testFrequencyMap();
    }

    public static void TestRandomInteger(){
        getRandomInteger();
        getRandomIntegerUntilMax();
        getRandomIntegerBetweenMinMax();
    }

    public static void TestRandomUniqueInteger(){
        getRandomUniqueInteger();
        getRandomUniqueIntegerUntilMax();
        getRandomUniqueIntegerBetweenMinMax();
    }

     public static void getRandomInteger() {
        int size = 0;

        while(size<=0){
            System.out.print("inserisci la grandezza della lista (tutti i numeri eccetto 0): ");
            size = scan.nextInt();
        }

        System.out.println(DataHelper.getRandomInteger(size));
    }

    public static void getRandomIntegerUntilMax() {
        int size = 0, max = 0;

        while(size<=0){
            System.out.print("inserisci la grandezza della lista (tutti i numeri eccetto 0): ");
            size = scan.nextInt();
        }

        System.out.print("inserisci il valore max della numerazione: ");
        max = scan.nextInt();

        System.out.println(DataHelper.getRandomInteger(size, max));
    }

    public static void getRandomIntegerBetweenMinMax() {
        int size = 0, min = 0, max = 0;

        while(size<=0){
            System.out.print("inserisci la grandezza della lista (tutti i numeri eccetto 0): ");
            size = scan.nextInt();
        }
        
        System.out.print("inserisci il valore min della numerazione: ");
        min = scan.nextInt();

        while(max<=min){
            System.out.print("inserisci il valore max della numerazione (il valore deve essere superiore a min): ");
            max = scan.nextInt();
        }

        System.out.println(DataHelper.getRandomInteger(size, min, max));
    }

    public static void getRandomUniqueInteger() {
        int size = 12;
        
        while(size<=0 || size>11){
            System.out.print("inserisci la grandezza della lista (un numero da 1 a 11): ");
            size = scan.nextInt();
        }

        System.out.println("Lista di numeri random univoci da 0 a 10");
        System.out.println(DataHelper.getRandomUniqueInteger(size));
    }

    public static void getRandomUniqueIntegerUntilMax() {
        int max = 0, size = 0;
        
        while(size<=0){
            System.out.print("inserisci la grandezza della lista (tutti i numeri eccetto 0): ");
            size = scan.nextInt();
        }

        System.out.print("inserisci il valore max della numerazione: ");
        max = scan.nextInt();

        System.out.println(DataHelper.getRandomUniqueInteger(size, max));
    }


    public static void getRandomUniqueIntegerBetweenMinMax() {
        int min = 0, max = 0, size = 0;
        
        while(size<=0){
            System.out.print("inserisci la grandezza della lista (tutti i numeri eccetto 0): ");
            size = scan.nextInt();
        }

        System.out.print("inserisci il valore min della numerazione: ");
        min = scan.nextInt();

        while(max<=min){
            System.out.print("inserisci il valore max della numerazione (il valore deve essere superiore a min): ");
            max = scan.nextInt();
        }
        
        System.out.println(DataHelper.getRandomUniqueInteger(size, min, max));
    }

    public static void testFrequencyMap() {
        System.out.print("Inserisci la grandezza della lista di numeri casuali per la mappa: ");
        int size = scan.nextInt();

        List<Integer> randomNumbers = DataHelper.getRandomInteger(size);
        System.out.println("Lista di numeri casuali generati: " + randomNumbers);

        Map<Integer, Integer> mapF = DataHelper.getFrequencyMap(randomNumbers);
        System.out.println(DataHelper.frequencyMapToString(mapF));
    }
}
