package src;

import java.util.*;

public class TwoSumTransactions {

    public void findTwoSum(int[] arr,int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){

            int diff = target - num;

            if(map.containsKey(diff)){
                System.out.println("Pair: " + num + " + " + diff);
                return;
            }

            map.put(num,1);
        }

        System.out.println("No pair found");
    }
}

