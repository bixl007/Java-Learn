public class _010_varArgs {
    public int sumNum(int... args) {
        System.out.println("Number of arguments: " + args.length);
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        _010_varArgs obj = new _010_varArgs();
        int sum2 = obj.sumNum(1, 2, 3, 4, 5);
        System.out.println("Sum2 = " + sum2);
    }
}
