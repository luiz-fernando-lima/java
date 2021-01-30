*********
Conteúdos
*********
- Padrões de Projetos;
- Reflection;
- Lambdas;


*******************
Padrões de Projetos
*******************

Abstract Factory (Criacional):

	- 

Factory Method (Criacional):

	- 

Prototype (Criacional):

	- 

Singleton (Criacional):

	- O Singleton é um padrão de projeto de Criacional, com objetivo de garantir que uma classe tenha apenas uma instância e fornecer um ponto de acesso global a essa instância.

	- Singleton Eager Initialization:
		- Construtor privado;
		- Variável estática da própria classe, instanciada em sua declaração;
		- Método estático para acesso à instância da classe;
	
	- Singleton Lazy Initialization:
		- Construtor privado;
		- Variável estática da própria classe, instanciada apenas quando solicitado.
		- Método estático para acesso à instância da classe;
	
	- Problemas:
		- Eager Initialization: objeto intânciado desde de inicialização;
		- Lazy Initialization: ambiente de multiplas threads ameaça e unicidade da instância;
		- Clonagem de objetos, classes que implementam a interface Cloneable;
		- Intância reflexiva, Reflection em Java;
		- Serialização, classes que implementam a interface Serializable;

	- Singleton Enum: forma de implementar o padrão Singleton mantendo seu propósito e evitando os problemas descritos antes.
	
	- Exemplo: https://github.com/luiz-fernando-lima/java/tree/master/PadroesProjeto/Singleton


Builder (Estrutural):

	- 


Composite (Estrutural):

	- 

Decorator (Estrutural):

	- 

Facade (Estrutural):

	- 