package projetos.com.calculadoramatrizes.console;

import projetos.com.calculadoramatrizes.entidades.Matriz;
import projetos.com.calculadoramatrizes.servicos.MatrizServico;
import projetos.com.calculadoramatrizes.utilidades.Impressora;
import projetos.com.calculadoramatrizes.utilidades.Leitora;

public class Start {

    public static void main(String[] args) {
        Matriz matriz;
        Matriz[] matrizes;
        
        System.out.println("---------- Bem-vindo a calculadora de matrizes ----------");
        int opcao; //variavel que sera utilizada para saber qual foi a opção escolhida pelo usuário
        
        String menu = ("---------- Opções do programa ---------- \n1. Verificar elemento de uma determinada posição\n"
                + "2. Verificar tipos de matriz\n3. Calcular matriz oposta\n4. Calcular matriz transposta\n"
                + "5. Calcular matriz inversa\n6. Calcular matriz dos cofatores\n7. Calcular matriz adjunta\n"
                + "8. Somar matrizes\n9. Subtrair matrizes\n10. Multiplicar matriz por escalar\n"
                + "11 Multiplicar matrizes\n12. Calcular determinante\n13. Sair\n-------------------------"); //menu de opções do nosso programa
        
        while(true){ //loop para rodar o nosso programa
            System.out.println(menu); //imprime o menu na tela
            System.out.println("Selecione uma opção: ");
            opcao = Integer.parseInt(Leitora.lerDado()[0]); //lê a opção desejada pelo usuário
            
            switch(opcao){ //analisará qual opção foi escolhida
                case 1:
                    matriz = Leitora.lerMatriz();
                    Impressora.imprimirElementoEspecifico(matriz);
                    break;
                case 2:
                    matriz = Leitora.lerMatriz();
                    Impressora.imprimirTiposMatriz(matriz);
                    break;
                case 3:
                    matriz = Leitora.lerMatriz();
                    Impressora.imprimirResultado(matriz, 1); //pede para realizar o calculo e exibir o resultado
                    break;
                case 4:
                    matriz = Leitora.lerMatriz();
                    Impressora.imprimirResultado(matriz, 2);
                    break;
                case 5: 
                    System.out.println("Programa em desenvolvimento. Em breve essa função será adicionada");
                    break;
                case 6:
                    //calcular matriz dos cofatores
                    break;
                case 7:
                    //calcular matriz adjunta
                    break;
                case 8:
                    matrizes = Leitora.lerDuasMatrizes();
                    Impressora.imprimirResultado(matrizes, 6);
                    break;
                case 9:
                    matrizes = Leitora.lerDuasMatrizes();
                    Impressora.imprimirResultado(matrizes, 7);
                    break;
                case 10:
                    matriz = Leitora.lerMatriz();
                    double escalar = Leitora.lerEscalar();
                    Impressora.imprimirResultado(matriz, escalar);
                    break;
                case 11:
                    matrizes = Leitora.lerDuasMatrizes();
                    Impressora.imprimirResultado(matrizes, 8);
                    break;
                case 12:
                    matriz = Leitora.lerMatriz();
                    Impressora.imprimirDeterminante(matriz);
                    break;
                case 13:
                    System.out.println("Obrigado por utilizar nosso programa. Volte sempre!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        }
    }
    
}
