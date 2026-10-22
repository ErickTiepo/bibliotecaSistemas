/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Professor extends Usuario {
    
    private String departamento;

    public Professor(String departamento, String nome, String matricula) {
        super(nome, matricula);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
        @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Departamento: "+ departamento);
    }

    
}
