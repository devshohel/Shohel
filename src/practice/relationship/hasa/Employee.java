
package practice.relationship.hasa;


class Employee {
    int empId;
    String empName;
    Department dept;   // HAS-A relationship

    Employee(int empId, String empName, Department dept) {
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
