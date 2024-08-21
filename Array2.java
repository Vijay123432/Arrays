public class Array2{
  // Prepare an Array with values of 1,2,3,4,5 and replace the value at 3rd index with 45
  public static void main(String[] args) {
    int[] k = new int[5];
    for (int i = 0; i < k.length; i++) {
        k[i] = i+1;
    }
    System.out.println("arrays values");
    for (int i = 0;i<k.length;i++) {
        if(i==2){
          k[i]=45;
    }
}
 for(int a:k){
   System.out.println(k);
 }
}

}
