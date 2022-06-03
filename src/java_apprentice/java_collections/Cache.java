package java_apprentice.java_collections;

import java.util.LinkedHashMap;

import java.util.Map.Entry;

public class Cache extends LinkedHashMap<Integer, String> {
  private static final long serialVersionUID = 1L;
  private static final int MAX_CACHE_SIZE = 5;

  public Cache() {
    super(16, 0.75f, true);
  }

  @Override
  protected boolean removeEldestEntry(Entry<Integer, String> eldest) {
    return size() > MAX_CACHE_SIZE;
  }
}
