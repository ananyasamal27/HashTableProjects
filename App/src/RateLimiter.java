package src;

import java.util.*;

public class RateLimiter {

    HashMap<String,Integer> requests = new HashMap<>();
    int limit = 5;

    public void checkRateLimit(String client){

        int count = requests.getOrDefault(client,0);

        if(count >= limit){
            System.out.println("Rate limit exceeded");
        }
        else{
            requests.put(client,count+1);
            System.out.println("Allowed ("+(limit-count-1)+" remaining)");
        }
    }
}
