package model;

import java.util.ArrayList;
import java.util.List;


public class Sistema {
	
	private static Sistema instancia = null; 
	private FilaPrioritaria fila;
	private List<Senha> senhasChamadas;
	private List<Senha> senhasGeradas;
	
	private Sistema(){
		fila = FilaPrioritaria.getInstance();
		senhasChamadas = new ArrayList<Senha>();
		senhasGeradas = new ArrayList<Senha>();
	}
	
	public static Sistema getInstance(){
		if (instancia == null){
			instancia = new Sistema();
		}
		
		return instancia;
	}
	
	public void gerarSenhaConvencional(){
		Senha senha = fila.addSenhaConvencional();
		senhasGeradas.add(0, senha);
	}
	
	public void gerarSenhaPrioritaria(){
		Senha senha = fila.addSenhaPrioritaria();
		senhasGeradas.add(0, senha);
	}
	
	public Senha chamarSenha(){
		Senha retorno = fila.chamarSenha();
		if (retorno == null){
			return new Senha(0,0);
		}
		return retorno;
	}
	
	public Senha getSenhaChamada(int indice){
		if ((indice+1) > senhasChamadas.size()){
			return (new Senha(0,0));
		}else{
			return senhasChamadas.get(indice);
		}
	}
	
	public Senha getSenhaGerada(int indice){
		if ((indice+1) > senhasGeradas.size()){
			return (new Senha(0,0));
		}else{
			return senhasGeradas.get(indice);
		}
	}
	
	public void zerarSistema(){
		fila.zerarFila();
		senhasGeradas.removeAll(senhasGeradas);
		senhasChamadas.removeAll(senhasChamadas);
	}
}
