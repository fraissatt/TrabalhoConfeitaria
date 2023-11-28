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
	        // Limite de orçamento
	        int orcamento = 0;
	        boolean orcamentoValido = false;
	        while (!orcamentoValido) {
	            try {
	                System.out.println("Informe o limite de orçamento R$: ");
	                orcamento = sc.nextInt();
	                orcamentoValido = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira um número válido para o limite de orçamento.");
	                sc.nextLine();
	            }
	        }

	        // Valores de compra dos ingredientes e leitura da quantidade de matéria-prima disponível
	        double valorChocolate = 0.0;
	        int qtdChocolate = 0;
	        boolean entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor do chocolate fracionado meio amargo R$:");
	                valorChocolate = sc.nextDouble();
	                System.out.println("Digite a quantidade de chocolate disponível (em gramas):");
	                qtdChocolate = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas números válidos para o valor e a quantidade de chocolate.");
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
	                System.out.println("Digite a quantidade de leite condensado disponível (em gramas):");
	                qtdLeiteCondensado = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas números válidos para o valor e a quantidade de leite condensado.");
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
	                System.out.println("Digite a quantidade de margarina disponível (em gramas):");
	                qtdMargarina = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas números válidos para o valor e a quantidade de margarina.");
	                sc.nextLine();
	            }
	        }

	        double valorLeitePo = 0.0;
	        int qtdLeiteEmPo = 0;
	        entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor do leite em pó R$:");
	                valorLeitePo = sc.nextDouble();
	                System.out.println("Digite a quantidade de leite em pó disponível (em gramas): ");
	                qtdLeiteEmPo = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas números válidos para o valor e a quantidade de leite em pó.");
	                sc.nextLine();
	            }
	        }

	        double valorCafe = 0.0;
	        int qtdCafeSolulvel = 0;
	        entradaValida = false;
	        while (!entradaValida) {
	            try {
	                System.out.println("Digite o valor do café solúvel R$:");
	                valorCafe = sc.nextDouble();
	                System.out.println("Digite a quantidade de café solúvel disponível (em gramas):");
	                qtdCafeSolulvel = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas números válidos para o valor e a quantidade de café solúvel.");
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
	                System.out.println("Digite a quantidade de coco ralado seco disponível (em gramas):");
	                qtdCocoRalado = sc.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira apenas números válidos para o valor e a quantidade de coco ralado seco.");
	                sc.nextLine();
	            }
	        }

	        // Cálculo da quantidade de receitas que podem ser feitas com a matéria-prima disponível
	        int qtdReceitaLeiteNinho = Math.min(qtdChocolate/400, Math.min(qtdLeiteCondensado/395, Math.min(qtdMargarina/40, qtdLeiteEmPo/50)));
	        int qtdReceitaCafe = Math.min(qtdChocolate/400, Math.min(qtdLeiteCondensado/395, Math.min(qtdMargarina/40, qtdCafeSolulvel/100)));
	        int qtdReceitaCoco = Math.min(qtdChocolate/400, Math.min(qtdLeiteCondensado/395, Math.min(qtdMargarina/40, qtdCocoRalado/300)));

	        // Cálculo do custo total das receitas
	        double custoTotal = valorChocolate + valorLeiteCondensado + valorMargarina + valorLeitePo + valorCafe + valorCoco;
	        double custoReceitaLeiteNinho = valorChocolate + valorLeiteCondensado + valorMargarina + valorLeitePo;
	        double custoReceitaCafe = valorChocolate + valorLeiteCondensado + valorMargarina + valorCafe;
	        double custoReceitaCoco = valorChocolate + valorLeiteCondensado + valorMargarina + valorCoco;

	        // Exibição dos resultados
	        System.out.println("O custo total foi R$: " + custoTotal + " (dentro do orçamento).");
	        if (custoTotal > orcamento) {
	            System.out.println("Infelizmente, o custo de produção ficou acima do orçamento esperado " + "(R$ " + orcamento + ")");
	        }

	        System.out.println("Com a quantidade de matéria-prima disponível, é possível fazer, de forma individual:");
	        System.out.println("- " + qtdReceitaLeiteNinho + " receita(s) de bombom de leite ninho.");
	        System.out.println("- " + qtdReceitaCafe + " receita(s) de bombom de café.");
	        System.out.println("- " + qtdReceitaCoco + " receita(s) de bombom de coco.");
	        System.out.println("O custo da(s) receita(s) de leite ninho foi R$: " + custoReceitaLeiteNinho);
	        System.out.println("O custo da(s) receita(s) de café foi R$: " + custoReceitaCafe);
	        System.out.println("O custo da(s) receita(s) de coco foi R$: " + custoReceitaCoco);

	        // Valor de venda unitária.
	        double valorVenda = 0.0;
	        boolean valorVendaValido = false;
	        while (!valorVendaValido) {
	            try {
	                System.out.println("Digite o valor de venda do bombom R$:");
	                valorVenda = sc.nextDouble();
	                valorVendaValido = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira um número válido para o valor de venda do bombom.");
	                sc.nextLine();
	            }
	        }

	        double lucroBombomLeiteNinho = valorVenda * 50 - custoReceitaLeiteNinho;
	        double lucroBombomCafe = valorVenda * 50 - custoReceitaCafe;
	        double lucroBombomCoco = valorVenda * 50 - custoReceitaCoco;
	        System.out.println("Caso queira fazer a receita de bomboms de leite ninho, o lucro será de R$: " + lucroBombomLeiteNinho);
	        System.out.println("Caso queira fazer a receita de bomboms de café, o lucro será de R$: " + lucroBombomCafe);
	        System.out.println("Caso queira fazer a receita de bomboms de coco, o lucro será de R$: " + lucroBombomCoco);

	        sc.close();

	    }

	}