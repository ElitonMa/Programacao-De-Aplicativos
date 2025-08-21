package cadastroEventos;

import java.util.ArrayList;

public class GerenciadorEvento {
    // Cria uma lista de arrays com a classe Evento
    private ArrayList<Evento> lista = new ArrayList<>();

    // Metodo para adicionar eventos a lista
    public void adicionar(Evento e) {
        lista.add(e);
    }

    // Metodo para listar todos os eventos do ArrayList
    public void listar() {
        for (Evento e : lista) {
            System.out.println(e);
        }
    }
}
