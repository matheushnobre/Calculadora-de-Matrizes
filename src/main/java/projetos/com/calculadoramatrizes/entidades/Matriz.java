package projetos.com.calculadoramatrizes.entidades;

//importando pacotes
import projetos.com.calculadoramatrizes.utilidades.Verificadora;

public class Matriz {
    //atributos
    private double matriz[][]; //armazenará uma matriz de ordem qualquer
    private int numeroLinhas; //guardará o valor correspondente ao número de linhas da matriz
    private int numeroColunas; //guardará o valor correspondente ao número de colunas da matriz
    
    //construtor
    public Matriz() { 
    }
    
    //construtor com parâmetros
    public Matriz(int numeroLinhas, int numeroColunas) {
        this.numeroLinhas = numeroLinhas;
        this.numeroColunas = numeroColunas;
        this.matriz = new double [numeroLinhas] [numeroColunas];
    }
    
    public void adicionarElemento(int i, int j, double elemento){ //recebe como parâmetro a posição da matriz e o elemento a ser adicionado
        matriz[i][j] = elemento; //atribui esse elemento na posição correta da matriz
    }
    
    public double retornarElemento(int i, int j){ //recebe como parâmetro a posição da matriz
        return matriz[i][j]; //retorna o elemento que está guardado nessa posição
    }

    //getters e setters 
    public double[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][] matriz) {
        this.matriz = matriz;
    }

    public int getNumeroLinhas() {
        return numeroLinhas;
    }

    public void setNumeroLinhas(int numeroLinhas) {
        this.numeroLinhas = numeroLinhas;
    }

    public int getNumeroColunas() {
        return numeroColunas;
    }

    public void setNumeroColunas(int numeroColunas) {
        this.numeroColunas = numeroColunas;
    }
    
}
