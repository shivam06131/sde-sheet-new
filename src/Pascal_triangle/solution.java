package Pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> val = generateRow( numRows);
        System.out.println(val);
    }

    static List<List<Integer>> generateRow(int numRows){
     List<List<Integer>> res = new ArrayList<List<Integer>>();
     List <Integer> row , prev = null;

     for(int i = 0;i<numRows;i++){
         row = new ArrayList<Integer>();
         for(int j=0;j<=i;j++){
             if(j==0 || j==i){
                 row.add(1);
             }else {
                 row.add(prev.get(j-1) + prev.get(j));
             }
         }
         prev = row;
         res.add(row);
     }

     return res;
    }
}
