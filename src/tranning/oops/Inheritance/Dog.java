package tranning.oops.Inheritance;

public class Dog extends Animal { /*Dog inherits eat() and sleep() from Animal*/
    Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}