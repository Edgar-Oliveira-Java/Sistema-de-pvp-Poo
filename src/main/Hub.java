package main;

import dominio.Inimigo;
import dominio.Item;
import dominio.Personagem;

public class Hub {
    public static void main(String[] args) {
        Personagem guts = new Personagem();
        Personagem miyamoto = new Personagem();
        Inimigo mangog = new Inimigo();
        Item[] inventario = new Item[3];
        inventario[0] = new Item();
        inventario[1] = new Item();
        inventario[2] = new Item();

        guts.playerConstructor("Guts", 230);
        miyamoto.playerConstructor("Miyamoto", 150);
        mangog.bossConstructor("Mango", 550);

        inventario[0].itemInventory("Espada Das Viuvas", 85, 25);
        inventario[1].itemInventory("Porrete das Nações", 57, 20);
        inventario[2].itemInventory("Katána das 8 petalas", 150, 10);

        miyamoto.atacarPlayer(guts, inventario[2]);
        miyamoto.atacarPlayer(guts, inventario[2]);
        miyamoto.atacarPlayer(guts, inventario[2]);
    }
}
