package ArrayList.Immutable;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ImmutableArrayListGuava {

    //with Guava
    private List<String> list_guava = new ArrayList<>();

    public void addToList_list_guava() { list_guava.add("practice"); }

    @Test
    public void makeImmutableListGuava(){
        /*Guava provides sililar functionally for creating its own version of immutableList*/
        addToList_list_guava();
        //this operation will actually create a copy of the original list..
        this.list_guava = ImmutableList.copyOf(this.list_guava);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void givenGuava_ImmutableList(){
        makeImmutableListGuava();
        List<String> unmodifiableList = this.list_guava;
        unmodifiableList.add("more practice");
    }


}
