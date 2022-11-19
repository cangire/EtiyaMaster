public class Main {
    public static void main(String[] args) {

        //ctrl+shift+Alt+L Formatting for ide
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
              //  System.out.println("Çok Güzel : Geçtiniz");
              //  break;
                // B ve C aynı sonucu veriyor eğer böyle kullanırsak
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil  : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}