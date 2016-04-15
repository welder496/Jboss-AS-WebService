package br.jus.cnj.message;

import javax.jws.WebService;

/**
 * Exemplo de WebService para Jboss
 * @author welder
 *
 */

@WebService(serviceName = "MessageInt", portName = "MessageInt", name = "MessageInt", endpointInterface = "br.jus.cnj.message.MessageInt")
public class MessageImpl implements MessageInt {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Mensagem retornada por um webService!!";
	}

}
