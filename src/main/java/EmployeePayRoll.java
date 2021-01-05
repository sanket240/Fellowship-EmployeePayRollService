public class EmployeePayRoll {
    int id;
    String name;
    int Salary;

    public EmployeePayRoll(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayRoll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
