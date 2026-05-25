package dominio;

public class Personagem {
    public String nome;
    public int vida;
    Arma item = new Arma();
    public void playerConstructor(String name, int life, String type, int damage, int bks){
        nome = name;
        vida = life;
        item.tipo = type;
        item.dano = damage;
        item.resiste = bks;
    }

    public void atacaBoss(Inimigo alvo){
        if(item.resiste <= 0){
            System.out.println(item.tipo + "Quebrou");
            return;
        }
        if(alvo.vida <= 0){
            System.out.println("O inimigo está morto");
            return;
        }
        System.out.println(nome + " Atacou: " + alvo.nome);
        alvo.vida -= item.dano;
        System.out.println("Vida do alvo: "+alvo.vida);
        item.resiste -= 5;
    }

    public void atacarPlayer(Personagem alvo){
        if(item.resiste <= 0){
            System.out.println(item.tipo + "Quebrou");
            return;
        }
        if(alvo.vida <= 0){
            System.out.println("O inimigo está morto");
            return;
        }
        System.out.println(nome + " Atacou: " + alvo.nome);
        alvo.vida -= item.dano;
        System.out.println("Vida do alvo: "+alvo.vida);
        item.resiste -= 5;
    }
}
