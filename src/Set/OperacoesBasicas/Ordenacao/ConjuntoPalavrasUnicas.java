package Set.OperacoesBasicas.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private String palavra;

    public ConjuntoPalavrasUnicas() {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    private Set<ConjuntoPalavrasUnicas> palavrasUnicas = new HashSet<>();

    public Set<ConjuntoPalavrasUnicas> getPalavrasUnicas() {
        return palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add( new ConjuntoPalavrasUnicas());
    }

    public void removerPalavra(String palavra){
        ConjuntoPalavrasUnicas palavraParaRemover = null;
        for(ConjuntoPalavrasUnicas cbu : palavrasUnicas){
            if(cbu.getPalavra() == palavra){
                palavraParaRemover = cbu;
            }
        }
        palavrasUnicas.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {

        if (!palavrasUnicas.isEmpty()) {
            for (ConjuntoPalavrasUnicas cbu : palavrasUnicas) {
                if (cbu.getPalavra().equalsIgnoreCase(palavra)) {
                    System.out.println(cbu);
                }
            }
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    @Override
    public String toString() {
        return "Palavras únicas: " + palavrasUnicas ;
    }


    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Caio");
        conjuntoPalavrasUnicas.adicionarPalavra("Leticia");
        conjuntoPalavrasUnicas.adicionarPalavra("Fabricio");
        conjuntoPalavrasUnicas.adicionarPalavra("Mara");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }

}
