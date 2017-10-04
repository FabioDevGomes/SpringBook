# SpringBook
Projeto baseado no livro "Vire o Jogo com Spring Framework"


Anotações de apoio para continuação da implementação.

1 - o Spring utiliza o elemento <context:component-scan />, onde indicamos  o pacote em que ele pode verificar. Este recurso é chamado de Classpath scanning, que permite ao Spring ler as classes encontradas no pacote indicado da aplicação em busca das que estão anotadas. Isso evita que tenhamos de declarar estas classes no XML. Ao fazer este “scanning”, as classes são passadas por um filtro e então a definição de um bean é criada para cada uma delas. Evidentemente que este filtro é determinado pelas anotações, onde não existem apenas as anotações que utilizamos neste exemplo,  mas de outras mais que temos como referencia para o framework: @Component, @Service, @Controller e @Repository (que foi introduzida no Spring 2.0)
  http://www.edsongoncalves.com.br/2010/08/16/spring-mvc-3-na-pratica-com-jpa-2/

  Inclusão do estereotipo Repository no escaneamento
  
 `<context:component-scan base-package="com.hopcroft.examples.dao">`
 
        `<context:include-filter type="annotation" expression="org.springframework.stereotype.Repository" />`
        
  `</context:component-scan>`
