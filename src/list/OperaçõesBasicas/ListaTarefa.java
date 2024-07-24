package list.OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void aicionarTarefa(Tarefa descricao) {
        this.tarefaList.add(descricao);
    }
    public void removerTarefa(Tarefa descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(String.valueOf(descricao))){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public Integer obterNumeroTarefa(){
        return this.tarefaList.size();
    }

    public void obterDescricao() {
        System.out.println(tarefaList);
    }
}
