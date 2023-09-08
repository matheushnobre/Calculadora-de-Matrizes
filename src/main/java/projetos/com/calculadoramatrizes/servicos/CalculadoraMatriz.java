package projetos.com.calculadoramatrizes.servicos;

import projetos.com.calculadoramatrizes.entidades.Matriz;

public class CalculadoraMatriz {

    public CalculadoraMatriz() {
    }
    
    public Matriz realizarOperacao(Matriz matriz, int operacao){
        Matriz resultado = null;
        //condições para verificar qual operação deve ser realizada
        switch(operacao){
            case 1:
                resultado=calcularOposta(matriz);
                break;
            case 2:
                resultado=calcularTransposta(matriz);
                break;
        }
        return resultado;
    }
    
    public Matriz realizarOperacao(Matriz[] matrizes, int operacao){
        Matriz resultado = null;
        if(isOperacaoPossivel(matrizes, operacao)==true){
            switch (operacao){
                case 6:
                    resultado=somarMatrizes(matrizes);
                    break;
                case 7:
                    resultado=subtrairMatrizes(matrizes);
                    break;
                case 8:
                    resultado=multiplicarMatrizes(matrizes);
                    break;
            }
        }
        return resultado;
    }  
    
    public Matriz realizarOperacao(Matriz matriz, double escalar){
        return multiplicarMatrizPorEscalar(matriz, escalar);
    }
    
    //verificador de operações possiveis
    private boolean isOperacaoPossivel(Matriz[] matrizes, int operacao){
        boolean retorno=false;
        switch(operacao){
            case 6: //soma
                //verifica se linhas e colunas sao iguais
                if(matrizes[0].getNumeroLinhas()==matrizes[1].getNumeroLinhas() && matrizes[0].getNumeroColunas()==matrizes[1].getNumeroColunas()){
                    retorno = true;
                }
                break;
            case 7: //subtracao
                if(matrizes[0].getNumeroLinhas()==matrizes[1].getNumeroLinhas() && matrizes[0].getNumeroColunas()==matrizes[1].getNumeroColunas()){
                    retorno = true;
                }
                break;
            case 8: //multiplicacao entre matrizes
                if(matrizes[0].getNumeroColunas()==matrizes[1].getNumeroLinhas()){ //numero de colunas da 1º = numero de linhas da 2º
                    retorno = true;
                }
                break;
        }
        return retorno;
    }

    private Matriz calcularOposta(Matriz matriz) {
        Matriz resultado = new Matriz (matriz.getNumeroLinhas(), matriz.getNumeroColunas()); 
        for(int i=0; i<matriz.getNumeroLinhas(); i++){ //percorre linhas
            for(int j=0; j<matriz.getNumeroColunas(); j++){ //percorre colunas
                double elementoMatriz = matriz.retornarElemento(i, j); //pega o elemento da matriz que quer se obter a oposta
                resultado.adicionarElemento(i, j, -elementoMatriz); //modifica o valor do elemento na matriz resultado
            }
        }
        return resultado;
    }
    
    private Matriz calcularTransposta(Matriz matriz){
        Matriz resultado = new Matriz (matriz.getNumeroColunas(), matriz.getNumeroLinhas()); //numero de linhas e colunas se inverte
        for (int i=0; i<matriz.getNumeroLinhas(); i++){ //percorre linhas
            for (int j=0; j<matriz.getNumeroColunas(); j++){ //percorre colunas
                double elementoMatriz = matriz.retornarElemento(i, j); //pega o elemento
                resultado.adicionarElemento(j, i, elementoMatriz); //adiciona esse elemento no resultado, porem o que estava na posição ij, fica agora na posição ji
            }
        }
        return resultado;
    }
    
    //calcularInversa
    
    //calcularCofatores
    
    //calcularAdjunta
    
    private Matriz somarMatrizes(Matriz[] matrizes){
        Matriz resultado = new Matriz(matrizes[0].getNumeroLinhas(), matrizes[0].getNumeroColunas()); //inicializa o resultado
        for(int i=0; i<matrizes[0].getNumeroLinhas(); i++){
            for(int j=0; j<matrizes[0].getNumeroColunas(); j++){
                double soma = matrizes[0].getMatriz()[i][j] + matrizes[1].getMatriz()[i][j]; //soma os elementos das matrizes
                resultado.adicionarElemento(i, j, soma);
            }
        }
        return resultado;
    }
    
    private Matriz subtrairMatrizes(Matriz[] matrizes){
        Matriz resultado = new Matriz(matrizes[0].getNumeroLinhas(), matrizes[0].getNumeroColunas()); //inicializa o resultado
        for(int i=0; i<matrizes[0].getNumeroLinhas(); i++){
            for(int j=0; j<matrizes[0].getNumeroColunas(); j++){
                double subtracao = matrizes[0].getMatriz()[i][j] - matrizes[1].getMatriz()[i][j]; //subtrai os elementos das matrizes
                resultado.adicionarElemento(i, j, subtracao);
            }
        }
        return resultado;
    }
    
    private Matriz multiplicarMatrizPorEscalar(Matriz matriz, double escalar){
        Matriz resultado = new Matriz(matriz.getNumeroLinhas(), matriz.getNumeroColunas()); //inicializa o resultado
        for (int i=0; i<matriz.getNumeroLinhas(); i++){
            for (int j=0; j<matriz.getNumeroColunas(); j++){
                double produto = matriz.getMatriz()[i][j] * escalar;
                resultado.adicionarElemento(i, j, produto);
            }
        }
        return resultado;
    }
    
    private Matriz multiplicarMatrizes(Matriz[] matrizes){
        Matriz resultado = new Matriz(matrizes[0].getNumeroLinhas(), matrizes[1].getNumeroColunas());
        for (int i = 0; i < matrizes[0].getNumeroLinhas(); i++) { //percorre as linhas
            for (int j = 0; j < matrizes[1].getNumeroColunas(); j++) { //percorre as colunas
                double produto = 0; //inicializa produto como 0
                for (int k = 0; k < matrizes[0].getNumeroColunas(); k++) { //ira percorrer todos os elementos da linha na 1º matriz e todos os elementos da coluna na 2º matriz
                    produto += matrizes[0].getMatriz()[i][k] * matrizes[1].getMatriz()[k][j]; //vai calcular o produto desses elementos
                }
                resultado.adicionarElemento(i, j, produto); //vai modificar o valor do elemento cij na matriz resultado
            }
        }
        return resultado;
    }
    
}
