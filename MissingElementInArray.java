package week1.day1;

import java.util.Arrays;

public class MissingElementInArray {



	public static void main(String[] args) {
		int arr []= {1,2,3,4,6,7,8,9};
		int length=arr.length;
		Arrays.sort(arr);
		// TODO Auto-generated method stub
		for(int i=1;i<length;i++) {
			if(i!=arr[i-1])
			{
				System.out.println(i);
			break;
		}
	}

}
}