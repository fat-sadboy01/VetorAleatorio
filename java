import java.util.Random;

public class VetorAleatorio {
    public static void main(String[] args) {
        int tamanho = 50;
        int[] primeiroVetor = new int[tamanho];
        double[] segundoVetor = new double[tamanho];

        // Povoar o primeiro vetor com números aleatórios de 1 a 50
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            primeiroVetor[i] = rand.nextInt(50) + 1;
        }

        // Povoar o segundo vetor usando a função especificada
        for (int i = 0; i < tamanho; i++) {
            segundoVetor[i] = 421 - (Math.sqrt((primeiroVetor[i]) * (Math.sin(primeiroVetor[i])) * Math.sin(primeiroVetor[i])));
        }

        // Mostrar o primeiro vetor como números inteiros
        System.out.println("Primeiro Vetor (Inteiros):");
        for (int i = 0; i < tamanho; i++) {
            String binario = Integer.toBinaryString(primeiroVetor[i]);
            // Preencher com zeros à esquerda para ter 8 posições
            while (binario.length() < 8) {
                binario = "0" + binario;
            }
            System.out.print(binario + " ");
        }
        System.out.println();

        // Mostrar o primeiro vetor em representação binária com 8 posições
        System.out.println("\nPrimeiro Vetor (Binário):");
        for (int i = 0; i < tamanho; i++) {
            String binario = Integer.toBinaryString(primeiroVetor[i]);
            // Preencher com zeros à esquerda para ter 8 posições
            while (binario.length() < 8) {
                binario = "0" + binario;
            }
            System.out.print(binario + " ");
        }
        System.out.println();

        // Mostrar o segundo vetor como números inteiros e calcular o número binário
        System.out.println("\nSegundo Vetor:");
        System.out.println("Posição | Valor no Primeiro Vetor | Valor no Segundo Vetor");
        for (int i = 0; i < tamanho; i++) {
            int inteiro = (int) segundoVetor[i];
            String binario = Integer.toBinaryString(inteiro);
            // Preencher com zeros à esquerda para ter 8 posições
            while (binario.length() < 8) {
                binario = "0" + binario;
            }
            System.out.printf("%7d | %23d | %20d%n", i, primeiroVetor[i], inteiro);
        }

        // Selecionar aleatoriamente duas posições nos vetores 1 e 2
        int posicao1 = rand.nextInt(tamanho);
        int posicao2 = rand.nextInt(tamanho);

        // Mostrar as posições selecionadas
        System.out.println("\nPosições selecionadas:");
        System.out.println("Posição no Primeiro Vetor: " + posicao1);
        System.out.println("Posição no Segundo Vetor: " + posicao2);

        // Comparar os valores nas posições selecionadas
        int valor1 = primeiroVetor[posicao1];
        int valor2 = (int) segundoVetor[posicao2];

        System.out.println("\nValores nas posições selecionadas:");
        System.out.println("Valor no Primeiro Vetor: " + valor1);
        System.out.println("Valor no Segundo Vetor: " + valor2);

        // Verificar qual deles tem o menor número
        if (valor1 < valor2) {
            System.out.println("O Primeiro Vetor tem o menor valor.");
        } else if (valor1 > valor2) {
            System.out.println("O Segundo Vetor tem o menor valor.");
        } else {
            System.out.println("Os valores são iguais.");
        }
    }
}
