# Boas Práticas de Software

Atividade da disciplina de Manutenção e Configuração de Software, sobre boas práticas de código e controle de versão com Git.

O sistema original recebe as notas de um aluno, calcula a média e mostra se ele foi aprovado ou reprovado.

## Como rodar

```
javac -d out src/Sistema.java
java -cp out Sistema
```

## Questão final

**1. Qual era o principal problema do código original?**

O código funcionava, mas era difícil de entender. Os nomes das variáveis eram só letras soltas (n, a, b, c), então não dava pra saber o que cada uma representava sem ler o código com calma. Além disso, estava tudo dentro do método main, sem nenhuma divisão.

**2. Quais melhorias você realizou?**

Troquei os nomes das variáveis por nomes que explicam o que elas guardam (nomeAluno, nota1, nota2, media). Também separei o código em métodos menores, cada um cuidando de uma parte: calcular a média, verificar se o aluno foi aprovado e mostrar o resultado. E criei uma constante para o valor da média mínima de aprovação, em vez de deixar o número 6 solto no meio do código.

**3. Como a modularização facilitou a organização do código?**

Ficou muito mais fácil de ler, porque cada método tem uma responsabilidade só. Se eu precisar mudar a regra de aprovação, por exemplo, sei exatamente onde mexer sem me preocupar em quebrar o resto. Também fica mais fácil testar cada parte separada e entender o programa só de olhar os nomes dos métodos.

**4. Como o Git ajudou a controlar as alterações realizadas no sistema?**

O Git deixou registrado o histórico de tudo que foi feito, desde o código original até as melhorias. Usar uma branch separada (melhoria-boas-praticas) permitiu mexer no código sem afetar a versão que já estava na main, e o Pull Request serviu pra revisar as mudanças antes de juntar tudo. Assim dá pra comparar o antes e o depois e, se precisar, voltar em qualquer ponto do histórico.
