public class Inimenev2{
	public static void main(String[] args){
		Inimene inimene1=new Inimene(70.0, 150.0);
		Inimene inimene2=new Inimene(80.0, 200.0);
		System.out.println("Kui lbs oleks kg siis mu kaal oleks suur:"+inimene1.lbs());	
		System.out.println("Wingload1 on:"+inimene1.lbs()/inimene1.ruutjalad);
		System.out.println("Wingload2 on:"+inimene1.lbs()/inimene2.ruutjalad);
			}
		
		
	
} 