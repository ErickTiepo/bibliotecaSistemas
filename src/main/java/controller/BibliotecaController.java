package controller;

import model.Biblioteca;
import model.Livro;
import model.Usuario;
import model.Aluno;
import model.Professor;
import view.BibliotecaView;

/**
 *
 * @author Usuario
 */
public class BibliotecaController {
    private final Biblioteca biblioteca;
    private final BibliotecaView view;

    public BibliotecaController(Biblioteca biblioteca, BibliotecaView view) {
        this.biblioteca = biblioteca;
        this.view = view;
    }
 
    public void cadastrarLivro(String titulo, String autor, int ano){
        // Passando 'true' no fim porque o construtor de Livro exige o boolean disponivel
        Livro livro = new Livro(titulo, autor, ano, true);
        biblioteca.adicionarLivro(livro);
        view.exibirMensagem("Livro cadastrado: " + livro);
    }

    public void cadastrarProfessor(String nome, String matricula, String departamento){
        // Invertida a ordem: suas classes model pedem departamento/curso antes de nome e matricula
        Professor professor = new Professor(departamento, nome, matricula);
        biblioteca.adicionarUsuario(professor);
        view.exibirMensagem("Professor cadastrado: " + nome);
    }

    public void cadastrarAluno(String nome, String matricula, String curso){
        // Invertida a ordem para bater com o construtor de Aluno: (curso, nome, matricula)
        Aluno aluno = new Aluno(curso, nome, matricula);
        biblioteca.adicionarUsuario(aluno);
        view.exibirMensagem("Aluno cadastrado: " + nome);
    }

    public void listarAcervo(){
        // Usando 'exibiTitulo' exatamente como foi escrito na sua BibliotecaView
        view.exibiTitulo("Acervo da biblioteca");
        for(Livro l : biblioteca.getAcervo()){
            view.exibirLivro(l);
        }
    }

    public void listarUsuarios(){
        view.exibiTitulo("Usuarios cadastrados");
        for(Usuario u : biblioteca.getUsuarios()){
            view.exibirUsuario(u);
        }
    }
    
    public void buscarLivro(String titulo) {
        // Usando o método 'buscarPorTitulo' da sua classe Biblioteca
        Livro livro = biblioteca.buscarPorTitulo(titulo);
        if (livro != null) {
            view.exibirMensagem("\nLivro encontrado:");
            view.exibirLivro(livro);
        } else {
            view.exibirMensagem("\nLivro não encontrado: " + titulo);
        }
    }
}
