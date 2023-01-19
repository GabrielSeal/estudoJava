package bytebankHerdado;
// gerente herda da classe funcionario é uma extensão do funcionario

public class Gerente extends Funcionario {

    private int senha;

    public boolean autentica(int senha)
    {   
        if (this.senha == senha)
        {
            return true;
        } else
        {
            return false;
        }
        
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

   public double getBonificacao()
   {
        return super.getBonificacao() + super.getSalario();
        // super pode puxar um metodo da classe mae, vai herdar do mesmo jeito
        // mostra que salario veio da classe mae
   }
}

