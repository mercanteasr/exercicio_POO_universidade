package Lista_4_Materia_POO;

import java.time.LocalDate;

public class TstVeic {
    public static void main(String[] args){
        Leitura l = new Leitura();
        Passeio passeio = new Passeio();
        Carga carga = new Carga();
        boolean velocidade;

        System.out.println("\n| VEICULO DE PASSEIO |");
        passeio.setPlaca(l.entDados("Placa veiculo: "));
        passeio.setMarca(l.entDados("Marca do veiculo: "));
        passeio.setModelo(l.entDados("Modelo veiculo: "));
        passeio.setCor(l.entDados("Cor veiculo: "));
        passeio.setQtdRodas(Integer.parseInt(l.entDados("Quantidade de rodas: ")));
        passeio.setQtdePassageiro(Integer.parseInt(l.entDados("Quantidade de passageiros: ")));
        velocidade = passeio.setVelocMax(Integer.parseInt(l.entDados("Digite a velocidade maxima: ")));
        if(!velocidade){
            System.out.println("\nA velocidade está fora dos limites brasileiros!");
        }
        passeio.getMotor().setPotencia(Integer.parseInt(l.entDados("Digite a potencia do motor: ")));
        passeio.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("Digite a quantidade de Pistões: ")));
        passeio.setDataCadastro(LocalDate.now().toString());

        System.out.println("\nExibição de Dados do Passeio\n");
        System.out.println("Placa..."+passeio.getPlaca());
        System.out.println("Marca..."+passeio.getMarca());
        System.out.println("Modelo..."+passeio.getModelo());
        System.out.println("Cor..."+passeio.getCor());
        System.out.println("Quantidade de Rodas..."+passeio.getQtdRodas());
        System.out.println("Quantidade de Passageiros..."+passeio.getQtdePassageiro());
        System.out.println("Velocidade maxima..."+passeio.getVelocMax());
        System.out.println("Potencia do motor..."+passeio.getMotor().getPotencia());
        System.out.println("Quantidade de pistões..."+passeio.getMotor().getQtdPistoes());
        System.out.println("Data de Cadastro..."+passeio.getDataCadastro());
        System.out.println("Velocidade medida em M/h..."+passeio.calcVel());
        System.out.println("Soma dos caracteres..."+passeio.calcular());

        System.out.println("\n| VEICULO DE CARGA |");
        carga.setPlaca(l.entDados("Placa veiculo: "));
        carga.setMarca(l.entDados("Marca do veiculo: "));
        carga.setModelo(l.entDados("Modelo veiculo: "));
        carga.setCor(l.entDados("Cor veiculo: "));
        carga.setQtdRodas(Integer.parseInt(l.entDados("Quantidade de rodas: ")));
        carga.setTara(Integer.parseInt(l.entDados("Tara: ")));
        carga.setCargaMax(Integer.parseInt(l.entDados("Carga maxima: ")));
        velocidade = carga.setVelocMax(Integer.parseInt(l.entDados("Digite a velocidade maxima: ")));
        if(!velocidade){
            System.out.println("\nA velocidade está fora dos limites brasileiros!");
        }
        carga.getMotor().setPotencia(Integer.parseInt(l.entDados("Digite a potencia do motor: ")));
        carga.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("Digite a quantidade de Pistões: ")));
        carga.setDataCadastro(LocalDate.now().toString());

        System.out.println("\nExibição de Dados da Carga\n");
        System.out.println("Placa..."+carga.getPlaca());
        System.out.println("Marca..."+carga.getMarca());
        System.out.println("Modelo..."+carga.getModelo());
        System.out.println("Cor..."+carga.getCor());
        System.out.println("Quantidade de Rodas..."+carga.getQtdRodas());
        System.out.println("Tara..."+carga.getTara());
        System.out.println("Carga maxima..."+carga.getCargaMax());
        System.out.println("Velocidade maxima..."+carga.getVelocMax());
        System.out.println("Potencia do motor..."+carga.getMotor().getPotencia());
        System.out.println("Quantidade de pistões..."+carga.getMotor().getQtdPistoes());
        System.out.println("Data de Cadastro..."+carga.getDataCadastro());
        System.out.println("Velocidade medida em Cm/h..."+carga.calcVel());
        System.out.println("Soma dos valores numericos..."+carga.calcular());
    }
}
