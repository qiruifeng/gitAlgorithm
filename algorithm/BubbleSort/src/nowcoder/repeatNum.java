package nowcoder;

public class repeatNum {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        for (int i=0;i<length-1;i++){
            for (int j=i+1;j<length;j++){
                if (numbers[j]==numbers[i]){
                    duplication[0]=numbers[i];
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
