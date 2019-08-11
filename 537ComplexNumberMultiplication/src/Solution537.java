public class Solution537 {
    public String complexNumberMultiply(String a, String b) {
        String[] first = a.split("\\+");
        String[] second = b.split("\\+");

        int aa = Integer.parseInt(first[0]);
        int bb = Integer.parseInt(first[1].substring(0, first[1].length()-1));
        int cc = Integer.parseInt(second[0]);
        int dd = Integer.parseInt(second[1].substring(0, second[1].length()-1));

        int resultAA = aa*cc - bb*dd;
        int resultBB = bb*cc + aa*dd;

        return resultAA+"+"+resultBB+"i";
    }
}
