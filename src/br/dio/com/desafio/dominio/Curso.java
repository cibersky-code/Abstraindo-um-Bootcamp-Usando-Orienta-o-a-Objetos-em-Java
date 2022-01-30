package br.dio.com.desafio.dominio;
/**
 * @autor: Bruno Teles
 * @version: 1.0
 */
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {
    }

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo= '" + titulo + '\'' +
                ", descricao= '" + descricao + '\'' +
                ", cargaHoraria= " + cargaHoraria + " Horas" +
                '}';
    }


}
