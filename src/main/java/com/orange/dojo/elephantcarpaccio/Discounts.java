package com.orange.dojo.elephantcarpaccio;

class Discounts {

  private static final float[] PRICE_THRESHOLDS = {
    1000f, 5000f, 7000f, 10000f, 50000f
  };
  private static final float[] DISCOUNT_RATES = {
    0.03f, 0.05f, 0.07f, 0.10f, 0.15f
  };

  float discountRate(Price price) {
    float priceValue = price.price();
    if (priceValue < PRICE_THRESHOLDS[0]) {
      return 0;
    }
    for (int i = 1; i < PRICE_THRESHOLDS.length; i++) {
      if (priceValue < PRICE_THRESHOLDS[i]) {
        return DISCOUNT_RATES[i-1];
      }
    }
    return DISCOUNT_RATES[PRICE_THRESHOLDS.length - 1];
  }

  DiscountPrice discount(Price price) {
    float discountRate = discountRate(price);
    float discountPrice = price.price() * (1 - discountRate);
    return new DiscountPrice(discountPrice);
  }
}
