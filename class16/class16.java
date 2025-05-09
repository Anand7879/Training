
package class16;

abstract class Payment{
    abstract void pay(int x);
    void print(){
        System.out.println("Payment done");
    }
}

class UpiPayment extends Payment{
    void pay(int x){
        System.out.println("Payment done via upi " + x);
    }
}

class CardPayment extends Payment{
    void pay(int x){
        System.out.println("Payment done via card " + x);
    }
}

public class class16 {
    public static void main(String[] args) {
        Payment obj = new UpiPayment();
        obj.pay(10000);
        obj.print();
        Payment obj1 = new CardPayment();
        obj1.pay(14000);
        obj1.print();

        Test t = new Test();
       t.method();
    }
}