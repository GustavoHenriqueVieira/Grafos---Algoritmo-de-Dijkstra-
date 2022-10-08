import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Grafo g = new GrafoMatricial(32);

        g.adicionarVertice("GRU"); //0
        g.adicionarVertice("BSB"); //1
        g.adicionarVertice("SDU"); //2
        g.adicionarVertice("REC"); //3
        g.adicionarVertice("POA"); //4
        g.adicionarVertice("VCP"); //5
        g.adicionarVertice("CGB"); //6
        g.adicionarVertice("RBR"); //7
        g.adicionarVertice("MCP"); //8
        g.adicionarVertice("CGH"); //9
        g.adicionarVertice("CNF"); //10
        g.adicionarVertice("SSA"); //11
        g.adicionarVertice("FOR"); //12
        g.adicionarVertice("CWB"); //13
        g.adicionarVertice("FLN"); //14
        g.adicionarVertice("BEL"); //15
        g.adicionarVertice("VIX"); //16
        g.adicionarVertice("GYN"); //17
        g.adicionarVertice("IGU"); //18
        g.adicionarVertice("GIG"); //19
        g.adicionarVertice("CGR"); //20
        g.adicionarVertice("MCZ"); //21
        g.adicionarVertice("JPA"); //22
        g.adicionarVertice("UDI"); //23
        g.adicionarVertice("AJU"); //24
        g.adicionarVertice("NAT"); //25
        g.adicionarVertice("JDO"); //26
        g.adicionarVertice("STM"); //27
        g.adicionarVertice("SJK"); //28
        g.adicionarVertice("MAB"); //29
        g.adicionarVertice("SBJR"); //30
        g.adicionarVertice("CKS"); //31
        g.adicionarAresta("GRU","BSB",863); //1
        g.adicionarAresta("SDU","GRU",347); //2
        g.adicionarAresta("REC","BSB",1672); //3
        g.adicionarAresta("REC","SDU",1887); //4
        g.adicionarAresta("GRU", "REC", 2126); //5
        g.adicionarAresta("VCP","POA",834); //6
        g.adicionarAresta("BSB", "POA", 1620); //7
        g.adicionarAresta("CGB", "VCP", 1258);//8
        g.adicionarAresta("REC", "CGB", 2487); //9
        g.adicionarAresta("RBR", "REC", 3660); //10
        g.adicionarAresta("RBR","SDU", 3036); //11
        g.adicionarAresta("CGB","RBR", 1440); //12
        g.adicionarAresta("MCP","BSB", 1820);// 13
        g.adicionarAresta("MCP","REC", 2023); //14
        g.adicionarAresta("MCP", "RBR", 2180);//15
        g.adicionarAresta("POA", "CGB", 1687);//16
        g.adicionarAresta("CGH","CNF",526); //17
        g.adicionarAresta("CNF","VIX",393); //18
        g.adicionarAresta("CGH","POA",840); //19
        g.adicionarAresta("IGU","BSB",1295); //20
        g.adicionarAresta("GYN","CGB",741); //21
        g.adicionarAresta("GYN", "REC", 1825); //22
        g.adicionarAresta("VCP","CNF",500); //23
        g.adicionarAresta("BSB","CWB",680); //24
        g.adicionarAresta("GIG","SDU",338); //25
        g.adicionarAresta("GIG","REC",1896); //26
        g.adicionarAresta("GIG","MCP",2682); //27
        g.adicionarAresta("CGR","SSA",1961); //28
        g.adicionarAresta("CGR","FLN",1022); //29
        g.adicionarAresta("MCZ","FLN",2452); //30
        g.adicionarAresta("MCZ","UDI",1708); //31
        g.adicionarAresta("JPA","VIX",1488); //32
        g.adicionarAresta("UDI","BEL",1957); //33
        g.adicionarAresta("NAT","BEL",1538); //34
        g.adicionarAresta("JDO","STM",1819); //35
        g.adicionarAresta("GRU","STM",2527); //36
        g.adicionarAresta("STM","SSA",2173); //37
        g.adicionarAresta("SJK","BSB",854); //38
        g.adicionarAresta("BSB","MAB",1202); //39
        g.adicionarAresta("NAT","JDO",465); //40
        g.adicionarAresta("REC","MAB",1613); //41
        g.adicionarAresta("SBJR","MAB",2063); //42
        g.adicionarAresta("CGR","SBJR",1201); //43
        g.adicionarAresta("CKS","CGR",1683); //44
        g.adicionarAresta("SSA","CKS",1498); //45
        g.adicionarAresta("REC","SSA",651); //46

        g.imprimirDistancia();
        //g.imprimirMapa();
        Dijkstra d = new Dijkstra(g);

        //Dijkstra d = new Dijkstra(g);

        String partida,destino,opt;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        opt = "N";
        while(opt.equals("N")) {
            g.imprimirMapa();
            System.out.println("Digite o aeroporto de partida:");
            partida = sc.next();
            System.out.println("Digite o aeroporto de destino:");
            destino = sc.next();
            d.inicializar();
            d.executar(partida, destino);
            d.imprimir();

            g.imprimirMapa();
            System.out.println("Sair ? S/N");
            opt = sc1.next();
            System.out.println("");

        }
    }
}