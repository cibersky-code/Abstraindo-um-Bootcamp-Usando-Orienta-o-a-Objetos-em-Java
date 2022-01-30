package br.dio.com.desafio.dominio;

import java.time.LocalDate;

/**
 * @autor: Bruno Teles
 * @version: 1.0
 */
public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double caucularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo= '" + getTitulo() + '\'' +
                ", descricao= '" + getDescricao() + '\'' +
                ", data= " + data +
                '}';
    }
}
