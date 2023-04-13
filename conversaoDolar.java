package exercicios;
import java.util.Scanner;


public class conversaoDolar {

	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
		
		
		   double real;
		   double dolar;
		   double cotacao;
		   
		   System.out.print("Digite a qunatidade em dolar: ");
		   dolar= input.nextDouble();
		   
		   System.out.print("Digite a cotacao do dolar: ");
		   cotacao = input.nextDouble();
		   
		   real = dolar * cotacao;
		   
		   System.out.print("Quantia em reais: "+ real + "R$");

	}

}
