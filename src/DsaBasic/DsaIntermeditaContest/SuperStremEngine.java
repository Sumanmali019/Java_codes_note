package DsaBasic.DsaIntermeditaContest;

/* 
 * 
 *Problem Description :-
 *You've just been hired as a network engineer at SuperStream, a leading video streaming service. One of your first tasks is to optimize the number of video data packets sent to users based on their internet connectivity.
 *When a user hits "play," video data is transmitted in packets. If their device acknowledges these packets quickly, it means they have a strong connection and can receive more packets simultaneously for smoother streaming. If acknowledgments lag, fewer packets should be sent to prevent buffering.
 *Given an array A, where each entry represents the acknowledgment time (in milliseconds) for individual packets, and two integers B and C, can you determine if there's a continuous sequence of B packets with an average acknowledgment time less than or equal to °C milliseconds? If so, it's a green signal (integer 1) to send more packets. Otherwise, it's time to throttle back (integer 0).
 */

class SuperStremEngine {

    public int solve(int[] A, int B, int C) {

        int n = A.length;

        int slidingWindow = 0;

        for (int i = 0; i < B; i++) {
            slidingWindow += A[i];
        }

        if (slidingWindow / B <= C) {
            return 1;
        }

        for (int i = B; i < n; i++) {
            slidingWindow -= A[i - B];
            slidingWindow += A[i];

            if (slidingWindow / B <= C) {
                return 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        SuperStremEngine engine = new SuperStremEngine();

        int[] A = { 30, 25, 40, 35, 20, 45, 50, 55, 22, 18, 150 };
        int B = 3;
        int C = 30;

        int res = engine.solve(A, B, C);

        System.out.println(res);

    }

}