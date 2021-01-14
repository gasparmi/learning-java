package pets;
// the package name has to match the name of the dir name, including subdirectories

// a public class is usable anywhere, by any other class
// ONLY one public class can exist in a file
// if we have a public class in a file, it has to have the same name as the file
public class Cat {

    private String name;

    // this will be shared acrros all classes in this directory, ./
    // final means CONST, so it cannot be modified
    private static final int INIT_NUM_LIVES = 9; 

    // constructor
    public Cat(String name) {
        // in Java, there is no arrow (->) operator
        this.name = new String(name);
    }

    // getters
    public String getName() {
        return this.name;
    }

    // this will be shared acrros all classes in this directory, ./
    public static String says() {
        return "meow";
    }
}