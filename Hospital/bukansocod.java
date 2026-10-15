package Hospital;

public class bukansocod  extends  Patient {
    double labcharg;

    public bukansocod(String name, double consfulfree, double labcharg) {
        super(name, consfulfree);
        this.labcharg = labcharg;
    }

    public double calculatebill() {
        return labcharg + consulfee;
    }
}
