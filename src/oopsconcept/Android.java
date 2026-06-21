package oopsconcept;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/4/28
 */
/*
Inheritance:
An important feature of object-oriented programs is inheritance—the ability to create classes that share the attributes
and methods of existing classes, but with more specific features. Inheritance is mainly used for code reusability. So
you are making use of already written the classes and further extending on that. That why we discussed the code
*reusability the concept. In general one line definition, we can tell that deriving a new class from existing class,
it’s called as Inheritance. You can look into the following example for inheritance concept. Here we have Mobile class
extended by other specific class like Android and Blackberry.
*/
public class Android extends Mobile {
    //Constructor to set properties/characteristics of object
    Android(String man,String o, String m,int c){
        super(man,o,m,c);
    }

    //Method to get access Model property of Object
    public String getModel(){
//        return "This is Blackberry-"+ model;

        return null;
    }
}
