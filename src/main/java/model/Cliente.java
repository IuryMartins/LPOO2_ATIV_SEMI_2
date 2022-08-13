/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author iuryi
 */
public class Cliente {
	
	String nome;
	String CPF;
        String dataNascimento;
        String Sexo;
        String Endereco;
        ArrayList<Conta> Contas;        

    public Cliente(String nome, String CPF, String dataNascimento, String Sexo, String Endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.Sexo = Sexo;
        this.Endereco = Endereco;
        this.Contas = new ArrayList<Conta>();
    }

    public Cliente() {
    this.Contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public ArrayList<Conta> getContas() { ///alterei de private pra public
        return Contas;
    }
    
    public void adicionarConta(Conta cb){
        getContas().add(cb);
    }
    
    public ArrayList<Conta> listarContasCliente(){
        ArrayList<Conta> aux =  getContas();
        return aux;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento + ", Sexo=" + Sexo + ", Endereco=" + Endereco + ", Contas=" + Contas + '}';
    }
	

}
