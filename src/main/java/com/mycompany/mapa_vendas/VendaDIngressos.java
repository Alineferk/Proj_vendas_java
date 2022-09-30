/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa_vendas;

/**
 *
 * @author aline
 */
import java.util.ArrayList;
import java.util.List;

public class VendaDIngressos {
    private List <Evento> evento = new ArrayList <>();
	ArrayList<Ingresso> ingressos = new ArrayList<>();
	ArrayList<statusIngresso> controle = new ArrayList<>();
	private Ingresso ingresso;
	private Evento nomeEvento;
	private statusIngresso cIngresso;
	private int qtdIngresso;
	private int ingsVendidos;
	public VendaDIngressos() {

	}
	public void cadastrarIngresso (Ingresso ingresso, Evento nomeEvento,statusIngresso cIngresso) {
		this.ingresso = ingresso;
		this.nomeEvento = nomeEvento;
		this.cIngresso = cIngresso;
		evento.add(this.nomeEvento);
		ingressos.add(this.ingresso);
		controle.add(this.cIngresso);
	}
	  public void listarIngressosCadastrados () {
			if(ingressos.size() == 0) {
				System.out.println("Nenhum ingresso disponivel!");
			} else {
			for (int i = 0; i<ingressos.size() ;i++) {
				System.out.println("=====================");
				System.out.println("Eventos Disponiveis: "+evento.get(i).getNomeEvento());
				System.out.println("Banda: " + ingressos.get(i).getNome());
				System.out.println("Data : "+ingressos.get(i).getData());
				System.out.println("Valores de ingressos --> Camarote: "+ingressos.get(i).getVlrCamarote()+",Pista: "+ingressos.get(i).getVlrPista()+",Vip: "+ingressos.get(i).getVlrVip());
				System.out.println("Ingressos disponiveis do lote 1: "+ingressos.get(i).getQtd1()+ " ,Lote 2: "+ingressos.get(i).getQtd2());
			}
			}
	  }
	public void totalIngresso (Integer totalIngresso) {
		this.qtdIngresso = totalIngresso;

	}
	public void verificaQuantidadeDisponivel (String lote, String noBanda) {
		if (lote.contentEquals("1")) {
		if (controle.size()==0) {
			System.out.println("Nenhum ingresso Disponivel!");		
		}else {
			for (int i = 0;i<controle.size();i++) {  
			   if(noBanda.equals(ingressos.get(i).getNome())) {
				   System.out.println("=====================");
				   controle.get(i).atualizarVendaLote1();
			   }
			}
		}
		}
		if(lote.contentEquals("2")) {
			if (controle.size()==0) {
				System.out.println("Nenhum ingresso Disponivel!");		
			}else {
				for (int i = 0;i<controle.size();i++) { 	
				if(noBanda.equals(ingressos.get(i).getNome())) {
					System.out.println("=====================");
					controle.get(i).atualizarVendaLote2();
				}
				}
			}
		}
	}
	public void vendeIngresso (String lote, String nomeBanda, Integer qtdIngresso, Double vendaIngressos) {

		if (lote.contentEquals("1")) {
			if (controle.size()==0) {
				System.out.println("Nenhum ingresso Disponivel!");		
			}else {
				for (int i = 0;i<controle.size();i++) {  
				   if(nomeBanda.equals(ingressos.get(i).getNome())) {
					   System.out.println("=====================");
					   controle.get(i).compraingressoLt1(qtdIngresso);
					   evento.get(i).financasLucros(vendaIngressos);
				   }
				}
			}
			}
			if(lote.contentEquals("2")) {
				if (controle.size()==0) {
					System.out.println("Nenhum ingresso Disponivel!");		
				}else {
					for (int i = 0;i<controle.size();i++) { 	
					if(nomeBanda.equals(ingressos.get(i).getNome())) {
						System.out.println("=====================");
						 controle.get(i).compraingressoLt1(qtdIngresso);
						 evento.get(i).financasLucros(vendaIngressos);
					}
					}
				}
			}
	}
	public void ingressosVendidos () {
		this.ingsVendidos += this.ingsVendidos;
	}
	public List<Evento> getEvento() {
		return evento;
	}
	public void setEvento(List<Evento> evento) {
		this.evento = evento;
	}
	public ArrayList<Ingresso> getIngressos() {
		return ingressos;
	}
	public void setIngressos(ArrayList<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

	public Ingresso getIngresso() {
		return ingresso;
	}
	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	public Evento getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(Evento nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public int getQtdIngresso() {
		return qtdIngresso;
	}
	public void setQtdIngresso(int qtdIngresso) {
		this.qtdIngresso = qtdIngresso;
	}
	public int getIngsVendidos() {
		return ingsVendidos;
	}
	public void setIngsVendidos(int ingsVendidos) {
		this.ingsVendidos = ingsVendidos;
	}
	public ArrayList<statusIngresso> getControle() {
		return controle;
	}
	public void setControle(ArrayList<statusIngresso> controle) {
		this.controle = controle;
	}
	public statusIngresso getcIngresso() {
		return cIngresso;
	}
	public void setcIngresso(statusIngresso cIngresso) {
		this.cIngresso = cIngresso;
	}	
}

