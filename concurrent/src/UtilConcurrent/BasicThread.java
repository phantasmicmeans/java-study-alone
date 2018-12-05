package UtilConcurrent;

import org.junit.Test;

public class BasicThread {

    Thread basic;
    ThreadTest threadTest = new ThreadTest();
    ThreadTestFirst threadTestFirst = new ThreadTestFirst();


    public Thread makeBasicThread() {
        this.basic = new Thread(threadTestFirst);
        return (!basic.isInterrupted()) ? this.basic : null;
    }

    @Test
    public void threadTest_Run() {
        makeBasicThread();
        this.threadTest.start();
    }

    @Test
    public void threadTestFirst_Run() {
        this.basic.start();
    }

    @Test
    public void threadTest_anonymous() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable thread");
            }
        }).start();
    }

    @Test
    public void threadTest_anonymousWithLambda() {

        Runnable runnable =
                () -> System.out.println("runnable with lambda expression");

        makeNewThread(runnable).start();
    }

    private Thread makeNewThread(Runnable runnable) {
        return new Thread(runnable);
    }
}

class ThreadTestFirst implements Runnable{

    @Override
    public void run() {
        System.out.println("threadFirst");
    }
}

class ThreadTest extends Thread{

    @Override
    public void run() {
        System.out.println("threadSecond");
    }
}
