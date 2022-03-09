package day08_ifElseIfStatements;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen çizdiğiniz dörtgenin ardışık kenarlarından ilk kenar uzunluğunu girin");
        double ilk_kenar = scan.nextDouble();
        System.out.println("lütfen çizdiğiniz dörtgenin diğer kenar uzunluğunu girin");
        double ikinci_kenar = scan.nextDouble();
        System.out.println("lütfen çizdiğiniz dörtgenin diğer kenar uzunluğunu girin");
        double ucuncu_kenar = scan.nextDouble();
        System.out.println("lütfen çizdiğiniz dörtgenin diğer kenar uzunluğunu girin");
        double dorduncu_kenar = scan.nextDouble();
        if ((ilk_kenar == ikinci_kenar) && (ikinci_kenar == ucuncu_kenar)) {
            System.out.println("çizilen dörtgen bir karedir");
        }
        else if ((ilk_kenar == ucuncu_kenar) && (ikinci_kenar == dorduncu_kenar)) {
            System.out.println("çizilen dörtgen bir dikdörtgendir");
        }
        else if (ikinci_kenar != ucuncu_kenar) {
            System.out.println("çizilen dörtgen bir yamuktur");
        }
    }
}