package Hospital;

public class mainhospital {
    public static void main() {
        System.out.println();
        bukansocod b1 = new bukansocod("ayan", 48, 18);
        System.out.println("NAME: " + b1.name);
        System.out.println("LAB CHARG:$" + b1.labcharg);
        System.out.println("FeeNumber:$" + b1.consulfee);
        System.out.println("TOTAL:$" + b1.calculatebill());

        System.out.println(" ");
        bukansocod b2 = new bukansocod("faraxan", 91, 77);
        System.out.println("NAME:" + b2.name);
        System.out.println("LAB CHARG:$" + b2.labcharg);
        System.out.println("FeeNumber:$" + b2.consulfee);
        System.out.println("TOTAL:$" + b2.calculatebill());

        System.out.println(" ");
        bukansocod b3 = new bukansocod("caisho", 91, 46);
        System.out.println("NAME:" + b3.name);
        System.out.println("LAB CHARG:$" + b3.labcharg);
        System.out.println("FeeNumber:$" + b3.consulfee);
        System.out.println("TOTAL:$" + b3.calculatebill());

        System.out.println(" ");
        bukansocod b4 = new bukansocod("farxiyo", 67, 770);
        System.out.println("NAME:" + b4.name);
        System.out.println("LAB CHARG:$" + b4.labcharg);
        System.out.println("feenumber:$" + b4.consulfee);
        System.out.println("TOTAL:$" + b4.calculatebill());


        System.out.println(" ");
        System.out.println(" ");
        bukanjiif bb1 = new bukanjiif("ali", 45, 31, 7);
        System.out.println("NAME:" + bb1.name);
        System.out.println("CONSFUL:$" + bb1.consulfee);
        System.out.println("Room Charge: $" + bb1.roomcharg);
        System.out.println("Number of Days: " + bb1.numberdays);
        System.out.println("Total Bill: $" + bb1.calculatebill());
        System.out.println("");

        bukanjiif bb2 = new bukanjiif("Abdi", 8, 46, 9);
        System.out.println("NAME:" + bb2.name);
        System.out.println("CONSFUL:$" + bb2.consulfee);
        System.out.println("Room Charge: $" + bb2.roomcharg);
        System.out.println("Number of Days: " + bb2.numberdays);
        System.out.println("Total Bill: $" + bb2.calculatebill());
        System.out.println("");

        bukanjiif bb3 = new bukanjiif("Halimo", 7, 68, 8);
        System.out.println("NAME:" + bb3.name);
        System.out.println("CONSFUL: $" + bb3.consulfee);
        System.out.println("Room Charge: $" + bb3.roomcharg);
        System.out.println("Number of Days: " + bb3.numberdays);
        System.out.println("Total Bill: $" + bb3.calculatebill());
        System.out.println("");


    }
}
