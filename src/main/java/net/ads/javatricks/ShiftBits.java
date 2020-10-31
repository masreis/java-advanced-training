package net.ads.javatricks;

public class ShiftBits {

    public static void main(String[] args) {

        ShiftBits shiftBits = new ShiftBits();
//        shiftBits.shifts();
        shiftBits.shiftsAnd();

    }

    private void shifts() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Int: " + i + ". Binary: " + Integer.toBinaryString(i));
            System.out.println(" >> 1: " + Integer.toBinaryString(i >> 1) + ". Int: " + (i >> 1));
            System.out.println(" << 1: " + Integer.toBinaryString(i << 1) + ". Int: " + (i << 1));
            System.out.println("----------------");
        }
    }

    private void shiftsAnd() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Int: " + i + ". Binary: " + Integer.toBinaryString(i));
            System.out.println("& 1: " + (i & 1));
            System.out.println("& 2: " + (i & 2));
            System.out.println("----------------");
        }
    }
}
