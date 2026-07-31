package tranning.oops.Inheritance;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }


    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}


