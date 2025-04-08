/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;
import java.io.*;

/**
 *
 * @author Pichau
 */
public class TesteAnalisador {
    
    public static void main(String[] args) throws IOException{
        String arquivo = "C:/Users/Pichau/Desktop/codigo1.txt/";
        
        BufferedReader texto = new BufferedReader(new FileReader(arquivo));
        
        Lexer analise = new Lexer(texto);
        
        while(true){
            
           Token objetotoken = analise.yylex();
           if(objetotoken == null)
               break;
          
        }
        
        
    }
    
}
