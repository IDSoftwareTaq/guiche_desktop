package model;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
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
		}else{
			senhasChamadas.add(0, retorno);
		}
		
		Thread t = new Thread(new Play());
		t.start();
		return retorno;
	}
	
	public String getSenhaChamada(int indice){
		if ((indice+1) > senhasChamadas.size()){
			return "";
		}else{
			return senhasChamadas.get(indice).toString();
		}
	}
	
	public String getSenhaGerada(int indice){
		if ((indice+1) > senhasGeradas.size()){
			return "";
		}else{
			return senhasGeradas.get(indice).toString();
		}
	}
	
	public void zerarSistema(){
		fila.zerarFila();
		senhasGeradas.removeAll(senhasGeradas);
		senhasChamadas.removeAll(senhasChamadas);
	}
	
	private void tocaMusica(){
		try {
			AudioClip som = Applet.newAudioClip(new File("src/sound/som.wav").toURL());
			som.play();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public class Play implements Runnable{

		@Override
		public void run() {
			tocaMusica();
		}
		
	}
}
