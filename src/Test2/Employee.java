package Test2;

public class Employee {
    private String employeeId,employeeName;
    private double salary,taxamount;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(double taxamount) {
        this.taxamount = taxamount;
    }

    public Employee(String employeeId, String employeeName, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
}
