package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
        //Construtor vazio
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() +
                "\nCarga Horaria: " + getCargaHoraria() +
                ",\nDescricao: '" + getDescricao() + '\'';
    }


}

