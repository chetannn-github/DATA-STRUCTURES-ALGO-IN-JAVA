findUnion(arr1, arr2, n, m)
{  
    let one = 0 , two = 0, i = 0,ans = [];
    ans[0] =Number.NEGATIVE_INFINITY;
    
    while(one<arr1.length || two<arr2.length){
        if(one < arr1.length && arr1[one]<=ans[ans.length-1]){one++}
        else if(two < arr2.length && arr2[two]<=ans[ans.length-1]){two++}
        
        else if (one >= arr1.length){
          ans[i] = arr2[two];
            two++;i++;
            
        }
        else if (two >= arr2.length){
          ans[i] = arr1[one];
            one++;i++;
        }else if(arr1[one]== arr2[two]){
            
          ans[i]= arr1[one];
            one++ ; two++;i++;
        }else if(arr1[one]>arr2[two]){
            
          ans[i] = arr2[two];
            two++;i++;
        }else if(arr1[one]<arr2[two]){
           ans [i] = arr1[one];
            one++;i++;
        }
        
        
    }
    
  
return ans
}