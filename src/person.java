class person{
	//atribut
	private String nama;
	
	//konstruktor
	person(){
	}
	
	person(String nama){
		this.nama=nama;
	}
	
	//get dan set
	public String getnama(){
		return nama;
	}
	
	public void setnama(String nama){
		this.nama=nama;
	}
	
	//print attribute
	public void printattribute(){
		System.out.println("Nama adalah "+nama);
	}
}