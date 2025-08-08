/*
Colégio Antonio de Moraes Barros
Prof: Edson
Disciplina: Back-End
 */
// Definimos a classe pública chamada Variaveis
public class Variaveis {

    // Método principal, ponto de entrada do programa Java
    public static void main(String[] args) {

        // Comentário explicativo: tipo nome = conteúdo;

        // Declaramos uma variável do tipo String para armazenar o nome
        String meuNome = "alex";

        // Esta linha está comentada, mas se fosse usada, substituiria o valor de meuNome
        // meuNome = "Fernandes";

        // Aqui, em vez de substituir, estamos acrescentando " Fernandes" ao valor anterior
        meuNome += " soares"; // agora meuNome é "Edson Fernandes"

        // Declaramos uma variável inteira para idade
        int idade = 50;

        // Declaramos uma variável do tipo double para altura
        double altura = 1.79;

        // Declaramos uma variável do tipo char (um caractere) para o sexo
        char sexo = 'M';

        // Declaramos uma variável do tipo boolean (lógico) para estado civil
        boolean casado = true;

        // Agora vamos imprimir os valores no console com mensagens personalizadas
        System.out.println(" Meu nome é " + meuNome);
        System.out.println(" minha idade é " + idade + " anos");
        System.out.println(" Minha altura " + altura);
        System.out.println(" sou casado? " + casado);
        System.out.println(" Sou do sexo " + sexo);

    } // fim do método main

} // fim da classe
