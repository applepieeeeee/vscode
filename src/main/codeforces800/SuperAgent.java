/*
    PROBLEM DESCRIPTION:
    Pearlo is standing at the entrance, but to get inside he need to pass combination lock. 
    A minute ago one of the workers entered the password on the terminal and opened the door. 
    The terminal is a square digital keyboard 3 × 3 with digits rom 1 to 9. Pearlo knows that 
    the password consists from distinct digits and is probably symmetric with respect to the 
    central button of the terminal. He has heat sensor which allowed him to detect the digits 
    which the worker pressed. Now he wants to check whether the password entered by the worker 
    is symmetric with respect to the central button of the terminal. This fact can Help Pearlo 
    to reduce the number of different possible password combinations.

    INPUT: Input contains the matrix of three rows of three symbols each. Symbol «X» means that the 
    corresponding button was pressed, and «.» means that is was not pressed. The matrix may contain 
    no «X», also it may contain no «.».

    OUTPUT: Print YES if the password is symmetric with respect to the central button of the terminal 
            and NO otherwise.
 */

/*
    SYMMETRY Conditions: 
    (0,0) should be equal to (2,2)
    (0,1) should be equal to (2,1)
    (0,2) should be equal to (2,0)
    (1,0) should be equal to (1,2)
    (1,1) is always symmetric with itself.
 */

import java.util.*;
public class SuperAgent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] matrix = new char[3][3];
        for (int i = 0; i < 3; i++){
            matrix[i] = s.nextLine().toCharArray();
        }
        s.close();

        if (isSymmetric(matrix)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isSymmetric(char[][] matrix){
        return matrix[0][0] == matrix[2][2] && matrix[0][1] == matrix[2][1] && matrix[0][2] == 
        matrix[2][0] && matrix[1][0] == matrix[1][2];
    }
}
