package br.edu.fesfafic.locadora.Model;

public class Filme {
    public String nome;
    public String diretor;
    public String genero;
    public int duracaoMin;
    public boolean disponivel;

    public Filme(String nome, String diretor, String genero, int duracaoMin) {
        this.nome = nome;
        this.diretor = diretor;
        this.genero = genero;
        this.duracaoMin = duracaoMin;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", genero='" + genero + '\'' +
                ", duracaoMin=" + duracaoMin +
                '}';
    }
}
