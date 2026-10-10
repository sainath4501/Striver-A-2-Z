// *

// **

// ***

// ****

// *****

// ****

// ***

// **

// *

class Solution {
    public void pattern10(int n) {
            for(int i=1;i <= 2*n-1;i++){
                int star=i;
                if(i<=n){
                    star=i;
                }else{
                    star=2*n-i;
                }
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
