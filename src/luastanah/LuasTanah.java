package luastanah;
import java.util.Scanner;
class LuasTanah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner tanahInput = new Scanner(System.in);
        String [] Tanah = new String[3];
        int [] Panjangtanah = new int[Tanah.length];
        int [] Lebartanah = new int[Tanah.length];
        int Luas;
        
        for (int i = 0; i < Tanah.length; i++){
            System.out.print("NAMA TANAH : ");
            Tanah[i] = tanahInput.nextLine();
            System.out.print("PANJANG : ");
            Panjangtanah[i] = input.nextInt();
            System.out.print("LEBAR : ");
            Lebartanah[i] = input.nextInt();
        }
        for (int i = 0; i < Tanah.length; i++){
            System.out.println(Tanah[i]);
            System.out.println("PANJANg : " + Panjangtanah[i]);
            System.out.println("LEBAR : " + Lebartanah[i]);
        }
        for (int i = 0; i < Tanah.length; i++){
            Luas = Panjangtanah[i] * Lebartanah[i];
            System.out.println("Luas " + Tanah[i] + " : " + Luas);
        }
    }
}