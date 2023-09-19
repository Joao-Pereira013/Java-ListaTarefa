package main.java.tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributos
    private List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Adiciona uma nova tarefa à lista
    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefaList.add(tarefa);
    }

    // Remove tarefas com uma descrição específica da lista
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefasRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }

    // Retorna o tamanho atual da lista de tarefas
    public int tamanhoLista() {
        return tarefaList.size();
    }

    // Exibe a lista de tarefas atual
    public void mostrarListaTarefas() {
        System.out.println("Lista de Tarefas:");
        for (Tarefa tarefa : tarefaList) {
            System.out.println("- " + tarefa.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        // Adiciona tarefas à lista
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Estudar Spring");
        listaTarefa.adicionarTarefa("Estudar Spring Boot");
        listaTarefa.adicionarTarefa("Estudar Spring Data JPA");
        
        // Exibe a quantidade de tarefas na lista
        System.out.println("Quantidade de tarefas a fazer: " + listaTarefa.tamanhoLista() + " Tarefas\n");
        
        // Exibe a lista de tarefas
        listaTarefa.mostrarListaTarefas();
        
        // Remove uma tarefa da lista
        listaTarefa.removerTarefa("Estudar Spring Boot");
        
        // Exibe a quantidade de tarefas na lista
        System.out.println("\nAgora você tem que fazer: " + listaTarefa.tamanhoLista() + " Tarefas\n");
        
        // Exibe a lista de tarefas
        listaTarefa.mostrarListaTarefas();
    }
}
