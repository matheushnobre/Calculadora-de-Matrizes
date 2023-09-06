package projetos.com.calculadoramatrizes.console;

import projetos.com.calculadoramatrizes.entidades.Matriz;
import projetos.com.calculadoramatrizes.servicos.MatrizServico;
import projetos.com.calculadoramatrizes.utilidades.Leitora;

public class Start {

    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        MatrizServico servico = new MatrizServico(matriz);
        
        System.out.println("---------- Bem-vindo a calculadora de matrizes ----------");
        int opcao; //variavel que sera utilizada para saber qual foi a opção escolhida pelo usuário
        
        String menu = ("---------- Opções do programa ---------- \n1. Verificar elemento de uma determinada posição\n"
                + "2. Verificar tipos de matriz\n3. Calcular matriz oposta\n4. Calcular matriz transposta\n"
                + "5. Calcular matriz inversa\n6. Somar matrizes\n7. Subtrair matrizes\n"
                + "8. Multiplicar matriz por escalar\n9. Multiplicar matrizes\n10. Calcular determinante\n"
                + "11. Sair\n-------------------------"); //menu de opções do nosso programa
        
        while(true){ //loop para rodar o nosso programa
            System.out.println(menu); //imprime o menu na tela
            System.out.println("Selecione uma opção: ");
            opcao = Integer.parseInt(Leitora.lerDado()[0]); //lê a opção desejada pelo usuário
            
            switch(opcao){ //analisará qual opção foi escolhida
                case 1:
                    matriz = Leitora.lerMatriz();
                    servico.setMatriz(matriz);
                    System.out.println("Você digitou a seguinte matriz: "+servico.retornarParaImpressao());
                    System.out.println("Elemento na posição desejada: "+servico.retornarElementoEspecifico());
                    break;
                case 2:
                    matriz = Leitora.lerMatriz();
                    servico.setMatriz(matriz);
                    System.out.println("Você digitou a seguinte matriz: "+servico.retornarParaImpressao());
                    System.out.println("Retornando os tipos em que essa matriz se encaixa..."+servico.retornarTiposMatriz());
                    break;
                case 3:
                    //calcular oposta
                    break;
                case 4:
                    //calcular transposta
                    break;
                case 5: 
                    //calcular inversa
                    break;
                case 6:
                    //somar matrizes
                    break;
                case 7:
                    //subtrair
                    break;
                case 8:
                    //multiplicar por escalar
                    break;
                case 9:
                    //multiplicar
                    break;
                case 10:
                    //calcular determinante
                    break;
                case 11:
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
