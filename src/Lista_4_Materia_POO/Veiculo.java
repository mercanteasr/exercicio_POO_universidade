package Lista_4_Materia_POO;

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    private String dataCadastro;
    private Motor motor;


    // Metodo "Motor"===============================

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Construtores ================================
    public Veiculo() {
        placa = "";
        marca = "";
        modelo = "";
        cor = "";
        qtdRodas = 0;
        velocMax = 0;
        motor = new Motor();
        dataCadastro = "";
    }

    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, String dataCadastro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        this.setVelocMax(velocMax);
        this.dataCadastro = dataCadastro;
        this.motor = new Motor();
    }

    // Getters e Setters ===========================
    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public boolean setVelocMax(int velocMax) {
        if(velocMax < 10 || velocMax > 250){
            this.velocMax = 100;
            return false;
        } else {
            this.velocMax = velocMax;
            return true;
        }
    }
    // =============================================

    public abstract int calcVel();

}
