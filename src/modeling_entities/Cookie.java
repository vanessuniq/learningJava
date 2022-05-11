package modeling_entities;

import java.util.Random;

public class Cookie {
  public static final String cookieType = "SESSION_COOKIE";
  private static final Random uniqId = new Random();
  private static int all = 0;
  private String id;
  private String userName;
  private String sessionKey;
  private int itemsInCart;

  public Cookie(String userName, String sessionKey, int itemsInCart) {
    this.id = "cookieId-" + uniqId.nextInt();
    this.userName = userName;
    this.sessionKey = sessionKey;
    this.itemsInCart = itemsInCart;
    all++;
  }

  public static int getAll() {
    return all;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getSessionKey() {
    return this.sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public int getItemsInCart() {
    return this.itemsInCart;
  }

  public void setItemsInCart(int itemsInCart) {
    this.itemsInCart = itemsInCart;
  }

  @Override
  public String toString() {
    return String.format("Cookie id: %s, userName: %s, sessionKey: %s, itemsInCart: %d.", id, userName, sessionKey,
        itemsInCart);
  }
}
