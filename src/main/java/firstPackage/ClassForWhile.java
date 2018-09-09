package firstPackage;

public class ClassForWhile {


    public static void main(String[] args) {

        int i=8;
        int j;
        if (i>5 && i<10){
            System.out.println("5<i<10");
            System.out.println(i);
            }
            else if (i<5){
            i=i+5;
            System.out.println(i);
        }
        else{
            System.out.println(i);
        }
System.out.println();

  int[] array=new int[10];

        for(j=0;j<10;j++){
            array[j]=j*2;
            System.out.println(array[j]);
            }
System.out.println();


            i=0;
         while (i<10) {

            System.out.println(i);
            i=i+3;
         }
System.out.println();

         i=0;
         boolean bool=true;
         while (bool){
             System.out.println("While:" +i);
             i++;
             if (i==8) {
                 bool = false;
             }
         }

System.out.println();

         i=1;
         do {
             System.out.println("do:" + i);
             i++;
         }
         while (i<=4);




    }



}
