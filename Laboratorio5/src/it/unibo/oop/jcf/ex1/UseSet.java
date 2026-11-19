package it.unibo.oop.jcf.ex1;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        
    	SortedSet<String> t = new TreeSet<>();
    	for(int i=1; i<=20 ;i++) {
    		t.add(""+i);
    	}
    	System.out.println(t);
    	
    	for(int i=1; i<=t.size() ;i++) {
    		if(i % 3 == 0) {
    			t.remove(""+i);
    		}
    	}
    	System.out.println(t);
  
    	/*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    }
}
