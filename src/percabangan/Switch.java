package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai ='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terimakasih Pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"BACOT !!!\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs   : \"Whueheheh XD\"");
            default:
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Mboh ya gerang?\"");
                System.out.println("Dosen : \"*Meriksai berkas\"");
                System.out.println("Dosen : \"*Menceleng\"");
                System.out.println("Mhs   : \"Kage Bunshin no Jutsu (Kaboooor)\"");
                break;

        }
    }
}
