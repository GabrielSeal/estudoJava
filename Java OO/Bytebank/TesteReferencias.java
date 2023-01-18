package Bytebank;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

       

        Conta segundaConta = primeiraConta;
        segundaConta.saldo += 100;

        System.out.println("saldo da segunda conta  " + segundaConta.saldo);
        System.out.println("saldo da primeira conta " + primeiraConta.saldo);

        if (primeiraConta == segundaConta)
        {
            System.out.println("são a mesma conta");
        }
        
    }
}
