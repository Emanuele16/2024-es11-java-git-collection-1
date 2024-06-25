import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DataHelper {

    public static List<Integer> getRandomInteger(int size) {
        return getRandomInteger(size, 0, 10);
    }

    public static List<Integer> getRandomInteger(int size, int max) {
        return getRandomInteger(size, 0, max);
    }

    public static List<Integer> getRandomInteger(int size, int min, int max) {
        List<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomIntegers.add(random.nextInt(max - min + 1) + min);
        }
        return randomIntegers;
    }

    public static List<Integer> getRandomUniqueInteger(int size) {
        return getRandomUniqueInteger(size, 0, 10);
    }

    public static List<Integer> getRandomUniqueInteger(int size, int max) {
        return getRandomUniqueInteger(size, 0, max);
    }

    public static List<Integer> getRandomUniqueInteger(int size, int min, int max) {
        List<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();
        int value;

        if (size > (max - min + 1)) {
            throw new IllegalArgumentException("Il numero è maggiore del numero di interi univoci disponibili.");
        }

        while (randomIntegers.size() < size) {
            value = random.nextInt(max - min + 1) + min;
            if (!randomIntegers.contains(value)) {
                randomIntegers.add(value);
            }
        }

        return randomIntegers;
    }

    public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : list) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        return map;
    }

    public static String frequencyMapToString(Map<Integer, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey())
              .append(" appare ")
              .append(entry.getValue())
              .append(" volte\n");
        }
        return sb.toString();
    }
}
