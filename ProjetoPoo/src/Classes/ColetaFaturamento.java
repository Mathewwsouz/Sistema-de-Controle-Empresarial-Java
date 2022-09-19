package Classes;

public class ColetaFaturamento {
    private String Mes;
    private double Fatura;
    private double SaldoPositivo;
    private double  GastosEmpresariais;

	
	public String getMes() {
		return Mes;
	}
	
	
    public double getFatura() {
		return Fatura;
	}

	public void setFatura(double Fatura) {
		this.Fatura = Fatura;
	}
	
	
public double getSaldoPositivo() {
		return SaldoPositivo;
	}

	public void setSaldoPositivo(double saldoPositivo) {
		this.SaldoPositivo = saldoPositivo;
	}

	public void setMes(String mes) {
		this.Mes = mes;
	}
	public double getGastosEmpresariais() {
		return GastosEmpresariais;
	}

	public void setGastosEmpresariais(double  GastosEmpresariais) {
		this. GastosEmpresariais =  GastosEmpresariais;
	}
	

public  void imprimirFatura() {
	System.out.println("---------Dados Financeiros----------");
	System.out.println("Mes: "+ getMes());
	System.out.println("Saldo Positivo: "+ getSaldoPositivo());
	System.out.println("Gastos Empresariais(Saldo negativo):-"+ getGastosEmpresariais());
	System.out.println("Salarios pagos(Saldo negativo):-"+ Funcionarios.CalcularSalarios());
	System.out.println("Lucros Mensais: "+(getSaldoPositivo()-getGastosEmpresariais()-Funcionarios.CalcularSalarios()));
	System.out.println("--------------------------------------");
	
}
}
