public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Timur";
        String ogrenci2 = "Kemal";
        String ogrenci3 = "Mehmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Timur";
        ogrenciler[1]="Kemal";
        ogrenciler[2]="Mehmet";
        ogrenciler[3]="Cengiz";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}