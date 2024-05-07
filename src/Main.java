import br.com.alura.desafioconversordemoedas.moedas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        RealBrasileiro realBrasileiro = new RealBrasileiro();
        YenJapones yenJapones = new YenJapones();
        String menuOpcoes = """
                *******************************************
                
                Seja bem vindo/a ao Conversor de Moedas :)
                
                Escolha uma das opções:
                
                1) Dólar para Real Brasileiro
                2) Dólar para Euro
                3) Dólar para Yen Japonês
                4) Real Brasileiro para Dólar
                5) Real Brasileiro para Euro
                6) Real Brasileiro para Yen Japonês
                7) Euro para Dólar
                8) Euro para Real Brasileiro
                9) Euro para Yen Japonês
                10) Yen Japonês para Dólar
                11) Yen Japonês para Euro
                12) Yen Japonês para Real Brasileiro
                13) sair
                
                *******************************************
                """;


        while (opcao != 13) {
            System.out.println(menuOpcoes);
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    dolar.converterDolarReal();
                    break;
                case 2:
                    dolar.converterDolarEuro();
                    break;
                case 3:
                    dolar.converterDolarYen();
                    break;
                case 4:
                    realBrasileiro.converterRealDolar();
                    break;
                case 5:
                    realBrasileiro.converterRealEuro();
                    break;
                case 6:
                    realBrasileiro.converterRealYen();
                    break;
                case 7:
                    euro.converterEuroDolar();
                    break;
                case 8:
                    euro.converterEuroReal();
                    break;
                case 9:
                    euro.converterEuroYen();
                    break;
                case 10:
                    yenJapones.converterYenDolar();
                    break;
                case 11:
                    yenJapones.converterYenEuro();
                    break;
                case 12:
                    yenJapones.converterYenReal();
                    break;
                case 13:
                    break;
                default:
                    System.out.println("Opção inválida, escolha novamente");
                    break;
            }
        }
        System.out.println("Programa encerrado!");
    }
}