package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 28;
        String nome = "Lucas Motta";
        double altura = 1.93;
        double peso = 97.690;

        double imc = (peso) / (altura * altura);
        System.out.println("Olá " + nome);
        
        if(idade >= 18) {
            if(imc < 22) {
                System.out.println("Você tem " +idade+ " anos e seu imc é de " +imc+ " Cuidado! Você corre risco de subnutrição.");
            } else if(imc <= 30) {
                System.out.println("Você tem " +idade+ " anos e seu imc é de " +imc+ " Parabéns! Você está no peso ideal!");
            } else if(imc <= 35){
                System.out.println("Você tem " +idade+ " anos e seu imc é de " +imc+ " Atenção! Você está fora do peso ideal!");
            } else {
                System.out.println("Você tem " +idade+ " anos e seu imc é de " +imc+ " Cuidado! Você corre risco de obesidade");
            }       
        
        }else {
            System.out.println("Novo demais para medição");
        }
        
    }
}