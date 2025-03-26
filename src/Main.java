public class Main {
    public static void main(String[] args){
        Funcionarios[] funcionario = {
                new Funcionarios("Ana", 3000.0,170),
                new Funcionarios("Carlos", 2800.0, 160),
                new Funcionarios("Marina", 3500.0,180),
                new Funcionarios("Joao", 2500.0, 155),
        };

        System.out.println("\nRelatorio de Funcionarios :");
        for (Funcionarios funcionarios : funcionario) {
            funcionarios.exibirDados();
        }
    }
}