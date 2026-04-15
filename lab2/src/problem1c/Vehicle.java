package problem1c;

import java.util.Objects;

public abstract class Vehicle {
	private String brand;
	private int year;
	
	
	public Vehicle(String brand,int year) {
		this.brand=brand;
		this.year=year;
	}
	
@Override
public boolean equals(Object o) {
	if(this == o) return true;
	if (!(o instanceof Vehicle)) return false;
	Vehicle that=(Vehicle) o;
	return year==that.year && brand.equals(that.brand);
	
}

@Override
public int hashCode() {
	return Objects.hash(brand,year);
}

@Override
public String toString() {
	return brand + " ( " + year + " ) ";
}


}
