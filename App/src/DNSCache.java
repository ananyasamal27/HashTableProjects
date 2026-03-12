package src;

import java.util.*;

class DNSEntry{
    String ip;
    long expiry;

    DNSEntry(String ip,long ttl){
        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttl;
    }
}

public class DNSCache {

    HashMap<String,DNSEntry> cache = new HashMap<>();

    public void resolve(String domain){

        if(cache.containsKey(domain)){
            DNSEntry e = cache.get(domain);

            if(System.currentTimeMillis() < e.expiry){
                System.out.println("Cache HIT → " + e.ip);
                return;
            }
        }

        String ip = "172.217.14.206"; // simulated DNS
        cache.put(domain,new DNSEntry(ip,5000));

        System.out.println("Cache MISS → " + ip);
    }
}
