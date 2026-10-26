package ASSEMENT2;

public abstract  class ABSTRUCTER {

    protected int serviceid;
    String serivename;
    int basecost;


    ABSTRUCTER(int serviceid, String serivacename, int basecost) {
        this.serviceid = serviceid;
        this.serivename = serivacename;
        this.basecost = basecost;

    }

    abstract int totalcos();

    void disblayserviceinfo() {
        System.out.println(" HOSPITAL BILLING SYSTEM   ");
        System.out.println("SERVICEID" + " " + serviceid);
        System.out.println("SERIVENAME" + "  " + serivename);

        System.out.println("TOTAL COST" + " " + totalcos());
    }
}
