package ArrayList.IntStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class UsageIntStream {

    public void intStream(){
        System.out.println(IntStream.of(1,2,3));
        System.out.println(IntStream.range(1,3));
        System.out.println(IntStream.rangeClosed(1,3));
    }

    public void iterate(){
        IntStream.iterate(0,i -> i + 2).limit(3); // > 0,2,4
    }

    public Stream <Integer> convertoToStream(){
        //convert an IntStream to Stream<Integer>, dedicated function for this job called boxed.
        return IntStream.range(1,5).boxed();
    }

    public void convertIntStreamToAnother(){
        //also find map functions that returns DoubleStream and LongStream.
        DoubleStream stream = IntStream.range(1,5).mapToDouble(i -> i);
        LongStream streamLong = IntStream.range(1,5).mapToLong(i -> i);
    }

    public boolean filtering(){
        boolean result = IntStream.range(1,5)
                                    .filter(i -> i%2 == 0)
                                    .allMatch(i -> i%2 == 0);
        return result;
    }

    public List<Integer> forEach(){
        List<Integer> list = new ArrayList<>();
        IntStream.range(1, 5).forEach(i -> list.add(i));
        return list;
    }

    /* Both these methods and a lot of the other functions that returns one element, will result
    an OptionalInt.
    like Optional, gives some great hihger-order functions that are abstracting away null checks
     */
    public int getMax(){
        return IntStream.range(1,5).max().getAsInt();
    }

    public int getMin(){
        return IntStream.range(1,5).min().getAsInt();
    }
}

