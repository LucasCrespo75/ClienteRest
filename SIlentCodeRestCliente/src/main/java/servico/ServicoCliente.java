package servico;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import entidade.Entrada;
import entidade.RetornoServico;
import entidade.Usuario;

public class ServicoCliente {

	public static RetornoServico pesquisarUsuario(String cpf) {
		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:9090/SilentCodeRest/rest/usuario/pesquisarUsuario?cpf=" + cpf);

			ClientResponse response = webResource.type("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			RetornoServico retornoServico = response.getEntity(RetornoServico.class);

			return retornoServico;

		} catch (Exception e) {

			e.printStackTrace();

		}
		return null;

	}

	public static RetornoServico cadastrarUsuario(Usuario usuario) {
		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:9090/SilentCodeRest/rest/usuario/cadastrarUsuario");

			ClientResponse response = webResource.type("application/json").post(ClientResponse.class, usuario);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			RetornoServico retornoServico = response.getEntity(RetornoServico.class);
			return retornoServico;

		} catch (Exception e) {

			e.printStackTrace();

		}
		return null;

	}
	public static RetornoServico pesquisarEntrada(Entrada entrada) {
		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:9090/SilentCodeRest/rest/entrada/ pesquisaEntrada");

			ClientResponse response = webResource.type("application/json").post(ClientResponse.class, entrada);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			RetornoServico retornoServico = response.getEntity(RetornoServico.class);
			return retornoServico;

		} catch (Exception e) {

			e.printStackTrace();

		}
		return null;
	
	
}


}
