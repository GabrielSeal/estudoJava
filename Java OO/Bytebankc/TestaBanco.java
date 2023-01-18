package Bytebankc;

public class TestaBanco {
    public static void main(String[] args) {
        
        Cliente gabriel = new Cliente();
        gabriel.nome = "Gabriel Seal";
        gabriel.cpf = "123.456.789-10";
        gabriel.profissao = "programador";

        Conta contaDeGabriel = new Conta();
        contaDeGabriel.deposita(100);

        // associa o cliente a conta
        contaDeGabriel.titular = gabriel;
        System.out.println(contaDeGabriel.titular.nome);

    }
}
