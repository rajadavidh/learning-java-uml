class prodi{
	//attribut
		private String nama;
		private kelas[] arrkelas = new kelas[10];
		private int jmlkelas;
		
	//konstruktor
		prodi(String nama){
			this.nama=nama;
			jmlkelas=0;
		}
		
	//get dan set
		public kelas[] getarrkelas(){
			return arrkelas;
		}
		
		public void setarrkelas(kelas[] arrkelas){
			this.arrkelas=arrkelas;
		}
		
		public int getjmlkelas(){
			return jmlkelas;
		}
		
		public void setjmlkelas(int jmlkelas){
			this.jmlkelas=jmlkelas;
		}
	
	//print
		public void printattribute(){
			System.out.println("nama prodi adalah "+nama);
			System.out.println("jumlah kelas adalah "+jmlkelas);
		}
		
		public void printarrkelas(){
			for (int i=0;i<=jmlkelas;i++){
				arrkelas[i].printattribute();
			}
		}
	
	//method lain
		public void addarrkelas(kelas kls){
			arrkelas[jmlkelas]=kls;
			jmlkelas++;
		}
		
		
		public double hitungaverageipk(){
			double avg=0.0;
			int jummhs=0;
			for(int i=0;i<=jmlkelas;i++){
				for(int j=0;j<=arrkelas[i].getjmlmhs();j++){
					avg=avg+(arrkelas[i].getarrmhs()[j].getIPK());
				}
				jummhs=jummhs+arrkelas[i].getjmlmhs();
			}
			return (avg/jummhs);
		}
		
		public int hitungtotalbea(){
			int bea=0;
			for(int i=0;i<jmlkelas;i++){
				bea=bea+(arrkelas[i].hitungtotalbea());
			}
			return bea;
		}
		
		public int hitungtotalbeacair(){
			int bea=0;
			for(int i=0;i<jmlkelas;i++){
				bea=bea+(arrkelas[i].hitungtotalbeacair());
			}
			return bea;
		}
	
}
