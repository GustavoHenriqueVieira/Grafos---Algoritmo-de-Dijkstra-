import java.util.*;

public class Dijkstra {
    private Grafo g;
    private int[] distancia;


    private boolean[] marca;
    public Dijkstra(Grafo g){
        this.g = g;
        this.marca = new boolean[g.getNumeroVertices()];
        this.distancia = new int[g.getNumeroVertices()];

    }

    public void inicializar(){
        for(int i = 0; i < this.g.getNumeroVertices(); ++i) {
            this.marca[i] = false;
            this.distancia[i] = 99999;

        }

    }
    public void executar(String s,String d) {
        System.out.println("Começando no aeroporto: " + s);
        System.out.println("Destino: " + d);
        int indS = this.g.getIndiceVertice(s);
        int indD = this.g.getIndiceVertice(d);
        this.inicializar();
        PriorityQueue<Integer> fila = new PriorityQueue();
        this.distancia[indS] = 0;
        fila.add(indS);
        while(fila.size() > 0) {
            int v = (Integer) fila.poll();
            if(!this.marca[v]){
                this.marca[v] = true;
                List<Integer> adjacenciaV = this.g.listarAdjacencias(v);
                Iterator var7 = adjacenciaV.iterator();
                while (var7.hasNext()) {
                    int u = (Integer) var7.next();
                    int dista = this.g.getDistancia(v, u);
                    if (this.distancia[u] > this.distancia[v] + dista) {
                        this.distancia[u] = this.distancia[v] + dista;
                        fila.add(u);
                    }
                }
            }
        }
        System.out.println("Distancia: "+this.distancia[indD]+"km");
    }
    public void imprimir(){
    }
}