package projetos.com.calculadoramatrizes.utilidades;

import projetos.com.calculadoramatrizes.entidades.Matriz;
import projetos.com.calculadoramatrizes.servicos.MatrizServico;


public final class Impressora {
    static MatrizServico servico = new MatrizServico();
    
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
   
}
