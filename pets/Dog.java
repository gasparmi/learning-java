package pets;

public class Dog {

    private String name;

    // constructor
    public Dog(String name) {
        this.name = new String(name);
    }

    // getters
    public String getName() {
        return this.name;
    }

    public static String says() {
        return "woof";
    }
}