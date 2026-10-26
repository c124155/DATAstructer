package ASSIGMENT1;

public class MAIN {
    static void main() {
        JAVA[] e = {
                new FULLTIME("IQRO", 133, 200, "it", 222, "full_time"),
                new PARTITIME("XAFSO", 133, 1200, "APPLICATION", 24, 120, "part_time"),
                new MANEGR("caisho", 2344, 233, "multimedia", 22, "maneger")
        };

        System.out.println("EMPLOYE SALRY REPORT");
        System.out.println();

        for (JAVA emp : e) {
            emp.displayinfo();
            System.out.println();
        }
    }}

