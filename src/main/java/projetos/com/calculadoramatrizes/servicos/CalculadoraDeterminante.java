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
        } else if(matriz.getNumeroLinhas()==3){
            return calcularDeterminanteOrdem3();
        } else{
            return 0;
        }
    }
    
    private double calcularDeterminanteOrdem2(){
        return retornarProdutoDiagonalPrincipal() - retornarProdutoDiagonalSecundaria();
    }
    
    private double calcularDeterminanteOrdem3(){
        return (retornarProdutoDiagonalPrincipal() + retornarParalelaPrincipal1() + retornarParalelaPrincipal2()) - (retornarProdutoDiagonalSecundaria() + retornarParalelaSecundaria1() + retornarParalelaSecundaria2());
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
    
    //sequencia de metodos para ajudar no calculo do determinante de ordem 3
    private double retornarParalelaPrincipal1(){
        return matriz.getMatriz()[0][1] * matriz.getMatriz()[1][2] * matriz.getMatriz()[2][0];
    }
    
    private double retornarParalelaPrincipal2(){
        return matriz.getMatriz()[0][2] * matriz.getMatriz()[1][0] * matriz.getMatriz()[2][1];
    }
    
    private double retornarParalelaSecundaria1(){
       return matriz.getMatriz()[0][0] * matriz.getMatriz()[1][2] * matriz.getMatriz()[2][1];
    }
    
    private double retornarParalelaSecundaria2(){
        return matriz.getMatriz()[0][1] * matriz.getMatriz()[1][0] * matriz.getMatriz()[2][2];
    }
}
