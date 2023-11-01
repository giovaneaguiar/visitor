<h1 align="center">Visitor</h1>

<p>O Visitor é um padrão de projeto comportamental que permite que você separe algoritmos dos objetos nos quais eles operam.
</p>

##

#### Exemplo 1

<p>Em resumo, meu exemplo demonstra o uso do padrão Visitor para calcular a área total de diferentes formas geométricas, promovendo extensibilidade e manutenção do código.
<p>
  
 - CalculadoraDeArea: Uma classe que atua como um visitante para calcular a área total das formas geométricas. Implementa a interface VisitanteFormaGeometrica.
  
- FormaGeometrica: Uma interface que define o contrato para as formas geométricas visitáveis.

- Circulo: Uma classe que representa um círculo. Implementa a interface FormaGeometrica e aceita visitantes para calcular sua área.

- Retangulo: Uma classe que representa um retângulo. Implementa a interface FormaGeometrica e aceita visitantes para calcular sua área.
</p>



