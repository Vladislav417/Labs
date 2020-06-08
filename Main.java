package com.company;

/**
 * C5 = 3  С = А ⊕ В
 * С7 = 5  char
 * C11 = 2 Обчислити суму найбільших елементів кожного стовпця матриці
 *
 *
 *
 */

/**
 * C2 = 0 O1 = "+"
 * C3 = 2 C = 2
 * C5 = 3 O2 = "+"
 * C7 = 5 тип індексів i та j = float
 */
public class Main {
    public static void main(String[] args) {
        double A[][] = {{'4', '7', '7'},
                {'5', '1', '8'},
                {'4', '8', '4'},
                {'4', '5', '3'},
                {'2', '4', '8'}};
        double B[][] = {{'8', '1', '4'},
                {'2', '7', '1'},
                {'4', '7', '1'},
                {'7', '9', '6'},
                {'4', '5', '6'}};
        char C[][] = new char [A.length+B.length][A[0].length + B[0].length];
        for (int i = 0; i < A.length + B.length; i++) {
            for (int j = 0; j < A[0].length + B[0].length; j++) {
                C[i][j] = '0';
            }

        }
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length;j++){
                C[i][j] = (char)A[i][j];
            }
        }

        for (int i = 0; i < B.length; i++){
            for (int j = 0; j < B[0].length;j++){
                C[i+A.length] [j+A[0].length] = (char)B[i][j];
            }
        }
        System.out.println("Матриця С:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }
        String S = "";
        for (int j = 0; j < C[0].length; j ++) {

            char max = C[0][j];
            for (int i = 0; i < C.length; i++) {
                if (C[i][j] > max) max = C[i][j];
            }
            S = S + max;
        }
        System.out.print(S);


    }
}