package Atividade18;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numConta, String numAgencia, double saldo) {
        super(numConta, numAgencia, saldo);
    }

    public void depositaValorContaPoupanca(double valor){
        valor = valor + (valor * (0.15/100));
        depositaValor(valor);
    }
    
}
