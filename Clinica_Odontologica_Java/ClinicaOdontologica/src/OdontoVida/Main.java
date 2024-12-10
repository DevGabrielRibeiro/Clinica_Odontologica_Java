package OdontoVida;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static ArrayList<Dentista> dentistas = new ArrayList<>();
    private static ArrayList<Consulta> consultas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Paciente");
            System.out.println("3. Adicionar Dentista");
            System.out.println("4. Listar Dentista");
            System.out.println("5. Adicionar Consulta");
            System.out.println("6. Listar Consulta");
            System.out.println("7. Sair");
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
                	adicionarConsulta(scanner);
                    break;
                case 6:
                	listarConsultas();
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
    
    private static void adicionarConsulta(Scanner scanner){
        System.out.print("Nome do Paciente: ");
        String nomePaciente = scanner.nextLine();
        System.out.print("Nome do Dentista: ");
        String nomeDentista = scanner.nextLine();
        System.out.print("Data da consulta: ");
        String dataConsulta = scanner.nextLine();
        System.out.print("Status da Consulta: ");
        String statusConsulta = scanner.nextLine();
        
        Consulta consulta = new Consulta(nomePaciente, nomeDentista, dataConsulta, statusConsulta);
        consultas.add(consulta);
        System.out.print("Consulta adicionada com sucesso!");
    }
    
    private static void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta cadastrada.");
        } else {
            System.out.println("Lista de Consultas:");
            for (Consulta consulta : consultas) {
                System.out.println(consulta);
            }
        }
    }
    
}
