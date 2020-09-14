public class Mommifier {
    public String addMommy(String input) throws InputException {
        if(input == null) {
            throw new InputException();
        } else if(!isContainVowels(input)){
            return input;
        }
        return null;
    }

    private Boolean isContainVowels(String input) {
        String vowels = "aeiou";
        for (int i = 0; i < input.length(); i++) {
            if(vowels.contains(input.charAt(i) + "")) {
                return true;
            }
        }
        return false;
    }
}
