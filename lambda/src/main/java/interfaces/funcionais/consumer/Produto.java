package interfaces.funcionais.consumer;

public class Produto {  // por padracao extends Object

    final String nome;
    public final double preco;
    public final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + ", desconto=" + desconto + '}';
    }
}
