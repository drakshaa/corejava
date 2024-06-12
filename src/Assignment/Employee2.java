package Assignment;

public class Employee2 {
    int sal;
    int workhr;

    void getInfo(int salary, int work_hour) {
        sal = salary;
        workhr = work_hour;
    }

    void AddSal() {
        if (sal < 500) {
            sal += 10;
        }
    }

    void AddWork() {
        if (workhr > 6) {
            sal += 5;
        }
    }

    void printFinalSalary() {
        System.out.println("Final Salary: $" + sal);
    }
}
