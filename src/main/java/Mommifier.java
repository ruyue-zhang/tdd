public class Mommifier {
    public String addMommy(String input) throws InputException {
        if(input == null) {
            throw new InputException();
        } else if(isVowelsMoreThan30Percent(input) && hasRepeat(input)) {
            return insertMommy(input);
        } else {
            return input;
        }
    }

    private Boolean isVowelsMoreThan30Percent(String input) {
        String vowels = "aeiou";
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if(vowels.contains(input.charAt(i) + "")) {
                vowelCount++;
            }
        }
        return input.length() < vowelCount * 3;
    }

    private Boolean hasRepeat(String input) {
        return input.contains("aa") || input.contains("ee") || input.contains("ii") || input.contains("oo") || input.contains("uu");
    }

    private String insertMommy(String input) {
        String vowels = "aeiou";
        String result = null;
        if(!isVowelsMoreThan30Percent(input) && !hasRepeat(input)) {
            return input;
        } else {
            for (int i = 0; i < input.length(); i++) {
                if(vowels.contains(input.charAt(i) + "") && input.charAt(i) == input.charAt(i + 1)) {
                    result = input.substring(0, i + 1) + "mommy" + input.substring(i + 1);
                    break;
                }
            }
            return insertMommy(result);
        }
    }
}
