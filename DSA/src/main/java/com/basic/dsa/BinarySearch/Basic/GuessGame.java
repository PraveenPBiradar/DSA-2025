package com.basic.dsa.BinarySearch.Basic;

public class GuessGame {
    private final int pick; // The secret number

    public GuessGame(int pick) {
        this.pick = pick;
    }

    public static void main(String[] args) {
        GuessGame game = new GuessGame(6); // Pick is 10
        System.out.println(game.guessNumber(10)); // Output: 10
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == -1) {
                high = mid - 1;
            } else if (res == 1) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int guess(int num) {
        if (num == pick) return 0;
        else if (num > pick) return -1;
        else return 1;
    }
}
