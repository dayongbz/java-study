package c.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();

        calculateSalary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        long salary = 0;
        switch (employee.type) {
            case 1:
                salary = employee.getSalary() / 100 * 5;
                break;
            case 2:
                salary = employee.getSalary() / 100 * 110;
                break;
            case 3:
                salary = employee.getSalary() / 100 * 120;
                break;
            case 4:
                salary = employee.getSalary() / 100 * 130;
                break;
            case 5:
                salary = employee.getSalary() / 100 * 200;
                break;
        }
        return salary;
    }

    public void calculateSalaries() {
        Employee[] employees = {new Employee("LeeDaeRi", 1, 1000000000), new Employee("KimManager", 2, 100000000), new Employee("WhangDesign", 3, 70000000), new Employee("ParkArchi", 4, 80000000), new Employee("LeeDevelop", 5, 60000000)};

        for (Employee employee : employees) {
            System.out.println(employee.getName() + "=" + this.getSalaryIncrease(employee));
        }
    }
}
