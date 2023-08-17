<h1>Projeto de Contagem com Tratamento de Exceções em Java</h1>
<p>Este é um projeto simples em Java que demonstra como realizar uma contagem entre dois parâmetros fornecidos pelo usuário, enquanto também faz o tratamento de exceções para garantir que os parâmetros sejam válidos.
</p>

<h2>Funcionalidades</h2>
<h3>O programa possui as seguintes funcionalidades:</h3>

<ol>
  
<li>Solicita ao usuário que insira dois parâmetros inteiros.</li>
<li>Realiza uma contagem crescente a partir do primeiro parâmetro até o segundo parâmetro, exibindo cada número no console.</li>
<li>Utiliza o tratamento de exceções para verificar se o segundo parâmetro é menor ou igual ao primeiro, lançando uma exceção personalizada ParametrosInvalidosException se essa condição não for atendida.</li>
<li>Captura e exibe a exceção lançada, mostrando uma mensagem de erro.</li>

</ol>

<h3>Tratamento de Exceções</h3>
<ol>
  
O projeto utiliza tratamento de exceções para garantir uma execução mais robusta e amigável. Aqui está como funciona o tratamento de exceções no projeto:

<li>
<bold>Exceção Personalizada ParametrosInvalidosException:</bold>
Foi criada uma exceção personalizada chamada ParametrosInvalidosException. Essa exceção é lançada quando os parâmetros fornecidos não atendem à validação desejada.
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/71770176/261418483-0e8e93d6-8550-467a-bb7e-f5d3de367aab.png" alt="Imagem do Projeto">
</li>

<li>
<bold>Método contar():</bold>
O método contar(int parametroUm, int parametroDois) lança a exceção ParametrosInvalidosException caso a validação não seja atendida.
<img src="https://github.com/MariaEduardaLeal/Contagem_com_tratamento_de_excecoes/assets/71770176/0b651790-8241-49d2-81a8-f9fb1f2a93c6" alt="Imagem do Projeto">
</li>
<li>
<bold>Bloco try-catch no Método main():</bold>
O método main() envolve a chamada do método contar() em um bloco try-catch. Isso permite capturar a exceção ParametrosInvalidosException e exibir uma mensagem de erro apropriada.
<img src="https://github.com/MariaEduardaLeal/Contagem_com_tratamento_de_excecoes/assets/71770176/f1b5a8a4-d3b7-4a09-a87f-7a9792871584" alt="Imagem do Projeto">

</li>
</ol>
