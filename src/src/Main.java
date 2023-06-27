import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        int running = 1;
        int menu;
        String fullName;
        String enter;
        String desciption;
        String cpf;
        String birthDay;
        double value;

        System.out.println(
                "\n\n\n\nOlá! Tudo bem?\n" +
                "Obrigado por optar pelos serviços do Silva Bank!\n\n\n");

        System.out.println("Pressione Enter para continuar!");
        enter = reading.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        System.out.println(
                "Seu cadastro será realizado em instantes, mas para isso precisamos de alguns dados.\n\n\n" +
                "Vamos começar?\n\n"
        );

        System.out.println("Pressione Enter para continuar!");
        enter = null;
        enter = reading.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");



        System.out.println("Por favor, digite seu NOME completo: ");//Cadastro do nome;
        fullName = reading.nextLine();
        System.out.println("\nFalta pouco...\n");
        System.out.println("Pressione Enter para continuar!");
        enter = null;
        enter = reading.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Por favor, digite seu CPF: ");//Cadastro CPF
        cpf = reading.nextLine();
        System.out.println("\nQuase lá!\n");
        System.out.println("Pressione Enter para continuar!");
        enter = reading.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Por favor, digite sua DATA DE NASCIMENTO: \n" +
                "Digite os números no formato de DD/MM/AAAA.");//Cadastro da data de nascimento
        birthDay = reading.nextLine();
        System.out.println("\nMuito obrigado!\n");
        System.out.println("Pressione Enter para continuar!");
        enter = reading.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        System.out.println(
                "Parabéns! Sua conta foi criada com sucesso!\n" +
                "Foi disponibilizado para você um limite de R$500.00 reais!\n" +
                "Seu cartão já está ativado para o uso!\n");

        System.out.println("Pressione Enter para continuar!");
        enter = reading.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        CreditCard cartao = new CreditCard(fullName, cpf, birthDay);

        do {
            System.out.println(
                    "------------------------------------------------\n" +
                    "----------------------MENU----------------------\n" +
                    "------------------------------------------------\n" +
                    "1- Realizar uma compra;\n" +
                    "2- Minha conta;\n" +
                    "3- Limite disponível;\n" +
                    "4- Extrato bancário.\n" +
                    "------------------------------------------------\n\n" +
                    "Escolha uma opção: "
            );

            menu = reading.nextInt();

            System.out.println("\n\n\n\n");

            switch (menu){
                case 1://Realizar uma compra.
                    System.out.println(
                            "------------------------------------------------\n" +
                            "---------------------COMPRA---------------------\n" +
                            "------------------------------------------------\n\n");
                    System.out.println(
                            "Digite a descrição da compra:");
                    desciption = reading.nextLine();
                    desciption = reading.nextLine();

                    System.out.println(
                            "Digite o valor da compra:");
                    value = reading.nextDouble();

                    Credit compra = new Credit(desciption, value);
                    boolean successful = cartao.addCredit(compra);

                    System.out.println("Pressione Enter para continuar!");
                    enter = reading.nextLine();
                    enter = reading.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");

                    if (successful){
                        System.out.println("Compra realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }

                    System.out.println("\nPressione Enter para continuar!");
                    enter = reading.nextLine();
                    enter = reading.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");

                    break;

                case 2://Minha conta.
                    System.out.print(
                            "------------------------------------------------\n" +
                            "-------------------MINHA CONTA------------------\n" +
                            "------------------------------------------------\n\n");
                    System.out.println(
                            "Nome: " + cartao.getCardholder() + ".\n" +
                            "Número da conta: " + cartao.getAccountNumber() + ".\n" +
                            "CPF: " + cartao.getCpf() + ".\n" +
                            "Limite total: R$ 500.00.\n");

                    System.out.println("Pressione Enter para continuar!");
                    enter = reading.nextLine();
                    enter = reading.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    break;

                case 3://Limite disponível.
                    System.out.println(
                            "------------------------------------------------\n" +
                            "---------------------LIMITE---------------------\n" +
                            "------------------------------------------------\n\n");
                    System.out.println(
                            "Limite total: R$ 500.00.\n" +
                            "Limite disponível para compra: R$" + cartao.getBalance() + ".\n\n");

                    System.out.println("Pressione Enter para continuar!");
                    enter = reading.nextLine();
                    enter = reading.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");

                    break;

                case 4://Extrato bancário.
                    System.out.println(
                            "------------------------------------------------\n" +
                            "---------------------EXTRATO--------------------\n" +
                            "------------------------------------------------\n\n");

                    for (Credit c : cartao.getCredit()){
                        System.out.println( c.getCreditDate() + " | Descrição: " + c.getDescription() + ". | Valor = " + c.getValue() + ".");
                    }

                    System.out.println("\n\n\n");
                    System.out.println("Pressione Enter para continuar!");
                    enter = reading.nextLine();
                    enter = reading.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    break;

                default:
                    System.out.println("Opção inválida!\n\n\n");

                    System.out.println("Pressione Enter para continuar!");
                    enter = reading.nextLine();
                    enter = reading.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");

                    break;

            }



            System.out.println(
                    "\n\n\n\n\n\n\n\n\n\n" +
                    "------------------------------------------------\n" +
                    "-------------------CONTINUAR?-------------------\n" +
                    "------------------------------------------------\n");
            System.out.println(
                    "1- Continuar;\n" +
                    "2- Terminar sessão.\n");

            running = 0;
            running = reading.nextInt();

            System.out.println("\n\n\n\n\n");

        }while(running == 1);
    }
}