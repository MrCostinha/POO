package com.td3.empresa;

import java.util.GregorianCalendar;

public class Funcionario {
    private String cpf;
    private String nome;
    private char sexo;
    private float salarioBruto;
    private GregorianCalendar dataNascimento;
    private GregorianCalendar dataAdmissao;
    
    public Funcionario() {
        this.dataAdmissao = new GregorianCalendar();
    }
    public Funcionario(String cpf, String nome, GregorianCalendar dataAdmissao) {
        setCpf(cpf);
        setNome(nome);
        setDataAdmissao(dataAdmissao);
    }
    public Funcionario(String cpf, String nome, char sexo, float salarioBruto, GregorianCalendar dataNascimento, GregorianCalendar dataAdmissao) {
        setCpf(cpf);
        setNome(nome);
        setSexo(sexo);
        setSalarioBruto(salarioBruto);
        setDataNascimento(dataNascimento);
        setDataAdmissao(dataAdmissao);
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public float getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public GregorianCalendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(GregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public GregorianCalendar getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(GregorianCalendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public boolean validarCPF(String cpf) {
        if (cpf.length() != 14 || cpf.charAt(3) != '.' || cpf.charAt(7) != '.' || cpf.charAt(11) != '-') {
            return false;
        }

        return true;
    }
    public boolean validarDataNascimento(GregorianCalendar dataNascimento) {
        if (dataNascimento.get(GregorianCalendar.YEAR) < 1920 || idade(dataNascimento) < 18) {
            return false;
        }

        return true;
    }
    public boolean validarDataAdmissao(GregorianCalendar dataAdmissao) {
        if (dataAdmissao.get(GregorianCalendar.YEAR) < 1995) {
            return false;
        }

        return true;
    }
    public int idade(GregorianCalendar dataNascimento) {
        GregorianCalendar dataAtual = new GregorianCalendar();
        int idade = dataAtual.get(GregorianCalendar.YEAR) - dataNascimento.get(GregorianCalendar.YEAR);

        if (dataAtual.get(GregorianCalendar.MONTH) < dataNascimento.get(GregorianCalendar.MONTH)) {
            idade--;
        } else if (dataAtual.get(GregorianCalendar.MONTH) == dataNascimento.get(GregorianCalendar.MONTH)) {
            if (dataAtual.get(GregorianCalendar.DAY_OF_MONTH) < dataNascimento.get(GregorianCalendar.DAY_OF_MONTH)) {
                idade--;
            }
        }

        return idade;
    }
    public float salarioLiquido(float salarioBruto) {
        if (salarioBruto <= 3000.0) {
            return salarioBruto - salarioBruto*0.17f;
        } else { 
            return salarioBruto - salarioBruto*0.27f;
        }
    }

    @Override
    public String toString() {
        return "Funcionário [ Nome = " + nome + ", Sexo = " + sexo + ", CPF = " + cpf + ", Data de Nascimento = " + 
        dataNascimento.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (dataNascimento.get(GregorianCalendar.MONTH)+1) + 
        "/" + dataNascimento.get(GregorianCalendar.YEAR) + ", Idade = " + idade(dataNascimento) +
        ", Data de Admissão = " + dataAdmissao.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (dataAdmissao.get(GregorianCalendar.MONTH)+1) + 
        "/" + dataAdmissao.get(GregorianCalendar.YEAR) + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) obj;
            if (this.nome.equals(funcionario.getNome()) && this.cpf.equals(funcionario.getCpf()) && this.sexo == funcionario.getSexo()) {
                return true;
            }
        }

        return false;
    }
}