package br.com.etecia.recyclerview;

public class Filmes {

    private String nome;
    private String descricao;
    private String categoria;
    private int img;

    public Filmes(String nome, String descricao, String categoria, int img) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
