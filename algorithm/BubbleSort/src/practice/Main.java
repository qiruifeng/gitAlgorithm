package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String[] strings = scanner.nextLine().split(" ");
            Collections.sort(Arrays.asList(strings));
            for (String str:strings){
                System.out.print(str+" ");
            }
        }



    }
}
