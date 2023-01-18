package Bytebanke;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        // conta.numero = 1337;
        conta.setNumero(789);
       // conta.setTitular(gabriel);

       Cliente gabriel = new Cliente();
       gabriel.setNome("Gabriel Seal");
       gabriel.setCpf("123.456.789-10");
       gabriel.setProfissao("programador");
       conta.setTitular(gabriel); // apontamento do titular como gabriel 

    }
}
