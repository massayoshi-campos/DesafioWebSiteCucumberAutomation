package br.com.test;

import br.com.common.TaskItPage;
import br.com.test.BaseTestCase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @author Massayohi Campos Criado em Fevereiro/2020
 * Desafio da empresa Inmetrics para automação Web, essa automação foi realizada com o framework Cucumber com Selenium em Java.
 * @version 1.0.0
 * @since Release 1.0
 * 
 */

public class TaskItPageSteps extends BaseTestCase {
	
	//Login de sucesso - Etapa 1
	@Given("^Logar no sistema preenchendo o campo Nome e Password e validar usuario logado$")
	public void fazerLoginSistema() throws Throwable {
	    TaskItPage.clickButtonSignHome();
		TaskItPage.preencherCampoName("Massa"); 
		TaskItPage.preencherCampoPassword("1234"); 
		TaskItPage.clickbuttonSign();
		TaskItPage.validaUserLogado("Hi, Massayoshi Campos");
		System.out.println ("Etapa 1 - Login, preencher o campo Nome e Password e validar usuario logado.");
		
	}
	
	 //Cadastro de uma nova Task - Etapa 2
	@Then("^Cadastrar uma nova task no sistema$")
	public void criacaoCadastroTask() throws Throwable {
		TaskItPage.clickAdicionarAlgumasTask();
		TaskItPage.clickAdicionarTask();
		TaskItPage.preencherTitleTask("Teste");
		Thread.sleep(1500);
		TaskItPage.preencherCampoDateLimitTask();
		Thread.sleep(1500);
		TaskItPage.clickButtonToday();
		TaskItPage.cliclButtonClose();
		TaskItPage.preencherCampoTimelimitTask();
		Thread.sleep(1500);
		TaskItPage.clicaHours();
		TaskItPage.preencherCampoAboutTask("Teste");
		TaskItPage.preencherCampoDoneTask("Yes");
		TaskItPage.clickSave();
		Thread.sleep(1500);
		TaskItPage.logoutSistem();
		System.out.println ("Etapa 2 - Cadastrar uma nova task no sistema.");	
			 
	}		 
	 
	 //Login e validação da nova task criada Etapa 3
	@And("^Loga e valida a nova task criada$")
	 public void validarTaskCriada() throws InterruptedException, Throwable{
		TaskItPage.clickButtonSignHome();
		TaskItPage.preencherCampoName("Massa");
		TaskItPage.preencherCampoPassword("1234");
		TaskItPage.clickbuttonSign();
		Thread.sleep(1500);
		TaskItPage.direcionarMyTask();
		Thread.sleep(1500);
		TaskItPage.validarTaskCriada("Teste");
		System.out.println ("Etapa 3 - Login, Verificar a nova task criada.");					
	 
	 }
	 
	 //Login de sucesso - Etapa 4
	@Then("^Exclui a nova task criada e valida sua exclusao, logo apos faz logout do sistema$")
	 public void validarTaskExcluida()  throws Throwable {
		Thread.sleep(1500);
		TaskItPage.excluirTaskCriada();
		Thread.sleep(1500);
		TaskItPage.validaMensagemTela("Finally, I no longer need to set eyes on you damn task!");
		Thread.sleep(1500);
		TaskItPage.logoutSistem();
		System.out.println ("Etapa 4 - Exclui a nova task criada, e logo apos faz logout do sistema.");
	 
	 }
	 
	
	 
}
