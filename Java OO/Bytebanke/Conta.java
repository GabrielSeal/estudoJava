package Bytebanke;

 public class Conta {
    private double saldo;  // sao atributos
    private int agencia;
    private int numero;
    private Cliente titular; // variavel igual ao nome da classe
    private static int total; // agora total é uma instancia da classe, ou seja de todos
    public Conta(int agencia, int numero) // isso é um construtor, quando não é criado o sistema faz para voce
    {

        total++;
        System.out.println("o total de contas é :" + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);
       // this.saldo = 100; // inicia com o saldo
        // só roda uma vez, a cada new
    }

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

    public int getNumero()
    {
        return this.numero;
    }

    public void setNumero(int novoNumero)
    {
        if (numero <= 0)
        {
            System.out.println("o numero da conta não pode ser negativo");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia()
    {
        return this.agencia;
    }

    public void setAgencia(int agencia) 
    {
        if (agencia <= 0)
        {
            System.out.println("o numero da agencia não pode valor negativo");
            return;
        }
        this.agencia = agencia;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }
}


