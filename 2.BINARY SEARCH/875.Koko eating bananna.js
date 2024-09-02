
var minEatingSpeed = function(piles, h) {
    let start = 1;
    let end = Math.max(...piles);
    let ans = end;
    while(start<=end){
        let mid = start + Math.floor((end-start)/2);
       
        if(speedPossible(mid,piles,h)){
            ans = mid;
            end = mid-1;

        }else{
            start = mid+1;
        }
   
    }
    return ans;
   
    };

let speedPossible = (speed,piles,h)=>{
    let ans = 0;
    for (let i =0 ; i<piles.length; i++){
        ans = ans + Math.ceil(piles[i]/speed);
        if(ans>h){return false}
        
    }
    return true;
    
}