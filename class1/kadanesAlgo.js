

let arr=[4,5,-10,1,3,-1,-2,12,-7,6];

let max=Number.MIN_VALUE;

let currSum=0;

for(let i=0;i<arr.length;i++){

    currSum=currSum+arr[i];

    if(max<currSum){
        max=currSum;
    }

    if(currSum<0){
        currSum=0;
    }
}

console.log(max);