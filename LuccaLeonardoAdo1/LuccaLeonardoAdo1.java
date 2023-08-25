// Exercício: A.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor1 = new int[10];
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número " + (i + 1) + ": ");
            vetor1[i] = input.nextInt();
        }
        
        System.out.println("Aqui estão os números que você digitou: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": " + vetor1[i]);
        }
    }
}

// //-=-=-=-=-==-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

// // Exercicio: B.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[8];
        int[] B = new int[8];

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número " + (i + 1) + " do grupo A: ");
            A[i] = input.nextInt();
            B[i] = A[i] * 3;
        }

        System.out.println("Números do grupo B:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Número " + (i + 1) + ": " + B[i]);
        }
    }
}

//-=-=-=-=-==-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

// // Exercicio: C.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[20];
        int[] B = new int[20];
        int[] C = new int[20];
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 20 números para o grupo A:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = input.nextInt();
        }
        
        System.out.println("Digite 20 números para o grupo B:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            B[i] = input.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("Números do grupo C: ");
        for (int i = 0; i < 20; i++) {
            System.out.println("Número " + (i + 1) + ": " + C[i]);
        }
    }
}

//-=-=-=-=-==-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

// // Exercicio: D.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[30];

        Scanner input = new Scanner(System.in);

        System.out.println("Digite 15 números para o grupo A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = input.nextInt();
        }

        System.out.println("Digite 15 números para o grupo B:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            B[i] = input.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            C[i] = A[i];
            C[i + 15] = B[i];
        }
        
        System.out.println("Números do grupo C: ");
        for (int i = 0; i < 30; i++) {
            System.out.print(C[i] + " ");
        }
    }
}

//-=-=-=-=-==-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

// Exercicio: E.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[30];

        Scanner input = new Scanner(System.in);

        System.out.println("Digite 15 números para o grupo A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = input.nextInt();
        }
        
        System.out.println("Digite 15 números para o grupo B:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            B[i] = input.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            C[i] = A[i];
            C[i + 15] = B[i];
        }
        
        System.out.println("Números do grupo C :");
        for (int i = 0; i < 30; i++) {
            System.out.print(C[i] + " ");
        }
    }
