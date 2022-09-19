package Exercicio01;

public class Veiculo {
    String marca;
    String modelo;
    String placa;
    String cor;
    float km;
    boolean ligado;
    int litrosCombustivel;
    int velocidade;
    double preco;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean ligado, int litrosCombustivel, int velocidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.ligado = ligado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void acelerar(){
        this.velocidade += 20;

    }
    void abastecer(int Combustivel){
        if(litrosCombustivel+Combustivel > 60){
            System.out.println("Nao cabe no tanque");
        } else {
            litrosCombustivel += Combustivel;
            System.out.println("O tanque foi abastecido");
        }

    }
    void frear(){
        if (velocidade > 0){
            System.out.println("Nao possivel frear parado");
        } else {
            velocidade -= 20;
            System.out.println("Parando");
        }


    }
    void pintar(){
    }
    void ligar(){

        System.out.println("Está ligando");
    }
    void desligar(){
        System.out.println("Está desligando");
    }



}
