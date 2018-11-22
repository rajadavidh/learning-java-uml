class mahasiswa extends person{
	//atribut
		private String NIM;
		private float IPK;
		private int status;
		//private int beasiswa;
		
	//konstruktor
		mahasiswa(String nama,String NIM,float IPK,int status){
			super(nama);
			this.NIM=NIM;
			this.IPK=IPK;
			this.status=status;
			//this.beasiswa=beasiswa;
		}
	//get dan set
		public String getNIM(){
			return NIM;
		}
		
		public void setNIM(String NIM){
			this.NIM=NIM;
		}
		
		public float getIPK(){
			return IPK;
		}
		
		public void setIPK(float IPK){
			this.IPK=IPK;
		}
		
		public int getstatus(){
			return status;
		}
		
		public void setstatus(int status){
			this.status=status;
		}
		
		/*public int getbeasiswa(){
			return beasiswa;
		}
		
		public void setbeasiswa(int beasiswa){
			this.beasiswa=beasiswa;
		}*/

	//printattribute
		public void printattribute(){
			super.printattribute();
			System.out.println("NIM adalah "+NIM);
			System.out.println("IPK adalah "+IPK);
			System.out.println("status adalah"+status);
			
		}
		
	//method lain
		public int hitungbeasiswa(float IPK){
			if (IPK>=3 && IPK<=4) {
				return 1000000;
			} else if( IPK>=2 && IPK<3) {
				return 500000;
			} else if( IPK>=1 && IPK<2) {
				return 250000;
			} else {
				return 0;
			}
			
		}
}
