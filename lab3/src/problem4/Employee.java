package problem4;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
 private double salary;
 private Date hireDate;
 private String insuranceNumber;
 
 public Employee(String name,double salary,Date hireDate,String insuranceNumber) {
	  super(name);
	  this.salary=salary;
	  this.hireDate=hireDate;
	  this.insuranceNumber=insuranceNumber;}
 
 @Override
 public int compareTo(Employee other) {
	 return Double.compare(this.salary,other.salary);
 }
 
 @Override
 public String toString() {
	 return super.toString() + "[Salary:  " + salary + ", Hired: " + hireDate + "]";
 }
 
 @Override
 public boolean equals(Object obj) {
	 if(!super.equals(obj)) return false;
	 Employee other=(Employee)obj;
	 return Double.compare(salary, other.salary)==0 && Objects.equals(insuranceNumber, other.insuranceNumber);
 }
 }
