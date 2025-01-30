package service;

import model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private List<Tarefa> tarefas; // lista de tarefas

    // construtor, vai inicializar a lista de tarefas
    public TarefaService() {
        this.tarefas = new ArrayList<>();
    }

    // metodo para adicionar uma nova tarefa à lista
    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    // metodo para listar todas as tarefas
    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println("ID: " + tarefa.getId() + "\nDescricao: " + tarefa.getDescricao());
            }
        }
    }

    public void concluirTarefa(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.marcarComoConcluida();
                System.out.println("Tarefa concluída! (ID: " + id + ")");
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }
    public void excluirTarefa(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefas.remove(tarefa);
                System.out.println("Tarefa removida com sucesso!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");

    }

}
