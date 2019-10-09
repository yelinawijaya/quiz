import java.io.*;
public class praktikum{
	public static void main (String[] args) throws IOException{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		String nama,noktp;
		int bayar,kode,status,biaya;
		double diskon,kembalian,totalbayar;
		
		System.out.println("|----|--------------------|--------------------|--------------|");
		System.out.println("|Kode|  Jenis Penerbangan | Tujuan Penerbangan |     Biaya    |");
		System.out.println("|----|--------------------|--------------------|--------------|");
		System.out.println("| 1  | 	      ekonomi     |	   JKT-MKS     | Rp. 1.000.000|");
		System.out.println("| 2  | 	      ekonomi     |	   MKS-JKT     | Rp. 1.500.000|");
		System.out.println("| 3  | 	      bisnis	  |	   JKT-MKS     | Rp. 2.500.000|");
		System.out.println("| 4  | 	      bisnis	  |	   MKS-JKT     | Rp. 3.000.000|");
		System.out.println("|----|--------------------|--------------------|--------------|");
	
		System.out.println();
		System.out.println("inputan Buffered Reader");
		System.out.print("Nama          : ");
		nama=br.readLine();
		System.out.print("No.KTP        : ");
		noktp=br.readLine();
		System.out.println();
		
	
		System.out.print("Kode : ");
		biaya=Integer.parseInt(br.readLine());
		System.out.println();
		

			if(biaya==1){
				System.out.println("Jenis Penerbangan : Ekonomi");
				System.out.println();
				System.out.println("Tujuan Penerbangan : JKT-MKS");
				System.out.println("Harga : Rp. 1.000.000");
				biaya=1000000;
			
			}	
			else if(biaya==2){
				System.out.println("Jenis Penerbangan : Ekonomi");
				System.out.println();
				System.out.println("Tujuan Penerbangan : MKS-JKT");
				System.out.println("Harga : Rp. 1.500.000");
				biaya=1500000;
	
			}
			else if (biaya==3){
				System.out.println("Jenis Penerbangan : Bisnis");
				System.out.println();
				System.out.println("Tujuan Penerbangan : JKT-MKS");
				System.out.println("Harga : Rp. 2.500.000");
				biaya=2500000;
			}
			else if (biaya==4){
				System.out.println("Jenis Penerbangan : Bisnis");
				System.out.println();
				System.out.println("Tujuan Penerbangan : MKS-JKT");
				System.out.println("Harga : Rp. 3.000.000");
				biaya=3000000;
			}
			else{
			System.out.println("Maaf anda salah memasukkan tipe pesawat");
			}
			

			System.out.print("Apakah anda merupakan member(1/0): ");
			status=Integer.parseInt(br.readLine());
			System.out.println();
		
			if(status==1){
				System.out.println("Anda Mendapat Diskon");
				diskon=biaya*0.1;
			}
			else {
				System.out.println("Anda Tidak Mendapat Diskon");
				diskon=biaya+0;
			}

			
	
			System.out.println("Total Diskon: "+diskon);
			totalbayar=biaya-diskon;
			System.out.println("Total Bayar: "+totalbayar);
			System.out.println();
			System.out.print("Bayar : ");
			bayar=Integer.parseInt(br.readLine());
			kembalian=bayar-totalbayar;
			System.out.println("Kembalian: "+kembalian);
			
		}	
	}