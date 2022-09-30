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

public class statusGEventos {
    List <Evento> evento = new ArrayList <>();
	private int numEventos;
	private Evento nomeEvento;

	public statusGEventos() {

	}

	public void eventosRealizados () {
		this.numEventos ++;
	}
	
	public void addEvento (Evento e) {
		this.nomeEvento = e;
		evento.add(this.nomeEvento);
	}
	
	public void listarEventosRealizados () {
		if(evento.size() == 0) {
			System.out.println("Nenhum evento realizado!");
		} else {
			for (int i = 0; i<evento.size();i++) {
				System.out.println("=====================");
				System.out.println("Evento " + evento.get(i).getNomeEvento());
				System.out.println("Com capacidade para "+ evento.get(i).getQtdPessoas()+ " pessoas.");
				System.out.println(evento.get(i).getMinhasFinancas()); 		
			}
		}
	}
	
	public int getNumEventos() {
		System.out.println("=====================");
		return numEventos;
	}
	
	public void setNumEventos(int numEventos) {
		this.numEventos = numEventos;
	}
}

