public class Funcionarios {
    private String nome;
    private double salarioBase;
    private int horasTrabalhadas;

    public Funcionarios(String nome, double salarioBase, int horasTrabalhadas){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalarioFinal() {
        int horasNormais = 160;
        double valorHoras = salarioBase / horasNormais;
        if(horasTrabalhadas > horasNormais) {
            int horasExtras =  horasTrabalhadas - horasNormais;
            return salarioBase + (horasExtras * valorHoras * 1.5);
        }
        return salarioBase;
    }

    public void exibirDados() {
        System.out.printf("Funcionario: %s\n", nome);
        System.out.printf("Salario Base: R$%.2f\n", salarioBase);
        System.out.printf("Horas Trabalhadas: %d\n", horasTrabalhadas);
        System.out.printf("Salario Final: R$%.2f\n", calcularSalarioFinal());
        System.out.println("------------------------------------");
    }
}