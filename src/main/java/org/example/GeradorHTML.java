package org.example;

// ConcreteCreator B
public class GeradorHTML extends GeradorDocumento {
    @Override
    public Documento criarDocumento() {
        return new DocumentoHTML();
    }
}
