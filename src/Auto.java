public class Auto {
    private String marca;
    private String modelo;
    private int ano;

    public Auto(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    ///////////////
    public void arrancar() {
        System.out.println("Arrancando el auto...");
    }

    public void apagar() {
        System.out.println("Apagando el auto...");
    }

    public void acelerar() {
        System.out.println("Acelerando el auto...");
    }
////////////////////////////////////////
    public String marca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String modelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int ano() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + ano +
                '}';
    }
}