 var numberSeq =[21,25,29,28,22,24,27,26,30];
 numberSeq.sort();

let arrayLength= numberSeq.length;

let missNumberIs=getMissNo(numberSeq,arrayLength);

function getMissNo(arr,n){

    var sum = ((n*(n+1))/2)+((n+1)*arr[0]);
     for(let i=0; i<n;i++)
     sum-=arr[i];

     var missNumber=sum;
         return missNumber;
}

console.log("Missing Number is :"+missNumberIs);

