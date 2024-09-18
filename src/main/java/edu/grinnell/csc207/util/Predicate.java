package edu.grinnell.csc207.util;

/**
 * A simple predicate.
 *
 * @param <T>
 *   The type of values the predicate will be applied to.
 */
public interface Predicate<T> {
  /**
   * Determine if the predicate holds.
   *
   * @param val
   *   A value.
   *
   * @return true if the predicate holds on val and false otherwise.
   */
  public boolean holds(T val);
} // Predicate<T>
