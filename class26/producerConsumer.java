package class26;

class simplewaitNotify{
     
    private boolean isSignal = false;

    public synchronized void waitforSignal(){
        isSignal = true;
        System.out.println("Producer Sending Signal....");
        notify();
    }

    public synchronized void waitforConsumer(){

        while(!isSignal){
     try {
        System.out.println("Waiting For the signal......");
        wait();
     } catch (Exception e) {
     }
   }
   System.out.println("Consumer Received signal......");

    }

}

public class producerConsumer {
    public static void main(String[] args) {
        simplewaitNotify obj = new simplewaitNotify();

        Thread producer = new Thread(()->{
            try {
                Thread.sleep(2000);
                obj.waitforSignal();
            } catch (Exception e) {
                // TODO: handle exception
            }
        });


        Thread consumer = new Thread(obj::waitforSignal);


        consumer.start();
        producer.start();
    }
    
}
