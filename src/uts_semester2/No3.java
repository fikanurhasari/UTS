package uts_semester2;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No.3 Transpose Matriks");
        
        int i, j, m, n;
        int matriks[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        
        System.out.print("masukkan jumlah baris matriks A:");
        //masukkan jumlah baris matriks = 2
        m = scan.nextInt ();
        System.out.print("masukkan jumlah kolom matriks A:");
        //masukkan jumlah kolom matriks = 3
        n = scan.nextInt ();
        System.out.println("masukkan elemen matriks A:");
        //masukkan elemen matriks = 1 2 3 4 5 6
        
        for(i = 0; i<m; i++) {
            for(j = 0; j<n; j++) {
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil Matriks:");
        for(i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for(i = 0; i<m; i++) {
            for(j = 0; j<n; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil transpose matriks:");
        for(i = 0; i<n; i++) {
            for(j = 0; j<m; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        System.out.print("masukkan jumlah baris matriks B:");
        //masukkan jumlah baris matriks = 3
        m = scan.nextInt ();
        System.out.print("masukkan jumlah kolom matriks B:");
        //masukkan jumlah kolom matriks = 2
        n = scan.nextInt ();
        System.out.println("masukkan elemen matriks B:");
        //masukkan elemen matriks = 1 2 3 4 5 6
        
        for(i = 0; i<m; i++) {
            for(j = 0; j<n; j++) {
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil Matriks:");
        for(i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for(i = 0; i<m; i++) {
            for(j = 0; j<n; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil transpose matriks:");
        for(i = 0; i<n; i++) {
            for(j = 0; j<m; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
}
    }
}