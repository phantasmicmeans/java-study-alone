package JAVA8.forEachExample;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class example {

    @Test
    public void forEachTest() {
        List<Integer> myList = new ArrayList<>();
        IntStream.range(0,10).forEach(myList::add);

        //1. traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            System.out.println("integer value :" + i);
        }

        //2. traversing through forEach
        class MyConsumer implements Consumer<Integer> {
            @Override
            public void accept(Integer integer) {
                System.out.println("integer value : " + integer);
            }

            public void accepts(Integer integer) {
                System.out.println("integer ffff : " + integer);
            }
        }

        MyConsumer myConsumer = new MyConsumer();
        myList.forEach(myConsumer::accepts);

        //3. 단순하게 Consumer 구현
        Consumer<Integer> consumer =  System.out::println;
        myList.forEach(consumer);
    }
}

