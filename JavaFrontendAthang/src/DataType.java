public class DataType {
    public static void main(String[] args){
        sumsOfNumber(2, 4.203f, 3.20d);
        //        int no = 2;
//        double long_no = 2L;
//        float float_no = 32.1f;
//
//        double sum = no + long_no + float_no;
//        System.out.println(sum);
    }

    public static void sumsOfNumber(int i, float f, double d){
        double sum = i + f + d;
        float sum2 = (float) (i + f + d);
        int sum3 = (int) (i + f + d);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
