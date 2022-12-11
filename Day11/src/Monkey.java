import java.util.ArrayList;

public class Monkey implements Comparable<Monkey> {
    public ArrayList<Long> items;
    public boolean operationSelf;
    public int operationNum;
    public boolean operationIsSum;
    public int test;
    public int ifPass;
    public int ifFail;
    public long inspected = 0;

    public Monkey(ArrayList<Long> items, boolean operationSelf, int operationNum, boolean operationIsSum, int test, int ifPass, int ifFail) {
        this.items = items;
        this.operationSelf = operationSelf;
        this.operationNum = operationNum;
        this.operationIsSum = operationIsSum;
        this.test = test;
        this.ifPass = ifPass;
        this.ifFail = ifFail;
    }

    public void calculate(ArrayList<Monkey> monkeys) {
        while (items.size() > 0) {
            long item = items.remove(0);
            long realOpNum = operationSelf ? item : operationNum;
            item = operationIsSum ? item + realOpNum : item * realOpNum;
            item /= 3;
            monkeys.get(item % test == 0 ? ifPass : ifFail).giveItem(item);
            inspected++;
        }
    }

    public void calculateChill(ArrayList<Monkey> monkeys, int globalDivision) {
        while (items.size() > 0) {
            long item = items.remove(0);
            long realOpNum = operationSelf ? item : operationNum;
            item = operationIsSum ? item + realOpNum : item * realOpNum;
            item = item % globalDivision;
            monkeys.get(item % test == 0 ? ifPass : ifFail).giveItem(item);
            inspected++;
        }
    }

    public void giveItem(long item) {
        items.add(item);
    }

    @Override
    public int compareTo(Monkey o) {
        return Long.compare(o.inspected, inspected);
    }
}
