package uts_semester2;

import java.util.Scanner;

public class No1 {
        public static void selectionSort(int[] A) {
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        
        for (pass = 0; pass < n - 1; pass++) {  
            smallIndex = pass;                  
            for (j = pass + 1; j < n; j++) {    
                if (A[j]<A[smallIndex]) {       
                    smallIndex = j;  
                }
            }
            
            temp = A[pass]; 
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }
    
    public static void tampil(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No.1 Selection Sort");
        System.out.println("");
        int A[] = {3, 10, 4, 2, 8, 13};
        No1.tampil(A);
        No1.selectionSort(A);
        System.out.println("");
        No1.tampil(A);
        System.out.println("");
        
        System.out.println("Fika Nur Hasari (21092001)" + "\n");
        System.out.println("No.1 Searching Binary");
        int B [] = {3, 10, 4, 2, 8, 13};
        int search = 0;
        int Indeks1 = 0; // 0
        int Indeks2 = B.length-1;
        int ketemu = 0;
        int data = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang akan dicari : "); //data yang dicari = 8
        search = scan.nextInt();
        System.out.println();
        
        System.out.println("Isi Data Adalah : ");
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((Indeks1 <= Indeks2 && (ketemu == 0))){
            data = (Indeks1 + Indeks2) / 2;
            System.out.println("Indeks data : " + data);
            if(search == B[data]){ 
                ketemu = 1;
                System.out.println();
                System.out.println("Data " +
                        search + " berada pada indeks ke - " + data);
            }
        }
    }
    }
