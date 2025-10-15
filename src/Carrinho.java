import java.util.*;

public class Carrinho implements MenuMenu{
    private final ArrayList<String> itens = new ArrayList<>(); //String que vai receber o produto selecionado pelo usuário
    private final ArrayList<Double> valores = new ArrayList<>(); //Tipo de dado que vai receber o valor do produto selecionado pelo usuário
    Scanner scanner = new Scanner(System.in);

    //Aqui onde acondece a adição do produto selecionado ao carrinho
    public void adicionarItem(String item, double preco){
        itens.add(item);
        valores.add(preco);
        System.out.println("\n" + item + " foi adicionado ao carrinho!");
    }

    //Aqui mostra o produto selecionado no carrinho com a opção de ir para pagamento
    private void mostrarCarrinho(){
        //Condição que verifica se o carrinho está vazio
        if(itens.isEmpty()){
            System.out.println("\nO carrinho está vazio =(");
            return;
        }

        //Menu onde mostra o carrinho
        System.out.println("\n==== SEU CARRINHO ====");
        double totalTemp = 0; //Recebe o preço do produto

        //Repetição for para mostrar um ou mais produtos selecionados
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(" - " + itens.get(i) + " | R$ " + String.format("%.3f", valores.get(i)));
            totalTemp += valores.get(i);
        }

        //Mostra o total da compra
        System.out.println("TOTAL: R$ " + String.format("%.3f", totalTemp));

        //Pergunta se o usuário quer ir para pagamento
        System.out.println("\nDeseja continuar para o pagamento? (s/n)");
        char letra = scanner.nextLine().toUpperCase().charAt(0);

        //Condição para saber se o usuário tem o necessário para pagar o produto
        if (letra == 'S') {
            System.out.println("\nDigite seu saldo para pagar: ");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); 

            //Condição para verificar o valor que o usuário deu é maior ou igual ao valor do produto
            //Se for maior, o usuário receberá o troco
            if (saldo >= totalTemp) {
                System.out.println("\nSeu pagamento foi aprovado!");
                System.out.println("Seu troco é de R$ " + String.format("%.3f", (saldo - totalTemp)));

                itens.clear();
                valores.clear();
            } else {
                System.out.println("\nSaldo insuficiente!");
                System.out.println("Faltam R$ " + String.format("%.3f", (totalTemp - saldo)));
            }
        }
    }

    @Override
    public void abrirCarrinho() {
        this.mostrarCarrinho();
    }

    //Métodos não usados
    @Override
    public void abrirMenu() {}

    @Override
    public void abrirConfig() {}

    @Override
    public void menuCompras() {}
}
