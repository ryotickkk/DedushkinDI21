import org.example.SetIntersectionCheckerTest ;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class SetIntersectionCheckerTest {
    @Nested
    class setIntersectionCheckerTest {
        private final SetIntersectionCheckerTest checker = new SetIntersectionCheckerTest();
        @Test
        void isIntersecting_emptySets() {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            assertFalse(checker.isIntersecting(set1, set2));
        }
        @Test
        void isIntersecting_noIntersection() {
            Set<Integer> set1 = Set.of(1, 2, 3);
            Set<Integer> set2 = Set.of(4, 5, 6);
            assertFalse(checker.isIntersecting(set1, set2));
        }
        @Test
        void isIntersecting_intersectionExists() {
            Set<Integer> set1 = Set.of(1, 2, 3);
            Set<Integer> set2 = Set.of(3, 4, 5);
            assertTrue(checker.isIntersecting(set1, set2));
        }
        @Test
        void isIntersecting_sameSets() {
            Set<Integer> set1 = Set.of(1, 2, 3);
            Set<Integer> set2 = Set.of(1, 2, 3);
            assertTrue(checker.isIntersecting(set1, set2));
        }
        @Test
        void testSetWithDuplicates() {
            Set<Integer> set1 = Set.of(2, 5, 4);
            Set<Integer> set2 = Set.of(2, 5, 4);
            assertTrue(checker.isIntersecting(set1, set2));
        }
        @Test
        void testEqualSets() {
            Set<Integer> set1 = Set.of(1, 2, 3);
            Set<Integer> set2 = Set.of(1, 2, 3);
            assertTrue(checker.isIntersecting(set1, set2));
        }
    }

    private boolean isIntersecting(Set<Integer> set1, Set<Integer> set2) {
    }
}