package p42_sortedarray;

import java.util.Arrays;

public class p42_sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,2,3,4,5};
		int cnt=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				//System.out.println(a[i]+" - "+a[i+1]);
				cnt++;
			}
		}
		if(cnt==a.length-1)
		{
			System.out.println("Sorted Order");
		}
		else
		{
			System.out.println("Unsorted Order");
		}
	
	}

}
