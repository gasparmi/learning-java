import pets.Cat;
import pets.Dog;

class PetStuff {
    public static void main(String[] args) {
        // the Cat class is defined in Cat.java
        // if Cat.java would've been in another directory, then this wouldn't work
        // we would need to use packages (more on this later...)
        Cat c = new Cat("Hobbess");
        System.out.println("The cat's name is: " +  c.getName());

        System.out.println("A cat says: " + Cat.says());
        System.out.println(c.getName() + " says: " + c.says());

        // Java's garbage collector will free/delete memory previously allocated for 
        // the first declaration on line 6. However, this doesn't mean that Java is
        // immune to memory leaks, so be careful. 
        c = new Cat("Garfield");

        Dog d = new Dog("Snoopy");
    }
}
