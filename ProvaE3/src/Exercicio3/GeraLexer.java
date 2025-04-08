/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;
import java.io.*;
/**
 *
 * @author Pichau
 */
public class GeraLexer {
    
    public static void main(String[] args) throws IOException{
            
        String CaminhoArquivo = "C:/Users/Pichau/Documents/NetBeansProjects/ProvaE3/src/Exercicio3/lexico.flex";
        File arquivo = new File(CaminhoArquivo);
        
        jflex.Main.generate(arquivo);
    }
    
}
