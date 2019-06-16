package JAVA8.forEachExample;

import org.junit.Test;

public class example2 {

    @Test
    public void LamdaRunnable() {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable");
            }
        };

        Runnable r1 = () -> { System.out.println("My Runnable one"); };

    }
}
