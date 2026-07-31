package tranning.function;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
public class Calculator {
    /* method signature: modifier returnType methodName(parameters)*/
    public int add(int a, int b) {
        return a + b;
    }

    public void printMessage(String message){ // return nothing job done here
        System.out.println(message);
    }

    static void main() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        calculator.printMessage("Addition is " + result);
    }

    /**
     Method signature = name + parameter types (used for overloading resolution)
     return type must match what's returned; void means nothing is returned
     Parameters are passed by value in Java
     — for objects/arrays, the reference value is copied,
     so the method can mutate the object's internals but can't reassign the caller's variable
     * */
}
