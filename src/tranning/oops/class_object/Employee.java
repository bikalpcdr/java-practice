package tranning.oops.class_object;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
public class Employee {
    //field (state)
    String name;
    double salary;

    //method (behavior)
    void showDetails(){
        System.out.println(name+ " earns "+salary);
    }

    // no-arg (default) constructor
    public Employee() {
        name = "Unknown";
        salary = 0.0;
    }

    // parameterized constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}

class Main{
    static void main() {
        Employee emp1 = new Employee(); // object created on the heap
        emp1.name = "Bikalpa";
        emp1.salary = 50000.00;
        emp1.showDetails();

        Employee emp2 = new Employee(); // independent object
        emp2.name = "Paaley Daii";
        emp2.salary = 60000.00;
        emp2.showDetails();

        /*for constructor demo*/
        Employee  employee = new Employee("Sneha", 55000.00);
        employee.showDetails();
        Employee employee2 = new Employee();
        employee2.showDetails();
    }
}
