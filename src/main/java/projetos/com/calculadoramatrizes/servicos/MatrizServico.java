package projetos.com.calculadoramatrizes.servicos;

import projetos.com.calculadoramatrizes.entidades.Matriz;
import projetos.com.calculadoramatrizes.utilidades.Leitora;
import projetos.com.calculadoramatrizes.utilidades.Verificadora;

public class MatrizServico {
    private Matriz matriz;

    public MatrizServico(Matriz matriz) {
        this.matriz = matriz;
    }

    public MatrizServico() {
    }
    
    public String retornarParaImpressao(){
        StringBuilder matrizImpressao = new StringBuilder(); //inicializa um construtor de strings 
        for(int i=0; i<matriz.getNumeroLinhas(); i++){ //percorre as linhas
            matrizImpressao.append("\n"); //pula uma linha para separar as linhas da nossa matriz
            for(int j=0; j<matriz.getNumeroColunas(); j++){ //percorre as colunas
                matrizImpressao.append(matriz.getMatriz()[i][j]); //adiciona o elemento ao nosso texto
                matrizImpressao.append(" "); //dá um espaço para separar as colunas
            }
        }  
        return matrizImpressao.toString(); //retorna o texto para impressao
    }
    
    public String retornarElementoEspecificoParaImpressao(){
        int[] posicao = Leitora.lerPosicao();
        return ""+matriz.retornarElemento(posicao[0], posicao[1]);
    }
    
    public String retornarTiposMatrizParaImpressao(){
        StringBuilder tiposMatriz = new StringBuilder();
        if(Verificadora.isMatrizLinha(matriz)==true){
            tiposMatriz.append("\nMatriz linha");
        }
        if(Verificadora.isMatrizColuna(matriz)==true){
            tiposMatriz.append("\nMatriz coluna");
        }
        if(Verificadora.isMatrizQuadrada(matriz)==true){
            tiposMatriz.append("\nMatriz quadrada");
        }
        if(Verificadora.isMatrizRetangular(matriz)==true){
            tiposMatriz.append("\nMatriz retangular");
        }
        if(Verificadora.isMatrizNula(matriz)==true){
            tiposMatriz.append("\nMatriz nula");
        }
        if(Verificadora.isMatrizIdentidade(matriz)==true){
            tiposMatriz.append("\nMatriz identidade");
        }
        if(Verificadora.isMatrizDiagonal(matriz)==true){
            tiposMatriz.append("\nMatriz diagonal");
        }
        if(Verificadora.isMatrizEscalar(matriz)==true){
            tiposMatriz.append("\nMatriz escalar");
        }
        if(Verificadora.isMatrizTriangularInferior(matriz)==true){
            tiposMatriz.append("\nMatriz triangular inferior");
        }
        if(Verificadora.isMatrizTriangularSuperior(matriz)==true){
            tiposMatriz.append("\nMatriz Triangular superior");
        }
        return tiposMatriz.toString();
    }

    public Matriz getMatriz() {
        return matriz;
    }

    public void setMatriz(Matriz matriz) {
        this.matriz = matriz;
    }
    
}
