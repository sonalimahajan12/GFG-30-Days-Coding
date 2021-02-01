class Solution 
{ 
    static long ValidPair(int a[], int n) 
	{ 
	    int p=0,q=a.length-1;
	    long sum=0;
	    Arrays.sort(a);
	    while(p<q)
	    {
	        if(a[p]+a[q]>0)
	        {
	            sum+=q-p;
	            q-=1;
	        }
	        else
	        {
	            p+=1;
	        }
	    }
	    return sum;
	}
} 