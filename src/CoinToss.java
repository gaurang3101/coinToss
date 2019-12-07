import java.util.Scanner;

public class CoinToss {

    private String state;

    public CoinToss() {
        this.toss();
    }

    public void toss() {
        double i = Math.random();
        this.state = (i <= 0.5) ? "Heads" : "Tails";
    }


    public int tossAndCount(int n, String face) {
        CoinToss ct = new CoinToss();
        int k = 0;
        for (int i = 0; i < n; i++) {
            ct.toss();
            System.out.println(ct.state);
            if (face.equalsIgnoreCase(ct.state)) {
                k = k + 1;
            }
        }
        return k;
    }
}

class HeadsAayaYaTails {
    public static void main(String[] args) {
        CoinToss ct = new CoinToss();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of tosses you want - ");
        int n = sc.nextInt();
        System.out.println("Please enter the state of coin - ");
        String face = sc.next();
        int i = ct.tossAndCount(n, face);
        System.out.println(i);
    }
}