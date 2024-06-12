package Assignment;

public class Test1 {
	public static void main(String[] args) {
	
	  Employee emp1 = new Employee();
      emp1.name = "Robert";
      emp1.year = 1994;
      emp1.address = "64C- WallsStreat";

      Employee emp2 = new Employee();
      emp2.name = "Sam";
      emp2.year = 2000;
      emp2.address = "68D- WallsStreat";

      Employee emp3 = new Employee();
      emp3.name = "John";
      emp3.year = 1999;
      emp3.address = "26B- WallsStreat";

      System.out.println("Name\tYear of joining\t Address");
      emp1.printEmployeeInfo();
      emp2.printEmployeeInfo();
      emp3.printEmployeeInfo();
	}
}
