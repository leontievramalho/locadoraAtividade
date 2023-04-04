package br.edu.fesfafic.locadora.Model;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    public String nome;
    public List<Filme> catalogo;
    public double precoAlugar;

    public Locadora(String nome, double precoAlugar){
        this.nome = nome;
        this.catalogo = new ArrayList<>();
        this.precoAlugar = precoAlugar;
    }

    public void addFilme(Filme filme){
        this.catalogo.add(filme);
    }

    public void removeFilme(Filme filme){
        this.catalogo.remove(filme);
    }

    public void verificarDisp(Filme filme){
        if(filme.isDisponivel())
            System.out.println("Filme disponível!");
        else
            System.out.println("Filme indisponível");
    }

    public void alugarFilme(Filme filme){
        if(filme.isDisponivel()) {
            filme.setDisponivel(false);
            System.out.println("Filme alugado com sucesso!");
        } else
            System.out.println("Filme indisponível.");
    }

    public void devolverFilme(Filme filme){
        filme.setDisponivel(true);
        System.out.println("Filme devolvido com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAlugar() {
        return precoAlugar;
    }

    public void setPrecoAlugar(double precoAlugar) {
        this.precoAlugar = precoAlugar;
    }

    public List<Filme> getCatalogo() {
        return catalogo;
    }

    @Override
    public String toString(){
        return "Locadora{" +
                "nome='" + this.nome + '\'' +
                ", catalogo=" + this.catalogo +
                ", preçoAlugar=" + this.precoAlugar +
                '}';
    }
}
