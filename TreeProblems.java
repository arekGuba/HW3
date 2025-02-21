/*
 * *** Arek Gubala / COMP 272-001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

 import java.util.*;

 public class TreeProblems {
 
   /**
    * Method different()
    *
    * Given two TreeSets of integers, return a TreeSet containing all elements
    * that are NOT in both sets. In other words, return a TreeSet of all the
    * elements that are in one set but not the other.
    */

   public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

     // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
     //
     // This can be done numerous ways, but once such will only that
     // *several* lines of code. Hint: create two temporary TreeSets and utilize the
     // methods retainAll(), addAll(), and removeAll(). But in the end, get something
     // to work.

     Set<Integer> union = new HashSet<>(setA);
     Set<Integer> intersection = new HashSet<>(setA);

     union.addAll(setB);  // every individual element in sets A and B combined
     intersection.retainAll(setB); // every element that exists in both set A and B

     // Every element - elements that exist in both sets = elements that ONLY exists EITHER in A or B
     union.removeAll(intersection);

     return union;
   }
 
   /**
    * Method removeEven()
    *
    * Given a treeMap with the key as an integer, and the value as a String,
    * remove all <key, value> pairs where the key is even. 
    */
 
   public static void removeEven(Map<Integer, String> treeMap) {

     // INSERT CODE HERE.

    /*
    * to prevent an error occuring as we delete keys while we traverse the set of treeMap's keys,
    * first, we make a temporary set to store the even keys of treeMap's keys. once we have
    * them, delete elements with those keys in treeMap
    */
    
    // empty set which will contain the even keys in treeMap
     Set<Integer> evenKeys = new HashSet<>();

     // for-each key in treeMap, if it's even, add that key integer to evenKeys
     for (Integer i : treeMap.keySet()) {
        if (i % 2 == 0){
          evenKeys.add(i);
        }
     }
     // now that we have all even keys, remove them from treeMap
     for (Integer i : evenKeys){
        treeMap.remove(i);
     }
     return;
   }
 
 
   /**
    * Method treesEqual()
    *
    * Given two treeMaps, each with the key as an integer, and the value as a String,
    * return a boolean value indicating if the two trees are equal or not.
    */
 
   public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
 
     // INSERT CODE HERE

     // if both trees are null, they they're equal to each other
     if (tree1 == null && tree2 == null){
      return true;
    }
    // no point in checking if treeMaps are equal if only one is null
    if (tree1 == null || tree2 == null){
      return false;
    }

    return (tree1.equals(tree2));
   }
 
 } // end treeProblems class
