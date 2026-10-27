package IMPORT;

import com.sun.source.tree.ImportTree;

public class JAVA extends Exception {

    JAVA(String message){
            super(message);
        }
    }
    class STUDEN{
        String StudId;
        String StudName;
        int Age;
        double Mark;
        int subject;

        STUDEN(String studId,String studName,int age,double mark,int subject){
            this.StudId=studId;
            this.StudName=studName;
            this.Age=age;
            this.Mark=mark;
            this.subject=subject;

        }

        void Validate()throws JAVA{
            if (StudId.isEmpty() || StudId==null){
                throw new JAVA("Student Id Cannot Be Empty.");
            }
            if (Mark<0 || Mark>100){
                throw new JAVA("Exam Mark Must Be Between 0 And 100");
            }
            if (subject<1 || subject>5){
                throw new JAVA("Subjects Must Be Between 1-5 only");
            }
        }
        void Disblay (){
            System.out.println("Registration Successful");
            System.out.println("Student Id :"+StudId);
            System.out.println("Student Name:"+StudName);
            System.out.println("Student Age :"+Age);
            System.out.println("Student Mark:"+Mark);
            System.out.println("Number Of Subjects:"+subject);
        }
        void Registr(){
            try {
                Validate();
                Disblay();

            }catch (JAVA e){
                System.out.println("Registration Failed");
                System.out.println("Error:"+e.getMessage());
            }finally {
                System.out.println("Registration Attempt Completed.\n");
            }
        }
    }



     class Universty_Exam {
        static void main(String[] args) {
            System.out.println("======Exam Registration System=====\n");
            STUDEN obj=new STUDEN("JUU22","ALI",21,69,8);
            obj.Registr();
            obj.Disblay();
            STUDEN obj1=new STUDEN("101","Ahmad Ali Hasan",22,80,7);
            obj1.Registr();
            obj1.Disblay();
            STUDEN obj2=new STUDEN("102","Muna Abdi Ahmad",21,90,4);
            obj2.Registr();
            obj2.Disblay();
        }
    }

