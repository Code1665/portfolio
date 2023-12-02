public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        s = s.trim();

        int lastSpaceIndex = s.lastIndexOf(' ');

        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        
        LengthOfLastWord obj = new LengthOfLastWord();


        String s1 = "Hello World";
        System.out.println(obj.lengthOfLastWord(s1)); // Output: 5

        String s2 = " fly me to the moon ";
        System.out.println(obj.lengthOfLastWord(s2)); // Output: 4

        String s3 = "luffy is still joyboy";
        System.out.println(obj.lengthOfLastWord(s3)); // Output: 6
    }
}
