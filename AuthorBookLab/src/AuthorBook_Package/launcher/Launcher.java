package AuthorBook_Package.launcher;
import AuthorBook_Package.Author;
import AuthorBook_Package.Book;
public class Launcher {
	public static void main(String[] args) {
		Author myAuthor = new Author("jean","jean@mail.com",'m');
		Book myBook = new Book("lotr", myAuthor  , 50F, 5);
		System.out.println(myAuthor.getName());
		System.out.println(myBook);
	}
}
