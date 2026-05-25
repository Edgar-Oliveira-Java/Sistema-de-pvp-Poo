package main;

import dominio.Inimigo;
import dominio.Personagem;

public class Hub {
    public static void main(String[] args) {
        Personagem guts = new Personagem();
        Personagem miyamoto = new Personagem();
        Inimigo mangog = new Inimigo();

        guts.playerConstructor("Guts", 250, "Espada de Fogo", 37, 100);
        mangog.bossConstructor("Mangog", 450);
        miyamoto.playerConstructor("miyamoto", 200, "Katana", 100, 25);
        guts.atacaBoss(mangog);
        miyamoto.atacarPlayer(guts);

    }
}
