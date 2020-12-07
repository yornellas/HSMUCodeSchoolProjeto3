import java.util.Scanner;
import java.lang.String;

public class AcoesBolsaProjeto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] mat_acao1 =  new double[4][7];
		mat_acao1[0][0] = 16.31;
		mat_acao1[0][1] = 16.00;
		mat_acao1[0][2] = 16.24;
		mat_acao1[0][3] = 15.78;
		mat_acao1[0][4] = 16.01;
		mat_acao1[0][5] = 16.07;
		mat_acao1[0][6] = 15.75;
		mat_acao1[1][0] = 15.56;
		mat_acao1[1][1] = 15.26;
		mat_acao1[1][2] = 15.12;
		mat_acao1[1][3] = 14.92;
		mat_acao1[1][4] = 15.26;
		mat_acao1[1][5] = 15.59;
		mat_acao1[1][6] = 15.45;
		mat_acao1[2][0] = 15.41;
		mat_acao1[2][1] = 15.22;
		mat_acao1[2][2] = 14.16;
		mat_acao1[2][3] = 14.91;
		mat_acao1[2][4] = 15.27;
		mat_acao1[2][5] = 15.31;
		mat_acao1[2][6] = 14.43;
		mat_acao1[3][0] = 14.81;
		mat_acao1[3][1] = 14.20;
		mat_acao1[3][2] = 13.40;
		mat_acao1[3][3] = 14.92;
		mat_acao1[3][4] = 15.26;
		mat_acao1[3][5] = 15.59;
		mat_acao1[3][6] = 15.45;
		
		double [][] mat_acao2 = {{40.73, 39.77, 40.11, 40.20, 39.65, 39.91, 39.21}, {39.86, 39.15, 39.70, 40.33, 41.85, 41.53, 40.50}, {40.78, 40.97, 41.19, 40.89, 39.68, 39.62, 37.45}, {40.20, 39.65, 39.91, 39.21, 41.19, 40.89, 39.68}};
		//já defini os valores das cotacoes das acoes apra facilitar. É só um exemplo, pois nao tem como saber quais acos a pessoa iria querer analisar.
		
		Scanner sc = new Scanner(System.in);
		int i, j;
		double maior, menor, soma;
		
		double[] vet_mediasem_acao1 = new double[4];
		double[] vet_mediasem_acao2 = new double[4];

		//media semanal acao1
		for (i=0; i <= mat_acao1.length -1; i++){
			vet_mediasem_acao1[i] = 0;
			for (j=0; j <= mat_acao1.length -1; j++) {
				vet_mediasem_acao1[i] = vet_mediasem_acao1[i] + mat_acao1[i][j] / 7;
			}
		}
		
		System.out.println("Maior média semanal da ação 1");
		maior = vet_mediasem_acao1[0];
		for (i=1; i <= mat_acao1.length -1; i++) {
			if (vet_mediasem_acao1[i] > maior) {
				maior = vet_mediasem_acao1[i];
			}
		}
		System.out.println(maior);
		
		System.out.println("Menor média semanal da ação 1");
		menor = vet_mediasem_acao1[0];
		for (i=1; i <= mat_acao1.length -1; i++) {
			if (vet_mediasem_acao1[i] < menor) {
				menor = vet_mediasem_acao1[i];
			}
		}
		System.out.println(menor);

		
		//media semanal acao2
		for (i=0; i <= mat_acao2.length -1; i++){
			vet_mediasem_acao2[i] = 0;
			for (j=0; j <= mat_acao2[0].length -1; j++) {
				vet_mediasem_acao2[i] = vet_mediasem_acao2[i] + mat_acao2[i][j] / 7;
			}
		}
		
		System.out.println();
		System.out.println("Maior média semanal da ação 2");
		for (i=1; i <= mat_acao2.length -1; i++) {
			if (vet_mediasem_acao2[i] > maior) {
				maior = vet_mediasem_acao2[i];
			}
		}
		System.out.println(maior);
		
		System.out.println("Menor média semanal da ação 2");
		menor = vet_mediasem_acao2[0];
		for (i=1; i <= mat_acao2.length -1; i++) {
			if (vet_mediasem_acao2[i] < menor) {
				menor = vet_mediasem_acao2[i];
			}
		}
		System.out.println(menor);
		
		
		//media mensal acao1
		soma = 0;
		for (i=0; i <= mat_acao1.length -1; i++){
			for (j=0; j <= mat_acao1.length -1; j++) {
				soma = soma + mat_acao1[i][j];
			}
		}
		System.out.println();
		System.out.print("Média mensal da ação 1: ");
		System.out.println(soma / 28);
		
		//media mensal acao2
		soma = 0;
		for (i=0; i <= mat_acao2.length -1; i++){
			for (j=0; j <= mat_acao2.length -1; j++) {
				soma = soma + mat_acao2[i][j];
			}
		}
		
		System.out.println();
		System.out.print("Média mensal da ação 2: ");
		System.out.print(soma / 28);
		
		
		sc.close();
	}

}
