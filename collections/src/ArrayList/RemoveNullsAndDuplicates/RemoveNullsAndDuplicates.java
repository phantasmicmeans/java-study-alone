package ArrayList.RemoveNullsAndDuplicates;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullsAndDuplicates {

    //withPlainJava & withGuava will modify the list element
    @Test
    public void removeNulls_withPlainJava(){
        List<String> list = Lists.newArrayList(null,"str",null);
        while(list.remove(null));

        assertEquals(1, list.size());
    }

    @Test
    public void removeNulls_withGuava(){
        List<String> list = Lists.newArrayList(null,"str",null);
        Iterables.removeIf(list, Predicates.isNull());

        assertEquals(1,list.size());
    }

    //this one will not modify the list
    @Test
    public void removeNulls_withGuava_immutable(){
        List<String> list = Lists.newArrayList(null,"str",null);
        List<String> listWithOutNulls = Lists.newArrayList(Iterables.filter(list, Predicates.notNull()));

        assertEquals(1,listWithOutNulls.size());
    }

    @Test
    public void removeNulls_withLambdaFunction(){
        List<String> list = Lists.newArrayList(null,"str",null,"str2",null);
        List<String> listWithOutNull = list.stream() //Immutable
                                            .filter(Objects::nonNull)
                                            .collect(Collectors.toList());

        assertEquals(2,listWithOutNull.size());
    }
}
