package bytebankHerdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionario nico = new Funcionario();
        nico.setNome("Nico");
        nico.setCpf("123.456.789-10");
        nico.setSalario(2000);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());




    }
}
