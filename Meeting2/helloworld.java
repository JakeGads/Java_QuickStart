public class helloworld {

    public static void main(String[] args){
        String name="(Phil)";        
        System.out.println(name);
        name="Jake";
        System.out.println(name);
        
        float myFloat = 2.5f;
        boolean myBoolean = myFloat > 2 && 5 < 2; // and
        System.out.println(myBoolean);
        myBoolean = myFloat > 2 || 5 < 2; // or \ |
        System.out.println(myBoolean);

        int readIRSensor = 1;

        /*
        code that grabs the reading from the ir sensor
        */

        if(readIRSensor > 3){
            System.out.println("Hey man you're too close we need to move back");
        }
        else if(readIRSensor == 3){
            System.out.println("Hey man you're exactly the right location");
        }
        else{
            System.out.println("Hey man you're too far");
        }


        readIRSensor = 3;
        switch(readIRSensor){
            case 1: 
                System.out.println("we read back a one");
                break;
            case 2:
                System.out.println("we read back a two");
            case 3:
                System.out.println("we read back a three");
                break;
            default:
                System.out.println("we read a number not between 1 + 3");
                break;
        }
    }
}