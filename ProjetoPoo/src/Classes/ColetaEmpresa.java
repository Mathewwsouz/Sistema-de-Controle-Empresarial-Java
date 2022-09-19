package Classes;

public class ColetaEmpresa {
    private String nome;
    private String Rua; 
    private String Bairro;
    private String Cep;
    private String cidade;
    private String Telefone;
    private String Email;
    
    public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	int numero;
    private String CNPJ;

    public String getNome() {
        return nome;
    }

    public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setNome(String nome) {
        this.nome = nome;
    }

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

public  void imprimirEmpresa() {
	System.out.println("---------Dados Empresariais----------");
	System.out.println("Nome: "+ getNome());
	System.out.println("CNPJ: "+ getCNPJ()+" Tefelefone:"+ getTelefone());
	System.out.println("E-mail: "+ getEmail());
	System.out.println("Rua: "+ getRua()+" Bairro:"+ getBairro());
	System.out.println("Numero: "+ getNumero()+" CEP:"+ getCep()+" R$");
	System.out.println("Cidade: "+ getCidade());
	System.out.println("--------------------------------------");
	
}
}

