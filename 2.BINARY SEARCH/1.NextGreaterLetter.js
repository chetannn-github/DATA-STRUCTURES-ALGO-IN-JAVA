// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. 
// There are at least two different characters in letters.

// Return the smallest character in letters that is lexicographically greater than target.
//  If such a character does not exist, return the first character in letters.




var nextGreatestLetter = function(letters, target) {
    let ans = letters[0];

    let start = 0;
    let end = letters.length-1;
    while(start<= end){
        let mid =start + Math.floor((end-start)/2);

        if(letters[mid]>target){
            ans = letters[mid];
            end = mid-1; 
        }else{
            start = mid+1;
        }
    }
    return ans;
};