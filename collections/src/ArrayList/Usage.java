package ArrayList;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Usage {

    /*
    ArrayList is one of the List implementations built atop an array,
    which is able to dynamically grow and shrink as you add/remove elements
    **Elements could be easily accessed by their indexes starting from 0.
     */

    // ArrayList is a generic class, so you can parameterize it with any type you want
    @Test
    public void noArg(){
        List<String> list = new ArrayList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void acceptionCollection(){
        Collection<Integer> number
                = IntStream.range(0,10).boxed().collect(toSet());

        List<Integer> list = new ArrayList<>(number);

        assertEquals(10,list.size());
        assertTrue(number.containsAll(list));
    }

    public List<Integer> addingElements(){

        List <Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8,9,10));

        IntStream.range(1,3).boxed()
                .collect(collectingAndThen(toCollection(ArrayList::new), ys -> list.addAll(0,ys)));

        return list;
    }

    public List<Integer> IteatingList(){

        List <Integer> list = intStreamToList();

        ListIterator <Integer> iter = list.listIterator();
        List <Integer> result = new ArrayList<>(list.size());
        while(iter.hasNext()){
            result.add(iter.next());
        }

        return result;
    }

    public List<Integer> intStreamToList(){
        return new ArrayList(IntStream.range(0,10).boxed().collect(toCollection(ArrayList::new)));
    }

}





















