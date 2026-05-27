package dominio;

public class Personagem {
    public String nome;
    public int vida;
    Item item = new Item();

    public void playerConstructor(String name, int life){
        nome = name;
        vida = life;
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
