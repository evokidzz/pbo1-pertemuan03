package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                   //i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i); //betul i nilainya 1
        i++;                   //karena i tadinya sudah bernilai 1 maka sekarang ditambakan lagi 1 menjadi 2
        System.out.println(i); //tuh betulkan nilainya 2
        i=i+1;                 //bisa dilihat i++ sama dengan i = i=1
        System.out.println(i); //i tadinya 2 sekarang menjadi 3
    }
}
