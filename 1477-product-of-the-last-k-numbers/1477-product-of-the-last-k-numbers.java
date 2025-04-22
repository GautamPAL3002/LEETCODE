import java.util.ArrayList;

class ProductOfNumbers {

    private ArrayList<Integer> list; // make it an instance variable
    private int ans; // also instance variable

    public ProductOfNumbers() {
        list = new ArrayList<>();
        ans = 1;
    }

    public void add(int num) {
        if (num == 0) {
            list = new ArrayList<>();
            ans = 1;
            return;
        }
        ans *= num;
        list.add(ans);
    }

    public int getProduct(int k) {
        if (k > list.size()) return 0;
        int last = list.get(list.size() - 1);
        if (list.size() == k) return last;
        return last / list.get(list.size() - k - 1);
    }
}
