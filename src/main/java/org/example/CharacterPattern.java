package org.example;

public class CharacterPattern {
    private char characterPattern;

    public CharacterPattern(char characterPattern) {
        this.characterPattern = characterPattern;
    }

    public String getPattern(int numRows) {
        if (numRows <= 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(characterPattern);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}