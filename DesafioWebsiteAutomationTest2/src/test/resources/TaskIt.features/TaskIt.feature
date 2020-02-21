#Author: Massayoshi Campos - Email: massayoshi.campos@gmail.com
#Keywords Summary: Login, Task.
#Feature: Realizar o login, validacao do home, cadastro, edicao e exclusao.
##@author Massayohi Campos
##Criado em Fevereiro/2020
##@version 1.0.0
##@since Release 1.0
@DashboardPageSteps
Feature: Realizacao dos testes no login, home, incluindo cadastro, alteracao e exclusao de task

  ## Realizacao de testes no sistema.
  Scenario: Login no sistema, cadastro e exclusão e suas validacoes
    Given Logar no sistema preenchendo o campo Nome e Password e validar usuario logado
    Then Cadastrar uma nova task no sistema
    And  Loga e valida a nova task criada
    Then Exclui a nova task criada e valida sua exclusao, logo apos faz logout do sistema
    
  