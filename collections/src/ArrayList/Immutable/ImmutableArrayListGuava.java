package ArrayList.Immutable;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ImmutableArrayListGuava {

    //with Guava
    private List<String> list = new ArrayList<>();

    public void addToList(){ list.add("practice");}

    @Test
    public void makeImmutableListGuava(){
        /*Guava provides sililar functionally for creating its own version of immutableList*/
        addToList();
        this.list = ImmutableList.copyOf(this.list);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void givenGuava_ImmutableList(){
        List<String> unmodifiableList = this.list;
        unmodifiableList.add("more practice");
    }
}
