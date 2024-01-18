package oopWithNLayeredApp1.dataAccess;

import oopWithNLayeredApp1.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi");	
	}
}
