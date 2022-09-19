package Classes;

public class Endereco {
     String rua;
     String cidade;
     String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Endereco() {
     }
     

     public void imprimirEndereco() {
    	 System.out.println("Endere�o:" + this.rua + ":" + this.estado + ":" + this.cidade);
     }
}
