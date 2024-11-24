import java.util.ArrayList;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
 
    public int getId() {
        return id;
    }

    public abstract double CalculateSalary();

    @Override
    public String toString() {
        return "Employee [name = " + name + ", id = " + id + ", salary = " + CalculateSalary() + " ]";
    }
}

class FulltimeEmployee extends Employee {
    private double monthlysalary;

    public FulltimeEmployee(String name, int id, double monthlysalary) {
        super(name, id);
        this.monthlysalary = monthlysalary;
    }

    @Override
    public double CalculateSalary() {
        return monthlysalary;
    }
}

class parttimeEmployee extends Employee {
    private int hourWorked;
    private double hourlyrate;

    public parttimeEmployee(String name, int id, double hourlyrate, int hourWorked) {
        super(name, id);
        this.hourWorked = hourWorked;
        this.hourlyrate = hourlyrate;
    }

    @Override
    public double CalculateSalary() {
        return hourlyrate * hourWorked;
    }
}

class payrollSystem {
    private ArrayList<Employee> employeeList;

    // constructor
    public payrollSystem() {
        // declare employeeList
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee empToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                empToRemove = employee;
                break;

            }

        }
        if (empToRemove != null) {
            employeeList.remove(empToRemove);

        }
    }

    public void displayEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class Miniproject {
    public static void main(String[] args) {

        // create object of payrollsystem class
        payrollSystem payrollsystem = new payrollSystem();
        FulltimeEmployee emp1 = new FulltimeEmployee("Prayag", 17, 100000);
        parttimeEmployee emp2 = new parttimeEmployee("Lavesh", 15, 2000, 10);

        // adding employees
        payrollsystem.addEmployee(emp1);
        payrollsystem.addEmployee(emp2);

        System.out.println("initial employee details: ");
        payrollsystem.displayEmployee();

        //remove employee
        payrollsystem.removeEmployee(02);
        System.out.println("remaining employee details");
        payrollsystem.displayEmployee();
    }
}
