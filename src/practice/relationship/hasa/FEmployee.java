
package practice.relationship.hasa;


public class FEmployee {
    int empId;
    String empName;
    FDepartment dept;   // HAS-A relationship

    FEmployee(int empId, String empName, FDepartment dept) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " + dept.deptId);
        System.out.println("Department Name: " + dept.deptName);
    }
}
