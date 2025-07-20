package org.example;

// Abstract Factory
public abstract class GeradorDocumento {
    // O método de fábrica
    public abstract Documento criarDocumento();

    // Lógica de negócio que usa o produto
    public void processarEGerar() {
        Documento doc = criarDocumento(); // Delega a criação
        doc.gerar();
    }
}

