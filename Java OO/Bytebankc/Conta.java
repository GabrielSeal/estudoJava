package Bytebankc;

 public class Conta {
   private double saldo;  // sao atributos
    int agencia;
    int numero;
    Cliente titular; // variavel igual ao nome da classe

    void deposita(double valor) // método
    {
        this.saldo = saldo + valor; // this é a palavra chave para se referir a conta que ele deu new
    }

     public boolean saca(double valor)
    {
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

    public double getSaldo()
    {
        return saldo;
    }



}


