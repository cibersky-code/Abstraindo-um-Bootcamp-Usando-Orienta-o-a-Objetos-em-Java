package br.dio.com.desafio.dominio;
/**
 * @autor: Bruno Teles
 * @version: 1.0
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double caucularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
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
                "titulo= '" + getTitulo() + '\'' +
                ", descricao= '" + getDescricao() + '\'' +
                ", cargaHoraria= " + cargaHoraria + " Horas" +
                '}';
    }

}
