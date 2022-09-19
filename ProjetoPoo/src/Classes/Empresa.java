package Classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
    	private static final List<ColetaEmpresa> ListEmpresas = new ArrayList<>();
    	
    	
    	public static List<ColetaEmpresa> getListEmpresas() {
    		return ListEmpresas;
    	}
    	public static void adicionar(ColetaEmpresa Empresa) {
    	     ListEmpresas.add(Empresa);
    	}
    	public static void Imprimir() {
    		for (ColetaEmpresa Empresa : ListEmpresas) {
                 Empresa.imprimirEmpresa();
    		}
    	}
    }

