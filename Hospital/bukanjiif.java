package Hospital;

import java.util.Scanner;

public class bukanjiif  extends  Patient {
    Scanner input = new Scanner(System.in);
    double roomcharg;
    int numberdays;

    public bukanjiif(String neme, double consulfee, double roomcharg, int numberdays) {
        super(neme, consulfee);
        this.roomcharg = roomcharg;
        this.numberdays = numberdays;
    }

    double calculatebill() {
        return roomcharg * numberdays + consulfee;
    }
}