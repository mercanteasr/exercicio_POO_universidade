package Lista_4_Materia_POO;

public class Passeio extends Veiculo implements Calc{
    private int qtdePassageiro;

    // Construtores ================================
    public Passeio() {
        qtdePassageiro = 0;
    }

    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, String dataCadastro, int qtdePassageiro) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, dataCadastro);
        this.qtdePassageiro = qtdePassageiro;
    }

    // Getters e Setters ===========================

    public int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    // Metodos da classe ==========================

    @Override
    public int calcVel() {
        return getVelocMax() * 1000;
    }

    @Override
    public int calcular() {
        return getPlaca().length() + getCor().length() + getMarca().length() + getModelo().length() + getDataCadastro().length();
    }
}
