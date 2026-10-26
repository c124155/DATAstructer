package ASSEMENT2;

public class CONSL extends ABSTRUCTER {
    int dectorfee;

    CONSL(int serviceid, String servename, int basecost, int dectorfee) {
        super(serviceid, servename, basecost);
        this.dectorfee = dectorfee;
    }


    @Override
    int totalcos() {
        return basecost + dectorfee;

    }
}
