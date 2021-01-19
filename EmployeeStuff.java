import employees.Employee;
import employees.Instructor;
import employees.Lecturer;
import employees.Professor;

class EmployeeStuff {
    public static void main(String[] args) {
        Employee e = new Employee("Luke Skywalker", 1, 40.00);
        System.out.println(e.getName() + " earns " + e.getMonthlyPay(160));

        Instructor i = new Instructor("Leia Organa", 2, 1000000, 9);
        System.out.println(i.getName() + " earns " + i.getMonthlyPay(160));
        System.out.println(i.deliverLecture());

        // Polymorphism
        Employee ei = new Instructor("Rey", 3, 900000, 9);
        // dynamic memory dispatch example: Java will use
        // the Instructor's getMonthlyPay() method when calculating Rey's monthly payment
        // even though ei is of type Employee
        System.out.println(ei.getName() + " earns " + ei.getMonthlyPay(160));

        // we can type cast ei if we know it is an instructor
        System.out.println(((Instructor)ei).deliverLecture());

        Professor p = new Professor("Obi Wan Kenobi", 4, 2000000, 9);


        // an interface cannot be instantiated
        // Lecturer l = new Lecturer();
        // but we can do something like: 
        // Lecturer le = new Instructor(...);
        haveALecture(i);
        haveALecture(p);
    }

    public static void haveALecture(Lecturer l){
        System.out.println(l.getName() + " says: " + l.deliverLecture());
    }
}