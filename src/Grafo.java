
import java.util.List;

public interface Grafo {
    void adicionarVertice(String var1);

    int getIndiceVertice(String var1);

    void adicionarAresta(String var1, String var2,int var3);

    void adicionarAresta(int var1, int var2, int var3);

    void imprimirMapa();

    List<Integer> listarAdjacencias(int var1);

    void imprimir();

    void imprimirDistancia();

    int getNumeroVertices();

    int getDistancia(int var1,int var2);

}

