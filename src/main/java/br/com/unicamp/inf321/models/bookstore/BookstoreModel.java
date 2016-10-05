package br.com.unicamp.inf321.models.bookstore;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	private static final String TEXT_VIEW_LOCATOR = "android.widget.TextView";
	private static final String LIST_VIEW_LOCATOR = "android.widget.ListView";
	private static final String EDIT_TEXT_LOCATOR = "android.widget.EditText";
	private static final String FIRST_NOTE_LOCATOR = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.ListView[1]/android.widget.TextView[1]";
	
	public BookstoreModel(AndroidDriver<WebElement> driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}
	
	
	@Override
	public void e_RealizarPagamentoCC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_UC06_Estoque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_ResumoCompra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_AdicionarProdutos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_aplicaPromocao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_enderecoEntregaSelecionado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_pagamentoEfetivado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_realizarLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_ppErro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_loginRealizado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_RealizarPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_enderecoEntrega() {
		// TODO Auto-generated method stub
		
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
		
	}

	@Override
	public void e_Iniciar() {
		// TODO Auto-generated method stub
		driver.launchApp();
		
	}

	@Override
	public void v_Inicial() {
		// TODO Auto-generated method stub
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_MENU);
		
	}

	@Override
	public void v_FinalizarPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_Produtos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_UC05_PagamentoBoleto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_ModalidadesEntrega() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_exibiModalidades() {
		// TODO Auto-generated method stub
		
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
		//clique na barra de busca
		By telaInicial = By.className("android.widget.Image");
		wait.until(ExpectedConditions.visibilityOfElementLocated(telaInicial));
		clicarPesquisa.tap(450,350).perform(); //250, 1000
		//clique no botão pesquisar
		wait.until(ExpectedConditions.visibilityOfElementLocated(telaInicial));
		clicarPesquisa.tap(1700,350).perform();
	}

	@Override
	public void e_InformarEstoque() {
		// TODO Auto-generated method stub
		
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

	
}
