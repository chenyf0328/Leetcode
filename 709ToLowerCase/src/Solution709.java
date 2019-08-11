public class Solution709 {
    public String toLowerCase(String str) {
        char[] origin = new char[str.length()];
        origin = str.toCharArray();
        String result = "";

        for (char iter: origin){
            if (iter>=65 && iter <= 90)
                iter = (char)(iter + 32);
            result += iter;
        }

        return result;
    }
}
