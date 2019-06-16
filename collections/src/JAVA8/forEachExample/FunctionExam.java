package JAVA8.forEachExample;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionExam {

    @Test
    public void test() {
        List<Student> list = new ArrayList<>();
        IntStream.range(0,2).forEach( idx -> {
            list.add(new Student("lee",12));
        });
    }
}

class Student {
    private String name;
    private int engScore;

    public Student(String name, int engScore) {
        this.name = name;
        this.engScore = engScore;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEngScore() {
        return engScore;
    }
    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }
}
