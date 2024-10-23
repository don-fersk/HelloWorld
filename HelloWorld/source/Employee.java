import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rasmus Klump", 5000, LocalDate.of(2024, 8, 26));
        System.out.printf("Name: %s%nSalary: %.2f DKK%nHire Date: %s%nYears of Service: %d%n",
                emp.getName(), emp.getSalary(), emp.getHireDate(), emp.getYearsOfService());
    }
}
