// primeira coisa: ler a frase
//segunda coisa: transformar a frase em um array 
//terceira coisa: desobrir a quantidade de caracteres existentes no array, para que assim, você consiga determinar o tamanho da frase quando invertida
// quarta coisa: criar um "for" do tamanho da string final ( quantidade de caracteres) 
// quinta coisa: quando o programa detectar um espaço, atribuir a uma variável espaco a sua localização no vetor
// ATÉ O FINAL DA AULA CONSEGUI ISSO 
// atribuir ao vetor final ( frase invertida) o vetor antigo até o espaço
// após cada espaço, iniciar o processo novamente 
package com.lulugol.desafio01;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String recebe = s.nextLine();

        char[] frase = recebe.toCharArray();
        int quantidade = frase.length;
        char[] invertida = new char[quantidade];
        int espaco;

        int posicao = 0;

        for (int i = quantidade - 1; i >= 0; i--) {
            if (frase[i] == ' ' || i == 0) 
                {
                if (i == 0) {
                    espaco = i;
                } else {
                     espaco = i + 1;
                }
                for (int j = espaco; j < quantidade && frase[j] != ' '; j++) {
                    invertida[posicao] = frase[j];
                    posicao++;
                }

                if (i > 0) {
                    invertida[posicao] = ' ';
                    posicao++;
                }
        }
    }
        System.out.println(invertida);
}
}
