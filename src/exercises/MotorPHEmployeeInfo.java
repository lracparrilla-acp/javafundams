package exercises;


class Employee {
    int employeeNumber;
    String fullName;
    String birthday;

    Employee(int employeeNumber, String fullName, String birthday) {
        this.employeeNumber = employeeNumber;
        this.fullName = fullName;
        this.birthday = birthday;
    }

    void display() {
        System.out.println("Employee Number: " + employeeNumber + " " + "Employee Name: " + fullName + " " + "Birthday: " + birthday);
    }
}

/**
 * MotorPH display employee info
 *
 * @author AC Parrilla
 * @version 1.01
 */
public class MotorPHEmployeeInfo {
    public static void main(String[] args) {

        Employee emp1 = new Employee(10001, "Juan Dela Cruz", "1990-01-01");
        Employee emp2 = new Employee(10002, "Juana Dela Cruz", "1990-02-01");
        Employee emp3 = new Employee(10003, "Pedro Penduko", "1991-03-01");
        Employee emp4 = new Employee(10004, "Juan Dela Cruz", "1990-01-01");

        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1 -> emp1.display();
                case 2 -> emp2.display();
                case 3 -> emp3.display();
                case 4 -> emp4.display();
            }
        }


    }
}
