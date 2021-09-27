package thalita.dom;

public class Pessoa {

    private String nome;
    private int cpf;

    private Endereco[] enderecos;

    public Pessoa(String nome, int cpf, int numEnderecos) {
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[numEnderecos]; // Definindo o tamanho
    }

    public void addEndereco(Endereco novoEndereco) {
        for (int i = 0; i < enderecos.length; i++) { // Varrendo o vetor de enderecos
            if (enderecos[i] == null) {              // Verifica se não há endereco
                enderecos[i] = novoEndereco;
                break;                               // Adiciona e sai do metodo
            }
        }
    }

    public void mostraInfo() {
        System.out.println(this.nome + ", portadora do CPF: " + this.cpf + " possui os seguintes enderecos: ");
        for (Endereco endereco : enderecos) {
            if(endereco != null) { //Verifica se existe membro antes de imprimir
                System.out.println(" ");
                System.out.println("Rua: " + endereco.rua + ", número: " + endereco.numero);
                System.out.println("Bairro: " + endereco.bairro);
            }
        }
    }
}
