
public class TestesEstadoCidade {

	public static void main(String[] args) {

		Estado santaCatarina = new Estado("Santa Catarina", "SC", "7.165.000");
		Estado parana= new Estado("Paraná", "PR", "11.080.000");
		
		Cidade paranaCapital =  new Cidade("Curitiba", parana, "1 963 726");
		Cidade santaCatarinaCapital = new Cidade("Florianópolis", santaCatarina, "508.826");
		
		Pessoa pessoa1 = new Pessoa("Maria", 30, new Profissao("Médica", 10000, "Hospital De Florianópolis"), paranaCapital);
        Pessoa pessoa2 = new Pessoa("João", 40, new Profissao("Desenvolvedor", 8000, "Sênior Sistemas"), santaCatarinaCapital);
        
		 System.out.println("Estado PR: " + parana.toString());
	        System.out.println("Estado SC: " + santaCatarina.toString());
	        System.out.println("Cidade de Curitiba: " + paranaCapital.toString());
	        System.out.println("Cidade de Florianópolis: " + santaCatarinaCapital.toString());
	        System.out.println("Pessoa Maria: " + pessoa1.toString());
	        System.out.println("Pessoa João: " + pessoa2.toString());
	}

}
