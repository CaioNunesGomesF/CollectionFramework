package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;




public class CatalogoLivros{


    List <Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l); // Correção: adicionar à lista correta
                }
            }
        }
        return livrosPorAutor;
    }


    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public List<Livro> pesquisarPotTitulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro l : livrosList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livrosEncontrados.add(l);
            }
        }

        return livrosEncontrados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < livrosList.size(); i++) {
            Livro l = livrosList.get(i);
            sb.append("Livro ").append(i + 1).append(": ")
                    .append(l.getTitulo()).append(", Autor: ")
                    .append(l.getAutor()).append(", Data de publicação: ")
                    .append(l.getAnoPublicacao()).append("\n");
        }
        return sb.toString();
    }



    public static void main(String[] args) {



        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPotTitulo("Livro 1"));


    }
}
