import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @ParameterizedTest
    @CsvSource({
            "anna, true",
            "civic, true",
            "level, true",
            "madam, true",
            "aba, true",
            "a, true",
            "racecar, true",
            "not, false",
            "test, false",
            "string, false",
    })
    void isPalindrome_shouldReturnTrueIfTheStringIsPalindrome(String input, boolean expected) {
        assertEquals(expected, palindromeChecker.isPalindrome(input));
    }
}
public class palindromeChecker {

}
