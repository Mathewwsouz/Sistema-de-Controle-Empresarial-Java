package Classes;

import java.util.Scanner;

public class CadastrarPessoa {
	int escolha;
	
public static void main(String[]args) {
	   int i,j,length;
	   Scanner scanString = new Scanner(System.in);
	   String cpf, Mes;
	   do {
		   j = ImprimirMenu();
		switch(j) {
		case 1:
			if(Funcionarios.getListaFuncionarios().size()>0) {
				ColetaCadastro Cadastro = new ColetaCadastro();
				ColetaLogin login = new ColetaLogin();

				@SuppressWarnings("resource")
				Scanner scan01 = new Scanner(System.in);
		        System.out.println("-----LOGIN-----");
		        System.out.println("Digite aqui o email:");
		        login.setEmailLogin(scan01.nextLine());
		        if(login.getEmail() == login.getEmailLogin()) {
		            System.out.println("Digite aqui a senha:");
		            login.setSenhaLogin(scan01.nextLine());
		            if(Cadastro.getSenha().equals(login.getSenhaLogin())) {
		            } else {
		                System.out.println("Senha e/ou email invalido(s)!");
		            }
		        }
		        
				}
		do {
			i = MenuRH();
			int escolha2;
			switch(i){
			case 1:
				int escolha;
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Cadastrar Funcionario");
				DadoColeta Funcionario = new DadoColeta();
				
				 System.out.println("Digite o nome do Funcionario");
				 Funcionario.setNome (scan.nextLine());
				 
				 System.out.println("Digite o Cpf do Funcionario");
				 Funcionario.setCpf (scan.nextLine());
				 
				 System.out.println("Digite o Idade do Funcionario");
				 Funcionario.setIdade (scan.nextInt());
				 
				 System.out.println("Digite o Cargo do Funcionario");
				 Funcionario.setCargo (scanString.nextLine());
				 
				 System.out.println("Digite o Salario do Funcionario");
				 Funcionario.setSalario (scan.nextDouble());
				 
				 System.out.println("Digite o numero identificador do Funcionario");
				 Funcionario.setIdFuncionario (scan.nextInt());
				 System.out.println("O funcionario pertence ao Recursos humanos?");
				 System.out.println("Digite 1-Sim 0-Nao");
				 escolha2 = scan.nextInt();
				 if(escolha2==1) {
					 ColetaCadastro cadastro = new ColetaCadastro();

				        do {
							
							@SuppressWarnings("resource")
							Scanner scan1 = new Scanner(System.in);
				            System.out.println("Email:");
				            cadastro.setEmail(scan1.nextLine());
				            length = cadastro.getEmail().length();
				          
				        } while(length == 0);

				        do {
				            @SuppressWarnings("resource")
							Scanner scan2 = new Scanner(System.in);
				            System.out.println("Senha:");
				            cadastro.setSenha(scan2.nextLine());
				            length = cadastro.getSenha().length();
				            
				        } while(length == 0);

				        do {
				            @SuppressWarnings("resource")
							Scanner scan3 = new Scanner(System.in);
				            System.out.println("Confirme a senha:");
				            cadastro.setSenhaConfirm(scan3.nextLine());
				            length = cadastro.getSenhaConfirm().length();

				        } while(length == 0 && cadastro.getSenha().equals(cadastro.getSenhaConfirm()));
				     
				        Funcionarios.adicionar(Funcionario);
				        
				    }
				 
			break;
			case 2:
				System.out.println("--------LISTAGEM--------");
				Funcionarios.Listar();
				break;
			case 3:
				System.out.println("-------Consultar Funcionarios--------");
				System.out.println("Digite o Cpf do funcionario:");
				cpf = scanString.nextLine();
				Funcionarios.BuscarCpf(cpf);
			break;
				
			case 4:
				System.out.println("--------DEMISSAO DE FUNCIONARIO--------");
				System.out.println("Insira o cpf do funcionario para a localiza��o de dados");
				cpf = scanString.nextLine();
				Funcionarios.BuscarCpf(cpf);
				System.out.println("deseja realmente excluir este funcionario?");
				System.out.println("1-SIM");
				System.out.println("2-N�O");
				escolha = scanString.nextInt();
				if(escolha==1) {
					Funcionarios.DemitirFuncionario(cpf);
					System.out.println("Demiss�o concluida");
				}else {
					System.out.println("Processo Cancelado!!!");
				}
				break;
			}
			}while(i!=0);
			break;
		case 2:
			int escolhaS;
			Scanner scan = new Scanner(System.in);
		do {
			escolhaS = ImprimeMenuC();
			switch(escolhaS) {
			 case 1:
				 ColetaFaturamento Faturamentos = new ColetaFaturamento();
				 System.out.println("Digite o Mes do Faturamento");
				 Faturamentos.setMes(scan.nextLine());
				 
				 System.out.println("Digite o saldo positivo sobre o faturamento:");
				 Faturamentos.setSaldoPositivo(scan.nextDouble());
				 Faturamento.adicionar(Faturamentos);
				 
				 System.out.println("Digite os gastos empresariais sobre o faturamento:");
				 Faturamentos.setGastosEmpresariais(scan.nextDouble());
				 Faturamento.adicionar(Faturamentos);
				 
			 break;
			 case 2:
				 System.out.println("-------------Consulta de Fatura-------");
				 System.out.println("Digite o M�s que deseja consultar:");
				 Mes = scanString.nextLine();
				Faturamento.BuscarMes(Mes);
			 break;	
			}
			 }while(escolhaS!=0);
		break;
		case 3:
			int a,b;
			a = MenuAdmin();
			switch(a){
			case 1:
				do {
			        b = EmpresaMenu();
					switch(b){
					case 1:
						   Scanner scant = new Scanner(System.in);
					       System.out.println("Cadastro Dados Empresarial");
					       ColetaEmpresa empresa = new ColetaEmpresa();
					       System.out.println("----------Nome-----------");
					       System.out.println("Digite o nome da empresa:");
					       empresa.setNome(scant.nextLine());
					       System.out.println("----------CNPJ-----------");
					       System.out.println("Digite o CNPJ da empresa:");
					       empresa.setCNPJ(scant.nextLine());
					       System.out.println("--------Endere�o----------");
					       System.out.println("Digite a Rua:");
					       empresa.setRua(scant.nextLine());
					       System.out.println("Digite o Bairro:");
					       empresa.setBairro(scant.nextLine());
					       System.out.println("Digite o Numero:");
					       empresa.setNumero(scanString.nextInt());
					       System.out.println("Digite o CEP:");
					       empresa.setCep(scant.nextLine());
					       System.out.println("Digite a Cidade:");
					       empresa.setCidade(scant.nextLine());
					       System.out.println("--------Telefone---------");
					       System.out.println("Digite o Telefone:");
					       empresa.setTelefone(scant.nextLine());
					       System.out.println("--------Email---------");
					       System.out.println("Digite o E-mail:");
					       empresa.setEmail(scant.nextLine());
					       Empresa.adicionar(empresa);
					break;
					case 2:
						System.out.println("-----------Dados Empresariais---------");
						Empresa.Imprimir();
					break;
					}
					
					}while(b!=0);
			break;
			
			}
			break;
		}
	   }while(j!=0);
	   scanString.close();
   }

public static int ImprimirMenu(){
	   int menu;
	@SuppressWarnings("resource")
	Scanner scan4 = new Scanner(System.in);
	   System.out.println("SISTEMA DE CONTROLE EMPRESARIAL ADMINISTRATIVO");
	   System.out.println("-------------Menu----------------");
	   System.out.println("1-Recursos Humanos");
	   System.out.println("2-Contabilidade");
	   System.out.println("3-Administrativo");
	   System.out.println("0-Sair");
	   menu = scan4.nextInt();
	   ;
	   return menu;
   }
   public static int MenuRH(){
	   int escolha1;
	   @SuppressWarnings("resource")
	Scanner scan5 = new Scanner(System.in);
	   System.out.println("-------------Recursos Humanos--------");
	   System.out.println("1-Cadastrar Funcionarios");
	   System.out.println("2-Listar Funionarios");
	   System.out.println("3-Consultar Dados de Funcionarios");
	   System.out.println("4-Demiss�o de Funcionario");
	   System.out.println("0-Sair");
	   
	   escolha1 = scan5.nextInt();
	   
	   return escolha1;
   }
   public static int MenuAdmin(){
	   int escolha1;
	   @SuppressWarnings("resource")
	Scanner scan6 = new Scanner(System.in);
	   System.out.println("-------------Administrativo--------");
	   System.out.println("1-Dados Empresariais");
	   System.out.println("2-Manuten��o Sistemica");
	   System.out.println("0-Sair");
	   
	   escolha1 = scan6.nextInt();
	   
	   return escolha1;
   }
   public static int EmpresaMenu(){
	    int menu;
	    @SuppressWarnings("resource")
		Scanner scan7 = new Scanner(System.in);
	    System.out.println("Dados Empresariais");
	    System.out.println("1-Cadastrar Dados");
	    System.out.println("2-Imprimir Dados");
	    System.out.println("0-Sair");

	    menu = scan7.nextInt();
	   
	    return menu;
	}
   public static int ImprimeMenuC(){
	   int escolha;
	    @SuppressWarnings("resource")
		Scanner scan8 = new Scanner(System.in);
		System.out.println("-------------Contabilidade-------------");
		System.out.println("1-Cadastrar Faturamento mensal");
		System.out.println("2-Consultar Faturamento Anteriores");
		System.out.println("0-Sair");

		escolha = scan8.nextInt();
		
		return escolha;
		}
}



