package com.hitop.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * friend wants to kidnap king of village
 * 
 * he's providing a collection (physical) of words from magazines
 * collection of strings is ok
 * 
 * using words he's provided, can we construct a sentence that he's specified
 * 
 * @author nick
 *
 */
public class Marquis1 {

  Map<String, Integer> ransomWords = new HashMap<>();
  
  public Marquis1(String ransomNote) {
    List<String> ransomNoteList = new ArrayList<String>(Arrays.asList(ransomNote.split(" ")));
    for (String word : ransomNoteList) {
      if (this.ransomWords.containsKey(word)) {
        int value = this.ransomWords.get(word).intValue();
        this.ransomWords.put(word, Integer.valueOf(++value));        
      } 
      else {
        this.ransomWords.put(word, 1);
      }
    }
  }
  
  public boolean validateWordsExistUsingMap(String input) {
    String[] words = input.split(" ");
    List<String> wordList = new ArrayList<String>(Arrays.asList(words));
    
    for (String word : wordList) {
      if (this.ransomWords.containsKey(word)) {
        int value = this.ransomWords.get(word).intValue();
        if (value > 0) {
          this.ransomWords.put(word, --value);
        }
      }
    }
    
    for (int value: this.ransomWords.values()) {
      if (value > 0) return false;
    }
    return true;
  }
  


  public static void main(String[] args) {
    System.out.println("PILE 1:");
    String pile = "one one two";
    String ransomNote = "one two three";
    Marquis1 m1 = new Marquis1(ransomNote);
    System.out.println(m1.validateWordsExistUsingMap(pile));
    Marquis2 m2 = new Marquis2(ransomNote);
    System.out.println(m2.validateWordsExistUsingListIterator(pile));
    Marquis3 m3 = new Marquis3(ransomNote);
    System.out.println(m3.validateWordsExistUsingCollectionsFrequency(pile));
    Marquis4 m4 = new Marquis4(ransomNote);
    System.out.println(m4.validateWordsExistUsingStreams(pile));
    System.out.println("");
    
    System.out.println("PILE 2:");
    pile = "one three";
    ransomNote = "one two three";
    m1 = new Marquis1(ransomNote);
    System.out.println(m1.validateWordsExistUsingMap(pile));
    m2 = new Marquis2(ransomNote);
    System.out.println(m2.validateWordsExistUsingListIterator(pile));
    m3 = new Marquis3(ransomNote);
    System.out.println(m3.validateWordsExistUsingCollectionsFrequency(pile));
    m4 = new Marquis4(ransomNote);
    System.out.println(m4.validateWordsExistUsingStreams(pile));
    System.out.println("");
    
    System.out.println("PILE 3:");
    pile = "one two three";
    ransomNote = "one two three";
    m1 = new Marquis1(ransomNote);
    System.out.println(m1.validateWordsExistUsingMap(pile));
    m2 = new Marquis2(ransomNote);
    System.out.println(m2.validateWordsExistUsingListIterator(pile));
    m3 = new Marquis3(ransomNote);
    System.out.println(m3.validateWordsExistUsingCollectionsFrequency(pile));
    m4 = new Marquis4(ransomNote);
    System.out.println(m4.validateWordsExistUsingStreams(pile));
    System.out.println("");

    System.out.println("PILE 4:");
    pile = "one one two three";
    ransomNote = "one two three";
    m1 = new Marquis1(ransomNote);
    System.out.println(m1.validateWordsExistUsingMap(pile));
    m2 = new Marquis2(ransomNote);
    System.out.println(m2.validateWordsExistUsingListIterator(pile));
    m3 = new Marquis3(ransomNote);
    System.out.println(m3.validateWordsExistUsingCollectionsFrequency(pile));
    m4 = new Marquis4(ransomNote);
    System.out.println(m4.validateWordsExistUsingStreams(pile));
    System.out.println("");

    System.out.println("PILE 5:");
    pile = "one two three";
    ransomNote = "one one two three";
    m1 = new Marquis1(ransomNote);
    System.out.println(m1.validateWordsExistUsingMap(pile));
    m2 = new Marquis2(ransomNote);
    System.out.println(m2.validateWordsExistUsingListIterator(pile));
    m3 = new Marquis3(ransomNote);
    System.out.println(m3.validateWordsExistUsingCollectionsFrequency(pile));
    m4 = new Marquis4(ransomNote);
    System.out.println(m4.validateWordsExistUsingStreams(pile));
    System.out.println("");

    System.out.println("PILE 6:");
    pile = "one";
    ransomNote = "one one";
    m1 = new Marquis1(ransomNote);
    System.out.println(m1.validateWordsExistUsingMap(pile));
    m2 = new Marquis2(ransomNote);
    System.out.println(m2.validateWordsExistUsingListIterator(pile));
    m3 = new Marquis3(ransomNote);
    System.out.println(m3.validateWordsExistUsingCollectionsFrequency(pile));
    m4 = new Marquis4(ransomNote);
    System.out.println(m4.validateWordsExistUsingStreams(pile));
    System.out.println("");

    System.out.println("PILE 7:");
    pile = "one two";
    ransomNote = "two one";
    m1 = new Marquis1(ransomNote);
    System.out.println(m1.validateWordsExistUsingMap(pile));
    m2 = new Marquis2(ransomNote);
    System.out.println(m2.validateWordsExistUsingListIterator(pile));
    m3 = new Marquis3(ransomNote);
    System.out.println(m3.validateWordsExistUsingCollectionsFrequency(pile));
    m4 = new Marquis4(ransomNote);
    System.out.println(m4.validateWordsExistUsingStreams(pile));
    System.out.println("");
  }
}
