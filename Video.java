

package com.mycompany.video;

public class Video {
    String titulo;
    int duracao;
    boolean estaDandoPlay;

    public Video(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.estaDandoPlay = false;
    }

    public void alternarPlay() {
        this.estaDandoPlay = !this.estaDandoPlay;
    }

    public void exibirStatus() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Está dando play? " + estaDandoPlay);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Video v1 = new Video("Aula POO", 30);
        Video v2 = new Video("Java Básico", 45);

        v1.alternarPlay();

        v1.exibirStatus();
        v2.exibirStatus();
    }
}