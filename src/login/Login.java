/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SENAI
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       String teste = "arquivoteste";
       
       File arquivo = new File("C:\\Users\\thiago\\Documents\\" + teste+".txt");
       String[] linhas = new String[]{"Thiago"};
       try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){
           for(String linha: linhas){
               bw.write(linha);
               bw.newLine();
           }
       }
       catch( IOException e){
           e.printStackTrace();
       }
    }
    
}
