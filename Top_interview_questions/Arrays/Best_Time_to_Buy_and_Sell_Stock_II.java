class Solution {
    public int maxProfit(int[] prices) {
        //풀이법 : 첫번째 값부터 비교하면서  최저값 인덱스, 최대값 인덱스 저장한다.  최대값 인덱스는 그 다음값보다 큰지도 비교한다. (다음 값이 더 크면 다음에 파는게 더 큰 이득이니까)
        // 최댓값 인덱스가 최솟값 인덱스보다 큰 경우, 최소에 사서 최대에 팔 수 있기에 프로핏 값 계산한다. 
        //solution : save the lowest, highest price's index.  The highest price's index should be larger than the next index's price. 
        //if the highest price's index is larger than the lowest price's index ,  calculate profit.

        int lowIndex =0; 
        int highIndex=0;
        int profit=0; 
    
        for(int i =0; i<prices.length; i++){
            if(prices[i]<prices[lowIndex]){
                lowIndex=i; 
            }else if(prices[i]>prices[lowIndex]){  
//if price is higher than the lowest price and tomorrow's price, it is the best to sell today and buy another stock tomorrow. 
                if(i!=prices.length-1){ 
        //check if today is the last day. (If it does, don't have to compare with tomorrow's price)
                    if(prices[i]>prices[i+1]){
                        highIndex=i;
                    }
                }else{
                        highIndex=i;
                    }
            }
            
            if((highIndex > lowIndex)){
                profit += prices[highIndex]-prices[lowIndex];
                lowIndex=i+1;
            }
        }
        
        return profit;
    }
}