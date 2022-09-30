/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa_vendas;

/**
 *
 * @author aline
 */
public class Show extends Evento{
    private banda apresenta;


	public Show (banda ob) {
		this.apresenta = ob;	

		}

	@Override
	public void iniciarEvento() {
		System.out.println("=====================");
		System.out.println("Evento iniciado!");
		System.out.println(apresenta.toString());
		financas(apresenta.getCache());
	}

}
