package lab1;

public class Main {
	public static void main(String[] args) {
		Book book1=new Book("957-5-1234","Java prog",Genre.SCIENCE);
		Book book2=new Book("957-5-5678");
		System.out.println("---Info about Book1");
		book1.printInfo(true);
		
		System.out.println("---Info about Book2");
		book2.printInfo(false);
		
		System.out.println(Book.totalbooks);
	}

}
