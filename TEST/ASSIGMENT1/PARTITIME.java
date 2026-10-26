package ASSIGMENT1;

public class PARTITIME  extends JAVA{
        int hoursworked;
        int hourlyrate;

        PARTITIME(String NAME, int employeid, double basicsalry, String depertement, int hoursworked, int hourlyrate, String category) {
            super(NAME, employeid, basicsalry, depertement, category);
            this.hoursworked = hoursworked;
            this.hourlyrate = hourlyrate;
        }

        @Override
        double calculatesalary() {
            return hoursworked * hourlyrate;
        }

        @Override
        void displayinfo() {
            super.displayinfo();
            {


            }
        }
    }


