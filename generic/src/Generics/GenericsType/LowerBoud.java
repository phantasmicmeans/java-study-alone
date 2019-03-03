package Generics.GenericsType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LowerBoud {

    public static void addCat(List<? super Cat> catList) {
        catList.add(new RedCat());
    }

    @Test
    public void testLowerBoud() {
        List<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<RedCat> redCatList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        addCat(animalList);
        addCat(catList);
        //addCat(redCatList);
        //compile time error, cannot add list of subclass RedCat Of Cat Class;

        //addCat(dogList);
        //compile time error, cannot add list of subclass Dog of SuperClass Animal of cat Class

    }
}

class Animal{}
class Cat extends Animal{};
class RedCat extends Cat{};
class Dog extends Animal{};
