package problem1b;

public class Book extends LibraryItem{
	private int NumberOfPages;
	
	public Book(String author,String title,int publicationYear,int NumberOfPages) {
		  super(title,author,publicationYear);
		  this.NumberOfPages=NumberOfPages;
	}
	
@Override
public int getMaxBorrowDays() {
	return 60;
}

@Override 
public String toString() {
	return super.toString() + ", pages " + NumberOfPages;
}
}
