package _14_Scope;

class Difference {

    int maximumDifference;

    int[] arr;

    public Difference(int[] arr) {
        this.arr = arr;
    }

    void computeDifference() {
        maximumDifference = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                int dif = arr[i] - arr[j];
                int positiveDif = Math.abs(dif);
                if (positiveDif > maximumDifference) {
                    maximumDifference = positiveDif;
                }
            }
        }
    }
}
