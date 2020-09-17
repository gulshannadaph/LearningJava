package SmallPrograms;

public class fibonnaci {
    public static void main(String args[]) {
        int first_number = 0, second_number = 1;
        int sum=0;
        int iternation = 5;
        for (int i = 0; i <= iternation; i++) {
           sum=first_number+second_number;
           first_number=second_number;
           second_number=sum;
           System.out.println(sum);
        }

    }
}
