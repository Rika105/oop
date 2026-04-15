package Problem1;

public class Cube extends Shape3D {
    private double side;
    public Cube(double side) {
    	this.side=side;
    }
    
@Override
public double volume() {
	return Math.pow(side, 3.0);
}

@Override
public double surfaceArea() {
	return Math.pow(side, 2.0) * 6;
	
}
}
