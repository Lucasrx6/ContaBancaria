package Atividade18;

public class Conta{
    //--------------------------------------Atributos--------------------------------------
    private String nomeTitular;
    private String numConta;
    private String numAgencia;
    private double saldo;

    // --------------------------------------Construtor--------------------------------------
    public Conta(String numConta, String numAgencia, double saldo){
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.saldo = saldo;
    }
    //--------------------------------------Metodos--------------------------------------
    public String consultaDados(){

        return "Nome do Titular: " + this.nomeTitular + ".\n"
             + "Numero da Agencia: " + this.numAgencia + ".\n"
             + "Numero da Conta: " + this.numConta + ".";
    }


    public Double consultaSaldo() {

        return this.saldo;
    }


    public void depositaValor(double valor) {
        if (valor > 0)
            this.saldo += valor; 

    }

    public double sacaValor(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor; 
            return this.saldo;
        }
        else
            return this.saldo;

    }  
// --------------------------------------getters e setters--------------------------------------
    public String getnomeTitular(){
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public String getNumConta(){
        return numConta;
    }

    public void setNumConta(String numConta){
        this.numConta = numConta;
    }

    public String getNumAgencia(){
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia){
        this.numAgencia = numAgencia;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}

