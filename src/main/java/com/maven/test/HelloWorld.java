package com.maven.test;

/**
Simple Hello World
 */


/**
 * @author    John Smith
 * @version   1.6
 * @since     2015-09-23
 */
final class HelloWorld {
    /**
     JavaDoc Comment.
     */
    private HelloWorld() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
    }
    /**
     *JavaDoc Comment.
     *@param args args
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
    }
}
