class GP {
    public static void main(String[] args) {
        int n = 10;
        int a = 2, r = 2;
        int gp;

        for (int i = 0; i < n; i++) {
            gp=(int)(a * Math.pow(r, i));
            System.out.print(" "+gp);
        }
    }
}
