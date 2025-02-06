//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        int [][] matiz ={{9,8,7},{5,3,2},{6,6,7}};
//        int[] maiorLinha =new int[3];
//        int[] menorLinha =new int[3];
//    for (int i = 0; i < 3; i++)
//            maiorLinha[i] =0;
//         for (int i = 0; i < 3; i++)
//                 menorLinha[i] =10;
//            for (int i = 0; i < 3; i++)
//                if(matiz[0][i]>maiorLinha[0])
//                    maiorLinha[0]=matiz[0][i];
//            for (int i = 0; i < 3; i++)
//                if(matiz[1][i]>maiorLinha[1])
//                    maiorLinha[1]=matiz[1][i];
//            for (int i = 0; i < 3; i++)
//                if(matiz[2][i]>maiorLinha[2])
//                    maiorLinha[2]=matiz[2][i];
//            //menor elemento de cada linha
//            for (int i = 0; i < 3; i++)
//                if(matiz[0][i]<menorLinha[0])
//                    menorLinha[0]=matiz[0][i];
//            for (int i = 0; i < 3; i++)
//                if(matiz[1][i]<menorLinha[1])
//                    menorLinha[1]=matiz[1][i];
//            for (int i = 0; i < 3; i++)
//                if(matiz[2][i]<menorLinha[2])
//                    menorLinha[2]=matiz[2][i];
//            for (int i = 0; i < 3; i++)
//                for (int j = 0; j < 3; j++)
//                    if(maiorLinha[i]==menorLinha[j])
//                        System.out.println("ponto de sela"+maiorLinha[i]);
//
//    }
//}

public class Main {
    public static void main(String[] args) {
        int [][] matiz = {{9, 8, 7}, {5, 3, 2}, {6, 6, 7}};

        // Arrays para armazenar os maiores e menores valores de cada linha
        int[] maiorLinha = new int[3];
        int[] menorLinha = new int[3];

        // Inicializando os arrays
        for (int i = 0; i < 3; i++) {
            maiorLinha[i] = Integer.MIN_VALUE;  // Menor valor possível para comparação
            menorLinha[i] = Integer.MAX_VALUE;  // Maior valor possível para comparação
        }

        // Encontrando o maior e o menor valor de cada linha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Atualiza maior valor da linha i
                if (matiz[i][j] > maiorLinha[i]) {
                    maiorLinha[i] = matiz[i][j];
                }
                // Atualiza menor valor da linha i
                if (matiz[i][j] < menorLinha[i]) {
                    menorLinha[i] = matiz[i][j];
                }
            }
        }

        // Verificando pontos de sela (maior na linha e menor na coluna)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Verifica se o valor é o maior na linha i e o menor na coluna j
                if (matiz[i][j] == maiorLinha[i]) {
                    boolean isSaddlePoint = true;
                    // Verifica se é o menor na coluna
                    for (int k = 0; k < 3; k++) {
                        if (matiz[k][j] < matiz[i][j]) {
                            isSaddlePoint = false;
                            break;
                        }
                    }
                    // Se for ponto de sela, imprime
                    if (isSaddlePoint) {
                        System.out.println("Ponto de sela: " + matiz[i][j]);
                    }
                }
            }
        }
    }
}
