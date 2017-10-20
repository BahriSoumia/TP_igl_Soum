import java.util.Vector;

/**
 * Created by Soumia-PC on 14/10/2017.
 */
public int[] Inverser(Vector<Integer> vect,int k ) {
        int i, j, x;
        int n = vect.size();
        i = 0;
        j = n-1 ;
        int [] tab = new int[vect.size()];
        for ( i=0 ; i < vect.size();i++){
            tab[i] = vect.get(j);
            j--;

        }
        for ( i =0 ; i < tab.length;i++)
        {
            vect.add(i,tab[i]);
            System.out.print("--"+vect.get(i));
        }

        return tab;
    }
/* par bull */

     public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }

        }
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
