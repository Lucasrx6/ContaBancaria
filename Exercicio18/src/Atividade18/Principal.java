package Atividade18;

import javax.swing.JOptionPane;

public class Principal {

    public static void main (String [] args){

        ContaCorrente contaCorrente = new ContaCorrente("0001", "0001", 0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("0002", "0002", 0);

        Object[] opcaoConta = {"Conta Corrente","Conta Poupanca","Encerrar"};
        Object contaEscolhida;

        Object[] opcao = {"Consultar Dados", "Consultar Saldo", "Depositar", "Sacar", "Retornar"};
        Object opcaoEscolhida;
        String valor = "0";
        Double valor2;
        Double juros;

        contaCorrente.setNomeTitular(JOptionPane.showInputDialog(null, "Informe o nome: "));

        do{
            contaEscolhida = JOptionPane.showInputDialog(null, "Qual conta deseja acessar ", "BANCO DF", 
            JOptionPane.INFORMATION_MESSAGE,null, opcaoConta,opcaoConta[0]);

            if (contaEscolhida == "Conta Corrente")

                do{
                   
                    opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha a opção ", "BANCO DF", 
                    JOptionPane.INFORMATION_MESSAGE,null, opcao,opcao[0]);

                    if (opcaoEscolhida == "Consultar Dados")
                        JOptionPane.showMessageDialog(null, contaCorrente.consultaDados());
                    
                    else if (opcaoEscolhida == "Consultar Saldo"){
                        JOptionPane.showMessageDialog(null, "Saldo em conta: " + contaCorrente.consultaSaldo());
                    }
                    
                    else if (opcaoEscolhida == "Depositar"){
                        valor = JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar: ");
                        valor = valor.replace(",",".");
                        contaCorrente.depositaValor(Double.parseDouble(valor));
                        JOptionPane.showMessageDialog(null, "Foi realizado o deposito de " + valor + " reais.\n" + 
                                                                            "O saldo atual é " + contaCorrente.consultaSaldo() + " reais");
                    }

                    else if (opcaoEscolhida == "Sacar"){
                        valor = JOptionPane.showInputDialog(null, "Digite o valor que deseja sacar: ");
                        valor = valor.replace(",",".");
                        contaCorrente.sacaValor(Double.parseDouble(valor));
                        JOptionPane.showMessageDialog(null, "Foi realizado o saque de " + valor + " reais.\n"+
                                                                            "O saldo atual é "+ contaCorrente.consultaSaldo() + " reais.");
                
                    }

                }while(opcaoEscolhida != "Retornar");


            if (contaEscolhida == "Conta Poupanca")

                do{

                        opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha a opção ", "BANCO DF", 
                        JOptionPane.INFORMATION_MESSAGE,null, opcao,opcao[0]);

                        if (opcaoEscolhida == "Consultar Dados")
                            JOptionPane.showMessageDialog(null, contaCorrente.consultaDados());
                        
                        else if (opcaoEscolhida == "Consultar Saldo"){
                            JOptionPane.showMessageDialog(null, "Saldo em conta: " + contaPoupanca.consultaSaldo());
                        }
                        
                        else if (opcaoEscolhida == "Depositar"){
                            valor = JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar: ");
                            valor = valor.replace(",",".");
                            contaPoupanca.depositaValorContaPoupanca(Double.parseDouble(valor));
                            valor2 = Double.parseDouble(valor);
                            juros = valor2 * (0.15/100);
                            JOptionPane.showMessageDialog(null, "Foi realizado o deposito de " + valor + " reais.\n" +
                                                                            "Foi adicionado um acrécimo de juros no valor de " + juros + " reais.\n" +
                                                                            "O saldo atual é " + contaPoupanca.consultaSaldo() + " reais");
                        }
        

                        else if (opcaoEscolhida == "Sacar"){
                            valor = JOptionPane.showInputDialog(null, "Digite o valor que deseja sacar: ");
                            valor = valor.replace(",",".");
                            contaPoupanca.sacaValor(Double.parseDouble(valor));
                            JOptionPane.showMessageDialog(null, "Foi realizado o saque de " + valor + " reais.\n"+
                                                                                "O saldo atual é "+ contaPoupanca.consultaSaldo() + " reais.");
                        }
                    
                }while(opcaoEscolhida != "Retornar");
                

        }while(contaEscolhida != "Encerrar");     
    }
}
