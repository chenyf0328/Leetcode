public class Test {
    public static void main(String[] args){
        Solution253 s = new Solution253();
        Interval[] array = new Interval[4];
        Interval i1 = new Interval(1,5);
        Interval i2 = new Interval(8,9);
        Interval i3 = new Interval(8,9);
        Interval i4 = new Interval(11,12);
        array[0] = i1;
        array[1] = i2;
        array[2] = i3;
        array[3] = i4;

        System.out.println(s.minMeetingRooms(array));
    }
}
