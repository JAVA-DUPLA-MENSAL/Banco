package org.example;
/*
    Assunto [Data] - Nome1 - Nome2
Repositório Conta Bancária
- Classe Conta
Properidade: Nome Completo
Saldo Inicial de 100 unidades
1 - Método Resgate: Retirar Unidade (Reduzir unidades)
2 - Método Depósito: Adicionar Unidads (Aumentar unidades)
3 - Saldo Disponivel para investimentos
4 - Valor Investido = Aumentar em 5% a cada laço
Rentabilidade de 5%
*/
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Conta {
    public String nome;

    public String conta;

    public static Double saldo = 100.0;

    Scanner scanner = new Scanner(System.in);

    public void resgate(){
        System.out.println(saldo);
        System.out.println("quanto voce quer retirar?");

        Double valorInput = scanner.nextDouble();

        if(valorInput < saldo){
            Double result = saldo - valorInput;

            saldo = result;

            System.out.println(saldo);
        }else{
            System.out.println("Saldo insuficiente... 190");
        }

    }

    public void deposito(){
        System.out.println(saldo);
        System.out.println("Quanto voce quer depositar?");

        Double valorInput  = scanner.nextDouble();

        Double result = saldo + valorInput;

        saldo = result;

        System.out.println(saldo);

    }

    public void invertir(){
        System.out.println("saldo atual:" + saldo);
        System.out.println("Quanto voce quer investir?");

        Double valorInput = scanner.nextDouble();

        Double dale = saldo - valorInput;

        saldo = dale;

        Double valorInvestido =  valorInput * 0.05;

        System.out.println("rendimento de:" + valorInvestido);


    }

    public Conta(String nome, String conta){
        this.nome = nome;
        this.conta = conta;
    }


}
