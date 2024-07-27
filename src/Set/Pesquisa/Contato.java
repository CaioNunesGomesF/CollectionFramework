package Set.Pesquisa;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numero;

    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Contato = ");
        result.append("Nome: ").append(nome);
        result.append(", Numero: ").append(numero);
        result.append('\n');
        return result.toString();
    }

}
