

let arr=[4,-5,3,-1,3,-4,-1];
let max=Number.MIN_VALUE;
for(let i=0;i<arr.length;i++){
   let sum=0;
    for(let j=i;j<arr.length;j++){
     
        sum=sum+arr[j];
        
        max=Math.max(sum,max);


    }
}

console.log(max);