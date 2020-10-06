package com.hitop.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Marquis4 {

  List<String> ransomWords;

  public Marquis4(String ransomNote) {
    ransomWords = new ArrayList<String>(Arrays.asList(ransomNote.split(" ")));
  }

  public boolean validateWordsExistUsingStreams(String input) {
    List<String> wordPile = new ArrayList<String>(Arrays.asList(input.split(" ")));

    ransomWords.stream()
        .filter(e -> wordPile.contains(e))
        .collect(Collectors.toSet())
        .forEach(ransomWords::remove);

    return ransomWords.isEmpty();
  }
}
