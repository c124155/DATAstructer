package ASSIGMENT1;

public class FULLTIME  extends  JAVA{


        double allowance;

        FULLTIME(String NAME, int employeid, double basicsalry, String deprtement ,double allowance,String category) {
            super(NAME, employeid, basicsalry,deprtement ,category);
            {
                this.allowance = allowance;
            }

        }

        @Override
        double calculatesalary() {

            return basicsalry + allowance;

        }

        @Override
        void displayinfo() {
            super.displayinfo();{

            }
        }
    }


