public class ExemploParametros {

    // Método com parâmetros
    public static void saudacao(String nome, int idade) {
        System.out.println("Olá, " + nome + ". Você tem " + idade + " anos.");
    }

    // Método com parâmetros e varargs
    public static void somaNumeros(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma é: " + soma);
    }

    public static void main(String[]args) {
        saudacao("Carlos", 19);

        somaNumeros(1, 2, 3, 4, 5); // Passando vários números
    }
}
