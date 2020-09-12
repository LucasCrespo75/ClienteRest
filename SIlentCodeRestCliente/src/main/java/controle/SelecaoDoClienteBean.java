package controle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidade.Entrada;
import entidade.RetornoServico;
import servico.ServicoCliente;

@ManagedBean(name = "SelecaoDoClienteBean")
@SessionScoped

public class SelecaoDoClienteBean {
	
	private String nome_cliente;
	private String tel_cliente;
	private String placaVeiculo;
	private Date data_Inicio;
	private Date data_Fim;
	
	private List <Entrada> pesquisarEntrada;



	public SelecaoDoClienteBean() {
		this.pesquisarEntrada = new ArrayList<Entrada>();
		
	}
	
	
	public void pesquisar() {
		
		
	Entrada entrada	= new Entrada(); 
//	pesquisarEntrada = Entrada.pesquisar(entrada , data_Inicio, data_Fim);
		
	RetornoServico retorno = ServicoCliente.pesquisarEntrada(entrada);
		
	}


	public String getNome_cliente() {
		return nome_cliente;
	}


	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}


	public String getTel_cliente() {
		return tel_cliente;
	}


	public void setTel_cliente(String tel_cliente) {
		this.tel_cliente = tel_cliente;
	}


	public String getPlacaVeiculo() {
		return placaVeiculo;
	}


	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}


	public Date getData_Inicio() {
		return data_Inicio;
	}


	public Date getData_Fim() {
		return data_Fim;
	}


	public void setData_Inicio(Date data_Inicio) {
		this.data_Inicio = data_Inicio;
	}


	public void setData_Fim(Date data_Fim) {
		this.data_Fim = data_Fim;
	}

	public List<Entrada> getPesquisarEntrada() {
		return pesquisarEntrada;
	}


	public void setPesquisarEntrada(List<Entrada> pesquisarEntrada) {
		this.pesquisarEntrada = pesquisarEntrada;
	}

	

}
