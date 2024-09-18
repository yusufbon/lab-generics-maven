package edu.grinnell.csc207.util;

/**
 * Dynamic arrays of values.
 *
 * @param <T>
 *   The type of value stored in the dynamic array.
 */
public interface DynamicArray<T> {
  /**
   * Set the element i of the array to val.
   *
   * @param i
   *   The index into which we store the element.
   * @param val
   *   The value to store.
   *
   * @pre i >= 0
   * @post get(i) = val
   */
  public void set(int i, T val);

  /**
   * Get element i of the array.
   *
   * @param i
   *   The index to retrieve.
   *
   * @return
   *   The most recent value stored using set(i, ...). If the ith
   *   element has not been set, returns null.
   *
   * @pre i >= 0
   */
  public T get(int i);
} // interface DynamicArray<T>
