package codewars;


/**
 * Testes para a classe Solution.
 */
public class SolutionTest {
    public static void main(String[] args) {
  
        Solution sl = new Solution();
    
        System.out.println( sl.whoLikesIt());
        System.out.println(sl.whoLikesIt("Peter"));
        System.out.println(sl.whoLikesIt("Jacob", "Alex"));
        System.out.println (sl.whoLikesIt("Max", "John", "Mark"));
        System.out.println(sl.whoLikesIt("Alex", "Jacob", "Mark", "Max", "bruninho", "davi"));
    }

}
