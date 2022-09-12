// --== CS400 File Header Information ==--
// Name: Jerry Yu
// Email: jcyu4@wisc.edu
// Team: HG
// TA: Hang Yin
// Lecturer: Gary Dahl
// Notes to Grader: I submitted the project on time but I accidentally forgot this header
import org.junit.Test;
import static org.junit.Assert.*;
/*
 * This class test the constructor and the insert method of the Red Black Tree class
 */
public class TestRedBlackTree {
  /*
   * Test that the constructor creates a new empty Red Black tree
   */
  @Test
  public void testConstructor() {
    RedBlackTree<Integer> test = new RedBlackTree<Integer>();
    assertEquals(0, test.size());
    assertEquals(true, test.isEmpty());
  }
  /*
   * Test that the class can handle a case 1 violation
   */
  @Test
  public void testCase1() {
    RedBlackTree<Integer> test = new RedBlackTree<Integer>();
    test.insert(24);
    test.insert(28);
    test.insert(32);
    assertEquals(true, test.root.toString().equals("[28, 24, 32]"));
  }
  /*
   * Test that the class can handle a case 2 violation
   */
  @Test
  public void testCase2() {
    RedBlackTree<Integer> test = new RedBlackTree<Integer>();
    test.insert(24);
    test.insert(28);
    test.insert(26);
    assertEquals(true, test.root.toString().equals("[26, 24, 28]"));
  }
  /*
   * Test that the class can handle a case 3 violation
   */
  @Test
  public void testCase3() {
    RedBlackTree<Integer> test = new RedBlackTree<Integer>();
    test.insert(24);
    test.insert(28);
    test.insert(20);
    test.insert(32);
    assertEquals(true, test.root.toString().equals("[24, 20, 28, 32]"));
  }
}
