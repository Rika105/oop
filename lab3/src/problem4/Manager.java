package problem4;
import java.util.Date;

import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insNum, double bonus) {
        super(name, salary, hireDate, insNum);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }
    
    @Override
    public int compareTo(Employee other) {
        int res = super.compareTo(other);
        if (res == 0 && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return res;}
    

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone(); 
        cloned.team = (Vector<Employee>) this.team.clone(); 
        return cloned;
    }

    @Override
    public String toString() {
        return super.toString() + " (Bonus: " + bonus + ", Team size: " + team.size() + ")";
    }
    
   
}
