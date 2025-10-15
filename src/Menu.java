import java.util.*;

public class Menu implements MenuMenu{
    Scanner scanner = new Scanner(System.in);
    private Carrinho carrinho = new Carrinho();
    private Produto produto = new Produto(carrinho);
    private Configuration config = new Configuration();

    private void opc(){
        int entrada = 0;

        while(entrada != 4){
            System.out.println("===== BEM VINDO A LOJA =====");
            System.out.println("== Digite um número para seguir ==");
            System.out.println("\n1 - Comprar produtos");
            System.out.println("2 - Ver carrinho");
            System.out.println("3 - Configurações");
            System.out.println("4 - Sair");
            entrada = scanner.nextInt();

            switch (entrada){
                case 1 -> produto.menuCompras();
                case 2 -> carrinho.abrirCarrinho();
                case 3 -> config.abrirConfig();
                case 4 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Comando invalido!!!");
            }
        }
    }

    @Override
    public void abrirMenu() {
        this.opc();
    }

    //Métodos não usados
    @Override
    public void abrirConfig() {}

    @Override
    public void menuCompras() {}

    @Override
    public void abrirCarrinho() {}
}
