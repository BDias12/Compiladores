/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Pichau
 */
public class Main_TesteAnalisador {
    
    public static void main(String[] args) throws FileNotFoundException {
    String arquivo = "C:\\Users\\Pichau\\Documents\\NetBeansProjects\\ProvaE2\\src\\Exercicio2\\codigofonte.txt";
    BufferedReader texto = new BufferedReader(new FileReader(arquivo));

    Lexer lexico = new Lexer(texto);

    AnalisadorSintatico sintatico = new AnalisadorSintatico(lexico);

    try {
      sintatico.parse();
      System.out.println("Sucesso na análise sintática");
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Falha geral.");
    }
  }
    
}


