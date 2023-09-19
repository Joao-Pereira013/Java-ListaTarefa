package main.java.tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  private List<Tarefa> tarefaList;

  // Construtor da classe ListaTarefa
  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  // Método para adicionar tarefas na lista
  public void adicionarTarefa(String descricao){
    Tarefa tarefa = new Tarefa(descricao);
    tarefaList.add(tarefa);
  }

  // Método para retornar o tamanho da lista
  public int tamanhoLista(){
    return tarefaList.size();
  }

  // Método para remover tarefas da lista
  public void removerTarefa(String descricao){
    List<Tarefa> tarefasRemover = new ArrayList<>();
     if(!tarefaList.isEmpty()){
       for(Tarefa tarefa : tarefaList){
         if(tarefa.getDescricao().equals(descricao)){
           tarefasRemover.add(tarefa);
         }
       }
       tarefaList.removeAll(tarefasRemover);
     }else{
       System.out.println("Lista de tarefas vazia");
     }
  }

  public static void main(String [] args){
    ListaTarefa listaTarefa = new ListaTarefa();
    
    // Adicionando tarefas na lista
    listaTarefa.adicionarTarefa("Estudar Java");
    listaTarefa.adicionarTarefa("Estudar Spring");
    listaTarefa.adicionarTarefa("Estudar Spring Boot");
    listaTarefa.adicionarTarefa("Estudar Spring Data JPA");

    // Imprimindo a lista de tarefas
    System.out.println(
    "Quantidade de tarefas a fazer: " + listaTarefa.tamanhoLista() + " Tarefas" + 
    "\nLista de tarefas: " + listaTarefa.tarefaList + "\n");

    // Removendo tarefas da lista
    listaTarefa.removerTarefa("Estudar Spring Boot");

    // Imprimindo a lista de tarefas atualizada
    System.out.println(
    "Agora você tem que fazer: " + listaTarefa.tamanhoLista() + " Tarefas" +
    "\nLista de tarefas: " + listaTarefa.tarefaList);


  }

}

