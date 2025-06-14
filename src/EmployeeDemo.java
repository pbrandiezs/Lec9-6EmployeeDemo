public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("John", "Smith", 28);
        employees[1] = new Worker("John", "Wick", 53);
        employees[2] = new Worker("Chuck", "Norris", 70);
        employees[3] = new Manager("Clint", "Eastwood", 75);
        employees[4] = new Worker("Sylvestor", "Stalone", 75);

        for(Employee employee : employees) {
            System.out.println("Name: " + employee.getFirstName() +
                    " " + employee.getLastName() + ", age " +
                    employee.getAge() + " says, " );
            System.out.println("\t" + employee.work() + "\n");
        }
    }
}
