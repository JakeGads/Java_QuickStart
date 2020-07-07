public class meeting3 {
   public static void main(String[] args) {
      // assume IR is some floating point number that is read from a literal IR sensor
      // assume that minDistance is some floating point number that is the minum number that can be expected from the sensor
      // assume that maxDistance is some floating point number which is the maxium number that can be expected from the sensor

      float IR = 3.14f;
      float minDistance = 5f;
      float maxDistance = 10f;

      for(int phil = 10; phil < 16; phil += 1){
         System.out.print("Not old enough");
      }
      
      System.out.print("old enough");

      int phil = 10;
      while(phil < 16){
         System.out.print("Not old enough");
         phil += 1;
      }
      System.out.print("old enough");

      int phil1 = 10;
      while(phil1 < 16){
         System.out.print("Not old enough");
         phil1 += 1;
      }
      System.out.print("old enough");

      // Arrays
      double[] myArray = new double[5];

      myArray[0] = 1;
      myArray[1] = 2;
      myArray[2] = 3;
      myArray[3] = 4;
      myArray[4] = 7;

      for(int i = 0; i < myArray.length; i++){
         System.out.println(i + ": " + myArray[i]);
      }
      /*
      0: 1.0
      1: 2.0
      2: 3.0
      3: 4.0
      4: 7.0
      */
   } 
}

/*
No drivers linceses for you 18
Congrats you are now old enough
*/