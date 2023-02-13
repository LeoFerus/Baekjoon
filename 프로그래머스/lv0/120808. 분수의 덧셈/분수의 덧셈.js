function solution(numer1, denom1, numer2, denom2) {
    
    let top = denom1*numer2+denom2*numer1;
    
    let bottom = denom1*denom2
    
    let maximum = 1;
    
    for(let i = 0; i<=top;i++){
        if(top%i===0&&bottom%i===0){
            maximum =i;
        }
    }
    
    var answer = [top/maximum,bottom/maximum];
    return answer;
}