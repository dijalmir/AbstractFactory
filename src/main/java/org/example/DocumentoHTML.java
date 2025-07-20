package org.example;

// ConcreteProduct B
public class DocumentoHTML implements Documento {
    @Override
    public void gerar() {
        System.out.println("Gerando documento HTML...");
    }
}

