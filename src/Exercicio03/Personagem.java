package Exercicio03;

public class Personagem {

    String Nome;
    int Vida;
    int Mana;
    float Xp;
    int Inteligencia;

    int Forca;
    int Level;

    public Personagem() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public float getXp() {
        return Xp;
    }

    public void setXp(float xp) {
        Xp = xp;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        Inteligencia = inteligencia;
    }

    public int getForça() {
        return Forca;
    }

    public void setForça(int força) {
        Forca = força;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    void lvlUp(){

    }
}
