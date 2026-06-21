package java_program_structure;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/4/28
 */

// this is car test class to instantiate and call Car Objects.
public class CarTest {
    void main() {
        Car maruti = new Car("Red", 160);
        Car ferrari = new Car("Yellow", 400);
        IO.println(maruti.carInfo());
        System.out.println(ferrari.carInfo());
    }
}
