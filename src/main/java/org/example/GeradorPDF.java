package org.example;

// ConcreteCreator A
public class GeradorPDF extends GeradorDocumento {
    @Override
    public Documento criarDocumento() {
        return new DocumentoPDF();
    }
}
