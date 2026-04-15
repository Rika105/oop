package lab1;
enum Genre{
	FICTION,SCIENCE,HISTORY
}

public class Book {
	public static final String LIBRARY_NAME="KBTU library";
	public static int totalbooks=0;
	private final String isbn;
	private String title;
	private Genre genre;
	{
		totalbooks++;
		System.out.println("New book is being added....");
	}
	public Book(String isbn) {
		this.isbn=isbn;
		this.title="Unknown";
	}
	public Book(String isbn,String title,Genre genre) {
		this(isbn);
		this.title=title;
		this.genre=genre;
	}
	public void printInfo() {
		System.out.println("Book: "+ title + ", ISBN: "+isbn);
	}
	public void printInfo(boolean detailed) {
		printInfo();
		if(detailed) {
			System.out.println("Genre: "+genre);
			System.out.println("Library: "+ LIBRARY_NAME);
		}
	}

}
