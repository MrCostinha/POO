package com.td3.teste;

import java.util.GregorianCalendar;

import com.td3.empresa.Funcionario;
import com.td3.empresa.OperacaoFuncionario;

public class App {
    public static void main(String[] args) throws Exception {
        // Funcionario funcionario1 = new Funcionario();
        // Funcionario funcionario2 = new Funcionario("000.000.000-00", "Q-Tip", new GregorianCalendar(2022, 9, 13));
        Funcionario funcionario3 = new Funcionario("123.456.789-10", "Matheus", 'M', 3500.0f, new GregorianCalendar(2002, 7-1, 1), new GregorianCalendar(2022, 9-1, 13));
        Funcionario funcionario4 = new Funcionario("987.654.321-00", "Layla", 'F', 3500.0f, new GregorianCalendar(2004, 1-1, 12), new GregorianCalendar(2022, 9-1, 13));
        Funcionario funcionario5 = new Funcionario("112.358.132-10", "Luan", 'M', 2800.0f, new GregorianCalendar(2003, 2-1, 5), new GregorianCalendar(2021, 2-1, 7));

        Funcionario[] funcionarios = { /* funcionario1, funcionario2, */ funcionario3, funcionario4, funcionario5 };

        OperacaoFuncionario.validaFuncionario(funcionarios);
        OperacaoFuncionario.contaSexo(funcionarios);
        OperacaoFuncionario.maiorMenorSalarioLiquido(funcionarios);
        OperacaoFuncionario.maiorMenorIdade(funcionarios);

        System.out.println();
        System.out.println(funcionario3.toString() + "\n");
        System.out.println(funcionario4.toString() + "\n");
        System.out.println(funcionario5.toString());
    }
}