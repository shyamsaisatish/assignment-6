package lab6;
import java.util.*;
public class Q2Tester {
	public static void main(String[] args) {
	Book book1 = new Book(1, "head first java", "kathy");
	Book book2 = new Book(4, "let us c", "Yaswanth");
	BookCollection bookCollection = new BookCollection();
	bookCollection.bookList.add(book1);
	bookCollection.bookList.add(book2);
	printBooks(bookCollection.bookList);
	
	//check whether book java in depth is there or not
	Book bookUpdate = new Book("Java in depth", "agarwal");
	bookCollection.hasBook(bookUpdate);
	
	System.out.println("Sorting by book title");
	bookCollection.sortByBookName();

	System.out.println("Sorting by author name");
	bookCollection.sortByAuthor();
}

private static void printBooks(List<Book> bookList) {
	for(Book book: bookList) {
		System.out.println(book);
	}
}
}
