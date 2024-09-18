package edu.grinnell.csc207.util.predicates;

import edu.grinnell.csc207.util.Predicate;

/**
 * Predicates for small strings.  Uses a form of the Singleton pattern.
 * Clients cannot create SmallString objects; they must reference
 * SmallString.PRED.
 *
 * @author Samuel A. Rebelsky
 */
public class OddInteger implements Predicate<Integer> {
  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * One copy of this predicate, following the singleton pattern.
   */
  public static final OddInteger PRED = new OddInteger();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new predicate. Made private to prevent clients from
   * creating new objects (part of the singleton pattern).
   */
  private OddInteger() {
  } // OddInteger()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine if val is an odd integer.
   *
   * @param val
   *   The integer we evaluate.
   *
   * @return
   *   true if val is odd and false if val is even.
   */
  public boolean holds(Integer val) {
    return (val % 2) == 1;
  } // holds

} // class OddInteger
