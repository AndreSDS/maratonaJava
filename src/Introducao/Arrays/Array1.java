package Introducao.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int[] idades = new int[3];
        byte[] anos = new byte[3];
        String[] palavras = new String[3];

        palavras[0] = "André";
        palavras[1] = "Barbára";
        palavras[2] = "Eduardo";

        System.out.println(idades[2]);
        System.out.println(anos[2]);

        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }
    }
}
