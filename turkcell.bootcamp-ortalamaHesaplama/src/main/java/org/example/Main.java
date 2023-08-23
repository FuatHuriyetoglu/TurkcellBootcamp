package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç adet sınav notu girmek istiyorsunuz??");
        int numberOfExam = scanner.nextInt();

        int totalGrade = 0;
        for(int i = 1 ; i<= numberOfExam; i++ ){
            System.out.println(i+ ".Sınav notunu giriniz");
            int grade = scanner.nextInt();
            totalGrade += grade;
        }
        double avg = (double) totalGrade /numberOfExam ;
        System.out.println("ortalama: "+ avg);

        if (avg >= 80){
            System.out.println("Yüksek puan <3");
        }else {
            System.out.println("Düşük puan!!");
        }
    scanner.close();

    }
}