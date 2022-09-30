/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa_vendas;

/**
 *
 * @author aline
 */
public class Evento {
    private String nomeEvento; 
	private String dataEvento;
	private int qtdPessoas;
	private Financa minhasFinancas;
            	
	public Evento () {
		minhasFinancas = new Financa();
	}

	public void iniciarEvento () {

	}

	public void financas (Double gastos) {
		minhasFinancas.setGastos(gastos);
	}
	public void financasLucros (Double lucros) {
		minhasFinancas.setLucros(lucros);
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}


	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public Financa getMinhasFinancas() {
		return minhasFinancas;
	}

	public void setMinhasFinancas(Financa minhasFinancas) {
		this.minhasFinancas = minhasFinancas;
	}

	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}	
}
