class Hanoi {

    public long toh(int N, int from, int to, int aux) {
       if(N == 0){
           return 0;
       }
       long c1 = toh(N-1,from,aux,to);
       System.out.println("move disk "+ N +" from rod "+ from +" to rod "+ to);
       long c2  = toh(N-1,aux,to,from);
       return c1+c2+1; //no of steps

    }
}
