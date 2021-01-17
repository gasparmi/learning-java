package employees;

public class Instructor extends Employee implements Lecturer{

    private int appointmentMonths;

    // constructor
    public Instructor(String name, int id, double salary, int appointmentMonths) {
        // this.name = name; Cannot do this because name is a private member in Employee class
        // instead call the Employee's constructor via super()
        super(name, id, salary);
        this.appointmentMonths = appointmentMonths;
    }

    // our intend is to override this super class's method
    @Override 
    public double getMonthlyPay(double hoursWorked) {
        return this.getPayRate() / this.appointmentMonths;
    }

    // this is an overloaded function
    // this method doesn't match anything on the Employee class
    public double getMonthlyPay() {
        return this.getPayRate() / this.appointmentMonths;
    }

    public String deliverLecture() {
        return "Today we'll learn about Java programming language and more...";
    }
}