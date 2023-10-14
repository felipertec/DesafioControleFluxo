import java.util.Random;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		/*Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();*/
        Random valorAleatorio = new Random();

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = valorAleatorio.nextInt(20);
        System.out.println("Valor Escolhido no primeiro Parametro: " + parametroUm);
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = valorAleatorio.nextInt(20);
        System.out.println("Valor Escolhido no segundo Parametro: " + parametroDois);

		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois - parametroUm;

        if(parametroUm > parametroDois){
            System.out.println("Entrou aqui");
            throw new ParametrosInvalidosException();
        }
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i < contagem; i++){
            System.out.println(i+1);
        }
	}
    
}