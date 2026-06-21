package java_program_structure;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/4/28
 */
public class Car {
    private String color;
    private int maxSpeed;

    public String carInfo(){
        return color+"Max Speed:-"+maxSpeed;
    }

    // this is constructor of Car class
    Car(String carColor, int speedLimit){
        this.color = carColor;
        this.maxSpeed = speedLimit;
    }
}
