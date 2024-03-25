import java.util.Arrays;
import java.util.Scanner;

public class ClassAssigments {
    public static void main(String[] args) {
//        userInput();
//        nestedStudentRemarks();
//        switchDays();
//        whileLoop();
//        doWhile();
//        forLoopMul();
//        breakAndContinue();
//        arrays();
        arrayQuestion();
    }

    public static void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained by student ");
        int obtainMark = sc.nextInt();

        if(obtainMark>=40 && obtainMark<=50){
            System.out.println("Third division");
        } else if (obtainMark >50 && obtainMark <=80){
            System.out.println("Second division");
        } else if (obtainMark > 80 && obtainMark <= 100){
            System.out.println("First divison");
        }else{
            System.out.println("Failed");
        }
    }

    public static void nestedStudentRemarks(){
        int obtainMark;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student obtained mark");
        obtainMark = sc.nextInt();

        if(obtainMark > 0 && obtainMark < 100){
            if(obtainMark >= 40){
                System.out.println("The student is pass, you can see the division he is in: ");
                if(obtainMark>=40 && obtainMark<=50){
                    System.out.println("Third division");
                } else if (obtainMark >50 && obtainMark <=80){
                    System.out.println("Second division");
                } else if (obtainMark > 80 && obtainMark <= 100){
                    System.out.println("First divison");
                }
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("The user have entered invalid marks");
        }

    }

    public static void switchDays(){
        int weekDays;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        weekDays = sc.nextInt();

        switch (weekDays){
            case 1:
                System.out.println("The entered "+ weekDays + " correesponds to Monday");
                break;
            case 2:
                System.out.println("The entered "+ weekDays + " correesponds to Tuesday");
                break;
            case 3:
                System.out.println("The entered "+ weekDays + " correesponds to Wednesday");
                break;
            case 4:
                System.out.println("The entered "+ weekDays + " correesponds to Thursday");
                break;
            case 5:
                System.out.println("The entered "+ weekDays + " correesponds to Friday");
                break;
            case 6:
                System.out.println("The entered "+ weekDays + " correesponds to Saturday");
                break;
            case 7:
                System.out.println("The entered "+ weekDays + " correesponds to Sunday");
                break;
            default:
                System.out.println("The entered number "+ weekDays +" does not correspond to any days in a week");
                break;
        }
    }

    public static void whileLoop(){
        System.out.println("@@@ Enter a number to show its multiplication table");        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        int counter = 1;
        while(counter <= 12){
            System.out.println(mul+ " * "+ counter+" = " +mul * counter);
            counter++;
        }
    }

    public static void doWhile(){
        System.out.println("@@@ Enter a number to show its multiplication table");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        int counter = 1;
        do {
            System.out.println(mul+ " * "+ counter+" = " +mul * counter);
            counter++;
        }while (counter<=12);
    }

    public static void forLoopMul(){
        System.out.println("@@@ Enter a number to show its multiplication table");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();

        for(int counter=1; counter<=12; counter++){
            System.out.println(mul+ " * "+ counter+" = " +mul * counter);
        }
    }

    public static void breakAndContinue(){
        System.out.println("@@@ Enter a number to show its multiplication table");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();

        for(int counter=1; counter<=20; counter++){
            if(counter%2 != 0){
                continue;
            }
            if(mul == 12 && counter > 10){
                break;
            }
            System.out.println(mul+ " * "+ counter+ " = "+ mul * counter);
        }
    }

    public static void arrays(){
        int arrays[] = new int[3];
        int[] arrays_ = {2, 20, 40, 0, 4, 78, 9};

        // normal for loop
        for(int i=0; i<arrays_.length; i++){
            System.out.print(arrays_[i]+" ");
        }

        // enhanced for loop
        for(int new_array : arrays_){
            System.out.print(new_array+ " ");
        }
    }

    public static void arrayQuestion(){
        int array[] = { 1, 5, 6, 2, 100, 20, -1, 203, 600};
        int store = array[0];
        for(int i=0; i<array.length; i++){
            if(i < array.length-1){
                array[i] = array[i+1];
            }else{
                break;
            }
        }
        array[array.length-1] = store;
        System.out.print(Arrays.toString(array));
//        for(int i : array){
//            System.out.print(i+ " " );
//        }
    }
}
