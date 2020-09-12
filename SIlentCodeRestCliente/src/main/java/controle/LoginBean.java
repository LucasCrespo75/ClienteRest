package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidade.RetornoServico;
import entidade.Usuario;
import servico.ServicoCliente;

@ManagedBean(name = "LoginBean")
@SessionScoped
public class LoginBean {

	private String txtCpf;
	private String txtSenha;

	private List<Usuario> listaUsuarios;
	private Usuario usuario; // Objeto para cadastro
	private String msgCadastroUsuario;

	
	public LoginBean() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
	}

	public String entrar() {

		RetornoServico retorno = ServicoCliente.pesquisarUsuario(this.txtCpf);
		
		if(retorno.getCodigoRetorno() == 0) {
			if(retorno.getUsuarioRetorno().getSenha().equalsIgnoreCase(this.txtSenha)) {
				System.out.println("Usuario Valido - OK");
			} else {
				System.out.println("Usuario Invalido - falha");
			}
		}else {
			System.out.println("Usuario não existe");
		}
		
		return "";
	}

	public void criarUsuario() {

		Usuario novo = new Usuario();

		novo.setNome(this.usuario.getNome());
		novo.setCpf(this.usuario.getCpf());
		novo.setSenha(this.usuario.getSenha());
		novo.setEmail(this.usuario.getEmail());

		RetornoServico retorno = ServicoCliente.cadastrarUsuario(novo);
		
		if(retorno.getCodigoRetorno() == 0) {
			System.out.println("Usuario cadastrado");
		}else {
			System.out.println("Falha ao cadastrar usuario");
		}

	}

	public String getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(String txtSenha) {
		this.txtSenha = txtSenha;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getMsgCadastroUsuario() {
		return msgCadastroUsuario;
	}

	public void setMsgCadastroUsuario(String msgCadastroUsuario) {
		this.msgCadastroUsuario = msgCadastroUsuario;
	}

	public String getTxtCpf() {
		return txtCpf;
	}

	public void setTxtCpf(String txtCpf) {
		this.txtCpf = txtCpf;
	}

}
