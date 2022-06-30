package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union2Array {

//    Question Link : https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1

    public static int doUnion(int a[], int n, int b[], int m)
    {

//     Incorrect Approach Should Use Set
//       int flag = 0 ;
//        System.out.println(n+" "+m);
//       Arrays.sort(a);
//       Arrays.sort(b);
//       if(n >= m){
//            for(int i = 0; i<=m-1;i++){
//              if(a[i] == b[i] )
//               flag++;
//              else{
//                  flag =+2;
//                  i++;
//              }
//            }
//            flag = flag +(n-m);       } else{
//           for(int i = 0; i<=n-1;i++){
//               if(a[i] == b[i])
//                   flag++;
//               else{
//                  flag = +2;
//                   i++;
//               }
//           }
//           flag = flag +(m-n);
//       }
//       return flag;
        Set<Integer> hs = new HashSet<>();


        for(int i = 0; i < n; i++) {
            hs.add(a[i]);
        }

        for(int j = 0; j < m; j++) {
           hs.add(b[j]);
        }

        return hs.size();
    }


    public static void main(String[] args) {
       int a [] = {69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,},
        b[]= {9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233};
        System.out.println(doUnion(a,a.length,b,b.length));
    }
}
