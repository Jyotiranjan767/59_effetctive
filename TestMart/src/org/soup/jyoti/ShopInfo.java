package org.soup.jyoti;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.soup.jyoti.exception.InvalidException;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class ShopInfo {

	@WebResult(partName="lookUpOutput")
	public String getShopInfo(@WebParam(partName="lookUpInput") String property) throws InvalidException{
		String response="invalid Prompt";
		if("shopName".equalsIgnoreCase(property)){
			response="Test mart";
		}else if("since".equalsIgnoreCase(property)){
			response="Since 2012";
		}
		else{
			throw new InvalidException("invalid input ",property+ " that you have sent seems to be invalid");
		}
		return response;
	}
}
