import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findTheSame();

    }
    public static void findTheSame(){

        int[] input1 = {1, 5, 10, 20, 40, 80};
        int[] input2 = {6, 7, 20, 80, 100};
        int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
        int x=0,y=0,z=0;
        while ( x < input1.length&&y<input2.length&&z<input3.length) {
            int a=input1[x];
            int b=input2[y];
            int c=input3[z];
            if (a==b&&b==c){
                System.out.println(a);
                x++;
                y++;
                z++;
            }
             else if(a<b&&a<c){
                x++;
            }
            else if (b<a&&b<c){
                y++;
            }
            else if (c<a&&c<b){
                z++;
            }


        }



    }

    public void reverseWordBuilder(){
                Scanner scanner=new Scanner(System.in);
        System.out.println("enter name");
        String str=scanner.nextLine();
        StringBuilder rst=new StringBuilder();
        char ch;
        for (int i = str.length()-1; i >=0; i--) {
            rst.append(str.charAt(i));

        }
        System.out.println(rst);
    }
    public void reverseWord(){
                Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string");
        String str=scanner.nextLine();
        String  rst="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            rst= ch+rst;
        }
        System.out.println("Reversed word: "+ rst
        );
    }
    public void findDuplicate(){
            int []nums={1,2,3,4,5,6,6,7,8,9};
        int sumNums=0;
        int sum=0;
        for(int i=0; i<nums.length;i++) {
            sumNums+=nums[i];
        }
        for (int i = 1; i <10 ; i++) {
            sum+=i;
        }
        System.out.println(sumNums);
        System.out.println(sum);
        System.out.println(sumNums-sum);

    }
    public void findDoubleBySet(){
                int[] nums = {1,2,3,4,5,6,6,7,8};
        int x=0;
        int y=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            set.add(n);
            x+=n;
        }
        for (int n:set){
            y+=n;
        }
                System.out.println(x-y);
    }
    public void findDoubleBySet2() {
        int[] nums = {1, 2, 1, 2, 3, 4, 5};
        HashSet<Integer> numsSet = new HashSet<>();
        for (int n : nums) {
            numsSet.add(n);
        }
        System.out.println(numsSet.toString());
        int[] nums2 = {1, 2, 1, 2, 3, 4, 5};
        Arrays.sort(nums2);
        for (int i = 0; i < nums2.length - 1; i++) {
            if (nums2[i] == nums2[i + 1]) {
                nums2[i] = -1;
            }
            System.out.println(nums2[i]);

        }
    }


}
