import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataHelper {

    private static List<Integer> addRandom(List<Integer> numbers, int size, int bound){
        Random randomNum = new Random();
        for(int i=0; i<size; i++){
            numbers.add(randomNum.nextInt(bound));
        }
        return numbers;
    }

    public static List<Integer> getRandomInteger(int size) {
        List<Integer> numbers = new ArrayList<>();
        addRandom(numbers, size, 11);

        return numbers;
    }

    public static List<Integer> getRandomInteger(int size, int max) {
        List<Integer> numbers = new ArrayList<>();
        addRandom(numbers, size, max);

        return numbers;    
    }

    public static List<Integer> getRandomInteger(int size, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNum = random.nextInt((max - min) + 1) + min;
            numbers.add(randomNum);
        }

        return numbers;    
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    // public static ??? getRandomUniqueInteger(int size) {
    //
    // return null;
    // }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    // public static ??? getRandomUniqueInteger(int size, int max) {
    //
    // return null;
    // }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    // max
    // public static ??? getRandomUniqueInteger(int size, int min, int max) {
    //
    // return null;
    // }

    // restituisce una mappa di frequenza di numeri interi
    // public static ??? getFrequencyMap(List<Integer> list) {
    //
    // return null;
    // }

}
