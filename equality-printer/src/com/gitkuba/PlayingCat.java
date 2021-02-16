package com.gitkuba;

public class PlayingCat {
  public static boolean isCatPlaying(boolean summer, int temperature) {
    int upperLimit = summer ? 35 : 45;
    return temperature <= upperLimit && temperature >= 25;
  }
}
