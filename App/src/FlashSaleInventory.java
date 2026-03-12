package src;

import java.util.*;

public class FlashSaleInventory {

    HashMap<String,Integer> stock = new HashMap<>();
    Queue<Integer> waitingList = new LinkedList<>();

    public FlashSaleInventory(){
        stock.put("IPHONE15_256GB",100);
    }

    public void checkStock(String product){
        System.out.println(stock.get(product) + " units available");
    }

    public void purchaseItem(String product,int userId){

        int count = stock.get(product);

        if(count > 0){
            stock.put(product,count-1);
            System.out.println("Purchase success. Remaining: " + (count-1));
        }
        else{
            waitingList.add(userId);
            System.out.println("Added to waiting list. Position: " + waitingList.size());
        }
    }
}
