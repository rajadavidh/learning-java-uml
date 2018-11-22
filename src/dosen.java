class dosen extends person{
	//attribut
		private String NIP;
		
	//konstruktor
		dosen (String nama, String NIP){
			super(nama);
			this.NIP=NIP;
		}
		
	//get dan set
		public String getNIP(){
			return NIP;
		}
		
		public void setNIP(String NIP){
			this.NIP=NIP;
		}
		
	//printattribute
		public void printattribute(){
			super.printattribute();
			System.out.println("NIP adalah "+NIP);
		}

}