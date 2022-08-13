/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author iuryi
 */
public class ContaCorrente extends Conta {

    public ContaCorrente( Cliente titular, double saldo,int count) {
        super(titular, saldo ,count);
        cadastrarTipo();
        //TODO Auto-generated constructor stub
    }
    
    private void cadastrarTipo(){
        super.setTipo("cc");
    }

}
