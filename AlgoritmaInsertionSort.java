import java.util.ArrayList;

public class AlgoritmaInsertionSort {

	public static void main(String[] args) {		
		//PREPARING data input
		ArrayList<Double> input 	= new ArrayList<Double>();
		input.add(16.17);
		input.add(10.11);
		input.add(18.19);
		input.add(3.4);
		input.add(12.13);
		input.add(20.0);
		input.add(9.9);
		input.add(14.15);
		input.add(7.8);
		input.add(5.6);
		input.add(1.2);
		//CETAK DATA INPUT
		System.out.println("Data Input   : "+input.toString());
		ArrayList<Double> output	= sort(input);			
	}
	public static ArrayList<Double>sort(ArrayList<Double> data){
			for(int i=1; i<data.size(); i++) {
				double z = data.get(i);
				int j = i;
				while(  j > 0  && data.get(j-1) > z) {
					data.set(j, data.get(j-1));j--;
				}
				data.set(j, z);
				System.out.print("\nStep-"+i+": ");
				for(int k=0;k<data.size();k++) {
					System.out.print(data.get(k)+" ");
				}
			}
		// END OF BEGIN BUBBLE SORT
				
		// CETAK DATA AKHIR
				System.out.print("\nDATA HASIL SORTING : ");
				for(int k=0;k<data.size();k++) {
					System.out.print(data.get(k)+" ");
		     }  
					return data;		
	}
}
