import java.util.*;
class rank_II { 
    public static void targetRank(ArrayList<Integer> arr , int target){

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==target){
                System.out.print(i+" ");
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int input=sc.nextInt(); //length of input

        ArrayList<Integer> list=new ArrayList<>(); //List declare and init
        int i=1;
        while(i<=input){
            list.add(sc.nextInt());
            i++;
        }
        int target=sc.nextInt();
        targetRank(list, target);
    }
}
