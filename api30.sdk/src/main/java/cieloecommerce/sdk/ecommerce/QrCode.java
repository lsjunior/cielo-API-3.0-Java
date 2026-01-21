package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class QrCode {
  @SerializedName("Expiration")
  private Integer expiration;

  public QrCode() {
    this.expiration = Integer.valueOf(3600); // 1h
  }

  public QrCode(Integer expiration) {
    this.expiration = expiration;
  }

  public void setExpiration(Integer expiration) {
    this.expiration = expiration;
  }

  public Integer getExpiration() {
    return this.expiration;
  }

}
