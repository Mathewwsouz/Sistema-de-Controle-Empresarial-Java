package Classes;

import java.util.ArrayList;
import java.util.List;

public class Faturamento {
	
    	private static final List<ColetaFaturamento> ListFaturamentos = new ArrayList<>();
    	
    	
    	public static List<ColetaFaturamento> getListFaturamentos() {
    		return ListFaturamentos;
    	}
    	public static void adicionar(ColetaFaturamento Faturamentos) {
    	     ListFaturamentos.add(Faturamentos);
    	}
    	public static void Imprimir(double totalSalario) {
    		for (ColetaFaturamento Faturamentos : ListFaturamentos) {
                 Faturamentos.imprimirFatura();
    		}
    	}
    	public static void BuscarMes(String Mes) {
    		for (ColetaFaturamento Faturamentos : ListFaturamentos) {
    			if (Faturamentos.getMes().equalsIgnoreCase(Mes)) {
    				Faturamentos.imprimirFatura();
    		}
        }
    	}
}
