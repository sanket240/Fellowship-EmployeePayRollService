import java.util.ArrayList;
import java.util.Scanner;
public class EmployeePayRollService
{
    ArrayList<EmployeePayRoll> employeePayrolllist=new ArrayList<>();
    public void addEmployee( Scanner sc)
    {
        System.out.println("Enter Id:");
        int id=sc.nextInt();
        System.out.println("Enter Name:");
        String name=sc.next();
        System.out.println("Enter Salaray:");
        int Salary=sc.nextInt();
        System.out.println("Employee added");
        employeePayrolllist.add(new EmployeePayRoll(id,name,Salary));
        System.out.println("Added");
    }
    public static void main(String args[])
    {
      EmployeePayRollService emp=new EmployeePayRollService();
      Scanner sc=new Scanner(System.in);
      emp.addEmployee(sc);
    }
}
