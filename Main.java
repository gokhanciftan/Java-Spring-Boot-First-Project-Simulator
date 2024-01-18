package oopWithNLayeredApp1;

import oopWithNLayeredApp1.business.ProductManager;
import oopWithNLayeredApp1.core.logging.DatabaseLogger;
import oopWithNLayeredApp1.core.logging.FileLogger;
import oopWithNLayeredApp1.core.logging.Logger;
import oopWithNLayeredApp1.core.logging.MailLogger;
import oopWithNLayeredApp1.dataAccess.HibernateProductDao;
import oopWithNLayeredApp1.dataAccess.JdbcProductDao;
import oopWithNLayeredApp1.entities.Product;

public class Main {

	public static void main(String[] args)throws Exception {
		Product product1 =new Product(1,"Iphone XR", 10000);
		

		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
	}

}
