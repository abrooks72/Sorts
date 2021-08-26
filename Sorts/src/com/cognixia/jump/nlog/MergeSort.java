package com.cognixia.jump.nlog;

public class MergeSort {
	
	 public static void merge(int a[],int l,int m,int h)
	   {  
	       int i, j,c=l;
	       int b[]=new int[h+1];
	 
		for(i = l,j = m+1; i<=m && j<=h; c++)
	             {
	 
	                  if(a[i] <= a[j])
	                  b[c] = a[i++];
	                 else
	                 b[c] = a[j++];
	      	}
		 while(i <= m )    
	                 b[c++] = a[i++];
	 
	               while(j<=h)   
	                 b[c++] = a[j++];
	          
	   	 for(i = l ; i <= h; i++)
	                        a[i] = b[i];
	   } 
	  
	   public static void Sort(int a[],int l,int h)
	   {  
	         if(l<h)
	        {
	           int m=(l+h)/2;
	           Sort(a,l,m);
	           Sort(a,m+1,h);
	           merge(a,l,m,h);
	 
	         } 
	          
	   
	   }
}
