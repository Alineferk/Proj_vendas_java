/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa_vendas;

/**
 *
 * @author aline
 */
import java.sql.Date;
public class Ingresso {
    private String nome;
     private String CPF;
    
	private String data;
	private String tipoEntrada; // Meia ou inteira
	private String setor; // vip, pista, camarote
	private double vlrVip;
	private double vlrCamarote;
	private double vlrPista;
	private String tipoPagamento; //cartão ou dinheiro.
	private int qtdIngresso;
	private int  qtd1;
	private int qtd2;

	public Ingresso() {

	}

	public void ingressosDisponiveis () {

	}

	public void lote1 (Integer qtdl1) {
		this.qtd1 = qtdl1;
	}
	public void lote2 (Integer qtdl2) {
		this.qtd2 = qtdl2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}



	public double getVlrVip() {
		return vlrVip;
	}

	public void setVlrVip(double vlrVip) {
		this.vlrVip = vlrVip;
	}

	public double getVlrCamarote() {
		return vlrCamarote;
	}

	public void setVlrCamarote(double vlrCamarote) {
		this.vlrCamarote = vlrCamarote;
	}

	public double getVlrPista() {
		return vlrPista;
	}

	public void setVlrPista(double vlrPista) {
		this.vlrPista = vlrPista;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public int getQtdIngresso() {
		return qtdIngresso;
	}

	public void setQtdIngresso(int qtdIngresso) {
		this.qtdIngresso = qtdIngresso;
	}


	public int getQtd1() {
		return qtd1;
	}

	public void setQtd1(int qtd1) {
		this.qtd1 = qtd1;
	}

	public int getQtd2() {
		return qtd2;
	}

	public void setQtd2(int qtd2) {
		this.qtd2 = qtd2;
	}

	@Override
	public String toString() {
		return "Ingresso [nome = " + nome + ", data = " + data + ", tipoEntrada=" + tipoEntrada + ", setor = " + setor
				+ ", vlrVipv = " + vlrVip + ", vlrCamarote = " + vlrCamarote + ", vlrPista = " + vlrPista + ", tipoPagamento="
				+ tipoPagamento + "]";
	}	
}
