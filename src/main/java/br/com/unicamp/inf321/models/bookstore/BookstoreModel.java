package br.com.unicamp.inf321.models.bookstore;

import org.apache.tools.ant.taskdefs.Sleep;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.unicamp.inf321.Grupo061;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

@GraphWalker(value = "random(edge_coverage(100))", start = "v_NotesListView")
public class BookstoreModel extends ExecutionContext implements Grupo061{

	private AndroidDriver<WebElement> driver;
	private WebDriverWait wait;
	
	/*
	private static final String TEXT_VIEW_LOCATOR = "android.widget.TextView";
	private static final String LIST_VIEW_LOCATOR = "android.widget.ListView";
	private static final String EDIT_TEXT_LOCATOR = "android.widget.EditText";
	private static final String FIRST_NOTE_LOCATOR = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.ListView[1]/android.widget.TextView[1]";
	*/
	public BookstoreModel(AndroidDriver<WebElement> driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, 30,5000);
	}
	
	
	@Override
	public void e_RealizarPagamentoCC() {
		// TODO Auto-generated method stub
		TouchAction clicarCartao = new TouchAction(driver);
		try {
			
			//Faz o scroll na tela de modalidade de pagamento
			clicarCartao.press(350, 900).waitAction(2000).perform();
			
			clicarCartao.moveTo(0,50).waitAction(2000).perform();
			
			//clica no pagamento por cartão
			clicarCartao.tap(296, 500).waitAction(2000).perform();
			
			clicarCartao.tap(1475,770).waitAction(2000).perform();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//
	}

	@Override
	public void v_UC06_Estoque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_ResumoCompra() {
		// TODO Auto-generated method stub
		By telaCarrinho = By.className("android.widget.Image");
		wait.until(ExpectedConditions.visibilityOfElementLocated(telaCarrinho));
	}

	@Override
	public void e_AdicionarProdutos() {
		// TODO Auto-generated method stub
		TouchAction clicarAddProduto = new TouchAction(driver);
		TouchAction clicarAddCarriho = new TouchAction(driver);
		//escolher o produto na home (ir para tela do produto)
		try{
			clicarAddProduto.tap(250,1000).waitAction(2000).perform();
			
			//clicar em comprar na tela do protudo (vai para o carrinho)
			clicarAddCarriho.tap(1250,900).waitAction(2000).perform();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		

	}

	@Override
	public void e_enderecoEntregaSelecionado() {
		// TODO Auto-generated method stub
		
		//Considerando que o cep foi informado (de acordo com o fluxo das telas)
		if(getAttribute("endereco_entrega").toString() == "true"){
			TouchAction clicarTelaCarrinho = new TouchAction(driver);
			/*TouchAction clicarCalcularFrete = new TouchAction(driver);
			TouchAction clicarFinalizar		= new TouchAction(driver);*/
			try{
				//press e moveTo fazem o scroll da tela
				clicarTelaCarrinho.press(1620,900).waitAction(2000).perform();
				
				clicarTelaCarrinho.moveTo(0, 50).waitAction(2000).perform();
				
				//clicar no finalizarCompra
				clicarTelaCarrinho.tap(1620,555).waitAction(2000).perform();
				
			}catch (Exception e) {
				// TODO: handle exception
			}

		}
	}
	

	@Override
	public void e_pagamentoEfetivado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_realizarLogin() {
		// TODO Auto-generated method stub
		TouchAction clicarLogar = new TouchAction(driver);
		try{
			clicarLogar.tap(215,765).waitAction(2000).perform();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void v_ppErro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_loginRealizado() {
		// TODO Auto-generated method stub
		System.out.println("Cliente esta logado");
	}

	@Override
	public void e_RealizarPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_enderecoEntrega() {
		// TODO Auto-generated method stub
		if(getAttribute("endereco_entrega").toString() == "false"){
			TouchAction clicarTelaCEP = new TouchAction(driver);
			try{
				clicarTelaCEP.tap(404, 870).waitAction(2000).perform();
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public void e_ValidaCartao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_PgtoNaoAprovado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_UC04_PagamentoCartaoCredito() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_Login() {
		// TODO Auto-generated method stub
		System.out.println("executando v_Login");
	}

	@Override
	public void e_Iniciar() {
		// TODO Auto-generated method stub
		driver.launchApp();
		
	}

	@Override
	public void v_Inicial() {
		// TODO Auto-generated method stub
		By telaInicial = By.className("android.widget.Image");
		wait.until(ExpectedConditions.visibilityOfElementLocated(telaInicial));
		
	}

	@Override
	public void v_FinalizarPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_Produtos() {
		// TODO Auto-generated method stub
		By telaProdutos = By.className("android.widget.Image");
		wait.until(ExpectedConditions.visibilityOfElementLocated(telaProdutos));
	}

	@Override
	public void v_UC05_PagamentoBoleto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_ModalidadesEntrega() {
		// TODO Auto-generated method stub
		By telaWhatever = By.className("android.widget.Image");
		wait.until(ExpectedConditions.visibilityOfElementLocated(telaWhatever));		
	}

	@Override
	public void e_exibiModalidades() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo telas de modalidades de Pagamento");
	}

	@Override
	public void v_IntermediadorDePagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_PgtoAprovado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_Pesquisar() {
		// TODO Auto-generated method stub
		TouchAction clicarPesquisa = new TouchAction(driver);

		By telaApp = By.className("android.widget.Image");
		wait.until(ExpectedConditions.visibilityOfElementLocated(telaApp));
		try {
			//Tem q clicar 2x para fazer uma busca valida	
			clicarPesquisa.tap(450,350).waitAction(2000).perform();
			

			clicarPesquisa.tap(450,350).waitAction(2000).perform();
			

			//clique no botão pesquisar
			clicarPesquisa.tap(1700,350).waitAction(2000).perform();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void e_InformarEstoque() {
		// TODO Auto-generated method stub
		System.out.println("Informando Estoque");
	
	}

	@Override
	public void v_UC_Promocoes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_Fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_ValidaPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_Voltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_Enderecos() {
		// TODO Auto-generated method stub
		
	}
	
	public void sleep(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
