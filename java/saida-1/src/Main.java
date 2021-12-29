public class Main {

    public static String linha(int n, String c) {
        String saida = "";
        for(int i = 1; i <= n; i++) {
            saida += c;
        }
        return saida;
    }

    public static String coluna(int n, String c, String d) {
        String saida = "";
        for(int i = 1; i <= n; i++) {
            saida += (i == 1 || i == 39)? c: d;
        }
        return saida;
    }

    public static void main(String[] args) {
        String saida = "";
        saida += linha(39,"-") + "\n";
        saida += coluna(39,"|"," ") + "\n";
        saida += coluna(39,"|"," ") + "\n";
        saida += coluna(39,"|"," ") + "\n";
        saida += coluna(39,"|"," ") + "\n";
        saida += coluna(39,"|"," ") + "\n";
        saida += linha(39,"-") + "\n";
        System.out.print(saida);
    }
}
