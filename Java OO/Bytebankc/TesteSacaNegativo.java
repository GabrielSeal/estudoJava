package Bytebankc;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200)); 
        System.out.println(conta.getSaldo());
        // encapsula o valor, so pega via método



        //conta.saldo = conta.saldo - 101; // nunca fazer isso // trabalho deve ser feito sempre por metodos
      //  System.out.println(conta.saldo); // nunca fazer isso

    }
}
