package net.company.exam;

import java.util.Arrays;

public class NumberOfDiscIntersections {
	
	public static int soluton(int[] A){

        // write your code in Java SE 8
        // write your code in Java SE 8
        if (A.length < 2)
            return 0;
        Long rightBoundry[] = new Long[A.length];
        Long leftBoundry[] = new Long[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                rightBoundry[i] = leftBoundry[i] = (long) i;
            } else {
                rightBoundry[i] = (long) i + A[i];
                leftBoundry[i] = (long) i - A[i];
            }
        }

        Arrays.sort(rightBoundry);
        Arrays.sort(leftBoundry);


        int in = 0;
        long s = 0;


        for (int i = 0; i < leftBoundry.length; i++) {

            if (leftBoundry[i] > rightBoundry[in]) {
                int y = 0;
                while (in < rightBoundry.length && leftBoundry[i] > rightBoundry[in]) {
                    y++;
                    in++;
                }
                if (y > 0)
                    s = s + (leftBoundry.length - i) * y;
            }


        }


        long t = (((long) A.length) * ((long) A.length - 1)) / 2;
        //System.out.println(t-s);
        if ((t - s) > 10000000)
            return -1;
        return (int) (t - s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
