package oopsconcept;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/4/28
 */
/*
Encapsulation:
Encapsulation means putting together all the variables (instance variables) and the methods into a single unit called
Class.It also means hiding data and methods within an Object.Encapsulation provides the security that keeps data and
methods safe from inadvertent changes.Programmers sometimes refer to encapsulation as using a “black box,” or a device
that you can use without regard to the internal mechanisms.A programmer can access and use the methods and data contained
in the black box but cannot change them.Below example shows Mobile class with properties, which can be set once while
creating object using constructor arguments. Properties can be accessed using getXXX() methods which are having public
access modifiers.
*/
public class Mobile {
    private String manufacturer;
    private String operatingSystem;
    private String model;
    private int cost;

    //Constructor to set properties/characteristics of object
    Mobile(String man, String o, String m, int c) {
        this.manufacturer = man;
        this.operatingSystem = o;
        this.model = m;
        this.cost = c;
    }

    //Method to get access Model property of Object
    public String getModel() {
        return this.model;
    }

    // We can add other method to get access to other properties
}
