package projetos.com.calculadoramatrizes.utilidades;

//importando pacotes
import projetos.com.calculadoramatrizes.entidades.Matriz;

public final class Verificadora {
    public static boolean isMatrizQuadrada(Matriz matriz){ //numero de linhas e de colunas deve ser igual para retornar verdadeiro
        if(matriz.getNumeroLinhas()==matriz.getNumeroColunas()){ 
            return true;
        } else{
            return false;
        }
    }
    
    public static boolean isMatrizRetangular(Matriz matriz){ //basta não ser matriz quadrada
        if(isMatrizQuadrada(matriz)==true){
            return false;
        } else{
            return true;
        }
    }
    
    public static boolean isMatrizLinha(Matriz matriz){ //numero de linhas deve ser igual a 1 
        if(matriz.getNumeroLinhas()==1){
            return true;
        } else{
            return false;
        }
    }
    
    public static boolean isMatrizColuna(Matriz matriz){ //numero de colunas deve ser igual a 1
        if(matriz.getNumeroColunas()==1){
            return true;
        } else{
            return false;
        }
    }
    
    public static boolean isMatrizIdentidade(Matriz matriz){ //todos os elementos da diagonal principal devem ser iguais a 1, enquanto os demais devem ser iguais a 0
        boolean retorno = false; //variavel para armazenar o retorno
        if(isMatrizQuadrada(matriz)==true && matriz.getNumeroLinhas()>1){ //só pode ser identidade se também for quadrada
            retorno=true; //muda o retorno para verdadeiro
            for(int i=0; i<matriz.getNumeroLinhas(); i++){ //percorrendo linhas
                for(int j=0; j<matriz.getNumeroColunas(); j++){ //percorrendo colunas
                    if(i==j && matriz.getMatriz()[i][j]==1 || i!=j && matriz.getMatriz()[i][j]==0){ //verifica se os elementos da diagonal principal são igual a 1 e se os demais elementos são iguais a 0
                        continue; //se ainda existir possibilidade de ser matriz identidade, segue rodando
                    } else{
                        retorno=false; 
                        break; //se não existir possibilidade, fecha o ciclo
                    }
                }
            }//fecha o laço de repetição
        } //fecha o if
        return retorno;
    }
    
    public static boolean isMatrizNula(Matriz matriz){ //todos os elementos devem ser iguais a 0
        boolean retorno = true; //inicializa o retorno como true
        for(int i=0; i<matriz.getNumeroLinhas(); i++){ //percorrendo as linhas
            for(int j=0; j<matriz.getNumeroColunas(); j++){//percorrendo as colunas 
                if(matriz.getMatriz()[i][j]!=0){ //verificando se o elemento é 0. caso seja diferente de 0...
                    retorno=false; //a matriz não é nula
                    break; //interrompe o laço
                }
            }
        }
        return retorno; //retorna true ou false
    }
}
