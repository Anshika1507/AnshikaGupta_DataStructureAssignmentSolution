package com.greatlearning.distinctfloormain;

import java.util.ArrayList;
import java.util.Scanner;

import com.greatlearning.distinctfloor.DistinctFloor;
import com.greatlearning.floor.Floor;

public class DistinctFloorMain {

	public static void main(String[] args) {
		
		int totalFloors ;
		Scanner sc =new Scanner(System.in);

		
		System.out.println("Enter the total no of floors in the building");
		totalFloors = sc.nextInt();
		ArrayList<Floor> list = new ArrayList<Floor>(totalFloors);
		
		
		for(int i =0; i < totalFloors; i++) 
		{
			System.out.println("Enter the floor size given on day :" +(i+1));		
			Floor f = new Floor();
			f.size = sc.nextInt();
			f.day = i+1;		
			list.add(i,f);		
		}
		DistinctFloor df = new DistinctFloor();
		df.sortFloor(list);
		sc.close();


	}

}
