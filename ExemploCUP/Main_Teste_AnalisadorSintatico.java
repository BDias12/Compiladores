/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploCUP;

import java.io.*;


/**
 *
 * @author Pichau
 */
public class Main_Teste_AnalisadorSintatico {
    public static void main(String[] args) throws FileNotFoundException{
        
        String arquivo = "C:\\Arquivo\\codigofonte.txt";
        
        System.out.println("Arquivo analisado: " + arquivo);
        
        BufferedReader texto = new BufferedReader(new FileReader(arquivo));
        Lexer AnaliseLexica = new Lexer(texto);
        
        ParserSintatico p = new ParserSintatico(AnaliseLexica);
        
        try{
            p.parse();
        }
        catch(Exception e){
            System.out.println("Falha geral.");
        }
        
    }
    
}
