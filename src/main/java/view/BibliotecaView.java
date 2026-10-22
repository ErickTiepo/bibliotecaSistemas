/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Livro;
import model.Usuario;

/**
 *
 * @author Usuario
 */
public class BibliotecaView {

    public void exibiTitulo(String titulo) {
        System.out.println("\n===" + titulo + "===");
    }

    public void exibirUsuario(Usuario usuario) {
        usuario.exibirDados();
    }

    public void exibirLivro(Livro livro) {
        System.out.println("-" + livro);
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirErro(String mensagem) {
        System.out.println("[Erro]" + mensagem);
    }

}
