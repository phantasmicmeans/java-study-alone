package ArrayList.Immutable;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableArrayList {

    //with the core JDK
    private List<String> list = new ArrayList<>();

    public void addToList(){ list.add("practice"); }

    @Test
    public void makeImmutableList(){
        //JDK provides a nice way to get an unmodifiable collection out of an existing one
        addToList();;
        Collections.unmodifiableList(this.list);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void givenJdk_ImmutableList(){
        makeImmutableList();
        List<String> unmodifiableList = Collections.unmodifiableList(this.list);
        unmodifiableList.add("more practice");
    }

}
