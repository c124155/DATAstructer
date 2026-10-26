package ASSEMENT2;

public class LAB  extends  ABSTRUCTER {
    int testcharg;

    LAB(int serviceid, String servename, int basecosty, int testcharg) {
        super(serviceid, servename, basecosty);
        this.testcharg = testcharg;
    }

    @Override
    int totalcos() {
        return basecost + testcharg;

    }
}