package tranning.oops.polymorphism;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
public class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dod extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {
    static void main() {
        /*Runtime polymorphism*/
        Animal[] animals = {
                new Dod(),
                new Cat(),
                new Animal()
        };

        for (Animal animal : animals) {
            animal.makeSound(); /*each object decides its own behavior at runtime*/
        }

        /*Compile-time polymorphism*/
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2.5, 3.7));
        System.out.println(calc.add(2, 3, 4));
    }
}

