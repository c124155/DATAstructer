package ASSEMENT2;

public class MAINABS {
    static void main() {
        ABSTRUCTER ab1 = new CONSL(123, "consulition", 20, 25);
        ab1.totalcos();
        ab1.disblayserviceinfo();
        System.out.println("  ");
        ABSTRUCTER ab2 = new UL(2344, "ultersond", 23, 32);
        ab1.totalcos();
        ab2.disblayserviceinfo();
        System.out.println("   ");
        ABSTRUCTER ab3 = new LAB(4555, "labrotry", 88, 88);
        ab3.totalcos();
        ab3.disblayserviceinfo();
        double total = 0;
        total += ab1.totalcos() + ab2.totalcos() + ab3.totalcos();
        System.out.println(" - - -----");
        System.out.println("TOTAL HOSPITAL$" + " " + total);
    }
}