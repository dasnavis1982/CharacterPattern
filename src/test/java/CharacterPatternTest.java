import org.example.CharacterPattern;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CharacterPatternTest {

    private CharacterPattern characterPattern;

    @BeforeEach
    public void characterPattern() {
        characterPattern = new CharacterPattern('*');
    }

    @Test
    public void testTriangularCharacterPattern() {
        String expectedOutput = "*\n**\n***\n****\n*****\n";
        String actualOutput = characterPattern.getPattern(5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void invalidTestTriangularCharacterPattern() {
        CharacterPattern characterPattern = new CharacterPattern('*');
        String actualOutput = characterPattern.getPattern(-1);
        assertNull(actualOutput, "Invalid pattern");
    }

}