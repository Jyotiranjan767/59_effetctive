package org.soup.jyoti.endpoint;



import javax.xml.ws.Endpoint;

import org.soup.jyoti.ProductCatalog;

public class TestmartPublisher {

	public static void main(String sfi[]){
		
		Endpoint.publish("http://localhost:1235/productcatalog", new ProductCatalog());
		
	}
}
