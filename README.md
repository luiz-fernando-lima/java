*********
Conte�dos
*********
- Padr�es de Projetos;
- Reflection;
- Lambdas;


*******************
Padr�es de Projetos
*******************

Abstract Factory (Criacional):

	- 

Factory Method (Criacional):

	- 

Prototype (Criacional):

	- 

Singleton (Criacional):

	- O Singleton � um padr�o de projeto de Criacional, com objetivo de garantir que uma classe tenha apenas uma inst�ncia e fornecer um ponto de acesso global a essa inst�ncia.

	- Singleton Eager Initialization:
		- Construtor privado;
		- Vari�vel est�tica da pr�pria classe, instanciada em sua declara��o;
		- M�todo est�tico para acesso � inst�ncia da classe;
	
	- Singleton Lazy Initialization:
		- Construtor privado;
		- Vari�vel est�tica da pr�pria classe, instanciada apenas quando solicitado.
		- M�todo est�tico para acesso � inst�ncia da classe;
	
	- Problemas:
		- Eager Initialization: objeto int�nciado desde de inicializa��o;
		- Lazy Initialization: ambiente de multiplas threads amea�a e unicidade da inst�ncia;
		- Clonagem de objetos, classes que implementam a interface Cloneable;
		- Int�ncia reflexiva, Reflection em Java;
		- Serializa��o, classes que implementam a interface Serializable;

	- Singleton Enum: forma de implementar o padr�o Singleton mantendo seu prop�sito e evitando os problemas descritos antes.
	
	- Exemplo: https://github.com/luiz-fernando-lima/java/tree/master/PadroesProjeto/Singleton


Builder (Estrutural):

	- 


Composite (Estrutural):

	- 

Decorator (Estrutural):

	- 

Facade (Estrutural):

	- 