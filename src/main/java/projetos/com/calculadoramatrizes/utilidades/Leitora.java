package projetos.com.calculadoramatrizes.utilidades;

//classe responsável por realizar a leitura de dados

//importando classes utilitárias
import java.util.Scanner;
import projetos.com.calculadoramatrizes.entidades.Matriz;

public final class Leitora {
    private static Scanner scanner;
    
    //bloco de inicialização estático para inicializar o scanner
    static{
        scanner = new Scanner(System.in);
    }
    
    public static String[] lerDado() { //lê um texto e retorna o texto lido
	String[] texto = scanner.nextLine().split(" "); 
	return texto; 
    }
    
    public static Matriz lerMatriz(){
        System.out.println("Digite o número de linhas e de colunas da matriz: ");
        String[] entrada = lerDado(); //lê a entrada do usuário
        int numeroLinhas = Integer.parseInt(entrada[0]); //atribui valor ao número de linhas da matriz
        int numeroColunas = Integer.parseInt(entrada[1]); //atribui valor ao número de colunas da matriz
        
        System.out.println("Certo. A matriz possui ordem "+numeroLinhas+" x "+numeroColunas+".");
        Matriz matriz = new Matriz(numeroLinhas, numeroColunas); //cria a matriz
        
        //laço de repetição para atribuir valores a cada elemento da matriz
        for(int i=0; i<matriz.getNumeroLinhas(); i++){ //percorre as linhas da matriz
            int linhaAtual = i+1; //apenas para facilitar a comunicação com o usuário
            System.out.println("Digite todos os elementos da linha "+linhaAtual+" da matriz: ");
            entrada = lerDado(); //lê a entrada do usuário
            for(int j=0; j<matriz.getNumeroColunas(); j++){ //percorre a coluna
                matriz.adicionarElemento(i, j, Integer.parseInt(entrada[j])); //adiciona os valores atribuídos pelo usuário na matriz
            } //fecha o laço de repetição que percorre as colunas
        } //fecha o laço de repetição que percorre as linhas
        
        return matriz; //retorna a matriz digitada pelo usuário
    }
    
    public static int[] lerPosicao(){
        int[] posicao = new int[2];
        System.out.println("Digite a posição da linha e da coluna do elemento que deseja verificar (modelo de entrada: i j): ");
        String[] entrada = lerDado();
        posicao[0] = Integer.parseInt(entrada[0])-1;
        posicao[1] = Integer.parseInt(entrada[1])-1; //lembre-se que o usuário começa a contagem do 1, enquanto o computador começa do 0
        return posicao;
    }
    
    
}
