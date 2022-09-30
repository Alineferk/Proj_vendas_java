/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa_vendas;

/**
 *
 * @author aline
 */
public class Financa {
    private double lucros;
	private double gastos;
	
	public void imprimeResumaFinanca () {
		System.out.println("Lucros ");
	}

	public double getLucros() {
		return lucros;
	}

	public void setLucros(double lucros) {
		this.lucros = lucros;
	}
	
	public double getGastos() {
		return gastos;
	}
	
	public void setGastos(double gastos) {
		this.gastos = gastos;
	}
	
	@Override
	public String toString() {
		return "Financa [lucros = " + lucros + ", gastos = " + gastos + "]";
	}	
}
