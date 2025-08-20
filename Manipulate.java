public class Manipulate {
    public static void main(String[] args) {
        String vowels = "aeiou";
        String name = "chinnapedhanna";
        String not_vowel = "";
        String yes_vowel = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                yes_vowel += ch;
            } else {
                not_vowel += ch;
            }
        }

        System.out.println("The result: " + (yes_vowel + not_vowel));
    }
}
