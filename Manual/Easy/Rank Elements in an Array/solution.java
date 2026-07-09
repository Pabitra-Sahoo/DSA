import java.util.*;

public class rank{
    public static void findRank(int arr[]){
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=(arr[i]);
        }
        Arrays.sort(temp);

        int j=1;
        for(int i=1;i<temp.length;i++){
            if(temp[i]!=temp[i-1]){
                temp[j++]=temp[i];
            }
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<j;i++){
            map.put(temp[i],i);
        }

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.print(map.get(arr[i])+1+" ");
            }
        }
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        String Val=sc.nextLine();

        String temp[]=Val.split(" ");
        int arr[]=new int[temp.length];

        for(int i=0;i<temp.length;i++){
            arr[i]=Integer.parseInt(temp[i]);
        }

        findRank(arr);
    }
}