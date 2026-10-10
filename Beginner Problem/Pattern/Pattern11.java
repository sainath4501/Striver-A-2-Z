// 1 

// 0 1 

// 1 0 1 

// 0 1 0 1 

// 1 0 1 0 1

class Solution {
    public void pattern11(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){

                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                if(j<i){
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}