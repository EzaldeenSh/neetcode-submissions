class Solution {
    public boolean isValid(String s) {

        Stack<Character> characters = new Stack();

        for(int index = 0; index < s.length(); index++) {
            if(isOpening(s.charAt(index))) {

                characters.push(s.charAt(index));

            } else if (characters.empty()) {

                return false;

            } else {

                if (!isCorresponding(characters.pop(), s.charAt(index))) {

                    return false;

                }
            }
        }

        return characters.empty();
    }


    private boolean isOpening(char bracket) {
        return List.of('[', '(', '{').contains(bracket);
    }
    
        private boolean isCorresponding(char leftBracket, char rightBracket) {

            switch (leftBracket) {
                case '[':  return ']' == rightBracket;
                case '(':  return ')' == rightBracket;
                case '{':  return '}' == rightBracket;
            }

            return false;

        }
}
