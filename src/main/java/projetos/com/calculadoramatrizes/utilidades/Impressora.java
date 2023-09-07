package projetos.com.calculadoramatrizes.utilidades;

import projetos.com.calculadoramatrizes.entidades.Matriz;
import projetos.com.calculadoramatrizes.servicos.CalculadoraMatriz;
import projetos.com.calculadoramatrizes.servicos.MatrizServico;


public final class Impressora {
    static MatrizServico servico = new MatrizServico();
    static CalculadoraMatriz calculadora = new CalculadoraMatriz();
    
    public static void imprimirTiposMatriz(Matriz matriz){
        servico.setMatriz(matriz);
        System.out.println("Retornando os tipos em que essa matriz se encaixa..."+servico.retornarTiposMatrizParaImpressao());
    }
    
    public static void imprimirMatriz(Matriz matriz){
        servico.setMatriz(matriz);
        System.out.println(servico.retornarParaImpressao());
    }
    
    public static void imprimirMatrizDigitada(Matriz matriz){
        servico.setMatriz(matriz);
        System.out.println("Você digitou a seguinte matriz:"+servico.retornarParaImpressao());
    }
    
    public static void imprimirElementoEspecifico(Matriz matriz){
        servico.setMatriz(matriz);
        System.out.println("Elemento na posição desejada: "+servico.retornarElementoEspecificoParaImpressao());
    }
   
    public static void imprimirResultado(Matriz matriz, int operacao){
        Matriz resultado = calculadora.realizarOperacao(matriz, operacao);
        servico.setMatriz(resultado);
        System.out.println("Resultado da operação..."+servico.retornarParaImpressao());
    }
}
