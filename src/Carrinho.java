import java.util.*;

public class Carrinho implements MenuMenu{
    private final ArrayList<String> itens = new ArrayList<>();
    private final ArrayList<Double> valores = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    private double total = 0;

    public void adicionarItem(String item, double preco){
        itens.add(item);
        valores.add(preco);
        System.out.println("\n" + item + " foi adicionado ao carrinho!");
    }

    private void mostrarCarrinho(){
        if(itens.isEmpty()){
            System.out.println("\nO carrinho está vazio =(");
            return;
        }

        System.out.println("\n==== SEU CARRINHO ====");
        double totalTemp = 0; // calcula sempre do zero

        for (int i = 0; i < itens.size(); i++) {
            System.out.println(" - " + itens.get(i) + " | R$ " + String.format("%.3f", valores.get(i)));
            totalTemp += valores.get(i);
        }

        System.out.println("TOTAL: R$ " + String.format("%.3f", totalTemp));

        System.out.println("\nDeseja continuar para o pagamento? (s/n)");
        char letra = scanner.nextLine().toUpperCase().charAt(0);

        if (letra == 'S') {
            System.out.println("\nDigite seu saldo para pagar: ");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); // consome ENTER

            if (saldo >= totalTemp) {
                System.out.println("\nSeu pagamento foi aprovado!");
                System.out.println("Seu troco é de R$ " + String.format("%.3f", (saldo - totalTemp)));

                // limpa o carrinho após o pagamento
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

    @Override
    public void abrirMenu() {
        //NÃO FARÁ NADA
    }

    @Override
    public void abrirConfig() {
        //NÃO FARÁ NADA
    }

    @Override
    public void menuCompras() {
        //NÃO FARÁ NADA
    }
}