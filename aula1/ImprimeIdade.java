package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 28;
        String nome = "Lucas Motta";
        double altura = 1.93;
        double peso = 92.690;

        double imc = (peso) / (altura * altura);
        System.out.println("Olá, " + nome);

        if (idade >= 28) {
            if (imc < 18) {
                System.out.println("Você tem " + idade + " anos e seu imc é de " + imc
                        + " Cuidado! Você corre risco de subnutrição.");
            } else if (imc <= 25) {
                System.out.println(
                        "Você tem " + idade + " anos e seu imc é de " + imc + " Parabéns! Você está no peso ideal!");
            } else if (imc <= 30) {
                System.out.println("Você tem " + idade + " anos e seu imc é de " + imc
                        + " Atenção! Você está fora do peso ideal!");
            } else {
                System.out.println("Você tem " + idade + " anos e seu imc é de " + imc
                        + " Cuidado! Você corre risco de obesidade.");
            }
        } else {
        }
        if (imc <= 18) {
            System.out.println("Procure um médico para avaliação de subnutrição.");
        } else if (imc <= 25) {
            System.out.println("Seu índice está controlado e saudável procure um nutricionista.");
        } else if (imc <= 30) {
            System.out.println("Parabéns consulte um médico para medição muscular.");
        } else if (imc <= 40) {
            System.out.println("Pré obesidade precisará de acompanhamento nutricional.");
        } else {
            System.out.println("Procure um médico endocrinologista com urgência.");
        }
    }
}
