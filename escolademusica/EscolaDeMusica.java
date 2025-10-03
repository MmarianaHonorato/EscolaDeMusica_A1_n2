package escolademusica;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EscolaDeMusica {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("Iniciar a Orquestra");

        InstrumentoMusical[] banda = new InstrumentoMusical[4];
        banda[0] = new Violao("Violão Clássico", "Madeira", 6);
        banda[1] = new Piano("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new Bateria("Bateria Acústica", "Madeira e Metal", 5);
        banda[3] = new Saxofone("Saxofone", "Latão", "Alto");

        EscolaDeMusica escola = new EscolaDeMusica();
        escola.apresentar(banda);
        escola.contarInstrumentosPorTipo(banda);
    }

    public void apresentar(InstrumentoMusical[] instrumentos) {
        System.out.println("\nIniciando a afinação dos instrumentos...");
        System.out.println("-------------------------------------------------");
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            System.out.println();
        }
        System.out.println("-------------------------------------------------");

        System.out.println("\nIniciando a apresentação musical...");
        System.out.println("-------------------------------------------------");
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
    }

    public void contarInstrumentosPorTipo(InstrumentoMusical[] instrumentos) {
        int violoes = 0, pianos = 0, baterias = 0, saxofones = 0, outros = 0;

        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento instanceof Violao) {
                violoes++;
            } else if (instrumento instanceof Piano) {
                pianos++;
            } else if (instrumento instanceof Bateria) {
                baterias++;
            } else if (instrumento instanceof Saxofone) {
                saxofones++;
            } else {
                outros++;
            }
        }

        System.out.println("\nContagem de instrumentos:");
        System.out.println("Total de instrumentos: " + instrumentos.length);
        System.out.println("Violões: " + violoes);
        System.out.println("Pianos: " + pianos);
        System.out.println("Baterias: " + baterias);
        System.out.println("Saxofones: " + saxofones);
        System.out.println("Outros: " + outros);
    }
}
