package org.soup.jyoti.business;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;

import org.soup.jyoti.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList=new ArrayList<>();
	List<String> moviesList=new ArrayList<>();
	List<String> musicList=new ArrayList<>();

	public ProductServiceImpl(){
	
		bookList.add("book1");
		bookList.add("book2");
		bookList.add("book3");
		
		moviesList.add("movies1");
		moviesList.add("movies2");
		moviesList.add("movies3");
		
		musicList.add("music1");
		musicList.add("music2");
		musicList.add("music3");
		
		
	}
	@WebMethod
	public List<String> getProducts(String catagory){
		switch(catagory){
		
		case "books":
		return bookList;
		
		case "movies":
			return moviesList;
			
		case "music":
			return musicList;
		
		
		}return null;
	}
	public boolean addProduct(String product,String catagory){ 
		switch(catagory){
		
		case "books":
			bookList.add(product);
			break;
		case "movies":
			moviesList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
			default:
			return false;	
		}
		return true;
	}
	
	public boolean deleteProduct(String product,String catagory){
		
		switch(catagory){
		
		case "books":
			bookList.remove(product);
			break;
		case "movies":
			moviesList.remove(product);
			break;
		case "music":
			musicList.remove(product);
			break;
			default :
				return false;
		}
		return true;
		
	}
	
	
	@WebMethod
	public List<String> getProductCatagories(){
	List<String> catagories=new ArrayList<>();
	catagories.add("books");
	catagories.add("movies");
	catagories.add("music");
	
	return catagories;
   }
	

	public List<Product> getProductsv2(String catagory) {

		List<Product> pro=new ArrayList<>();
		pro.add(new Product("Vaidehi", "EPIP industrial Area4", 515.2423));
		pro.add(new Product("rc -1 block", "EPIP industrial Area2", 42.2453));
		pro.add(new Product("number 82", "EPIP industrial Area3", 542115.224));
		pro.add(new Product("WhiteField", "EPIP industrial Area1", 51524.2254));
		return pro;
	}

}

