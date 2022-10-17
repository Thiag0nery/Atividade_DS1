/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estoque;

import login.*;

/**
 *
 * @author ALUNO
 */
public class EstoqueClass {
    private int Unidade;
    private String nomeProduto;
    private double Preco;
    private int Codico;

    public void MetadoEstoque(int Unidade, String nomeProduto, double preco, int Codico) {
        this.Unidade = Unidade;
        this.nomeProduto = nomeProduto;
        this.Preco = preco;
        this.Codico = Codico;
    }

    public int getUnidade() {
        return Unidade;
    }

    public void setUnidade(int Unidade) {
        this.Unidade = Unidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public int getCodico() {
        return Codico;
    }

    public void setCodico(int Codico) {
        this.Codico = Codico;
    }
    
    public  Object[] Inserindo(){
        return new Object[]{
            this.Unidade,
            this.nomeProduto,
            this.Preco,
            this.Codico
        };
    }

    
    
}
