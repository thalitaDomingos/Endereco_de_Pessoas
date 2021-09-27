// Pessoa possui 1 ou mais enderecos 

package thalita.dom;

public class Principal {
    public static void main(String[] args) {

        Endereco endereco_1 = new Endereco("Rua 1", "Bairro 1", 123 );
        Endereco endereco_2 = new Endereco("Rua 2", "Bairro 2", 456 );
        Endereco endereco_3 = new Endereco("Rua 3", "Bairro 3", 789 );

        Pessoa pessoa =  new Pessoa("Thalita", 1234, 3);

        // Adicionando enderecos
        pessoa.addEndereco(endereco_1);
        pessoa.addEndereco(endereco_2);
        pessoa.addEndereco(endereco_3);

        pessoa.mostraInfo();
    }
}
