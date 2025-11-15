
let  gas = [1,2,3,4,5]
let cost = [3,4,5,1,2]


let tgas=0;
let tcost=0;

for(let i=0;i<gas.length;i++){
    tgas=tgas+gas[i];
    tcost=tcost+cost[i];
}

if(tgas<tcost){
    console.log(-1);
    
}
else{

    let ans=0;
    let currFuel=0;
    for(let i=0;i<gas.length;i++){
        currFuel=currFuel+gas[i]-cost[i];

        if(currFuel<0){
            ans=i+1;
            currFuel=0;
        }
    }

  console.log(ans);

}

