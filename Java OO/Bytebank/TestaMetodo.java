package Bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        
        Conta contaDoGabriel = new Conta();  // maiusculo sempre é a classe, minusculo é a variavel
       // contaDoGabriel.saldo = 100;
       // contaDoGabriel.deposita(50); // esse erro não faz sentido, ignorar
      //  System.out.println(contaDoGabriel.saldo);
       // contaDoGabriel.saldo = 100;
      //  boolean ConseguiuRetirar = contaDoGabriel.saca(101);
      //  System.out.println(contaDoGabriel.saldo);
      //  System.out.println(ConseguiuRetirar);
        
        Conta contaDaThais = new Conta();
        contaDaThais.saldo = 1000;
        if (contaDaThais.transfere(300,contaDoGabriel)) // só pode pq transfere é boolean
        {
            System.out.println("transferencia realizada com sucesso");
        }
        else{
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDaThais.saldo);
        System.out.println(contaDoGabriel.saldo);

    }

}
