package org.example;

// Cliente
public class Aplicacao {
    private static GeradorDocumento gerador;

    public static void main(String[] args) {
        configurar("PDF");
        gerador.processarEGerar(); // Gera PDF

        configurar("HTML");
        gerador.processarEGerar(); // Gera HTML
    }

    static void configurar(String tipo) {
        if (tipo.equalsIgnoreCase("HTML")) {
            gerador = new GeradorHTML();
        } else {
            gerador = new GeradorPDF();
        }
    }
}