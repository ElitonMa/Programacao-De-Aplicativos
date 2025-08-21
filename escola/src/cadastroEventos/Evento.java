package cadastroEventos;

public class Evento {
    private String nome;
    private String data;
    private String local;

    public Evento(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public String getNome() {
        return this.nome;
    }
    public String getData() {
        return this.data;
    }
    public String getLocal() {
        return this.local;
    }

    @Override
    public String toString () {
        return nome + " | " + data + " | " + local;
    }

}
