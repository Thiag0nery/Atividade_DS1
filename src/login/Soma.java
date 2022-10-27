/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author thiago
 */
public class Soma {
    private double Number;
    private double Soma;
    private double Unitario;
    
    public double getNumber() {
        return Number;
    }

    public void Soma(double numero){
        this.Number += numero;
       
    }
    public String Soma(){
        return String.valueOf( Number );
    }
    
    public double Unitario(double numero, int Unitario){
        return this.Number = numero * Unitario;
    }
    public void ValorUnitario(double valor, int quantidade){
       this.Unitario = valor * quantidade;
    }
    public String ValorUnitario(){
        return String.valueOf(Unitario);
    }
    
    @Override
    public String toString() {
        return  String.valueOf(Number);
    }
     
    /*public double getNumber() {
        return Number;
    }
    
    public double Somando(double numero){
        return this.Number += numero;
    }
    public double Unitario(double numero, int Unitario){
        return this.Number = numero * Unitario;
    }
    public String Resultado(){
        return String.format("%.2f", this.resultado);
    }
    public void Resultado(double Recebido, double Subtotal){
       this.resultado =  Subtotal - Recebido;
    }

    @Override
    public String toString() {
        return  String.format("%.2f",this.Number);
    }
    */

    

    
}
