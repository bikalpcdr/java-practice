package tranning.oops.abstraction;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
abstract class PaymentMethod {
    abstract void pay(double amount); /* no body-> show what to do not how*/

    void printReceipt(double amount) { /*concrete method, shared by all subclass*/
        System.out.println("Receipt: Rs." + amount + " paid");
    }
}
class ESewaPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using ESewaPayment");
    }
}

class KhaltiPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using KhaltiPayment");
    }
}

class Main{
    static void main() {
        PaymentMethod esewa = new ESewaPayment();
        esewa.pay(2000);
        esewa.printReceipt(2000);

        PaymentMethod khalti = new KhaltiPayment();
        khalti.pay(1000);
        khalti.printReceipt(1000);

        //PaymentMethod pm = new PaymentMethod();
        // not allowed — cannot instantiate abstract class
    }
}

