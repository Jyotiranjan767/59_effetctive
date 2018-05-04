package org.soup.jyoti;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.soup.jyoti.model.Product;

@WebService(name="testmartCatalog",serviceName="testmartCatalogService",portName="testmartCatalogPort"
,targetNamespace="http://testmart.jyoti.org")
public interface ProductCatalogInterface {

	List<String> getProductCatagories();

	List<String> getProducts(String catagory);

	boolean addProducts(String product, String catagory);

	boolean deleteProduct(String product, String catagory);

	@WebMethod
	@WebResult(name="product")
	List<Product> getProductsv2(String catagory);

}