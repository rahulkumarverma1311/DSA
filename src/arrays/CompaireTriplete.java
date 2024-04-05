package arrays;

import java.util.ArrayList;
import java.util.List;

public class CompaireTriplete {

    private static List<Integer> getScore(List<Integer>a,List<Integer>b){
        ArrayList<Integer>al = new ArrayList<>();
        int aScore=0;
        int bScore=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                aScore++;
            }
            if(a.get(i)< b.get(i)){
                bScore++;
            }
        }
        al.add(aScore);
        al.add(bScore);
        return al;
    }



    public static void main(String[] args) {
        ArrayList<Integer>a = new ArrayList<>();
        ArrayList<Integer>b = new ArrayList<>();

        a.add(1);
        a.add(14);
        a.add(132);
        b.add(32);
        b.add(11);
        b.add(3243);



        System.out.println(getScore(a,b));

    }
}

