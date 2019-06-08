public class Program {
    public void init () {
        System.out.println("Hello");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Regis");
        pessoa.setIdade(40);
        pessoa.setPeso(90);
        pessoa.setFilhos(true);

        System.out.println(pessoa.getNome());

        int res = soma(20, 2);
        System.out.println(res);

        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(3000.14F);

        System.out.println(funcionario.getTipoSalario());

        Pessoa pessoa2 = new Pessoa("Regis", 40, 89, true);

        System.out.println("O peso é " + pessoa2.getPeso());
        System.out.println(pessoa2);
    }

    private int soma (int a, int b) {
        return a + b;
    }
}