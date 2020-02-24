package online_store_app;

import online_store_app.auth.Users;
import online_store_app.configuration.AppConfiguration;
import online_store_app.model.Book;
import online_store_app.auth.IUserAuthService;
import online_store_app.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicApplication.class, args);
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfiguration.class);

		IUserAuthService userAuthService = context.getBean(IUserAuthService.class);
		//test user
		//User testUser = new User("adam.tomasiewicz@outlook.com","password1");
		//userAuthService.saveUser(testUser);
		System.out.println(userAuthService.getUserByID(1));

		List<Users> listOfUsers = userAuthService.getAllUsers();
		for (Users user: listOfUsers) {
			System.out.println(user);
		}

		Product productService = context.getBean(Product.class);
		//test Book
		//Book testBook = new Book("Wiedzmin","Andrzej Sapkowski");

//		libraryBookService.saveBook(testBook);
//		System.out.println(libraryBookService.getBookByID(1));
//		libraryBookService.saveBook(new Book("Wiedzmin","Andrzej Sapkowski"));
//		libraryBookService.saveBook(new Book("Java Podstawy","Cay S. Horstman"));
//		libraryBookService.saveBook(new Book("Pismo Swiete","Pan Bóg"));
//		libraryBookService.saveBook(new Book("Pan Tadeusz","Adam Mickiewicz"));
//		libraryBookService.saveBook(new Book("Potop","Henryk Sienkiewicz"));
//		libraryBookService.saveBook(new Book("Zbrodnia i kara","Fiodor Dostoyewski"));

		List<Product> listOfProducts = productService.getAllProductsFromDB();
		for (Product product: listOfProducts) {
			System.out.println(product);
		}
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//ILibraryBookService libraryBookService = context.getBean(ILibraryBookService.class);
	}

}
