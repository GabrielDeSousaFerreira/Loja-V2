import java.util.*;

public class Produto implements MenuMenu{
    Scanner scanner = new Scanner(System.in);

    //atributos
    private Carrinho carrinho;
    private double samsung = 2.500;
    private double motorola = 3.650;
    private double xiaomi = 3.299;
    private double apple = 4.000;

    //construtor
    public Produto(Carrinho carrinho){
        this.carrinho = carrinho;
    }

    //metodos
    private void listaCompras(){
        System.out.println("\n======= BEM VINDO =======");
        System.out.println("Digite o número correspondente ao produto para comprar:\n");

        //Produtos da loja
        System.out.println("1 - Samsung Galaxy S25 = R$"+String.format("%.3f",this.samsung));
        System.out.println("2 - Motorola Edge 60 = R$"+String.format("%.3f",this.motorola));
        System.out.println("3 - Xiaomi Poco F6 = R$"+String.format("%.3f",this.xiaomi));
        System.out.println("4 - Apple Iphone 16 = R$"+String.format("%.3f",this.apple));
        int escolhe = scanner.nextInt();
        scanner.nextLine();

        //Usuário escolhe qual produto ele quer
        switch (escolhe){
            case 1 -> carrinho.adicionarItem("Samsung Galaxy S25 ", this.samsung);
            case 2 -> carrinho.adicionarItem("Motorola Edge 60", motorola);
            case 3 -> carrinho.adicionarItem("Xiaomi Poco F6", xiaomi);
            case 4 -> carrinho.adicionarItem("Apple Iphone 16", apple);
            default -> System.out.println("Erro!! Opção inválida");
        }
    }

    @Override
    public void menuCompras(){ //Chama o metodo listaCompras para que seja exibido ao acessar a opção no menu
        this.listaCompras();
    }

    //Métodos não usados
    @Override
    public void abrirCarrinho() {}

    @Override
    public void abrirMenu() {}

    @Override
    public void abrirConfig() {}
}
