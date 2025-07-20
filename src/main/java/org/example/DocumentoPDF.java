
package org.example;

/// ConcreteProduct A
public class DocumentoPDF implements Documento {
    @Override
    public void gerar() {
        System.out.println("Gerando documento PDF...");
    }
}
