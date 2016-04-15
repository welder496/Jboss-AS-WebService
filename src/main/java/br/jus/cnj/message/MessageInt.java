package br.jus.cnj.message;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MessageInt {
  
	@WebMethod
	public String getMessage();
	
}
