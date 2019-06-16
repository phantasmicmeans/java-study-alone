package Generics.GenericsType;


import java.util.List;

public class GenericMethod {

    public static <T> boolean isEqualTo(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.getT().equals(g2.getT());
    }

    public static <T extends Comparable<T>> int compare(T g1, T g2) {
        return g1.compareTo(g2);
    }

    public static double makeSum(List<Number> numberList) {
        double sum = 0;
        for(Number number : numberList) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static double makeSumUpper(List <? extends Number> numberList) {
        double sum = 0;
        double sumV = numberList.stream().mapToDouble(i -> ((Number) i).doubleValue()).sum();
        return sumV;
    }
}
