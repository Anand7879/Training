package class25;

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread using runnable intrface");
    }
}

class MyThread implements Runnable{
      String fileName;
      
      public MyThread(String fileName)
      {
        this.fileName = fileName;
      }

       public void run(){
        for(int i = 1; i<=5; i++)
        {
              System.out.println(fileName+" downloading...." + (i*20) + "%");
          
         try {
             Thread.sleep(2000);
            } 
            catch (Exception e) {
                  
           }
        }
        System.out.println(fileName + " Done");

    
      }
}

class Hello extends Thread{
   static int Totalbalance = 1000;
        int balance;

     public Hello(int balance){
         this.balance = balance;
     }
     
     public void run(){
         
         synchronized(Hello.class){

            if(Totalbalance >= balance){

                System.out.println(Thread.currentThread().getName());
                System.out.println(balance + " Successfully Withdrow");
       
                Totalbalance-=balance;
       
                System.out.println("Remaining Balance = "+ Totalbalance); 
       
            }else{
                System.out.println("Insufficient Balance");
            }
       
         }

        }


}

public class class25 {
    public static void main(String[] args) {
        // MyRunnable obj = new MyRunnable();
        // Thread T1 = new Thread(obj);
        // T1.start();

        // try {
        //     T1.join();
        // } catch (Exception e) {
    
        //     e.printStackTrace();
        // }
        
        // System.out.println("Main Thread Is Running");

        // MyThread obj = new MyThread("File A");
        // Thread T1 = new Thread(obj);
        // T1.start();
        //  MyThread obj1 = new MyThread("File B");
        // Thread T2 = new Thread(obj1);
        // T2.start();

        
         Hello t1 = new Hello(800);
         Hello t2 = new Hello(200);

         t1.start();
         t2.start();

          
    }
    
}
