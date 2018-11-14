import java.util.ArrayList;
import java.util.Arrays;

public class AlgoritmaShellSort {

	public static void main(String[] args) {
		//PREPARING DATA INPUT
				ArrayList<Double> data = new ArrayList<Double>();
				data.add(16.17);
				data.add(10.11);
				data.add(18.19);
				data.add(3.4);
				data.add(12.13);
				data.add(20.0);
				data.add(9.9);
				data.add(14.15);
				data.add(7.8);
				data.add(5.6);
				data.add(1.2);
				
		int jarak=8;
		
		System.out.println("DATA AWAL : "+data.toString());
		System.out.println("PROSES BUBBLE SORT :");
		for(int a = 0; a < data.size(); a++) {
			if (jarak>1) {
				jarak/=2;
			}
			for(int b = 0; b < data.size()-jarak; b++) {
				if(data.get(b) > data.get(b+jarak)) {
					Double temp = data.get(b);
					data.set(a, data.get(a+jarak));
					data.set(a+1, temp);
									
				System.out.println("STEP->"+", MIN = "+data.get(b+1)+" SWAP("+(a+1)+","+data.get(b+1)+")"+" -> "+data.toString());
			}
		}
			
			System.out.println("");
		}
		
		System.out.println("HASIL SORTING BUBBLE : "+data.toString());
		}
	}

