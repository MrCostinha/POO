package com.td3.empresa;

public class OperacaoFuncionario {
    public static void validaFuncionario(Funcionario[] funcionarios) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].getNome() == null) {
                System.out.println("Funcionário " + i+1 + ": Nome inválido");
            }
            if (funcionarios[i].validarCPF(funcionarios[i].getCpf()) == false) {
                System.out.println("Funcionário " + i+1 + "CPF inválido");
            }
            if (funcionarios[i].getSexo() != 'M' && funcionarios[i].getSexo() != 'F') {
                System.out.println("Funcionário " + i+1 + ": Sexo inválido");
            }
            if (funcionarios[i].getSalarioBruto() < 0) {
                System.out.println("Funcionário " + i+1 + ": Salário inválido");
            }
            if (funcionarios[i].validarDataNascimento(funcionarios[i].getDataNascimento()) == false) {
                System.out.println("Funcionário " + i+1 + ": Data de nascimento inválida");
            }
            if (funcionarios[i].validarDataAdmissao(funcionarios[i].getDataAdmissao()) == false) {
                System.out.println("Funcionário " + i+1 + ": Data de admissão inválida");
            }
        }
    }
    public static void contaSexo(Funcionario[] funcionarios) {
        int masculino = 0, feminino = 0;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSexo() == 'M') {
                masculino++;
            } else {
                feminino++;
            }
        }

        System.out.println("Sexo masculino: " + masculino);
        System.out.println("Sexo feminino: " + feminino);
    }
    public static void maiorMenorSalarioLiquido(Funcionario[] funcionarios) {
        int maior = 0, menor = 0;
        float maiorSalario = funcionarios[0].salarioLiquido(funcionarios[0].getSalarioBruto());
        float menorSalario = funcionarios[0].salarioLiquido(funcionarios[0].getSalarioBruto());
        
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].salarioLiquido(funcionarios[i].getSalarioBruto()) > maiorSalario) {
                maior = i;
                maiorSalario = funcionarios[i].salarioLiquido(funcionarios[i].getSalarioBruto());
            }
            if (funcionarios[i].salarioLiquido(funcionarios[i].getSalarioBruto()) < menorSalario) {
                menor = i;
                menorSalario = funcionarios[i].salarioLiquido(funcionarios[i].getSalarioBruto());
            }
        }

        System.out.println("Maior salário líquido: " + funcionarios[maior].getNome() + " = " + maiorSalario);
        System.out.println("Menor salário líquido: " + funcionarios[menor].getNome() + " = " + menorSalario);
    }
    public static void maiorMenorIdade(Funcionario[] funcionarios) {
        int maior = 0, menor = 0;
        int maiorIdade = funcionarios[0].idade(funcionarios[0].getDataNascimento());
        int menorIdade = funcionarios[0].idade(funcionarios[0].getDataNascimento());
        
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].idade(funcionarios[i].getDataNascimento()) > maiorIdade) {
                maior = i;
                maiorIdade = funcionarios[i].idade(funcionarios[i].getDataNascimento());
            }
            if (funcionarios[i].idade(funcionarios[i].getDataNascimento()) < menorIdade) {
                menor = i;
                menorIdade = funcionarios[i].idade(funcionarios[i].getDataNascimento());
            }
        }

        System.out.println("Maior idade: " + funcionarios[maior].getNome() + " = " + maiorIdade);
        System.out.println("Menor idade: " + funcionarios[menor].getNome() + " = " + menorIdade);
    }
}