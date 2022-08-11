/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.ja a to edit this template
 */
package model;

/**
 *
 * @author iuryi
 */
public class ContaPoupanca extends Conta {

    
    public ContaPoupanca(Cliente titular, double saldo) {
        super(titular, saldo);
        //TODO Auto-generated constructor stub
    }
    
    private void cadastrarTipo(){
       super.setTipo("cp");
    }

}
