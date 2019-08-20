/* Write an algorithm to output the state of the cells after the given number of days
 *
 *
*/
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n;
        int arrLength;

        //int[] arr = new int[] { 1, 0, 1, 0, 1, 1, 0, 1 };
        int[] arr = new int[] {1, 0, 0, 0, 0, 1, 0, 0};
        int[] out = new int[8];
        n = 2;
        arrLength = arr.length;
        if (arrLength != 0) {
            while (n != 0) {
                for (int i = 0; i < arrLength; i++) {
                    if ((i == 0 && arr[i + 1] == 1) ||
                        ((i == arrLength - 1) && arr[arrLength - 2] == 1)) {
                        System.out.println("inside edge case " + i);
                        out[i] = 1;
                    } else if (i > 0 && i <= arrLength - 2) {
                        if (arr[i - 1] != arr[i + 1]) {
                            System.out.println("inside 1 - 6 indexes (active) " + i);
                            out[i] = 1;
                        } else {
                            System.out.println("inside 1 - 6 indexes (inactive) " + i);
                            out[i] = 0;
                        }
                    } else {
                        System.out.println("Inactive case " + i);
                        out[i] = 0;
                    }
                }
                n--;
                System.arraycopy(out, 0, arr, 0, arrLength);
                System.out.println("iteration " + n);
                for (int i = 0; i < out.length; i++) {
                    System.out.print(out[i] + " ");
                }
            }
        }

    }
}


/* Another class which returns a list
 *
 */
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;
import java.util.ArrayList;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{        
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
        int arrLength = states.length;
        int[] out = new int[arrLength];
        if (arrLength != 0) {
            while (days != 0) {
                for (int i = 0; i < arrLength; i++) {
                    if ((i == 0 && states[i + 1] == 1) ||
                        ((i == arrLength - 1) && states[arrLength - 2] == 1)) {
                        //System.out.println("inside edge case " + i);
                        out[i] = 1;
                    } else if (i > 0 && i <= arrLength - 2) {
                        if (states[i - 1] != states[i + 1]) {
                            //System.out.println("inside 1 - 6 indexes (active) " + i);
                            out[i] = 1;
                        } else {
                            //System.out.println("inside 1 - 6 indexes (inactive) " + i);
                            out[i] = 0;
                        }
                    } else {
                        //System.out.println("Inactive case " + i);
                        out[i] = 0;
                    }
                }
                days--;
                System.arraycopy(out, 0, states, 0, arrLength);
                //System.out.println("iteration " + n);
                /*for (int i = 0; i < out.length; i++) {
                    System.out.print(out[i] + " ");
                }*/
            }
        }
		List<Integer> list = new ArrayList<>(arrLength);

		for (int i : states) {
			list.add(Integer.valueOf(i));
		}
        return list;
    }
  // METHOD SIGNATURE ENDS
}
