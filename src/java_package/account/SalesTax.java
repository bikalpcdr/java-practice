package java_package.account;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/4/28
 */
public class SalesTax {
    void main() {
        int interestAmount = new java_package.calculate.MyCalculation().calculateInterest(1000,8);
        System.out.println("The interestAmount is " + interestAmount);
        int intAmount = new java_package.calculate.MyCalculation().calculateInterest(1000,10);
        System.out.println("The intAmount is " + intAmount);
    }
}
