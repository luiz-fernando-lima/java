***********************
Padrões de Projetos
***********************

1 - Singleton:

	- O Singleton é um padrão de projeto de Criação, com objetivo de garantir que uma classe tenha apenas uma instância e fornecer um ponto de acesso global a essa instância.

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

	- Singleton ENUM: forma de implementar o padrão Singleton mantendo seu propósito e evitando os problemas descritos antes.

2 - Strategy:
	- 
		