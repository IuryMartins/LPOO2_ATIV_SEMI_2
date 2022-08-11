/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author iuryi
 */
public class Conta {

	
	int numero;
	Cliente titular;
        double  Saldo; 
        private int count = 1;
        private String tipo;	
	
	public Conta(Cliente titular, Double Saldo) {
		super();
		this.titular = titular;
                this.Saldo = Saldo;
                setNumero();
	}

    public Conta() {}

    public int getNumero() {
        return numero;
    }

    private void setNumero() {
        this.numero = count;
        count++;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }
    
    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return this.tipo;
    }

  
	
}

