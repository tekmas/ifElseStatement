package day08_ifElseIfStatements;

import java.util.Scanner;

public class Examples_2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("mmaş teklifiniz nedir?");
        double maas = scan.nextDouble();
        if (maas>80000){
            System.out.println("kabul ediyorum");
        }
        else if ((maas>=60000)&&(maas<=80000)){
            System.out.println("konuşabiliriz");
        }
        else if (maas<60000){
            System.out.println("malesef kabul edemem");
        }
    }
}
