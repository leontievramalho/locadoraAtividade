package br.edu.fesfafic.locadora.Main;

import br.edu.fesfafic.locadora.Model.Filme;
import br.edu.fesfafic.locadora.Model.Locadora;

public class Main {
    public static void main(String[] args){
        Filme pokemon = new Filme("Pokemon", "Fulano", "Aventura", 110);
        Filme vingadores = new Filme("Vingadores", "Cicrano", "Ação", 150);
        Locadora locatudo = new Locadora("Locatudo", 2);
        locatudo.addFilme(pokemon);
        locatudo.addFilme(vingadores);

        locatudo.verificarDisp(pokemon);
        locatudo.alugarFilme(pokemon);
        locatudo.verificarDisp(pokemon);
        locatudo.devolverFilme(pokemon);
        locatudo.verificarDisp(pokemon);
    }
}
