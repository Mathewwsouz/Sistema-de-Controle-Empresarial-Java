package Classes;

public class ColetaCadastro {
    private String email;
	private String senha;
	private String senhaConfirm;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenhaConfirm() {
        return senhaConfirm;
    }

    public void setSenhaConfirm(String senhaConfirm) {
        this.senhaConfirm = senhaConfirm;
    }
}