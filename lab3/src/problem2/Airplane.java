package problem2;
interface Moveable {
	void move();
}

interface Flyable extends Moveable{
	void fly();
}


public class Airplane implements Flyable{
@Override
public void move() {
	System.out.println("Moving");
}
@Override
public void fly() {
	System.out.println("Flying");
}

}
