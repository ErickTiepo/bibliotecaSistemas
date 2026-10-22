/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Usuario
 */
import controller.BibliotecaController;
import model.Biblioteca;


public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        BibliotecaView view = new BibliotecaView();
        BibliotecaController controller = new BibliotecaController(biblioteca, view);

        controller.cadastrarAluno("Maria Silva", "2024001", "Sistemas de Informação");
        controller.cadastrarProfessor("João Motta", "P0001", "Computação");

        controller.cadastrarLivro("Clean Code", "Robert C. Martin", 2008);
        controller.cadastrarLivro("Dom Casmurro", "Machado de Assis", 1899);
        controller.cadastrarLivro("Use a Cabeça! Padrões de Projeto", "Freeman & Robson", 2009);

        controller.listarUsuarios();
        controller.listarAcervo();

        controller.buscarLivro("Dom Casmurro");
        controller.buscarLivro("Livro Inexistente");
    }
}