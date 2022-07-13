package aula1;

public class AvaliaAluno {
    public static void main(String[] args) {
        String aluno="Lucas";
        double nota1=8.6;
        double nota2=5.2;
        double nota3=7.1;
        double media=0;
        double fator1=0.6;
        double fator2=0.2;
        boolean skl=false;
        
        if (skl == true) {
            media=(nota1*fator1)+(nota2+fator2)+(nota3+fator2) /3;
            System.out.println("Nome do Aluno: " + aluno + " e sua media foi: " + media);
            if(media>=7){
                System.out.println("Está aprovado.");
            } else{
                System.out.println("Está reprovado.");
            }
        }else{
            media=(nota1*fator2)+(nota2+fator2)+(nota3+fator1) /3;
            System.out.println("Nome do Aluno: " + aluno + " e sua media foi: " + media);
            if(media>=7){
                System.out.println("Está aprovado!");
            } else{
                System.out.println("Está reprovado!");
            }
        }
    }
}