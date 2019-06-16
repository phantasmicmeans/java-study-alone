package Generics;

import Generics.GenericsType.GenericMethod;
import Generics.GenericsType.GenericsType;
import Generics.GenericsType.GenericsTypeOld;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

import java.util.stream.IntStream;

public class basic {

    @Test
    public void Test() {
        GenericsTypeOld type = new GenericsTypeOld();
        type.setT("Pankaj");
        String str = (String)type.getT();
        //this can cause ClassType Cast Exception!!!
    }
    /*
    Notice that while using this class, we have to use type casting and
    it can produce ClassCastException at runtim!!!
    so, we will use hava generics class to rewrite the same class.
     */

    @Test
    public void Test2() {
        GenericsType<String> type = new GenericsType<>();
        GenericsType type1 = new GenericsType(); //raw type;
        type.setT("sangmin");
        type1.setT("sangmin");
        type1.setT(12);
    }

    @Test
    public void testTypeInterface() {
        GenericsType<String> g1 = new GenericsType<>();
        GenericsType<String> g2 = new GenericsType<>();
        g1.setT("sangmin");
        g2.setT("sangmins");

        boolean isEqual = GenericMethod.isEqualTo(g1, g2);
    }

    @Test
    public void testRestrictTypeComparable() {
        Integer g1 = 1;
        Integer g2 = 2;
        System.out.println(GenericMethod.compare(g1,g2));
    }

    @Test
    public void testUpperBoundsGenerics() {
        List<Number> list = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();

        Consumer consumer =  t -> {
            if(t instanceof Integer)
                listInteger.add((Integer)t);
            else if(t instanceof Double)
                listDouble.add((Double)t);
        };

        IntConsumer intConsumer = listInteger::add;

        IntStream.range(1,10).forEach(intConsumer);
        listDouble.add(0.0);
        listDouble.add(0.5);
        listDouble.add(0.7);
        listDouble.add(1.333);

        System.out.println(GenericMethod.makeSumUpper(listInteger));
        System.out.println(GenericMethod.makeSumUpper(listDouble));
    }
}
