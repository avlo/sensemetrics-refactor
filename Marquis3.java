package com.hitop.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Marquis3 {

  List<String> ransomWords;
  
  public Marquis3(String ransomNote) {
    ransomWords = new ArrayList<String>(Arrays.asList(ransomNote.split(" ")));
  }

  public boolean validateWordsExistUsingCollectionsFrequency(String input) {
    List<String> wordPile = new ArrayList<String>(Arrays.asList(input.split(" ")));

    for (String ransomWord : ransomWords) {
      if (Collections.frequency(wordPile, ransomWord) >= Collections.frequency(ransomWords, ransomWord))
        continue;
      return false;
    }
    return true;
  }
}
