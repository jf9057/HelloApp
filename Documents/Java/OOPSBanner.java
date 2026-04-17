public class OOPSBanner {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[] {
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[] {
                "PPP ",
                "P  P",
                "PPP ",
                "P   ",
                "P   "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[] {
                " SSS ",
                "S    ",
                " SS  ",
                "   S ",
                "SSS  "
        });

        CharacterPatternMap[] banner = { O, O, P, S };

        int height = banner[0].getPattern().length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : banner) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}