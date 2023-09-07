package projetos.com.calculadoramatrizes.servicos;

import projetos.com.calculadoramatrizes.entidades.Matriz;

public class CalculadoraMatriz {
    
    public Matriz realizarOperacao(Matriz matriz, int operacao){
        Matriz resultado = new Matriz();
        //condições para verificar qual operação deve ser realizada
        if(operacao==1){
            resultado=calcularOposta(matriz);
        } else if(operacao==2){
            resultado=calcularTransposta(matriz);
        }
        return resultado;
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
}
