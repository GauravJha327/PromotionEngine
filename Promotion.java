package com.promotionengine.promotion;

import java.util.*;

public interface Promotion {
 int apply(Map<Character, Integer> items, Map<Character, Integer> prices);
}
