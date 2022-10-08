import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GrafoMatricial implements Grafo {
    private boolean[][] matriz;
    private List<String> mapa;
    private int numeroVertices;
    private int[][] distancia;

    public GrafoMatricial(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        this.mapa = new ArrayList(numeroVertices);
        this.matriz = new boolean[numeroVertices][numeroVertices];
        this.distancia =  new int[numeroVertices][numeroVertices];

        for(int i = 0; i < numeroVertices; ++i) {
            this.matriz[i][i] = true;
            this.distancia[i][i]= 0;
        }

    }

    public void adicionarVertice(String v) {
        this.mapa.add(v);
    }

    public int getIndiceVertice(String v) {
        return this.mapa.indexOf(v);
    }

    public void adicionarAresta(String v1, String v2, int v3) {
        this.adicionarAresta(this.getIndiceVertice(v1), this.getIndiceVertice(v2),v3);
    }

    public void adicionarAresta(int v1, int v2,int v3) {
        this.matriz[v1][v2] = true;
        this.matriz[v2][v1] = true;
        this.distancia[v1][v2] = v3;
        this.distancia[v2][v1] = v3;
    }

    public void imprimirMapa() {
        Iterator var2 = this.mapa.iterator();

        while(var2.hasNext()) {
            String v = (String)var2.next();
            System.out.print(this.getIndiceVertice(v) + "-" + v+ " || ");
        }
        System.out.println("");
    }

    public List<Integer> listarAdjacencias(int v) {
        List<Integer> adjacentes = new ArrayList(this.numeroVertices);

        for(int j = 0; j < this.numeroVertices; ++j) {
            if (this.matriz[v][j] && v != j) {
                adjacentes.add(j);
            }
        }

        return adjacentes;
    }
    public void imprimirDistancia(){
        for(int i = 0; i < this.numeroVertices; ++i) {

            for(int j = 0; j < this.numeroVertices; ++j) {
                System.out.print(this.distancia[i][j] +"\t");

            }

            System.out.println("");
        }

        System.out.println("");
    }

    public void imprimir() {
        for(int i = 0; i < this.numeroVertices; ++i) {

            for(int j = 0; j < this.numeroVertices; ++j) {
                System.out.print(this.matriz[i][j] +"\t");

            }

            System.out.println("");
        }

        System.out.println("");
    }

    public boolean[][] getMatriz() {
        return this.matriz;
    }

    public void setMatriz(boolean[][] matriz) {
        this.matriz = matriz;
    }

    public List<String> getMapa() {
        return this.mapa;
    }

    public void setMapa(List<String> mapa) {
        this.mapa = mapa;
    }

    public int getNumeroVertices() {
        return this.numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }


    public int getDistancia(int v1,int v2) {
        return distancia[v1][v2];
    }

    public void setDistancia(int[][] distancia) {
        this.distancia = distancia;
    }
}