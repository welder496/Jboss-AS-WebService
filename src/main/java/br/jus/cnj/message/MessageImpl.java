package br.jus.cnj.message;

import javax.jws.WebService;

@WebService(serviceName = "MessageInt", portName = "MessageInt", name = "MessageInt", endpointInterface = "br.jus.cnj.message.MessageInt")
public class MessageImpl implements MessageInt {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Mensagem retornada por um webService!!";
	}

}
