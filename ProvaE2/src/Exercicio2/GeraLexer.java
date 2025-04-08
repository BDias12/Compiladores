/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author Pichau
 */
public class GeraLexer {
    
     public static void main(String[] args) throws IOException {
    String caminho = "C:/Users/Pichau/Documents/NetBeansProjects/ProvaE2/src/Exercicio2/lexico.flex";
    File arquivo = new File(caminho);

    jflex.Main.generate(arquivo);
  }
    
}
