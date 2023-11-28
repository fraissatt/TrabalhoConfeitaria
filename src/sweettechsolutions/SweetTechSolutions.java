/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sweettechsolutions;

import java.util.InputMismatchException;

import java.util.Scanner;

public class SweetTechSolutions {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // Limite de or�amento
	        int orcamento = 0;
	        boolean orcamentoValido = false;
	        while (!orcamentoValido) {
	            try {
	                System.out.println("Informe o limite de or�amento R$: ");
	                orcamento = sc.nextInt();
	                orcamentoValido = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira um n�mero v�lido para o limite de or�amento.");
	                sc.nextLine();
	            }
	        }

	        // Valores de compra dos ingredientes e leitura da quantidade de mat�ria-prima dispon�vel
	        double valorChocolate = 0.0;
	        int qtdChocolate = 0;
	        boolean entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor do chocolate fracionado meio amargo R$:");
	                valorChocolate = sc.nextDouble();
	                System.out.println("Digite a quantidade de chocolate dispon�vel (em gramas):");
	                qtdChocolate = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas n�meros v�lidos para o valor e a quantidade de chocolate.");
	                sc.nextLine();
	            }
	        }

	        double valorLeiteCondensado = 0.0;
	        int qtdLeiteCondensado = 0;
	        entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor do leite condensado R$:");
	                valorLeiteCondensado = sc.nextDouble();
	                System.out.println("Digite a quantidade de leite condensado dispon�vel (em gramas):");
	                qtdLeiteCondensado = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas n�meros v�lidos para o valor e a quantidade de leite condensado.");
	                sc.nextLine();
	            }
	        }

	        double valorMargarina = 0.0;
	        int qtdMargarina = 0;
	        entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor da margarina R$:");
	                valorMargarina = sc.nextDouble();
	                System.out.println("Digite a quantidade de margarina dispon�vel (em gramas):");
	                qtdMargarina = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas n�meros v�lidos para o valor e a quantidade de margarina.");
	                sc.nextLine();
	            }
	        }

	        double valorLeitePo = 0.0;
	        int qtdLeiteEmPo = 0;
	        entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor do leite em p� R$:");
	                valorLeitePo = sc.nextDouble();
	                System.out.println("Digite a quantidade de leite em p� dispon�vel (em gramas): ");
	                qtdLeiteEmPo = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas n�meros v�lidos para o valor e a quantidade de leite em p�.");
	                sc.nextLine();
	            }
	        }

	        double valorCafe = 0.0;
	        int qtdCafeSolulvel = 0;
	        entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor do caf� sol�vel R$:");
	                valorCafe = sc.nextDouble();
	                System.out.println("Digite a quantidade de caf� sol�vel dispon�vel (em gramas):");
	                qtdCafeSolulvel = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas n�meros v�lidos para o valor e a quantidade de caf� sol�vel.");
	                sc.nextLine();
	            }
	        }

	        double valorCoco = 0.0;
	        int qtdCocoRalado = 0;
	        entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor do coco ralado seco R$:");
	                valorCoco = sc.nextDouble();
	                System.out.println("Digite a quantidade de coco ralado seco dispon�vel (em gramas):");
	                qtdCocoRalado = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas n�meros v�lidos para o valor e a quantidade de coco ralado seco.");
	                sc.nextLine();
	            }
	        }

	        // C�lculo da quantidade de receitas que podem ser feitas com a mat�ria-prima dispon�vel
	        int qtdReceitaLeiteNinho = Math.min(qtdChocolate/400, Math.min(qtdLeiteCondensado/395, Math.min(qtdMargarina/40, qtdLeiteEmPo/50)));
	        int qtdReceitaCafe = Math.min(qtdChocolate/400, Math.min(qtdLeiteCondensado/395, Math.min(qtdMargarina/40, qtdCafeSolulvel/100)));
	        int qtdReceitaCoco = Math.min(qtdChocolate/400, Math.min(qtdLeiteCondensado/395, Math.min(qtdMargarina/40, qtdCocoRalado/300)));

	        // C�lculo do custo total das receitas
	        double custoTotal = valorChocolate + valorLeiteCondensado + valorMargarina + valorLeitePo + valorCafe + valorCoco;
	        double custoReceitaLeiteNinho = valorChocolate + valorLeiteCondensado + valorMargarina + valorLeitePo;
	        double custoReceitaCafe = valorChocolate + valorLeiteCondensado + valorMargarina + valorCafe;
	        double custoReceitaCoco = valorChocolate + valorLeiteCondensado + valorMargarina + valorCoco;

	        // Exibi��o dos resultados
	        System.out.println("O custo total foi R$: " + custoTotal + " (dentro do or�amento).");
	        if (custoTotal > orcamento) {
	            System.out.println("Infelizmente, o custo de produ��o ficou acima do or�amento esperado " + "(R$ " + orcamento + ")");
	        }

	        System.out.println("Com a quantidade de mat�ria-prima dispon�vel, � poss�vel fazer, de forma individual:");
	        System.out.println("- " + qtdReceitaLeiteNinho + " receita(s) de bombom de leite ninho.");
	        System.out.println("- " + qtdReceitaCafe + " receita(s) de bombom de caf�.");
	        System.out.println("- " + qtdReceitaCoco + " receita(s) de bombom de coco.");
	        System.out.println("O custo da(s) receita(s) de leite ninho foi R$: " + custoReceitaLeiteNinho);
	        System.out.println("O custo da(s) receita(s) de caf� foi R$: " + custoReceitaCafe);
	        System.out.println("O custo da(s) receita(s) de coco foi R$: " + custoReceitaCoco);

	        // Valor de venda unit�ria.
	        double valorVenda = 0.0;
	        boolean valorVendaValido = false;
	        while (!valorVendaValido) {
	            try {
	                System.out.println("Digite o valor de venda do bombom R$:");
	                valorVenda = sc.nextDouble();
	                valorVendaValido = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira um n�mero v�lido para o valor de venda do bombom.");
	                sc.nextLine();
	            }
	        }

	        double lucroBombomLeiteNinho = valorVenda * 50 - custoReceitaLeiteNinho;
	        double lucroBombomCafe = valorVenda * 50 - custoReceitaCafe;
	        double lucroBombomCoco = valorVenda * 50 - custoReceitaCoco;
	        System.out.println("Caso queira fazer a receita de bomboms de leite ninho, o lucro ser� de R$: " + lucroBombomLeiteNinho);
	        System.out.println("Caso queira fazer a receita de bomboms de caf�, o lucro ser� de R$: " + lucroBombomCafe);
	        System.out.println("Caso queira fazer a receita de bomboms de coco, o lucro ser� de R$: " + lucroBombomCoco);

	        sc.close();

	    }

	}