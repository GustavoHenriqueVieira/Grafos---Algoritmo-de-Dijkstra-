import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class BuscaLargura {
    private Grafo g;
    private Cor[] cores;
    private int[] distancia;
    private int[] pai;
    private int total;

    public BuscaLargura(Grafo g) {
        this.g = g;
        this.cores = new Cor[g.getNumeroVertices()];
        this.distancia = new int[g.getNumeroVertices()];
        this.pai = new int[g.getNumeroVertices()];
        this.total = 0;
    }

    public void inicializar() {
        for(int i = 0; i < this.g.getNumeroVertices(); ++i) {
            this.cores[i] = Cor.BRANCO;
            this.distancia[i] = -1;
            this.pai[i] = -1;
            this.total = 0;
        }

    }

    public void execute(String s) {
        System.out.println("Começando no aeroporto: "+s);
        int indS = this.g.getIndiceVertice(s);
        this.inicializar();
        PriorityQueue<Integer> fila = new PriorityQueue();
        this.cores[indS] = Cor.CINZA;
        this.distancia[indS] = 0;
        fila.add(indS);
        this.total = 0;
        while(fila.size() > 0) {
            int v = (Integer)fila.poll();
            List<Integer> adjacenciaV = this.g.listarAdjacencias(v);
            Iterator var7 = adjacenciaV.iterator();
            System.out.println(this.g.getDistancia(indS,v));
            this.total = this.total + this.g.getDistancia(indS,v);
            while(var7.hasNext()) {
                int u = (Integer)var7.next();
                if (this.cores[u] == Cor.BRANCO) {
                    this.pai[u] = v;
                    this.distancia[u] = this.distancia[v] + 1;
                    this.total = this.total + this.g.getDistancia(indS,v);
                    this.cores[u] = Cor.CINZA;

                    fila.add(u);
                }
            }
        }

    }

    public void imprimir() {
        System.out.println("Cores");
        Cor[] var4;
        int var3 = (var4 = this.cores).length;

        int var2;
        for(var2 = 0; var2 < var3; ++var2) {
            Cor c = var4[var2];
            System.out.print(c + " ");
        }

        System.out.println("\nPai");
        int[] var6;
        var3 = (var6 = this.pai).length;

        int d;
        for(var2 = 0; var2 < var3; ++var2) {
            d = var6[var2];
            System.out.print(d + " ");
        }

        System.out.println("\nDistancia de arestas");
        var3 = (var6 = this.distancia).length;

        for(var2 = 0; var2 < var3; ++var2) {
            d = var6[var2];
            System.out.print(d + " ");
        }
        System.out.println("\nMenor Distancia em kilometros");
        System.out.println(this.total);
        System.out.println("");
    }
}