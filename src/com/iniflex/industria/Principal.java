package com.iniflex.industria;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        FuncionarioService service = new FuncionarioService();

        Utils.inicioPrograma();

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.1 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao(
                "Questão 3.1 - Inserir todos os funcionários, na mesma ordem e informações da tabela acima.");
        service.adicionarFuncionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"),
                "Operador");
        service.adicionarFuncionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"),
                "Operador");
        service.adicionarFuncionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"),
                "Coordenador");
        service.adicionarFuncionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"),
                "Diretor");
        service.adicionarFuncionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"),
                "Recepcionista");
        service.adicionarFuncionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"),
                "Operador");
        service.adicionarFuncionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"),
                "Contador");
        service.adicionarFuncionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"),
                "Gerente");
        service.adicionarFuncionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"),
                "Eletricista");
        service.adicionarFuncionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"),
                "Gerente");
        service.imprimirFuncionarios();
        Utils.fimQuestao("Questão 3.1");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.2 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao("Questão 3.2 - Remover o funcionário 'João' da lista.");
        service.removerFuncionario("João");
        service.imprimirFuncionarios();
        Utils.fimQuestao("Questão 3.2");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.3 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao("Questão 3.3 - Imprimir todos os funcionários com todas as suas informações.");
        service.imprimirFuncionarios();
        Utils.fimQuestao("Questão 3.3");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.4 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao(
                "Questão 3.4 - Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.");
        service.aumentarSalario(new BigDecimal("10"));
        service.imprimirFuncionarios();
        Utils.fimQuestao("Questão 3.4");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.5 e 3.6 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao(
                "Questões 3.5 e 3.6 - Agrupar os funcionários por função em um MAP, sendo a chave a 'função' e o valor a 'lista de funcionários'.\nImprimir os funcionários, agrupados por função.");
        service.imprimirFuncionariosPorFuncao();
        Utils.fimQuestao("Questões 3.5 e 3.6");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.8 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao("Questão 3.8 - Imprimir os funcionários que fazem aniversário no mês 10 e 12.");
        service.imprimirAniversariantes(10, 12);
        Utils.fimQuestao("Questão 3.8");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.9 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao(
                "Questão 3.9 - Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.");
        service.imprimirFuncionarioMaisVelho();
        Utils.fimQuestao("Questão 3.9");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.10 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao("Questão 3.10 - Imprimir a lista de funcionários por ordem alfabética.");
        service.imprimirFuncionariosOrdemAlfabetica();
        Utils.fimQuestao("Questão 3.10");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.11 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao("Questão 3.11 - Imprimir o total dos salários dos funcionários.");
        service.imprimirTotalSalarios();
        Utils.fimQuestao("Questão 3.11");

        // |=|=|=|=|=|=|=|=|=|=| Questão 3.12 |=|=|=|=|=|=|=|=|=|=|

        Utils.inicioQuestao(
                "Questão 3.12 - Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.");
        service.imprimirSalariosMinimos();
        Utils.fimQuestao("Questão 3.12");

        Utils.fimPrograma();
    }
}
