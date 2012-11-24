# language: ca
Característica: Suma
  Per evitar fer errors tontos
  Com un matemàtic idiota
  Vull saber la suma dels números

  Esquema de l'escenari: Sumar dos números
    Donat que he introduït <entrada_1> a la calculadora
    I que he introduït <entrada_2> a la calculadora
    Quan premo el botó <botó>
    Aleshores el resultat ha de ser <resultat> a la pantalla

  Exemples:
    | entrada_1 | entrada_2 | botó | resultat |
    | 20        | 30        | +    | 50       |
    | 2         | 5         | +    | 7        |
    | 0         | 40        | +    | 40       |


  Escenari: Suma de tres números
    Donat que he introduït 3 a la calculadora
    I que he introduït 5 a la calculadora
    I que he introduït 2 a la calculadora
    Quan premo el botó +
    Aleshores el resultat ha de ser 10 a la pantalla