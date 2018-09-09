package firstPackage;

public class ClassLoop {
    public static void main(String[] args) {

        int[] array = {486,119,1236,489,212,808,1232,494,367,804,226,1079,798,1152,36,1154,382,1247,1298,74,64,153,896,854,1204,510,798,444,722,842,644,1198,952};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);


    }
}
