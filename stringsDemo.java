package java1;

public class stringsDemo {
    /**
     
     */
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı : " + mesaj.length()); // eleman sayısını gösterir
        System.out.println("5.eleman : " + mesaj.charAt(4)); // 5. elemanda hangi harf olduğunu gösterir.
        System.out.println(mesaj.concat(" Yaşasın!")); // mesajın sonuna buraya ne yazarsak onu ekler.
        System.out.println(mesaj.startsWith("A")); // mesajın başı a ile başlıyorsa true veya false diye gösterir.
        System.out.println(mesaj.endsWith("l")); // mesajın sonu l ile bitiyorsa true veya false diye gösterir.
        char[] karakterler = new char[5]; // dizi oluşturduk 5 elemanlı bir dizi
        mesaj.getChars(0, 5, karakterler, 0); // karakterler yerindeki 0 ila 5 indexteki sayıyı yaz demek.
        System.out.println(karakterler); // görüntülemek için yazdık bunu.
        System.out.println(mesaj.indexOf('a')); // baştan başlayarak mesajdaki ilk a ya kadar olan elemanı gösterir.
        System.out.println(mesaj.lastIndexOf("a")); // sondan başlayarak mesajdaki ilk a ya kadar olan elemanı gösterir.
        System.out.println(mesaj.substring(2, 6)); // mesajdaki 2. no dan 6.no ya kadar ındexli olanı yazıyor. (gün)

        System.out.println(mesaj.toLowerCase()); // hepsini küçük harfle yazıyor.
        System.out.println(mesaj.toUpperCase()); // hepsini büyük yapıyor harfleri.

        // System.out.println(mesaj.trim()); // baştaki ve sondaki boşlukları atıyor.

    }

}
