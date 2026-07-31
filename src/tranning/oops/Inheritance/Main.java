package tranning.oops.Inheritance;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
public class Main {
    static void main() {
        Dog d = new Dog("TOmmy");

        d.eat(); // from animal
        d.sleep(); // from animal
        d.bark(); // from dog class
    }
}
