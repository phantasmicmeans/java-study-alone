package ArrayList.Immutable;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableArrayList {

    //with the core JDK
    private List<String> list = new ArrayList<>();

    public ImmutableArrayList(){ list.add("practice"); }

    public List<?> makeImmutableList(){
        //JDK provides a nice way to get an unmodifiable collection out of an existing one
        return Collections.unmodifiableList(this.list);
    }

    public List<?> givenJdk_ImmutableList(){
        List<String> unmodifiableList = Collections.unmodifiableList(this.list);
        unmodifiableList.add("more practice");
        return unmodifiableList;
    }

}
