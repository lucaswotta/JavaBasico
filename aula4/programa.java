package aula4;

public class programa {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Toyota";
        van.modelo = "Hiace";
        van.capCombustivel = 76;
        van.numPassageiro = 10;
        van.consCombustivel = 20.2;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.capCombustivel = 42;
        fusca.numPassageiro = 4;
        fusca.consCombustivel = 8.6;

        System.out.println("--- Impressao do Objeto [Fisico] ---");
        System.out.println(van);
        System.out.println("Modelo: " + van.modelo + " | Autonomia: " + van.calculaAutonomia());
        System.out.println("Eco taxa: " + van.verificarEcoDesempenho());
        if (van.validaEcoDesempenho(105) == true) {
            System.out.println("Eco eficiente.");
        } else {
            System.out.println("Nao e Eco Eficiente.");
        }
    }
}
