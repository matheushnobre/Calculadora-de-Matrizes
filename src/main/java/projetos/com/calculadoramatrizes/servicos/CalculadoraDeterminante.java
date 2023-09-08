package projetos.com.calculadoramatrizes.servicos;

import projetos.com.calculadoramatrizes.entidades.Matriz;
import projetos.com.calculadoramatrizes.utilidades.Verificadora;

public class CalculadoraDeterminante {
    private Matriz matriz;

    public CalculadoraDeterminante(Matriz matriz) {
        this.matriz = matriz;
    }
    
    public double calcularDeterminante(){
        if(matriz.getNumeroLinhas()==1){
            return matriz.getMatriz()[0][0];
        } else if(matriz.getNumeroLinhas()==2){
            return calcularDeterminanteOrdem2();
        } else{
            return 0;
        }
    }
    
    private double calcularDeterminanteOrdem2(){
        return retornarProdutoDiagonalPrincipal() - retornarProdutoDiagonalSecundaria();
    }
    
    private double calcularDeterminanteOrdem3(){
        return 0;
    }
    
    private double retornarProdutoDiagonalPrincipal(){
        double produto = 1;
        for (int i=0; i<matriz.getNumeroLinhas(); i++){
            for (int j=0; j<matriz.getNumeroColunas(); j++){
                if(i==j){ //verifica se o elemento é da diagonal principal
                    produto *= matriz.getMatriz()[i][j];
                }
            }
        }
        return produto;
    }
    
    private double retornarProdutoDiagonalSecundaria(){
        double produto = 1;
        for (int i=0; i<matriz.getNumeroLinhas(); i++){
            for (int j=0; j<matriz.getNumeroColunas(); j++){
                if(i+j == matriz.getNumeroLinhas()-1){ //verifica se o elemento é da diagonal secundaria
                    produto *= matriz.getMatriz()[i][j];
                }
            }
        }
        return produto;
    }
}
