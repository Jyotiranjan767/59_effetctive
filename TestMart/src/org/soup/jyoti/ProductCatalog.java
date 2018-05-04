package org.soup.jyoti;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.soup.jyoti.business.ProductServiceImpl;
import org.soup.jyoti.model.Product;

   @WebService(endpointInterface="org.soup.jyoti.ProductCatalogInterface",
		   serviceName="testmartCatalogService",portName="testmartCatalogPort")
   public class ProductCatalog implements ProductCatalogInterface {
	   ProductServiceImpl psImpl=new ProductServiceImpl();
	   /* (non-Javadoc)
	 * @see org.soup.jyoti.ProductCatalogInterface#getProductCatagories()
	 */
	@Override
	@WebMethod(action="fetch_actionCatagories",operationName="fetch_operationCatagories")
	   public List<String> getProductCatagories(){
		   return psImpl.getProductCatagories();
		   
	   }
	   /* (non-Javadoc)
	 * @see org.soup.jyoti.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	@WebMethod
	   public List<String> getProducts(String catagory){
		   return psImpl.getProducts(catagory);
	   }
	   /* (non-Javadoc)
	 * @see org.soup.jyoti.ProductCatalogInterface#addProducts(java.lang.String, java.lang.String)
	 */
	@Override
	@WebMethod
	   public boolean addProducts(String product,String catagory){
		   return psImpl.addProduct(product, catagory);
	   }
	   /* (non-Javadoc)
	 * @see org.soup.jyoti.ProductCatalogInterface#deleteProduct(java.lang.String, java.lang.String)
	 */
	@Override
	@WebMethod
	   public boolean deleteProduct(String product,String catagory){
		   return psImpl.deleteProduct(product, catagory);
	   }
	   
	   /* (non-Javadoc)
	 * @see org.soup.jyoti.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	@WebMethod(exclude=false)
	   public List<Product> getProductsv2(String catagory){
		   return psImpl.getProductsv2(catagory);
	   }
	

   }
