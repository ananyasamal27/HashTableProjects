package src;

import java.util.*;

public class UsernameChecker {

    HashMap<String, Integer> users = new HashMap<>();
    HashMap<String, Integer> attempts = new HashMap<>();

    public UsernameChecker() {
        users.put("john_doe", 1);
        users.put("admin", 2);
    }

    public boolean checkAvailability(String username) {

        attempts.put(username, attempts.getOrDefault(username, 0) + 1);

        return !users.containsKey(username);
    }

    public List<String> suggestAlternatives(String username) {

        List<String> list = new ArrayList<>();

        list.add(username + "1");
        list.add(username + "2");
        list.add(username.replace("_", "."));

        return list;
    }

    public String getMostAttempted() {

        String maxUser = "";
        int max = 0;

        for(String u : attempts.keySet()){
            if(attempts.get(u) > max){
                max = attempts.get(u);
                maxUser = u;
            }
        }

        return maxUser;
    }
}
