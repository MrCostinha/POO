package com.td3.empresa;

public class OperacaoFuncionario {
    public static void validaFuncionario(Funcionario[] funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome() == null) {
                System.out.println("Nome inválido");
            }
            if (funcionario.validarCPF(funcionario.getCpf()) == false) {
                System.out.println("CPF inválido");
            }
            if (funcionario.getSexo() != 'M' && funcionario.getSexo() != 'F') {
                System.out.println("Sexo inválido");
            }
            if (funcionario.getSalarioBruto() < 0) {
                System.out.println("Salário inválido");
            }
            if (funcionario.validarDataNascimento(funcionario.getDataNascimento()) == false) {
                System.out.println("Data de nascimento inválida");
            }
            if (funcionario.validarDataAdmissao(funcionario.getDataAdmissao()) == false) {
                System.out.println("Data de admissão inválida");
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
        float maior = funcionarios[0].salarioLiquido(funcionarios[0].getSalarioBruto());
        float menor = funcionarios[0].salarioLiquido(funcionarios[0].getSalarioBruto());

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.salarioLiquido(funcionario.getSalarioBruto()) > maior) {
                maior = funcionario.salarioLiquido(funcionario.getSalarioBruto());
            }
            if (funcionario.salarioLiquido(funcionario.getSalarioBruto()) < menor) {
                menor = funcionario.salarioLiquido(funcionario.getSalarioBruto());
            }
        }

        System.out.println("Maior salário líquido: " + maior);
        System.out.println("Menor salário líquido: " + menor);
    }
    public static void maiorMenorIdade(Funcionario[] funcionarios) {
        int maior = funcionarios[0].idade(funcionarios[0].getDataNascimento());
        int menor = funcionarios[0].idade(funcionarios[0].getDataNascimento());

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.idade(funcionario.getDataNascimento()) > maior) {
                maior = funcionario.idade(funcionario.getDataNascimento());
            }
            if (funcionario.idade(funcionario.getDataNascimento()) < menor) {
                menor = funcionario.idade(funcionario.getDataNascimento());
            }
        }

        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);
    }
}