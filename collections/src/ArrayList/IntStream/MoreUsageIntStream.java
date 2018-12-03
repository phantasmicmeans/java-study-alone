package ArrayList.IntStream;

import org.junit.Test;

import java.util.stream.IntStream;

public class MoreUsageIntStream {

    @Test
    public void forLoop() {
        for (int i = 0; i < 100; i++) {
            if (i > 50) break;
            System.out.println(i);
        } // easy way to break the for loop (just 50 count)
    }

    @Test
    public void forLoopIntStream() {
        IntStream.range(1, 100).forEach(i -> check(i));
        //this one looks like run 50 times, actually 100 times
        //not same as the upper one.
    }

    @Test
    public void forLooptIntStreamUpdate() {
        //this one looks better, But filter is Lazy..
        //same as the upper one.
        IntStream.range(1, 100).filter(i -> i < 50).forEach(System.out::println);
    }

    boolean check(int number) {

        if(number > 50) {
            System.out.println("smaller than 50");
            return false;
        }
        return number < 50;
    }
}
