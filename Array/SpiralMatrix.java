package muthuArray;

public class SpiralMatrix {

	public static void main(String[] args) {
		      int[][] ar = new int[4][4];
		      
		      int i=1;
		      
		      int row=0, col=0;
		      for( col=0;col<ar.length;col++)
		      {
		    	  ar[row][col]=i;
		    	  i++;
		      }
		      
		/*    ar[0][0]=i;i++;
		      ar[0][1]=i;i++;
		      ar[0][2]=i;i++;
		      ar[0][3]=i;i++;
*/	
		  //    System.out.println("row :"+row); //0
		  //    System.out.println("col :"+col); //4
		      
		      row++; //1
		      col--; //3
		      while(row<ar.length)
		      {
		    	  ar[row][col]=i;
		    	  i++;
		    	  row++;
		      }
		      
		/*    ar[1][3]=i;i++;
		      ar[2][3]=i;i++;
		      ar[3][3]=i;i++;
*/		      
		 //     System.out.println("row :"+row); //4
		 //     System.out.println("col :"+col); //3
		      
		      row--; //3
		      col--; //2
		      while(col>=0)
		      {
		    	  ar[row][col]=i;
		    	  i++;
		    	  col--;
		      }
		/*    ar[3][2]=i;i++;
		      ar[3][1]=i;i++;
		      ar[3][0]=i;i++;
*/		      
		  //    System.out.println("row :"+row); //3
		  //    System.out.println("col :"+col); //-1
		      
		      row--; //2
		      col++; //0
		      while(row>0)
		      {
		    	  ar[row][col]=i;
		    	  i++;
		    	  row--;
		      }
		      
	  /*      ar[2][0]=i;i++;
		      ar[1][0]=i;i++;
*/		      
		//      System.out.println("row :"+row); //0
		//      System.out.println("col :"+col); //0
		      
		      row++; //1
		      col++; //1
		      while(col<3)  // ar.length-1
		      {
		    	  ar[row][col]=i;
		    	  i++;
		    	  col++;
		      }
	/*	      ar[1][1]=i;i++;
		      ar[1][2]=i;i++;
*/
		      
		  //    System.out.println("row :"+row); //1
		  //    System.out.println("col :"+col); //3
		      
		      row++;
		      col--;
		      while(row<ar.length-1)
		      {
		    	  ar[row][col]=i;
		    	  i++;
		    	  row++;
		      }
		      
		   //   ar[2][2]=i;i++;
		      
		 //     System.out.println("row :"+row); //3
		 //     System.out.println("col :"+col); //2
		      
		      row--; //2
		      col--; //1
		      while(col<ar.length-2)
		      {
		    	  ar[row][col]=i;
		    	  col++;
		      }
		      
		  //    ar[2][1]=i;
		      
		      for( row=0;row<ar.length;row++)
		      {
		    	  for( col=0;col<ar.length;col++)
		    	  {
		    		  System.out.print(ar[row][col]+"\t");
		    	  }
		    	  System.out.println();
		      }
		    
	}

}
