# CodigoParaTodxs
## Desafio proposto pela ProWay a fim de simular uma aplicação de empréstimo pessoal
<!--ts-->
   * [Sobre](#sobre)
   * [Pré Requisitos](#pré-requisitos)
   * [Rodando o Programa](#rodando-o-programa)
   * [Tecnologias](#tecnologias)
<!--te-->

<h4 align="center"> 
	🚧  Projeto Desenvolvido, porém necessária perfumaria  🚧
</h4>

### Sobre

Projeto proposto pela ProWay em parceria com a Serasa no projeto Código Para Todxs que busca simular uma forma de empréstimo pessoal.
O sistema foi desenvolvido inteiramente em Java, utilizando a interface visual JFrame e persistencia em JSON.


### Pré-requisitos

Para a execução do projeto, não será necessário nenhum pré-requisito. O programa pode ser acessado pelo caminho CodigoParaTodxs/dist/PropostaDeCredito.jar
Como a persistência é feita em JSON, também não será necessária nenhuma utilização de SGBD.
Já para acessar o código, o recomendável é a utilização da IDE NetBeans 8.2. Visto que a mesma proporciona uma melhor visão dos JFrames.

### Rodando-o-Programa

O Programa se inicia solicitando as informações do tipo do empréstimo. Valor em reais e quantidade de parcelas em que deseja pagar.
Após informar e continuar, será redirecionado a uma tela para fornecer informações pessoais, tal como Nome, CPF, Email e Celular.
Com os dados informados, a próxima tela irá solicitar dados como idade, ocupação, renda salarial, motivo do empréstimo, dentre outros.
Com esses dados em mãos, deverá informar os dados de endereço, podendo utilizar o Cep para fazer uma busca mais eficiente.

Após ter todos os dados em mãos, o sistema irá realiazar os cálculos para saber se o usuário é confiável para um contrato na quantia em que ele deseja, bem como nas parcelas em que ele solicitou. Caso as parcelas fiquem em um valor muito elevado, o programa irá aumentar automaticamente o número de parcelas.
Caso seja determinado que não será uma negociação confiável, o programa encerrará informando que não há nenhuma proposta de empréstimo disponível para o usuário. Caso contrário, serão informados 6 formas de empréstimo, variando em valor e parcelas.

Ao selecionar e confirmar um dos contratos, o usuário será redirecionado para uma tela em que poderá revisar todas as suas informações, bem como o contrato escolhido. Caso ele confirme, será feita a persistencia via JSON com os dados da pessoa e seu contrato. Caso ela recuse, voltará para a tela inicial a fim de alterar as informações.

### Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [NetBeans 8.2](https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html)

### Autor
---

<a href="https://github.com/LeonardoGabrielDaSilva">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/10273541?s=400&u=2e2cf0ac182a36f0d5274bc8a9f0d30d65dadbf1&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Leonardo Gabriel da Silva</b></sub></a> <a href="https://github.com/LeonardoGabrielDaSilva"</a>


[![Linkedin Badge](https://img.shields.io/badge/-Leonardo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardo-gabriel-da-silva-3948a7152/)](https://www.linkedin.com/in/leonardo-gabriel-da-silva-3948a7152/) 



