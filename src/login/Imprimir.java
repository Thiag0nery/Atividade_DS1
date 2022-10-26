/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author thiago
 */
public class Imprimir {
    public String teste(String Ariquivo){
       LoginPri a = new LoginPri();
       String funcionario = a.txtLogin.getText();
       
       File arquivo = new File("C:\\Salvos\\" + Ariquivo +".txt");
       String[] linhas = new String[]{"Funcionario:" + funcionario,};
       try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){
           for(String linha: linhas){
               bw.write(linha);
               bw.newLine();
           }
       }
       catch( IOException e){
           e.printStackTrace();
       }
       return Ariquivo;
    }
}
