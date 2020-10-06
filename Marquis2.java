package com.hitop.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Marquis2 {

  List<String> ransomWords;

  public Marquis2(String ransomNote) {
    ransomWords = new ArrayList<String>(Arrays.asList(ransomNote.split(" ")));
  }

  public boolean validateWordsExistUsingListIterator(String input) {
    List<String> wordPile = new ArrayList<>(Arrays.asList(input.split(" ")));
    ListIterator<String> ransomWordsIterator = ransomWords.listIterator(); 

    while (ransomWordsIterator.hasNext()) {
      String ransomWord = ransomWordsIterator.next();
      if (wordPile.contains(ransomWord)) {
        wordPile.remove(ransomWord);
        ransomWordsIterator.remove();
      }
    }
    return ransomWords.isEmpty() ? true : false;
  }
}
