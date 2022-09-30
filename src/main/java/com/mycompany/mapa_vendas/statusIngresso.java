/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa_vendas;

/**
 *
 * @author aline
 */
public class statusIngresso {
    private int lote1;
	private int lote2;
	private int compraLt1;
	private int compraLt2;


	public void ingressosLote1 (Integer in1) {
		this.lote1 = in1;
	}
	public void ingressosLote2 (Integer in2) {
		this.lote2 = in2;
	}

	public void atualizarVendaLote1() {
		this.lote1 -= this.compraLt1;
		System.out.println("Ingressos disponiveis lote 1: " + this.lote1);
	}
	public void atualizarVendaLote2() {
		this.lote2 -= this.compraLt2;
		System.out.println("Ingressos disponiveis lote 2: " + this.lote2);
	}

	public void compraingressoLt1 (Integer qtd1) {
		this.compraLt1 = qtd1;
	}
	public void compraingressoLt2 (Integer qtd2) {
		this.compraLt2 = qtd2;
	}

	public int getLote1() {
		return lote1;
	}
	public void setLote1(int lote1) {
		this.lote1 = lote1;
	}
	public int getLote2() {
		return lote2;
	}
	public void setLote2(int lote2) {
		this.lote2 = lote2;
	}	
}
    
