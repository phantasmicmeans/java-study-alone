package ListPartition;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class PartitionList{
    //How to split a List into several sublist of given size
    //no support in the standard Java Collection API.
    //Guava and the Apache Commons Collections have some way
    final String[] list = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    //can use anything between makeList_Arrays or guava
    public List<String> makeList_Arrays(String[] array) {
        //return dynamic list with collection api
        return new ArrayList<>(Arrays.asList(array));
    }

    public List<String> makeList_Arrays_guava(String[] array) {
        //return dynamic list with guava
        return Lists.newArrayList(array);
    }

    @Test
    public void partitioningList_Guava() {

        List<String> strList = makeList_Arrays_guava(this.list);
        List<List<String>> subList = Lists.partition(strList, 5);
        printListItem(subList);

        List<String> lastPartition = getLastPartition(subList);
        printSubList(lastPartition);
    }

    public void printListItem(List<List<String>> list) {

        ListIterator<List<String>> iterator = list.listIterator();
        int number = 0;

        while (iterator.hasNext()) {
            System.out.println("Index : " + number++);
            if(printSubList(iterator.next()).equals("empty")){
                return;
            }
        }
    }

    //print sub list, null check
    public String printSubList(List<String> list){
        return (!list.isEmpty()) ? printList(list) : printList_if_empty();
    }

    //print a list if not a null
    public String printList(List<String> list){

        list.listIterator().forEachRemaining(System.out::println);
        System.out.println("list iterate complete");

        return "complete";
    }

    //return list empty if list empty
    public String printList_if_empty(){ return "empty"; }

    //get Last partition from a List<List<String>>
    public List<String> getLastPartition(List<List<String>> list) {
        return (!list.isEmpty()) ? list.get(list.size() - 1) : null;
    }

}
