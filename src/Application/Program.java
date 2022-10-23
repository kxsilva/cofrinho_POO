package Application;

import java.util.Iterator;
import java.util.Scanner;

import Entities.Dolar;
import Entities.Euro;
import Entities.Moeda;
import Entities.Real;

public class Program {
	//Aluno: Kaynã Xavier da Silva || RU: 4150733
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner para leitura de dados do usuario.

		Cofrinho cofre = new Cofrinho(); // Instancia do cofre na classe principal.

		// While para programaçao defensiva, caso o usuario digite um numero invalido.
		while (true)  {
			System.out.println("COFRINHO:");
			System.out.println(
					"1 - Adicionar Moeda\n2 - Remover Moeda\n3 - Listar Moedas\n4 - Calcular total convertido para Real\n0 - Encerrar");
			int choice = sc.nextInt();

			if (choice == 0) {
				break;
			} else if (choice == 1) {
				// Choice = 1, para adicionar moedas
				System.out.println("Escolha Moeda: ");
				System.out.println("1 - Real\n2 - Dolar\n3 - Euro");
				int escolhaMoeda = sc.nextInt();
				System.out.println("Digite o valor:");
				double value = sc.nextDouble();
				//Os if e else abaixo, servem para adicionar no cofre a moeda selecionada
				if (escolhaMoeda == 1) {
					cofre.getMoedas().add(new Real(value));
				} else if (escolhaMoeda == 2) {
					cofre.getMoedas().add(new Dolar(value));
				} else if (escolhaMoeda == 3) {
					cofre.getMoedas().add(new Euro(value));
				}
			} else if (choice == 2) {
				// Choice == 2, para remoçao de moedas
				System.out.println("Escolha Moeda: ");
				System.out.println("1 - Real\n2 - Dolar\n3 - Euro");
				int escolhaMoeda = sc.nextInt();
				System.out.println("Informe o valor que deseja retirar: ");
				double value = sc.nextDouble();
				
				//Os if e else abaixo, tem como funçao, procurar na lista a instancia da moeda escolhida
				//O uso de Iterator para que a remoçao da moeda não gere nenhum tipo de Exceçao
				if (escolhaMoeda == 1) {
					for(Iterator<Moeda> i = cofre.getMoedas().iterator(); i.hasNext();) {
						Real r = (Real) i.next();
						if(r.getValor() == value) {
							i.remove();
						}
					}
				}
				if (escolhaMoeda == 2) {
					for(Iterator<Moeda> i = cofre.getMoedas().iterator(); i.hasNext();) {
						Dolar r = (Dolar) i.next();
						if(r.getValor() == value) {
							i.remove();
						}
					}
				}
				if (escolhaMoeda == 3) {
					for(Iterator<Moeda> i = cofre.getMoedas().iterator(); i.hasNext();) {
						Euro r = (Euro) i.next();
						if(r.getValor() == value) {
							i.remove();
						}
					}
				}

			} else if (choice == 3) {
				//Utilizaçao do metodo de listagem.
				cofre.listagemMoedas();
			} else if (choice == 4) {
				//Utilizaçao do metodo de converter tudo para Real
				System.out.println("Valor total convertido para Real: " + cofre.totalConvertido());
			} else {
				// Opçao da programaçao defensiva
				System.out.println("Escolha invalida, digite um valor valido.\n");
			}
		}

	}

}
