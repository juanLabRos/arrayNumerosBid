/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraynumerosbid;

/**
 *
 * @author Juan Labandeira Ros
 */
public class ArrayNumerosBid {

   
    
    public static void main(String[] args) {
	
	System.out.println("Array bidimensional de números");
	
	//creamos el array
	
	int[][] array = new int[4][5];
	
	array[0][0]=1;
	array[0][1]=1;
	array[0][2]=1;
	array[0][3]=1;
	array[0][4]=1;
	
	array[1][0]=1;
	array[1][1]=1;
	array[1][2]=1;
	array[1][3]=1;
	array[1][4]=1;
	
	array[2][0]=1;
	array[2][1]=1;
	array[2][2]=1;
	array[2][3]=1;
	array[2][4]=1;
	
	array[3][0]=1;
	array[3][1]=1;
	array[3][2]=1;
	array[3][3]=1;
	array[3][4]=1;
	
	
	for(int i=0; i<4;i++){
	    System.out.println("");
	    for (int j=0; j<5;j++){
		 System.out.println("\t\n"+array[i][j]);
	    }
	   
	}
    }
    
}
