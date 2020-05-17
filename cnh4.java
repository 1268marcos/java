package cnh;

import java.util.Scanner;

public class PrimeiraCNH {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		int idade = tcd.nextInt();
		
		int pontos = 0;
		
		if( idade >= 18) {
			pontos++;
		}
		
		System.out.println("Você sabe ler e escrever?");
		String sabeLer = tcd.next();
		
		if( sabeLer.equals("s") || sabeLer.equals("S") ) {
			pontos++;
		}
		
		System.out.println("Você tem RG?");
		String temRg = tcd.next();
		
		if( temRg.equals("s") || temRg.equals("S")) {
			pontos++;
		}
		
		System.out.println("Você tem CPF?");
		String temCpf = tcd.next();
		
		if( temCpf.equals("s") || temCpf.equals("S") ) {
			pontos++;
		}
		
		if( pontos == 4 ) {
			System.out.println("Você pode ter a sua CNH");
			
			//fase de pontuacao do Detran
			System.out.println("Você tem comprovante de residência?");
			String comprovaRes = tcd.next();
			
			int pontosDetran=0;
			
			if( comprovaRes.equals("s") || comprovaRes.equals("S") ) {
				pontosDetran++;
			}
			
			System.out.println("Você tem o protocolo do Detran?");
			String comprovaDetran = tcd.next();
			
			if( comprovaDetran.equals("s") || comprovaDetran.equals("S") ) {
				pontosDetran++;
			}
			
			System.out.println("Você tem o cadastro biométrico?");
			String cadBio = tcd.next();
			
			if( cadBio.equals("s")  || cadBio.equals("S") ) {
				pontosDetran++;
			}
			
			if( pontosDetran == 3 ) {
				System.out.println("Ok no Detran. \n Pague as taxas..");	
				
				boolean pagou = false;
				
				while( pagou == false  ) {
					System.out.println("Pagou? S-sim N-não D-desistir");
					String respSobrePagamento = tcd.next();
					
					if( respSobrePagamento.equals("d") || 
							respSobrePagamento.equals("D") ) {
						System.out.println("Fim do programa");
						break;
					}
					
					if( respSobrePagamento.equals("n") ||
							respSobrePagamento.equals("N") ) {
						System.out.println("Vá fazer o pagamento...");
					}
					
					if( respSobrePagamento.equals("s") ||
							respSobrePagamento.equals("S") ) {
						System.out.println("Muito bem... vá ao médico...");
						pagou = true;
					}
										
				}
				
				boolean foiAprovadoMedico = false;
				while( foiAprovadoMedico == false ) {
					System.out.println("Foi aprovado no exame médico? <s/n/d>");
					String resultado= tcd.next().toLowerCase();
					
					if(resultado.equals("d")) {
						System.out.println("Fim do programa");
						break;
					}
					
					if(resultado.equals("n")) {
						System.out.println("Marque novo exame médico....");
					}
					
					if( resultado.equals("s") ) {
						System.out.println("Vá fazer o curso teórico na autoescola...");
						foiAprovadoMedico = true;
					}
					
				}
				
				boolean foiAprovadoProva = false;
				while( foiAprovadoProva == false ) {
					System.out.println("Quantos acertos na prova teórica? Ao digitar uma quantidade negativa o programa será finalizado.");
					int numAcertos = tcd.nextInt();
					if( numAcertos >= 21 ) {
						System.out.println("Parabéns. Faça solicitação licença para aprendizagem");
						foiAprovadoProva = true;
					} else if( numAcertos < 0 ) {
						System.out.println("Fim do programa");
						break;
					}
					
				}
				
				boolean fezCursoPratico = false;
				while( fezCursoPratico == false ) {
					System.out.println("Fez Curso Prático? <s/n/d>");
					String curso=tcd.next().toLowerCase();
					if( curso.equals("d") ) {
						System.out.println("Fim do programa");
						break;
					}
					
					if( curso.equals("n") ) {
						System.out.println("Faça o curso novamente...");
					}
					
					if( curso.equals("s") ) {
						System.out.println("Vá fazer a aula noturna...");
						fezCursoPratico = true;
					}
					
				}
				
				boolean fezAulaNoturna = false;
				while( fezAulaNoturna == false ) {
					System.out.println("Fez a aula noturna? <s/n/d>");
					String aula = tcd.next().toLowerCase();
					if( aula.equals("d") ) {
					     System.out.println("Fim do programa");
					     break;
					}
					
					if( aula.equals("n")) {
						System.out.println("Faça a aula noturna");
					}
					
					if( aula.equals("s") ) {
						System.out.println("Vá fazer a avaliação prática no Detran...");
						fezAulaNoturna = true;
					}
					
				}
				
				boolean foiAprovadoDetran = false;
				while ( foiAprovadoDetran == false ) {
					System.out.println("Foi Aprovado? <s/n/d>");
					String provaPratica = tcd.next().toLowerCase();
					if( provaPratica.equals("d") ) {
						System.out.println("Fim do Programa... que pena.. você quase conseguiu");
						break;
					}
					
					if( provaPratica.equals("n") ) {
						System.out.println("Com calma faça a prova prática...");
					}
					
					if( provaPratica.equals("s") ) {
						System.out.println("SUCESSO. PERMISSÃO PROVISÓRIA DA CNH...");
						foiAprovadoDetran = true;
					}
					
				}
				
			}  else {
				System.out.println("Verifique o que faltou e retorne depois");
			}
			
		} else {
			System.out.println("Você não atende aos requisitos");
		}
		
	}
	
}
