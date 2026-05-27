package dominio;

public class Item {
    public String tipo;
    public int dano;
    public int resiste;
    public void itemInventory(String type, int damage, int bks){
        tipo = type;
        dano = damage;
        resiste = bks;
    }
}
