package stream.reduce.reduce2;

public class Aluno {

    final String nome;
    public final double nota;
    final boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }
    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + nome + '\'' + ", nota=" + nota
                + ", bomComportamento=" + bomComportamento + '}';
    }
}
