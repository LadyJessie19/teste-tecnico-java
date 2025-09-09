package com.iniflex.industria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Utils {
    public static void inicioPrograma() {
        limparTela();
        System.out.println("--- Início do Programa ---");
        System.out.println("Bem-vindo ao sistema de gestão de funcionários!");
        System.out.println("Desenvolvido por Jessie Moura | Dev Fullstack");
        System.out.println("--------------------------");
        esperarEnter();
        limparTela();
    }

    // Método para pausar a execução por um número específico de segundos
    public static void pausar(int segundos) {
        try {
            System.out.println("\nCarregando... ");
            TimeUnit.SECONDS.sleep(segundos);
            limparTela();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Método para limpar a tela do terminal
    private static void limparTela() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Método para esperar o usuário pressionar Enter
    private static void esperarEnter() {
        System.out.println("\nPressione Enter para continuar...");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            reader.readLine();
        } catch (java.util.NoSuchElementException e) {
            // Ignorar a exceção se não houver entrada disponível
        } catch (IOException e) {
            // Ignorar IOException se ocorrer ao ler a entrada
        }
    }

    // Métodos para iniciar questões
    public static void inicioQuestao(String questao) {
        System.out.println("\n--- " + questao + " ---");
        pausar(3);
        System.out.println("\n--- " + questao + " ---");
    }

    // Método para finalizar uma questão
    public static void fimQuestao(String questao) {
        System.out.println("\n--- Fim da " + questao + " ---");
        esperarEnter();
        limparTela();
    }

    // Método para finalizar o programa
    public static void fimPrograma() {
        System.out.println("\n--- Fim do Programa ---");
        System.out.println("Obrigado por utilizar o sistema de gestão de funcionários!");
        System.out.println("Desenvolvido por Jessie Moura | Dev Fullstack");
        System.out.println("-----------------------");
    }
}
