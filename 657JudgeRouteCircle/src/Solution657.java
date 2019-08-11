public class Solution657 {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        char[] step=moves.toCharArray();
        for (char s: step){
            switch(s){
                case 'U': y--; break;
                case 'D': y++; break;
                case 'L': x--; break;
                case 'R': x++; break;
                default: break;
            }
        }

        return (x==0 && y==0);
    }
}
