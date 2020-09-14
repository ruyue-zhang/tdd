public class Mommifier {
    public String addMommy(String input) throws InputException {
        if(input == null) {
            throw new InputException();
        } else if(!isContainVowels(input)){
            return input;
        } else if(!isVowelsMoreThan30Percent(input)) {
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

    private Boolean isVowelsMoreThan30Percent(String input) {
        String vowels = "aeiou";
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if(vowels.contains(input.charAt(i) + "")) {
                vowelCount++;
            }
        }
        return input.length() / vowelCount < 3;
    }
}
