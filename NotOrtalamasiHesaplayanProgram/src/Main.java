import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturuyoruz
        int matematik,fizik,kimya,turkce,tarih,muzik;

        //Kullanıcıdan veri alacağız
        Scanner input = new Scanner(System.in);

        System.out.print("Matemaik Notunuz : ");
        matematik=input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya=input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih=input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik=input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;

        System.out.print("Ortalamanız : ");
        System.out.println(sonuc);

        String str = (sonuc >= 60) ? "Geçtiniz" : "Kaldınız";
        System.out.print(str);

    }
}
