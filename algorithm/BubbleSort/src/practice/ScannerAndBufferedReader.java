package practice;

import java.util.Scanner;

import static tools.tools.printArrays;

public class ScannerAndBufferedReader {
    public static int[] multiply(int[] A) {
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            res[i]=1;
            int j=0;
            while(j<A.length){
                if (j==i){
                    j++;

            }else {
                    res[i]=res[i]*A[j++];
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数据");
        





//        int a=scanner.nextInt();
//        System.out.println(a);
//        String b=scanner.nextLine();
//        System.out.println(b);
        int[] a={1,2,3,4,5};
        printArrays(multiply(a));
    }
}
