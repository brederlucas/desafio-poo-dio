import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        var curso2 = new Curso();

        curso2.setTitulo("Js"); curso2.setCargaHoraria(4); curso2.setDescricao("descrição curso Js");

        System.out.println("\n\n" + curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java"); mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println("\n\n" + mentoria);

    }
}