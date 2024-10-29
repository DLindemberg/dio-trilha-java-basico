package org.example;

import java.util.Scanner;

public class ContaTerminal {

    public static void criarContaBanco() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        String saldoInput = scanner.nextLine();
        saldoInput = saldoInput.replace(",", ".");
        double saldo = Double.parseDouble(saldoInput);

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        criarContaBanco();
    }
}
