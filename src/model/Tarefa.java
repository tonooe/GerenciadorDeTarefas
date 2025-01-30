package model;

public class Tarefa {
    private static int contadorId= 1; // é um contador geral pra gerar ids únicos
    private int id; //id único de cada tarefa
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) { // o parâmetro serve apenas pra receber valores, ou seja, não faz sentido o concluída e contador receber valores ao criar o objeto, por isso só temos a descricao
        this.id = contadorId++;
        this.descricao = descricao; // só tem ela no parâmetro pois é o que vamos passar ao criar um objeto, vamos passar apenas a descricao da tarefa, já que automaticamente a tarefa se iniciará como não concluída
        this.concluida = false; // começa como ''não concluida'' pois se não, ao criar um objeto, teríamos q passar dois parametros, a descricao e se a tarefa foi concluida ou não (''fazer exercicios'', false), assim, já deixando como concluida = false, a tarefa começa como nao concluida automaticamente
    }

    // retorna o id da tarefa, n tem set pq n tem o pq redefinir o valor do id
    public int getId() {
        return id;
    }

    // retorna a descrição da tarefa/ retorna/mostra a descrição
    public String getDescricao() {
        return descricao;
    }

    // define uma nova descrição para a tarefa
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // retorna se a tarefa já foi concluida (true/false)
    public boolean isConcluida() {
        return concluida;
    }

    // marca a tarefa como concluída
    public void marcarComoConcluida() {
        this.concluida = true;
    }
    public void removerConclusao() {
        this.concluida = false;  // Marca a tarefa como não concluída
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + (concluida ? "[✔] " : "[ ] ") + descricao;
    }

}
