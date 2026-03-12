package src;

import java.util.*;

public class PlagiarismDetector {

    HashMap<String, Set<String>> ngrams = new HashMap<>();

    public void addDocument(String docId,String text){

        String[] words = text.split(" ");

        for(int i=0;i<words.length-2;i++){

            String gram = words[i]+" "+words[i+1]+" "+words[i+2];

            ngrams.putIfAbsent(gram,new HashSet<>());

            ngrams.get(gram).add(docId);
        }
    }

    public void checkDocument(String text){

        String[] words = text.split(" ");

        int matches = 0;

        for(int i=0;i<words.length-2;i++){

            String gram = words[i]+" "+words[i+1]+" "+words[i+2];

            if(ngrams.containsKey(gram)){
                matches++;
            }
        }

        System.out.println("Matching n-grams: " + matches);
    }
}
