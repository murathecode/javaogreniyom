package java1;

import javax.sql.rowset.CachedRowSet;

public class switchDemo {
    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {

            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;

            case 'C':
                System.out.println(" İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println(" Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println(" Malesef : Geçemediniz");
                break;
            default:
                System.out.println("Geçersiz Not");
                break;
            
        }

    }

}
