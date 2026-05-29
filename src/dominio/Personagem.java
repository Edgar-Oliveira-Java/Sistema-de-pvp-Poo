package dominio;

public class Personagem {
    private String nome;
    private int vida;
    Item item = new Item();

    public Personagem(String name, int life){
        this.nome = name;
        this.vida = life;
    }


    public void atacaBoss(Inimigo alvo, Item gadget){
        if(gadget.resiste <= 0){
            System.out.println("Item quebrado!");
            return;
        }
        if(alvo.vida <= 0){
            System.out.println("O Inimigo foi morto!");
        }else {
            alvo.vida -= gadget.dano;
            gadget.resiste -= 2;
            System.out.println(alvo.nome+" Foi atacado");
            System.out.println("Tomou "+gadget.dano+" de dano!");
        }
    }

    public void atacarPlayer(Personagem alvo, Item gadget){
        if(gadget.resiste <= 0){
            System.out.println("Item quebrado!");
            return;
        }
        if(alvo.vida <= 0){
            System.out.println("O Inimigo foi morto!");
        }else {
            alvo.vida -= gadget.dano;
            gadget.resiste -= 2;
            System.out.println(alvo.nome+" Foi atacado");
            System.out.println("Tomou "+gadget.dano+" de dano!");
        }
    }
}
