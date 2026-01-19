
package evidenceproblemsolve.oop;

// Interface example

public interface Animal_Interface {
    void makeSound();
}

class Dog implements Animal_Interface{
    public void makeSound(){
        System.out.println("Dog is barking.");
    }
}

class Cat implements Animal_Interface{
    public void makeSound(){
        System.out.println("Cat is meowing.");
    }
}

class AmlTest{
    public static void main(String[] args) {
        Animal_Interface dog = new Dog();
        Animal_Interface cat = new Cat();
        
        dog.makeSound();
        cat.makeSound();
    }
}
