package com.iniflex.industria;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FuncionarioService {
    private final List<Funcionario> funcionarios;

    public FuncionarioService() {
        this.funcionarios = new ArrayList<>();
    }

    // Questão 3.1
    public void adicionarFuncionario(String nome, LocalDate dataNascimento,
            BigDecimal salario, String funcao) {
        funcionarios.add(new Funcionario(nome, dataNascimento, salario, funcao));
    }

    // Questão 3.2
    public void removerFuncionario(String nome) {
        funcionarios.removeIf(f -> f.getNome().equals(nome));
    }

    // Questão 3.3
    public void imprimirFuncionarios() {
        System.out.println("\n--- Todos os funcionários no banco de dados ---");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %s | Data de Nascimento: %s | Salário: R$ %,.2f | Função: %s%n",
                    f.getNome(),
                    f.getDataNascimento().format(formatter),
                    f.getSalario(),
                    f.getFuncao());
        }
    }

    // Questão 3.4
    public void aumentarSalario(BigDecimal percentual) {
        System.out.println("\n--- Aumentando salários em " + percentual + "% ---");
        BigDecimal fatorAumento = BigDecimal.ONE.add(percentual.divide(new BigDecimal("100")));
        funcionarios.forEach(f -> f.setSalario(f.getSalario().multiply(fatorAumento)));
    }

    // Questões 3.5 e 3.6
    public void imprimirFuncionariosPorFuncao() {
        System.out.println("\n--- Funcionários agrupados por função (Salários atualizados com o aumento de 10%) ---");
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(java.util.stream.Collectors.groupingBy(Funcionario::getFuncao));

        funcionariosPorFuncao.forEach((funcao, lista) -> {
            System.out.println("\nFunção: " + funcao);
            lista.forEach(f -> System.out.printf("  Nome: %s, Salário: R$ %,.2f%n", f.getNome(), f.getSalario()));
        });
    }

    // Questão 3.8
    public void imprimirAniversariantes(int... meses) {
        System.out.println("\n--- Aniversariantes de " + Arrays.toString(meses) + " ---");
        List<Funcionario> aniversariantes = funcionarios.stream()
                .filter(f -> Arrays.stream(meses).anyMatch(mes -> f.getDataNascimento().getMonthValue() == mes))
                .collect(java.util.stream.Collectors.toList());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        aniversariantes.forEach(f -> System.out
                .println("Nome: " + f.getNome() + " | Data de Nascimento: " + f.getDataNascimento().format(formatter)));
        System.out.println("----------------------------------------------");
    }

    // Questão 3.9
    public void imprimirFuncionarioMaisVelho() {
        System.out.println("\n--- Funcionário com a maior idade ---");
        Funcionario maisVelho = funcionarios.stream()
                .min(java.util.Comparator.comparing(Funcionario::getDataNascimento))
                .orElse(null);
        if (maisVelho != null) {
            var idade = java.time.Period.between(maisVelho.getDataNascimento(), LocalDate.now());
            System.out.printf("Nome: %s | Idade: %d anos%n", maisVelho.getNome(), idade.getYears());
        }
        System.out.println("-----------------------------------");
    }

    // Questão 3.10
    public void imprimirFuncionariosOrdemAlfabetica() {
        System.out.println("\n--- Funcionários em ordem alfabética ---");
        funcionarios.stream()
                .sorted(java.util.Comparator.comparing(Funcionario::getNome))
                .forEach(f -> System.out.println("Nome: " + f.getNome()));
        System.out.println("----------------------------------------");
    }

    // Questão 3.11
    public void imprimirTotalSalarios() {
        System.out.println(
                "\n--- Total de salários (Salários atualizados com o aumento de 10% e Funcionário João removido) ---");
        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.printf("Valor total dos salários: R$ %,.2f%n", totalSalarios);
        System.out.println("-------------------------");
    }

    // Questão 3.12
    public void imprimirSalariosMinimos() {
        System.out.println("\n--- Salários Mínimos por funcionário ---");
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        funcionarios.forEach(f -> {
            BigDecimal salariosMinimos = f.getSalario().divide(salarioMinimo, 2, RoundingMode.HALF_UP);
            System.out.printf("Nome: %s | Salários Mínimos: %.2f%n", f.getNome(), salariosMinimos);
        });
        System.out.println("------------------------------------------");
    }
}
