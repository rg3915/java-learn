public class Funcionario extends Pessoa {
    private float salario;
    private String tipoSalario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;

        if (salario <= 1000) {
            this.tipoSalario = "baixo";
        } else if (salario <= 3000) {
            this.tipoSalario = "medio";
        } else {
            this.tipoSalario = "alto";
        }
    }

    public String getTipoSalario() {
        return tipoSalario;
    }

}