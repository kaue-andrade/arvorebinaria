class NoArvore { // Cria uma classe NoArvore

    // Cria as variáveis info, esquerda e direita

    char info;
    NoArvore esquerda;
    NoArvore direita;

    // Método construtor

    public NoArvore(char ch) {
        this.info = ch;
        this.esquerda = null;
        this.direita = null;
    }
}

public class ArvoreBinaria {
    public static void main(String[] args) {

        // Cria os respectivos nós

        NoArvore raiz = criaNo('A');
        raiz.esquerda = criaNo('B');
        raiz.direita = criaNo('C');
        raiz.direita.esquerda = criaNo('D');
        raiz.direita.direita = criaNo('E');
        imprime(raiz, 0);
    }

    // Criação do método "imprime" para mostrar informações

    public static void imprime(NoArvore nodo, int tabulacao) {
        for (int i = 0; i < tabulacao; i++) {
            System.out.print("-");
        }
        if (nodo != null) {
            System.out.println(nodo.info);
            imprime(nodo.esquerda, tabulacao + 2);
            System.out.println();
            imprime(nodo.direita, tabulacao + 2);
        } else {
            System.out.println("vazio");
        }
    }

    // Função criaNo retorna um novo nó (NoArvore)

    public static NoArvore criaNo(char ch) {
        NoArvore novo = new NoArvore(ch);
        novo.esquerda = null;
        novo.direita = null;
        return novo;
    }
}
