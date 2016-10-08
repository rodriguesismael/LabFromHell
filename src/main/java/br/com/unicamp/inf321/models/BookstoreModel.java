package br.com.unicamp.inf321.models;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.Edge;
//import org.graphwalker.java.annotation.Vertex;

import br.com.unicamp.inf321.Grupo061;

public class BookstoreModel extends ExecutionContext implements Grupo061{

    @Edge()
   public void e_RealizarPagamentoCC(){
    	System.out.println("Running: e_RealizarPagamentoCC");
    }

	@Override
	public void v_UC06_Estoque() {
		System.out.println("Running: v_UC06_Estoque");
		
	}

	@Override
	public void v_ResumoCompra() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_ResumoCompra");
		
	}

	@Override
	public void e_AdicionarProdutos() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_AdicionarProdutos");
	}

	@Override
	public void e_enderecoEntregaSelecionado() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_enderecoEntregaSelecionado");
	}

	@Override
	public void e_pagamentoEfetivado() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_pagamentoEfetivado");
	}

	@Override
	public void e_realizarLogin() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_realizarLogin");
	}

	@Override
	public void v_ppErro() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_ppErro");
	}

	@Override
	public void e_loginRealizado() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_loginRealizado");
	}

	@Override
	public void e_RealizarPagamento() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_RealizarPagamento");
	}

	@Override
	public void e_enderecoEntrega() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_enderecoEntrega");
	}

	@Override
	public void e_ValidaCartao() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_ValidaCartao");
	}

	@Override
	public void e_PgtoNaoAprovado() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_PgtoNaoAprovado");
	}

	@Override
	public void v_UC04_PagamentoCartaoCredito() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_UC04_PagamentoCartaoCredito");
	}

	@Override
	public void v_Login() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_Login");
	}

	@Override
	public void e_Iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_Iniciar");
	}

	@Override
	public void v_Inicial() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_Inicial");
	}

	@Override
	public void v_FinalizarPagamento() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_FinalizarPagamento");
	}

	@Override
	public void v_Produtos() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_Produtos");
	}

	@Override
	public void v_UC05_PagamentoBoleto() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_UC05_PagamentoBoleto");
	}

	@Override
	public void v_ModalidadesEntrega() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_ModalidadesEntrega");
	}

	@Override
	public void e_exibiModalidades() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_exibiModalidades");
	}

	@Override
	public void v_IntermediadorDePagamento() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_IntermediadorDePagamento");
	}

	@Override
	public void e_PgtoAprovado() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_PgtoAprovado");
	}

	@Override
	public void e_Pesquisar() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_Pesquisar");
	}

	@Override
	public void e_InformarEstoque() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_InformarEstoque");
	}

	@Override
	public void v_UC_Promocoes() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_UC_Promocoes");
	}

	@Override
	public void e_Fechar() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_Fechar");
	}

	@Override
	public void e_ValidaPagamento() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_ValidaPagamento");
	}

	@Override
	public void e_Voltar() {
		// TODO Auto-generated method stub
		System.out.println("Running: e_Voltar");
	}

	@Override
	public void v_Enderecos() {
		// TODO Auto-generated method stub
		System.out.println("Running: v_Enderecos");
	}



}
