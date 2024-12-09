package OdontoVida;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static ArrayList<Dentista> dentistas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("01. Adicionar Paciente");
            System.out.println("02. Listar Paciente");
            System.out.println("03. Adicionar Dentista");
            System.out.println("04. Listar Dentista");
            System.out.println("05. Adicionar Consulta");
            System.out.println("06. Listar Consulta");
            System.out.println("07. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarPaciente(scanner);
                    break;
                case 2:
                    listarPacientes();
                    break;
                case 3:
                	adicionarDentista(scanner);
                    break;
                case 4:
                	listarDentistas();
                    break;
                case 5:
                    System.out.println("Funcionalidade para adicionar consulta ainda não implementada.");
                    break;
                case 6:
                    System.out.println("Funcionalidade para listar consultas ainda não implementada.");
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    private static void adicionarPaciente(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();

        Paciente paciente = new Paciente(nome, cpf, telefone, email, endereco, dataNascimento);
        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso!");
    }

    private static void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de Pacientes:");
            for (Paciente paciente : pacientes) {
                System.out.println(paciente);
            }
        }
    }
    
    private static void adicionarDentista(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CRM: ");
        String crm = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Dentista dentista = new Dentista(nome, crm, telefone, email);
        dentistas.add(dentista);
        System.out.print("Dentista adicionado com sucesso!");
    }
    
    private static void listarDentistas() {
        if (dentistas.isEmpty()) {
            System.out.println("Nenhum dentista cadastrado.");
        } else {
            System.out.println("Lista de Dentistas:");
            for (Dentista dentista : dentistas) {
                System.out.println(dentista);
            }
        }
    }
    

}
