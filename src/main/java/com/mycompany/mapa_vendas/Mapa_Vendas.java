/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mapa_vendas;

/**
 *
 * @author aline
 */
public class Mapa_Vendas {

    public static void main(String[] args) {
        banda b = new banda();
		Ingresso i = new Ingresso();
		statusIngresso ci = new statusIngresso();
		statusIngresso ci1 = new statusIngresso();
		VendaDIngressos op = new VendaDIngressos();

		b.setNomeBanda("Metalica");
		b.setGeneroMusical("Rock");
		b.setNumIntegrantes(4);
		b.setCache(300);
		b.setNumShows(500);

		i.setNome("Metalica");
		i.setData("21/09,/2022");
		i.setVlrPista(50);
		i.setVlrVip(200);
		i.setVlrCamarote(150);
		ci.setLote1(150);
		ci.setLote2(250);

		Show s = new Show(b);

		s.setNomeEvento("Rock in Rio");
		s.setQtdPessoas(2000);
		s.setDataEvento("25/11/2022");
		s.iniciarEvento();

		op.cadastrarIngresso(i,s,ci);

		statusGEventos g = new statusGEventos();
		g.eventosRealizados();
		g.addEvento(s);

		banda b1 = new banda();
		Ingresso i1 = new Ingresso();

		b1.setNomeBanda("AC / DC");
		b1.setGeneroMusical("Rock");
		b1.setNumIntegrantes(4);
		b1.setCache(3000);
		b1.setNumShows(480);

		i1.setNome("Exal");
		i1.setData("10/11/2025");
		i1.setVlrPista(80);
		i1.setVlrVip(180);
		i1.setVlrCamarote(200);
		i1.setQtdIngresso(1000);
		ci1.setLote1(600);
		ci1.setLote2(300);

		Show s1 = new Show(b1);

		s1.setNomeEvento("Rock in rool");
		s1.setQtdPessoas(1000);
		s1.iniciarEvento();

		op.cadastrarIngresso(i1,s1,ci1);
		op.listarIngressosCadastrados();

		g.addEvento(s1);

		op.verificaQuantidadeDisponivel("1","Metalica");
		op.verificaQuantidadeDisponivel("2", "AC / DC");
		op.vendeIngresso("1", "Metalica", 3,450.0);
		op.verificaQuantidadeDisponivel("1","Metalica");
		g.listarEventosRealizados();

	}

}
    
