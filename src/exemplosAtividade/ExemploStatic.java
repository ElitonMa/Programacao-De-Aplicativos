package exemplosAtividade;

public class ExemploStatic {
    static int contador;
    {
        // Fará com que cada vez que a classe sejá chamada o contador irá incrementar
        contador++;
    }
}
