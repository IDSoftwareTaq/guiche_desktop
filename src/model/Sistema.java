package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

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
	
	public Senha chamarSenhaPersonalizado(){
		Senha retorno = fila.chamarSenhaPersonalizado();
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
            InputStream in = new FileInputStream(new File("C:/guiche/som.wav"));
            AudioStream  as = new AudioStream(in); 
            AudioPlayer.player.start(as);
         }catch (Exception ex){
           ex.printStackTrace();
         }
	}
	
	public class Play implements Runnable{

		@Override
		public void run() {
			tocaMusica();
		}
		
	}
}
