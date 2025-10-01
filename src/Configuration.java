import java.util.*;

public class Configuration implements MenuMenu {
    Scanner scanner = new Scanner(System.in);

    private void perfil() {
        System.out.println("\n==== INFORMAÇÕES DE PERFIL ====");
        System.out.println("\nNome: Fulano Da Silva");
        System.out.println("Idade: 26");
        System.out.println("Sexo: Masculino");
        System.out.println("CEP: 01010-010");
        System.out.println("Endereço: Rua 9 de Abril, nº544\n\n");
    }

    private void mudarTema() {
        int num;

        System.out.println("\nDeseja mudar o tema?");
        System.out.println("1 - Claro, 2 - Escuro");
        num = scanner.nextInt();

        switch (num){
            case 1 -> System.out.println("Mudou para o tema claro!\n\n");
            case 2 -> System.out.println("Mudou para o tema escuro!\n\n");
            default -> System.out.println("Comando inválido!\n\n");
        }
    }

    private void suporte() {
        int opcao = 0;

        while (opcao != 8) {
            System.out.println("\n=== SUPORTE ===");
            System.out.println("1 - Onde está meu pedido?");
            System.out.println("2 - Como trocar ou devolver um produto?");
            System.out.println("3 - Quais são as formas de pagamento?");
            System.out.println("4 - Qual o prazo e valor do frete?");
            System.out.println("5 - Problemas com pagamento");
            System.out.println("6 - Como funciona a garantia?");
            System.out.println("7 - Falar com atendente / Voltar\n");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consome ENTER

            switch (opcao) {
                case 1 -> System.out.println("Você pode acompanhar seu pedido no menu 'Meus Pedidos'.\n\n");
                case 2 -> System.out.println("Trocas e devoluções podem ser feitas em até 7 dias após o recebimento.\n\n");
                case 3 -> System.out.println("Aceitamos cartão de crédito, débito, PIX e boleto bancário.\n\n");
                case 4 -> System.out.println("O prazo e valor do frete dependem do CEP informado no checkout.\n\n");
                case 5 -> System.out.println("Verifique com seu banco ou tente outro método de pagamento.\n\n");
                case 6 -> System.out.println("Todos os produtos possuem garantia de 1 ano contra defeitos de fábrica.\n\n");
                case 7 -> {
                    System.out.println("Encaminhando para um atendente humano... Voltando ao menu principal.\n\n");
                    return;
                }
                default -> System.out.println("Comando inválido\n\n");
            }
        }
    }

    private void empresa() {
        System.out.println("\n==== SOBRE A EMPRESA ====");
        System.out.println("Nossa loja foi criada com o objetivo de oferecer os melhores");
        System.out.println("produtos de tecnologia com qualidade, segurança e rapidez.");
        System.out.println("Trabalhamos para garantir a melhor experiência de compra,");
        System.out.println("com atendimento dedicado e preços justos para nossos clientes.\n\n");
    }

    private void config() {
        int num = 0;

        while (num != 5) {
            System.out.println("\n==== CONFIGURAÇÕES ====");
            System.out.println("\n1 - Ver perfil");
            System.out.println("2 - Mudar tema");
            System.out.println("3 - Suporte");
            System.out.println("4 - Sobre a empresa");
            System.out.println("5 - Voltar para o menu");
            num = scanner.nextInt();

            switch (num) {
                case 1 -> this.perfil();
                case 2 -> this.mudarTema();
                case 3 -> this.suporte();
                case 4 -> this.empresa();
                case 5 -> {
                    System.out.println("\nVoltando ao menu...\n\n");
                    return;
                }
                    default -> System.out.println("Comando invalido!");
            }
        }
    }


    @Override
    public void abrirConfig() {
        this.config();
    }

    @Override
    public void menuCompras() {
        //NÃO FARÁ NADA
    }

    @Override
    public void abrirCarrinho() {
        //NÃO FARÁ NADA
    }

    @Override
    public void abrirMenu() {
        //NÃO FARÁ NADA
    }
}
