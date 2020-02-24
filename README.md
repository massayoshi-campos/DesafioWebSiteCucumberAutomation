# DesafioWebSiteCucumberAutomation
Projeto com selenium+Cucumber realizando funções de teste no site disponibilizado pela empresa **Inmetrics**.

`<link>` : <http://www.juliodelima.com.br/taskit/>

# Site de demonstração para praticar o WebDriver:

- [HeroKuapp](http://the-internet.herokuapp.com/)
- [jqueryui](https://jqueryui.com/demos/)
- [PHPTravels](https://phptravels.com/demo/)
- [Newtours](http://newtours.demoaut.com/)
- [Way2Automation](http://www.way2automation.com/demo.html)
- [AutomationPractice](http://automationpractice.com/index.php)
- [Demoqa](https://demoqa.com/)

# Índice

- Pré-requisito
- Configuração
- Instalação e Execução do Projeto
- Features
- Suporte
- License

# Pré Requisitos

- JDK install 8
- Eclipse IDE install
- Maven install
- JUnit install
- Cucumber plugin install

# Configuração do Ambiente

## Variáveis de Ambiente

### Java

- Windows: https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html

### Maven

- Windows: https://www.mkyong.com/maven/how-to-install-maven-in-windows/


# Instalação e Execução do Projeto

1. Faça o download do zip ou clone do repositório Git
2. Descompacte o arquivo zip (se você tiver baixado um)
3. Abra o Eclipse
4. File ->> Import ->> Maven ->> Existing Maven Projects >> Navegue até a pasta em que você descompactou o zip
5. Você pode executar o teste pelo Cucumber ou Junit
6. Junit
7. src/test/java ->> br.com.test ->> "TaskItValidation.java"
8. Clique com o botão direito do mouse no arquivo e execute como Run As "JUnit test"
9. Cucumber
10. src/teste/resources ->> features ->> "TaskIt.feature""
11. Clique com o botão direito do mouse no arquivo e execute como Run As "1 Cucumber Feature"

# Feature

- Arquivo de exemplo .feature

```
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
```
    
# Suporte
## E-mail: massayoshi.campos@gmail.com
## Linkedin: https://www.linkedin.com/in/massayoshi-campos/
> Se você tiver alguma dúvida sobre este repositório ou precisar de ajuda para contribuir, não hesite em entrar em contato comigo.

## Contribuições
> Se você tem algum exemplo de código que gostaria de contribuir para este repositório, sinta-se à vontade para abrir uma solicitação de recebimento.

## Comentário
> Os colaboradores deste repositório ficarão muito gratos por receber feedback! Se você deseja elogiar ou comentar algum exemplo de teste ou o repositório como um todo, faça-o pelo e-mail. Eu adoraria ouvir o que você pensa, então, reserve um momento para me informar.

# License
- Esse código é livre para ser usado dentro dos termos da licença MIT license
- Copyright 2020 ©Massayoshi Campos
