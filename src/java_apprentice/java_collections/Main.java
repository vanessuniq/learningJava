package java_apprentice.java_collections;

import java.util.Map;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {
    Map<Integer, String> lruCache = new Cache();
    lruCache.put(1008, "Fate");
    lruCache.put(9283, "Love");
    lruCache.put(9282, "Happy");
    lruCache.put(1993, "Ever");
    lruCache.put(1990, "After");
    System.out.println("\n================================\n");
    System.out.println("Added exactly five entries.\n");
    for (Entry<Integer, String> entry : lruCache.entrySet()) {
      System.out.println(entry);
    }
    lruCache.get(1008);
    System.out.println("\nAfter accessing the cache data 'Fate', the order of the cache entries is:\n");
    for (Entry<Integer, String> entry : lruCache.entrySet()) {
      System.out.println(entry);
    }
    lruCache.put(1005, "Unconditional");
    lruCache.put(0111, "Link");
    System.out.println("\nAfter adding two additional input to the cache, the entries are as followed: \n");
    for (Entry<Integer, String> entry : lruCache.entrySet()) {
      System.out.println(entry);
    }
  }
}
