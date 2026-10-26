package ASSEMENT2;

public class UL  extends  ABSTRUCTER {
    int addetionalfee;

    UL(int sericeid, String serivecename, int basecost, int addetionalfee) {
        super(sericeid, serivecename, basecost);
        this.addetionalfee = addetionalfee;
    }

    @Override
    int totalcos() {
        return basecost + addetionalfee;
    }
}