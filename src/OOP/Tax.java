package OOP;
import java.util.Scanner;

class NguoiNopThue {
    private String hoten;
    private String MST;
    protected double thunhap;
    protected int npt;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        hoten = sc.nextLine();
        MST = sc.nextLine();
        thunhap = Double.parseDouble(sc.nextLine());
        npt = Integer.parseInt(sc.nextLine());
        sc.close();
    }
    public void display() {
        System.out.print(hoten + " | " + MST + " | " + thunhap);
    }
    
}

class TinhThue extends NguoiNopThue {
    public double tinhToanThue() { 
        double tpn = thunhap - 11 - (npt * 4.4);
        double thuePhaiNop = 0;
        if (tpn <= 0) {
            thuePhaiNop = 0;
        } else if (tpn <= 5) {
            thuePhaiNop = tpn * 0.05;
        } else {
            thuePhaiNop = tpn * 0.1; 
        }
        return Math.round(thuePhaiNop * 100.0) / 100.0;
    }
    @Override
    public void display() {
        super.display(); 
        System.out.println(" | " + tinhToanThue());
    }
}

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            TinhThue tt = new TinhThue();
            tt.nhap();
            tt.display();
        }
        sc.close();
    }
}