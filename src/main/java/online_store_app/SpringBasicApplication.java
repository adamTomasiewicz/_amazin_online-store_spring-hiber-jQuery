package online_store_app;

import online_store_app.auth.Users;
import online_store_app.configuration.AppConfiguration;
import online_store_app.model.AbstractProduct;
import online_store_app.services.AbstractProductUtils;
import online_store_app.services.UsersDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicApplication.class, args);
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfiguration.class);

		UsersDaoImpl usersDao = context.getBean(UsersDaoImpl.class);
		//test user
		Users testUser = new Users("adam.tomasiewicz@outlook.com","password1");
		usersDao.addProduct(testUser);
		System.out.println(usersDao.getProductByID(1));
		AbstractProductUtils productUtils = context.getBean(AbstractProductUtils.class);
		productUtils.loadData();
//		List<Users> listOfUsers = userAuthService.getAllUsers();
//		for (Users user: listOfUsers) {
//			System.out.println(user);
//		}

		//AbstractProduct abstractProductService = context.getBean(AbstractProduct.class);
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

//		List<AbstractProduct> listOfAbstractProducts = abstractProductService.getAllProductsFromDB();
//		for (AbstractProduct abstractProduct : listOfAbstractProducts) {
//			System.out.println(abstractProduct);
//		}
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//ILibraryBookService libraryBookService = context.getBean(ILibraryBookService.class);
	}

}
