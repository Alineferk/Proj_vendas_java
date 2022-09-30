/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa_vendas;

/**
 *
 * @author aline
 */
public class banda {
    private String nomeBanda;
	private int numIntegrantes;
	private String generoMusical;
	private int numShows;
	private double cache;

	public banda () {

	}
	public String getNomeBanda() {
		return nomeBanda;
	}
	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
	public int getNumIntegrantes() {
		return numIntegrantes;
	}
	public void setNumIntegrantes(int numIntegrantes) {
		this.numIntegrantes = numIntegrantes;
	}
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	public int getNumShows() {
		return numShows;
	}
	public void setNumShows(int numShows) {
		this.numShows = numShows;
	}
	public double getCache() {
		return cache;
	}
	public void setCache(double cache) {
		this.cache = cache;
	}

	@Override
	public String toString() {
		return "Banda = " + nomeBanda + ", Numero de Integrantes = " + numIntegrantes + ", Genero Musical = "
				+ generoMusical + "\n"+ "Numero de shows = " + numShows + ", Cache = R$ " + cache;
	}	
}
    
