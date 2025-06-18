package class24;

//Multithreading 

class MyThread extends Thread {
  // public void run(){
  //   System.out.println("Hello");
    
  //   try {
  //       Thread.sleep(3000);
  //   } catch (Exception e) {
    
  //   }

  //   System.out.println("Hiiii");
  // }

  public void run(){

    for(int i = 1; i<=5; i++)
    {
      System.out.println(i);
          try {
        Thread.sleep(i*1000);
    } catch (Exception e) {
    
    }
    }
  }
    
}

 class  downloadFile{
     public static void file(String file){
        for(int i = 1; i<=5; i++){
          System.out.println(file+" downloading...." + (i*20) + "%");
          
         try {
             Thread.sleep(2000);
            } 
            catch (Exception e) {
                  
           }
        }
        System.out.println(file+" Done ");
     }
    
}

class thread extends Thread{
      String fileName;
      
      public thread(String fileName)
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

public class class24 {
    public static void main(String[] args) {
        // MyThread T1 = new MyThread();
        // T1.start();
        // System.out.println("Hiii");

        // downloadFile.file("File A");
        // downloadFile.file("File B");

        
        //   thread t1 = new thread("File A");
        //   thread t2 = new thread("File B");

        //   t1.start();
        //   t2.start();
       
           MyThread T1 = new MyThread();
        T1.start();
    }
}
