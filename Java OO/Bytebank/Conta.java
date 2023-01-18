package Bytebank;

 public class Conta {
    double saldo;  // sao atributos
    int agencia;
    int numero;
    String titular;

    void deposita(double valor) // método
    {
        this.saldo = saldo + valor; // this é a palavra chave para se referir a conta que ele deu new
    }

     public boolean saca(double valor)
    {
        this.saldo = saldo - valor;
        if (this.saldo >= valor)
        {
            this.saldo = this.saldo - valor;
            return true;
        }
        else 
        {
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino)
    {
        if (this.saldo >= valor)
        {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        else
        {
            return false;
        }
    }

}


