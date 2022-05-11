package modeling_entities;

public class Cookie {
  public static String cookieType = "LOGGED_IN_USER_COOKIE";
  private String id;
  private String userName;
  private String sessionKey;
  private int itemsInCart;

  public Cookie(String id, String userName, String sessionKey, int itemsInCart) {
    this.id = id;
    this.userName = userName;
    this.sessionKey = sessionKey;
    this.itemsInCart = itemsInCart;
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
