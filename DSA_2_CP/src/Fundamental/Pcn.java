package Fundamental;

public class Pcn {
    public static void main(String[] args) {
        int p = 5;
        int n = 2;
        pcn(p,n);

    }

    public static void pcn(int p, int n ) {
        int pfac = 1;
        for(int i = 1; i<=p; i++){
            pfac *=i;
        }
        int nfac = 1;
        for(int i = 1; i<=p-n; i++){
            nfac *=i;
        }
        int pnc = pfac/nfac;
        System.out.println(p+"n"+n+"= "+ pnc);
    }
}
