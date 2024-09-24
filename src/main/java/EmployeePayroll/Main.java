package EmployeePayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        employeePayrollService payrollService = new employeePayrollService();

        payrollService.readEmpData();
        payrollService.writeEmpData();
    }
}
record empPayroll(int id , String name , double salary){

}
class employeePayrollService{
    private ArrayList<empPayroll> list = new ArrayList<>();

    public void readEmpData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee id:");
        int id = sc.nextInt();

        System.out.println("Enter Employee Name:");
        String name = sc.next();

        System.out.println();
        double salary = sc.nextDouble();

        empPayroll emp = new empPayroll(id,name , salary);
        list.add(emp);
    }

    public void writeEmpData(){
        System.out.println("Emp[loyeePayroll  Data:");
        for (EmployeePayroll.empPayroll empPayroll : list) {
            System.out.println(empPayroll);
        }
    }
}

