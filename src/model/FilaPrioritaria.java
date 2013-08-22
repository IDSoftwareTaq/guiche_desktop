package model;

import java.util.ArrayList;
import java.util.List;


public class FilaPrioritaria {
	
	private static FilaPrioritaria instancia = null;
	private int senha;
	private List<Senha> filaConvencional;
	private List<Senha> filaPrioritaria;
	private int cont;
	private int NUMEROPRIORIDADE;
	
	private FilaPrioritaria(){
		filaConvencional = new ArrayList<Senha>();
		filaPrioritaria = new ArrayList<Senha>();
		cont = 0;
		senha = 0;
		NUMEROPRIORIDADE = 3;
	}
	
	public static FilaPrioritaria getInstance(){
		if (instancia == null){
			instancia = new FilaPrioritaria();
		}
		return instancia;
	}
	
	public Senha addSenhaConvencional(){
		Senha senhaAdd = new Senha(senha, 0);
		filaConvencional.add(senhaAdd);
		senha++;
		return senhaAdd;
	}
	
	public Senha addSenhaPrioritaria(){
		Senha senhaAdd = new Senha(senha, 1);
		filaPrioritaria.add(senhaAdd);
		senha++;
		return senhaAdd;
	}
	
	private Senha chamarSenhaConvencional(){
		Senha senhaAux = filaConvencional.get(0);
		filaConvencional.remove(0);
		cont = 1;
		return senhaAux;
	}
	
	private Senha chamarSenhaPrioritaria(){
		Senha senhaAux = filaPrioritaria.get(0);
		filaPrioritaria.remove(0);
		cont++;
		return senhaAux;
	}
	
	public Senha chamarSenha(){
		Senha retorno = null;
		if (filaPrioritaria.size() > 0) {
			if (cont == NUMEROPRIORIDADE){
				if (filaConvencional.size() > 0){
					retorno = chamarSenhaConvencional();
				}else{
					if (filaPrioritaria.size() > 0){
						retorno = chamarSenhaPrioritaria();
					}
				}
			}else{
				if (filaPrioritaria.size() > 0){
					retorno = chamarSenhaPrioritaria();
				}
			}
		}else{
			if (filaConvencional.size() > 0){
				retorno = chamarSenhaConvencional();
			}
		}
		return retorno;
	}
	
	public void setPrioridade(int prioridade){
		NUMEROPRIORIDADE = prioridade;
	}
	
	public void zerarFila(){
		filaConvencional.removeAll(filaConvencional);
		filaPrioritaria.removeAll(filaPrioritaria);
		senha = 0;
		cont = 0;
	}
	
}
