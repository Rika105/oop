package problem1b;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public LibraryItem(String title,String author,int publicationYear) {
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	
	public abstract int getMaxBorrowDays();

@Override
public String toString() {
	return title + " by " + author + "( " + publicationYear + ")";
}

}
