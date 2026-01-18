
package test;

// Interface example

public interface Animal {
    void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog is barking.");
    }
}

class Cat implements Animal{
    public void makeSound(){
        System.out.println("Cat is meowing.");
    }
}

class AmlTest{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.makeSound();
        cat.makeSound();
    }
}
