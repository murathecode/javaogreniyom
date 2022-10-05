package java1;

public class loopDemo {

    public static void main(String[] args) {
        System.out.println("Döngü Başlıyor");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);

        }
        System.out.println("Döngü Bitti");
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Döngü Bitti");

        // Do-While
        int k = 200;
        do {
            System.out.println("loglandı");
            System.out.println(k);
            k+=2;
        } while (k < 10);
        System.out.println(" Do-While Döngü Bitti");

    }

}
