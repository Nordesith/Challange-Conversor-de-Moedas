package br.com.alura.desafioconversordemoedas.moedas;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class RealBrasileiro {
    String montante = "";
    Scanner leitura = new Scanner(System.in);
    public void converterRealDolar (){
        System.out.println("Digite quanto quer converter: ");
        montante = leitura.nextLine();
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/4a4322e9085f94946a886d1d/pair/BRL/USD/" + montante);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(moeda)))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moeda moeda1 = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("O valor de " + montante + " dólares convertido para euro é de " + moeda1.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a moeda.");
        }
    }

    public void converterRealEuro (){
        System.out.println("Digite quanto quer converter: ");
        montante = leitura.nextLine();
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/4a4322e9085f94946a886d1d/pair/BRL/EUR/" + montante);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(moeda)))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moeda moeda1 = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("O valor de " + montante + " reais convertido para euros é de " + moeda1.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a moeda.");
        }
    }

    public void converterRealYen (){
        System.out.println("Digite quanto quer converter: ");
        montante = leitura.nextLine();
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/4a4322e9085f94946a886d1d/pair/BRL/JPY/" + montante);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(moeda)))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moeda moeda1 = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("O valor de " + montante + " reais convertido para yens é de " + moeda1.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a moeda.");
        }
    }
}
