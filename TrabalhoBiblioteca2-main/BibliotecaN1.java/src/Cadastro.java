public class Cadastro {

// VARIAVEIS
private String nome, cpf;



public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    public String toString() {
        return this.nome + "\n" + 
               this.cpf + "\n";                          
    }

}