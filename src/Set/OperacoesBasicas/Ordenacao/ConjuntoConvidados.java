package Set.OperacoesBasicas.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

        //Atributo
        private Set<Convidado> convidadoSet;

        public ConjuntoConvidados() {
                this.convidadoSet = new HashSet<>();
        }

        public void adicionarConvidado(String nome, int codigoConvite){
                convidadoSet.add(new Convidado(nome, codigoConvite));
        }

        public void removerConvidadoPorCodigoDeConvite(int codigoConvite){
                Convidado convidadoParaRemover = null;
                for(Convidado c : convidadoSet){
                        if(c.getCodigoConvite() == codigoConvite){
                                convidadoParaRemover = c;
                                break;
                        }
                }
                convidadoSet.remove(convidadoParaRemover);
        }

        public int contarConvidados(){
                return convidadoSet.size();
        }

        public void exibirConvidados(){
                System.out.println(convidadoSet);
        }

        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder("ConjuntoConvidados{\n");
                for (Convidado c : convidadoSet) {
                        sb.append("  ").append(c.getNome()).append("\n");
                }
                sb.append("}");
                return sb.toString();
        }


        public static void main(String[] args) {
                ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
                System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

                conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
                conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
                conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
                conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

                conjuntoConvidados.exibirConvidados();

                System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

                conjuntoConvidados.removerConvidadoPorCodigoDeConvite(1234);

                System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

                conjuntoConvidados.exibirConvidados();

                conjuntoConvidados.removerConvidadoPorCodigoDeConvite(1236);

                System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

                conjuntoConvidados.exibirConvidados();


        }
}
