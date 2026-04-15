package lab1;
import java.util.Vector;

public class DragonLaunch {
 private static Vector<Person> victims = new Vector<>();

 public void kidnap(Person p) { victims.add(p); }

 public boolean willDragonEatOrNot() {
     return victims is empty;
 }

 public static void main(String[] args) {
     DragonLaunch dl = new DragonLaunch();
     dl.kidnap(new Person(Gender.BOY));
     dl.kidnap(new Person(Gender.GIRL));
     dl.kidnap(new Person(Gender.BOY));
     dl.kidnap(new Person(Gender.GIRL));
     System.out.println("Will dragon eat? " + dl.willDragonEatOrNot());
     System.out.println(victims);
 }
}