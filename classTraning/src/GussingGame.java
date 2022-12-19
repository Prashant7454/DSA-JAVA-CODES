import java.util.Random;
import java.util.Scanner;

public class GussingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ranNo = random.nextInt(100) + 1;
        System.out.println(ranNo);
        int gNo = sc.nextInt();
        int count = 0;
        int prevNo = 0;
        while(true){
            if(ranNo==gNo){
                count++;
                break;
            }
            else if(1>gNo || gNo>=100){
                System.out.println("OUT OF BOUND");
            }
            else if(count==0 && ((ranNo-10<=gNo&&gNo<ranNo) || (ranNo+10>=gNo && gNo>ranNo))){
                System.out.println("WARM!");
                count++;
                prevNo=gNo;
            }
            else if(count == 0){
                System.out.println("COLD!");
                count++;
                prevNo = gNo;
            }
            else if((gNo<prevNo && gNo>ranNo) || (prevNo<gNo && gNo<ranNo)){
                System.out.println("WARMED!");
                count++;
                prevNo = gNo;
            }
            else{
                System.out.println("COLDER!");
                count++;
                prevNo = gNo;
            }
            gNo = sc.nextInt();
        }

        System.out.println("You guess successfully ");
        System.out.println("No. of Guesses : " + count);
    }
}
