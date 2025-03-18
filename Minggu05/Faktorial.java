package Minggu05;

public class  Faktorial {
    
    public int faktorialBf(int n){
    int fakto = 1;
    int i = 1;  
    while (i <= n) {  
        fakto *= i;  
        i++; 
    }
    return fakto;

   }

    public int faktorialDc(int n){
        if (n==1) {
            return 1;
        }else{
            int fakto = n * faktorialDc(n-1);
            return fakto;
        }
    }
}
