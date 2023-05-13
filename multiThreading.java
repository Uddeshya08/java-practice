class myThread1 extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("Thread one is running");
        }
    }

}

 class myThread2 extends Thread{

    @Override
    public void run(){ //OVERRIDE RUN METHOD

        while(true) {
            System.out.println("Thread two is running");
                    }
        }

}

class myThread3 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running using Runnable 1");
    }
}

class myThread4 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running using Runnable 2");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) { //sleep and join methods throws interrupted exception if not catched
                                           // will throw exception or give error
            throw new RuntimeException(e);
        }

    }
}
public class multiThreading {

    public static void main(String[] args) {

        // IMPLEMENTATION USING THREAD CLASS

        myThread1 t1=new myThread1();

        myThread2 t2 = new myThread2();

        t1.start();
        t2.start();

        // IMPLEMENTATION USING RUNNABLE INTERFACE
        myThread3 t3 = new myThread3();

        Thread g1=new Thread(t3); //LOAD THREAD OBJECT IN THREAD INTERFACE

        myThread4 t4 = new myThread4();
        Thread g2=new Thread(t4);
            t1.setPriority(Thread.MAX_PRIORITY); //Setting priority

    }
}
