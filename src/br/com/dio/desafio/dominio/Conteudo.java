package br.com.dio.desafio.dominio;

public abstract class Conteudo {
//o metodo abstract não pode ser instanciado e ele só foi criado implementar os atributos nas classes
// filhas( curso e mentoria) para evitar a repetição de código.(herança).

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
