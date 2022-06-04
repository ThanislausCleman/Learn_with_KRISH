 var numberSeq =[30,26,24,25,22,27,28,29,21];   
 numberSeq.sort();

let arrayLength= numberSeq.length;

let missNumberIs=getMissNo(numberSeq,arrayLength);

function getMissNo(arr,n){

    var sum = ((n*(n+1))/2)+((n+1)*arr[0]);
     for(let i=0; i<n;i++)
     sum-=arr[i];

     var missNumber=sum;
     //console.log(missingNumber);
         
     if(missNumber < arr[n - 1]){ // missed a number but not first or last number
         return missNumber;
     }else if (missNumber%2==0 && n%2==1){ //number of array element is odd and last namber is missed
         return missNumber;
     }else if(missNumber%2==1 && n%2==1){ //number of array element is odd and first namber is missed
         return (missNumber-(n+1));
     }else if(missNumber%2 ==0 && n%2 ==0){ //number of array element is even and first namber is missed
         return (missNumber-(n+1));
     }else if(missNumber%2 == 1 && n%2 ==0){ //number of array element is even and last namber is missed
        return missNumber;
         return missNumber;
     }

}

console.log("Missing Number is:- "+missNumberIs);
