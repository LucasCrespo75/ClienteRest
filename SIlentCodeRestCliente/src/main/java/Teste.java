import entidade.RetornoServico;
import entidade.Usuario;
import servico.ServicoCliente;

public class Teste {

	public static void main(String[] args) {
		RetornoServico retorno = ServicoCliente.pesquisarUsuario("666666");
		if(retorno.getCodigoRetorno() == 0) {
			System.out.println(retorno.getUsuarioRetorno().getNome());
		}else {
			System.out.println("Retorno invalido!!!");
		}
		
//		Usuario usuario = new Usuario();
//		usuario.setCpf("666666");
//		usuario.setEmail("6@666");
//		usuario.setNome("Angel ok");
//		usuario.setSenha("12345");
//		
//		retorno = ServicoCliente.cadastrarUsuario(usuario);
//		if(retorno.getCodigoRetorno() == 0) {
//			System.out.println("Cadastrado com sucesso!!");
//		}else {
//			System.out.println("Retorno invalido - Cadastro Usuario!!!");
//		}
		
	}

}
