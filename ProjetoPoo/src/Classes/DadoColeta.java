package Classes;

public class DadoColeta {
    private String nome;
    private String Cpf;
    private int idade;
    private String cargo;
    private double salario;
    private int IdFuncionario;
    
    public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdFuncionario() {
		return IdFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		IdFuncionario = idFuncionario;
	}

	public Endereco getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco enderecos) {
		this.enderecos = enderecos;
	}
	
    private Endereco enderecos;
    
    public DadoColeta() {
    }
    
    public String getNome() {//metodo para recuperar valores
    	return nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public String getCpf() {//metodo para recuperar valores
    	return Cpf;
    }
    public void setCpf(String Cpf) {
    	this.Cpf = Cpf;
    }
    public int getIdade() {
    	return idade;
    }
    public void setIdade(int idade) {
    	this.idade = idade;
    }
    public Endereco getEndereco() {//metodo para recuperar valores
    	return enderecos;
    }
    public void setEndereco(Endereco enderecos) {
    	this.enderecos = enderecos;
    }
    public  void imprimirFuncionario() {
    	System.out.println("-----------------------------");
    	System.out.println("Nome: "+ getNome()+" IdFuncionario:"+getIdFuncionario());
    	System.out.println("CPF: "+ getCpf());
    	System.out.println("Idade: "+ getIdade()+" Anos");
    	System.out.println("Cargo: "+ getCargo()+" Salario:"+ getSalario()+" R$");
    	System.out.println("-----------------------------");
    	
    }

}

