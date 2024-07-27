package Map.OperacoesBasica;



import java.util.HashMap;
import java.util.Map;

public class AgendaContrato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContrato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
                numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    @Override
    public String toString() {
        return "AgendaContrato = " + agendaContatoMap ;

    }

    public static void main(String[] args) {

        AgendaContrato agendaContatos = new AgendaContrato();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 111111);

        agendaContatos.exibirContato();


    }

}
