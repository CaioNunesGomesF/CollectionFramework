package list.OperaçõesBasicas;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CarrinhoDeCompra {

    List<Item> item = new ArrayList<>();

    public void adicionarItem(String nome, Double preco, int quantidade){
        item.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome){

        for(Item it : item){
            if(it.getNome().equalsIgnoreCase(nome)){
                item.remove(it);
                break;
            }else{
                System.out.println("A lista é inexistente.");
            }
        }
    }

    public Double calcularValorTotal(){
        double totalValor = 0;

        for(Item it : item){
            totalValor += it.getPreco() * it.getQuantidade();
        }

        return totalValor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < item.size(); i++) {
            Item it = item.get(i);
            sb.append("Produto ").append(i + 1).append(": ")
                    .append(it.getNome()).append(", Preço: R$")
                    .append(String.format("%.2f",it.getPreco())).append(", Quantidade: ")
                    .append(it.getQuantidade()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        CarrinhoDeCompra carro = new CarrinhoDeCompra();

        carro.adicionarItem("Leite", 7.00,4);
        carro.adicionarItem("Feijão", 4.00, 5);
        carro.adicionarItem("Arroz", 5.00, 3);

        System.out.println(carro);

        System.out.println("Valor total a se pagar = " + String.format("%.2f",carro.calcularValorTotal()));

        carro.removeItem("Leite");

        System.out.println();
        System.out.println(carro);

        System.out.println("Valor total a se pagar = R$" + String.format("%.2f",carro.calcularValorTotal()));

    }

}



