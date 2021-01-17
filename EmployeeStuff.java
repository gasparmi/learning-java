import employees.Employee;

class EmployeeStuff {
    public static void main(String[] args) {
        Employee e = new Employee("Luke Skywalker", 1, 40.00);
        System.out.println(e.getName() + " earns " + e.getMonthlyPay(160));
    }
}