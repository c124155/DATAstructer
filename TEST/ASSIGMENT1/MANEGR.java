package ASSIGMENT1;

public class MANEGR  extends JAVA{


        int bouns;
        MANEGR(String NAME,int employeid,double basicsalry,String depertement,int bouns,String cetogory){
            super(NAME,employeid,basicsalry,depertement,cetogory);
            this.bouns=bouns;
        }

        @Override
        double calculatesalary() {

            return basicsalry+bouns;
        }

        @Override
        void displayinfo() {
            super.displayinfo();

        }
    }




