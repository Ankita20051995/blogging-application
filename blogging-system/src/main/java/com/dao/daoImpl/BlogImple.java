package DAO;

import java.util.*;


import com.BloggingApplication.model.Rating;
 
public class BlogImple implements BlogDAO
{
 

	@Override
	public void AvgRating(Rating rating) {
		// TODO Auto-generated method stub
		ArrayList<Integer> rating1 = new ArrayList<Integer>();
		 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Please enter a list of numbers: ");
	       
	      while (in.hasNextDouble())
	      {
	         int input = in.nextInt();
	         rating1.add(input);
	      }
	 
	      if (rating1.size() == 0)
	      {
	         System.out.println("No average.");
	 
	      } 
	       
	      else
	      {
	         int total = 0;
	         for (int element : rating1)
	         {
	            total = total + element;
	         }
	         double average = total / rating1.size();
	         System.out.println("The average is: " + average);
	 
	      }
	}
   }



