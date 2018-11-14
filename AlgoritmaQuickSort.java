import java.util.ArrayList;

public class AlgoritmaQuickSort {	
	
		static void quickSort (int a[], int indexMIN, int indexMAX){
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

		    //  lo adalah index bawah, hi adalah index atas
		    //  dari bagian array yang akan di urutkan
		        int i=indexMIN, j=indexMAX, h;
		        int pivot=a[indexMIN];

		    //  pembagian
		        do{
		            while (a[i]<pivot) i++;
		            while (a[j]>pivot) j--;
		            if (i<=j)
		            {
		                h=a[i]; a[i]=a[j]; a[j]=h;//tukar
		                i++; j--;
		            }
		        } while (i<=j);

		    //  pengurutan
		        if (indexMIN<j) quickSort(a, indexMIN, j);
		        if (i<indexMAX) quickSort(a, i,indexMAX);
		    }

		    
		    public static void main(String[] args) {
		        int tabInt[]={24,17,18,15,22,26, 13, 21, 16, 28};
		        int i,n=10;
		        
		            for(i=0;i<n;i++){
		                System.out.print(tabInt[i]+ " ");
		           }
		            System.out.print("\n");
		        quickSort(tabInt,0,n-1);
		        
		        for(i=0;i<n;i++){
		            System.out.print(tabInt[i]+" ");
		        }

		    }

		}


