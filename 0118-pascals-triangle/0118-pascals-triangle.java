import java.util.List;
import java.util.ArrayList;
class Solution {

    List<List<Integer>> pascal = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {

        for (int row = 1; row <= numRows; row++) {

            List<Integer> temp = new ArrayList<>();

            int ans = 1;

            temp.add(ans);

            for (int col = 1; col < row; col++) {

                ans = ans * (row - col);
                ans = ans / col;

                temp.add(ans);
            }

            pascal.add(temp);
        }

        return pascal;
    }
}