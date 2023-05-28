//knapsack problem

class Knapsack{
	static int[][] t=new int[11][5];
	static{
		
	for(int i=0;i<11;i++){
		
	   for(int j=0;j<5;j++)
	   {
		   t[i][j]=-1;
	   }
	}
	}
	
	
	
	public static int knapsack(int wa[],int vl[],int W,int n){
		// base condition for recurive function
		if (W== 0 || n==0)
			return 0;
		
		//System.out.println(t[W][n]);
	if(t[W][n]!=-1){
		return t[W][n];
	}
		//choise 
		//otimality
		
		if (wa[n]<=W)
			return t[W][n]=Math.max(vl[n]+knapsack(wa,vl,W-1,n-1),knapsack(wa,vl,W,n-1));
		
		
		else if(wa[n]>W)
		   return t[W][n]=knapsack(wa,vl,W,n-1);
	   
	   return 0;
	}
	
public static void main(String[] args){
	// first of all we will have two array for wait and profit means value 
	int wa[]={1,4,3,2};
	int vl[]={3,4,2,3};
	int W=10;
	int n=wa.length-1;
	
	
	int result=knapsack(wa,vl,W,n);
	System.out.println(result);
	
	//Knapsack problems is telles to mind out the max befit from carring the item 
	
	


}
	
}

