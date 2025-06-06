package class26;

class Hello extends Thread{
   static int Totalbalance = 1000;
        int balance;

     public Hello(int balance){
         this.balance = balance;
     }
     
      private boolean isSignal = false;

     public synchronized void Withdrow(){
         isSignal = true;
          if(Totalbalance >= balance){

                System.out.println(Thread.currentThread().getName());
                System.out.println(balance + "Withdrow by " + Thread.currentThread().getName());
       
                Totalbalance-=balance;
       
                System.out.println("Remaining Balance = "+ Totalbalance); 
       
            }else{
                System.out.println("Insufficient Balance");
            }

            notify();
     }

    
     public synchronized void waitforSignal(){
        
        while(!isSignal){
     try {
        System.out.println("Waiting......");
        wait();
     } catch (Exception e) {
     }
   }
     System.out.println("Successfully withdrow by.......");
   
     }


    //  public void run(){
         
    //      synchronized(Hello.class){

    //         if(Totalbalance >= balance){

    //             System.out.println(Thread.currentThread().getName());
    //             System.out.println(balance + " Successfully Withdrow");
       
    //             Totalbalance-=balance;
       
    //             System.out.println("Remaining Balance = "+ Totalbalance); 
       
    //         }else{
    //             System.out.println("Insufficient Balance");
    //         }
       
    //      }

    //     }


}

public class Balance {

    public static void main(String[] args) {
         Hello t1 = new Hello(800);
         Hello t2 = new Hello(200);

         t1.start();
         t2.start();
    }
}
