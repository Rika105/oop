package pr5.io.app;

import pr5.io.model.Book;

import java.io.*;
import java.util.*;

public class LibraryApp {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

       
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("library.dat"))) {
            books = (ArrayList<Book>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No existing file, starting fresh.");
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(A)dd or (L)ist or (Q)uit:");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("A")) {
                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                books.add(new Book(title, author));

            } else if (choice.equalsIgnoreCase("L")) {
                for (Book b : books) {
                    System.out.println(b);
                }

            } else if (choice.equalsIgnoreCase("Q")) {
                break;
            }
        }

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("Save error");
        }

        sc.close();
    }
}
