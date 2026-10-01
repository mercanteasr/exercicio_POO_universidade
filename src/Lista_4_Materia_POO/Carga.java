package Lista_4_Materia_POO;

public class Carga extends Veiculo implements Calc{
     private int tara;
     private int cargaMax;

    // Construtores ================================
    public Carga() {
        tara = 0;
        cargaMax = 0;
    }

    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, String dataCadastro, int tara, int cargaMax) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, dataCadastro);
        this.tara = tara;
        this.cargaMax = cargaMax;
    }

// Getters e Setters ===========================

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    // Metodos da classe ==========================

    @Override
    public int calcVel() {
        return getVelocMax() * 100000;
    }

    @Override
    public int calcular() {
        return tara + cargaMax + getQtdRodas() + getVelocMax() + getMotor().getPotencia() + getMotor().getQtdPistoes();
    }
}
