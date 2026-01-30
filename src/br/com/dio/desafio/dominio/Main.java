package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        var curso2 = new Curso();

        curso2.setTitulo("Js"); curso2.setCargaHoraria(4); curso2.setDescricao("descrição curso Js");

        //System.out.println("\n\n" + curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java"); mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println("\n\n" + mentoria);

        Conteudo conteudo = new Curso();

        Conteudo conteudo1 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscriverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila" + devCamila.getContudosInscritos());
        devCamila.progredir();
        System.out.println("Progredindo...");
        System.out.println("Conteúdos inscritos Camila" + devCamila.getContudosInscritos());
        System.out.println("Conteúdos concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());

        System.out.println("==================================================================");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscriverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João" + devJoao.getContudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Progredindo...");
        System.out.println("Conteúdos inscritos João" + devJoao.getContudosInscritos());
        System.out.println("Conteúdos concluídos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());

    }
}