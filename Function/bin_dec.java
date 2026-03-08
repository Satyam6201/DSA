package Function;

public class bin_dec {

    // Binery to decemial:-

    public static void binTodec(int bin ){
        int originalBin = bin;
        int pow = 0; 
        int dec = 0; 

        while (bin >0) {
            int lastDigit = bin % 10;
            dec = dec +(lastDigit * (int)Math.pow(2, pow));
            pow++; 
            bin = bin/10;
        }
        System.out.println("Decemial number of " + originalBin + " is = " + dec);
    }

    // Decimal to Binary:-
    

    public static void decTobin(int dec) {
        int originalDec = dec;
        int pow = 0;
        int bin = 0;

        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;

            dec = dec /2;
        }
        System.out.println("Binary number of " + originalDec + " is = " + bin );
    }

    
    public static void main(String[] args) {
        binTodec(10000001);
        decTobin(129);
    }
}
