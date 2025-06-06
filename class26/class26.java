package class26;


class MyThread extends Thread{
    public void run(){
        for(int i = 0; i<10; i++)
        {
         System.out.println(getName() + " is running with priority " + getPriority());
         Thread.yield();
        }
    }
}

public class class26 {
    public static void main(String[] args) {
        // System.out.println("idhar dekho");

        // Thread t1 = new Thread(()->{
        //     System.out.println("Hello");
        //     try {
        //         Thread.sleep(2000);
        //     } catch (Exception e) {
        //     }
            
        //     System.out.println("Ham Last Me aayenge");
        // });

        // Thread t2 = new Thread(()->{
        //     System.out.println("Hiiii");
        // });

        // t1.start();
        // t2.start();


        
    
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("lower priority thread ");
        t2.setName("higher priority thread ");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();




    }
    
}
