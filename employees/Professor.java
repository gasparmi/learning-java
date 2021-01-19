package employees;

public class Professor extends Instructor implements Lecturer{


    // constructor
    public Professor(String name, int id, double salary, int appointmentMonths) {
        super(name, id, salary, appointmentMonths);
    }

    // our intend is to override this super class's method
    @Override 
    public String deliverLecture() {
        return "Much pontification...";
    }
}