package java101;

import java.util.Scanner;
//not ortalaması hesaplayan program:
public class notOrtalama {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        //Scanner sınıfını tanımla
        Scanner inp =new Scanner(System.in) ;

        //kullanıcıdan değerleri al
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        double sonuc;
        if(mat<0 || mat>100){
            int toplam = (fizik + kimya + turkce + tarih + muzik);
             sonuc = toplam / 5;
        }else if(fizik<0 || fizik>100){
            int toplam = (mat + kimya + turkce + tarih + muzik);
             sonuc = toplam / 5;
        }else if(kimya<0 || kimya>100){
            int toplam = (mat + fizik + turkce + tarih + muzik);
            sonuc = toplam / 5;
        }else if(turkce<0 || turkce>100){
            int toplam = (mat + fizik + kimya + tarih + muzik);
            sonuc = toplam / 5;
        }else if(tarih<0 || tarih>100){
            int toplam = (mat + fizik + kimya + turkce + muzik);
            sonuc = toplam / 5;
        }else if (muzik<0 || muzik>100){
            int toplam = (mat + fizik + kimya + turkce + tarih);
            sonuc = toplam / 5;
        }else {
            int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
            sonuc = toplam / 6;
        }
        System.out.println("Ortalamanız : " + sonuc);
        if (sonuc >= 60 ){
            System.out.println("Sınıfı geçtiniz!");
        }else{
            System.out.println("Sınıfta kaldınız!");
        }

    }
}