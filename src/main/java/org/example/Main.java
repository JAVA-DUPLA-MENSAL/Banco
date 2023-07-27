package org.example;

import java.util.Scanner;

public class Main {
    
    static int opc;
    public static void main(String[] args) {
        Integer i = 8;
        Integer opc;

        Scanner scanner = new Scanner(System.in);

          Conta conta = new Conta("Andre","0.0123");

        //conta.resgate(saldo);
        //conta.deposito(saldo);
        //conta.invertir();
        do{
            System.out.println("          Bem vindo " + conta.nome + " Conta " + conta.conta);
            System.out.println("==================================================");
            System.out.println(" 1 - Resgate \n 2 - Depósito \n 3 - Investimento PIX \n 4 - Saldo e investimento \n 0 - SAIR");
            System.out.println("==================================================");

            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    conta.resgate();

                    break;
                case 2:
                    conta.deposito();
                    break;
                case 3:
                    conta.invertir();
                    break;
                case 0:
                    System.out.println("Ate a proxima");
                    break;
                case 4:
                    conta.info();
                    break;
                default:
                    System.out.println("esta opção não existe");
                    break;
            }

        }while(i != 0);



    }


}