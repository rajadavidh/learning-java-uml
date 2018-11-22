class kelas{
	//attribut
		private String kode;
		private mahasiswa[] arrmhs;
		private int jmlmhs;
		
	//konstruktor
		kelas(String kode){
			this.kode=kode;
			jmlmhs=0;
		}
		
	//get dan set
		public mahasiswa[] getarrmhs(){
			return this.arrmhs;
		}
		
		public void setarrmhs(mahasiswa[] arrmhs){
			this.arrmhs=arrmhs;
		}
		
		public int getjmlmhs(){
			return jmlmhs;
		}
		
		public void setjmlmhs(int jmlmhs){
			this.jmlmhs=jmlmhs;
		}
	
	//print
		public void printattribute(){
			System.out.println("kode kelas adalah "+kode);
			System.out.println("jumlah mahasiswa adalah "+jmlmhs);
		}
		
		public void printarrmhs(){
			for(int i=0;i<=jmlmhs;i++){
				arrmhs[i].printattribute();
			}
		}
	
	//method lain
		public void addarrmhs(mahasiswa mhs){
			arrmhs[jmlmhs]=mhs;
			jmlmhs++;
		}
		
		public void filtermahasiswa(float IPK){
			for (int i=0;i<=jmlmhs;i++){
				if (arrmhs[i].getIPK()>=IPK){
					arrmhs[i].printattribute();
				}
			}
		}
		
		public void filtermahasiswa(int status){
			for (int i=0;i<=jmlmhs;i++){
				if (arrmhs[i].getstatus()==status){
					arrmhs[i].printattribute();
				}
			}
		}
		
		public double hitungaverageipk(){
			double avg = 0.0;
			for (int i=0;i<=jmlmhs;i++){
				avg=avg+(arrmhs[i].getIPK());
			}
			return avg/jmlmhs;
		
		}
		
		public int hitungtotalbea(){
			int bea=0;
			for (int i=0;i<=jmlmhs;i++){
				bea=bea+(arrmhs[i].hitungbeasiswa(arrmhs[i].getIPK()));
			}
			return bea;
		
		}
		
		public int hitungtotalbeacair(){
			int bea=0;
			for(int i=0;i<jmlmhs;i++){
				if (arrmhs[i].getstatus()==1){
					bea=bea+(arrmhs[i].hitungbeasiswa(arrmhs[i].getIPK()));
				}
			}
			return bea;
		}
	
}
