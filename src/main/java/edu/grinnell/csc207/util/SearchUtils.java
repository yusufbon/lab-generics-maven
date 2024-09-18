package edu.grinnell.csc207.util;

/**
 * Some simple search utilities.
 */
public class SearchUtils {
  /**
   * Find the first value for which a predicate holds.
   *
   * @param <T>
   *   The type of values we are searching.
   * @param vals
   *   The array we want to search.
   * @param pred
   *   A predicate to check over each value.
   * @return the first value in vals for which the predicate holds.
   *   Return null if nothing is found.
   */
  public static <T> T search(T[] vals, Predicate<T> pred) {
    for (int i = 0; i < vals.length; i++) {
      if (pred.holds(vals[i])) {
        return vals[i];
      } // if
    } // for
    return null;
  } // search(T[], Predicate<T>)
} // class SearchUtils
