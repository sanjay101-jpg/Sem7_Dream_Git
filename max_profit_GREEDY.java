public class max_profit_GREEDY {
    public static void main(String[] Args){
        int [] prices = {7,1,5,3,6,4};
        int minprice=prices[0];// store lowest price seen so for
        int maxprofit=0;// store maxprofit
        for(int i=1;i< prices.length;i++){
            int profit=prices[i]-minprice;// cal profit
            maxprofit=Math.max(maxprofit,profit);//get the maxprofit
            minprice=Math.min(minprice,prices[i]);//get the minprice
        }
        System.out.println("maxprofit:"+maxprofit);
        System.out.println("minprice:"+minprice);
    }

}