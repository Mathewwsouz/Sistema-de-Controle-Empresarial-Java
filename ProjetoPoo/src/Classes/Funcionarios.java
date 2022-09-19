package Classes;

import java.util.List;
import java.util.ArrayList;

public class Funcionarios {

	private static final List<DadoColeta> ListaFuncionarios = new ArrayList<>();
	private static final List<DadoColeta> NovaLista = new ArrayList<>();

	public static List<DadoColeta> getListaFuncionarios() {
		return ListaFuncionarios;
	}

	public static List<DadoColeta> getNovaLista() {
		return NovaLista;
	}

	public static void adicionar(DadoColeta Funcionario) {
		if(ListaFuncionarios.add(Funcionario)) {
			System.out.println("Funcionario Cadastrado Com Sucesso");
		};
	}

	public static void Listar() {
		for (DadoColeta Funcionario : ListaFuncionarios) {
             Funcionario.imprimirFuncionario();
		}
	}

	public static void BuscarCpf(String Cpf) {
		for (DadoColeta Funcionario : ListaFuncionarios) {
			if (Funcionario.getCpf().equalsIgnoreCase(Cpf)) {
				Funcionario.imprimirFuncionario();
		}else {
			System.out.println("FUNCIONARIO N�O ENCONTRADO NO BANCO DE FUNCIONARIOS");
		}
	}
	}
	public static boolean DemitirFuncionario(String Cpf) {
		for(DadoColeta Funcionario: ListaFuncionarios){
			if(Funcionario.getCpf().equalsIgnoreCase(Cpf))
				ListaFuncionarios.remove(Funcionario);
		}
		return true;
	}
	public static double CalcularSalarios() {
		double totalSalario=0;
			for(int i=0;i<ListaFuncionarios.size();i++) {
		totalSalario =totalSalario+(ListaFuncionarios.get(i).getSalario());
			}
	return totalSalario;
	}
}

