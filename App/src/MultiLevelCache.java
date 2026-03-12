package src;

import java.util.*;

public class MultiLevelCache {

    HashMap<String,String> L1 = new HashMap<>();
    HashMap<String,String> L2 = new HashMap<>();

    public void getVideo(String id){

        if(L1.containsKey(id)){
            System.out.println("L1 Cache HIT");
        }
        else if(L2.containsKey(id)){
            System.out.println("L2 Cache HIT → promoted to L1");
            L1.put(id,L2.get(id));
        }
        else{
            System.out.println("L3 Database HIT");
            L2.put(id,"VideoData");
        }
    }
}


