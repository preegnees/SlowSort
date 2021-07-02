import java.util.ArrayList;
import java.util.Arrays;

public class justSort {
    private int c1 = 0;
    private int c2 = 0;
    private String oneOrTwo;
    private String array;
    public justSort ( int c1, int c2,  String oneOrTwo ) {
        this.c1 = c1;
        this.c2 = c2;
        this.oneOrTwo = oneOrTwo;
    }
    public justSort ( String array, String oneOrTwo ) {
        this.oneOrTwo = oneOrTwo;
        this.array = array;
    }
    private ArrayList<Integer> arrFalse = new ArrayList<>();
    private ArrayList<Integer> arrTrue = new ArrayList<>();

    public ArrayList<Integer> raspredSort () {
        ArrayList<Integer> aI = new ArrayList<>();
        if ( oneOrTwo.equals("1") ) {
            filling();
            soutArrFalse();
            aI = sort();
        } else if ( oneOrTwo.equals("2") ) {
            fillingExclusive();
            soutArrFalse();
            aI = sort();
        }
        return aI;
    }
    public ArrayList<Integer> sort () {
        while ( !arrFalse.isEmpty() ) {
            int min = arrFalse.get(0);
            int indexMin = arrFalse.indexOf(min);
            for (int i = 0; i <= arrFalse.size() - 1; i++) {
                if (min >= arrFalse.get(i)) {
                    min = arrFalse.get(i);
                    indexMin = arrFalse.indexOf(min);
                }
            }
            arrTrue.add(min);
            arrFalse.remove(indexMin);
        }
        return arrTrue;
    }
    private void filling () {
        for ( int i = c2; i >= c1; i-- ) {
            arrFalse.add(i);
        }
    }
    public void fillingExclusive () {
        ArrayList<String> arr = new ArrayList<String>(
                Arrays.asList(array.split(" "))
        );
        for ( int i = 0; i < arr.size(); i++ ) {
            arrFalse.add(new Integer(arr.get(i)));
        }
    }
    private void soutArrFalse () {
        System.out.println("Не отсортированный массив: ");
        System.out.println(arrFalse);
        System.out.println("Отсортированный массив: ");
    }
}
