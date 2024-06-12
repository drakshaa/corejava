package constructor;

public class Employee {
	int salary;
	int work_hours;
	
	void getInfo(int salary, int work_hours) {
		this.salary = salary;
		this.work_hours = work_hours;
	}
	
	void AddSal() {
		if (salary<500) {
			salary += 10;
		}
	}
	
	void AddWork() {
		if(work_hours>6) {
			salary += 5;
		}
	}
	void getSalary() {
		System.out.println("Total Salary = $" +salary);
	}
}
