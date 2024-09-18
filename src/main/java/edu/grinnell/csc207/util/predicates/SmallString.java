package edu.grinnell.csc207.util.predicates;

import edu.grinnell.csc207.util.Predicate;

/**
 * Predicates for small strings.  Uses a form of the Singleton pattern.
 * Clients cannot create SmallString objects; they must reference
 * SmallString.PRED.
 *
 * @author Samuel A. Rebelsky
 *
 */
public class SmallString implements Predicate<String> {
  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * One copy of this predicate, following the singleton pattern.
   */
  public static final SmallString PRED = new SmallString();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new predicate. Made private to prevent clients from
   * creating new objects (part of the singleton pattern).
   */
  private SmallString() {
  } // SmallString()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine if val is a small string.
   *
   * @param val
   *   The string we evaluate.
   *
   * @return
   *   true if val is small and false otherwise.
   */
  public boolean holds(String val) {
    return val.length() < 5;
  } // holds(String)
} // class SmallString
