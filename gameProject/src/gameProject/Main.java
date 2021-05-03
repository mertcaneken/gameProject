package gameProject;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new  Game();
		game1.setId(1);
		game1.setCategory("Fight");
		game1.setName("DodoMayCry");
		game1.setPrice(10);
	
		
		Game game2 = new  Game();
		game2.setId(2);
		game2.setCategory("SoulsLike");
		game2.setName("DodoSouls");
		game2.setPrice(5);
		
		
		Game game3 = new  Game();
		game3.setId(3);
		game3.setCategory("Co-Op");
		game3.setName("Dodofront II");
		game3.setPrice(5);
		
		
	
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setTc("12345678911");
		gamer1.setFirstName("Mertcan");
		gamer1.setLastName("Eken");
		gamer1.setMoney(175);
		gamer1.setDateOfBirth("06/07/2002");
		
		Gamer gamer2 = new Gamer();
		gamer2.setId(2);
		gamer2.setTc("12345678912");
		gamer2.setFirstName("Dodo");
		gamer2.setLastName("Dodo");
		gamer2.setMoney(9999999);
		gamer2.setDateOfBirth("09/10/2020");
		
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Dodo Bahar Indirimleri");
		campaign1.setCampaignRate(50);
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setName("Tüm ürünlerde %20 indirim");
		campaign2.setCampaignRate(10);
		
		GamerManager gamerManager = new GamerManager(new ValidationManager());
		gamerManager.register(gamer1);
		System.out.println("");
		gamerManager.login(gamer1);
		System.out.println("");
		gamerManager.update(gamer1);
		System.out.println("");
		gamerManager.delete(gamer1);
		
		System.out.println("");
		System.out.println(" --------------------------------------- ");
		System.out.println("");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		System.out.println("");
		campaignManager.update(campaign1);
		System.out.println("");
		campaignManager.delete(campaign1);
		System.out.println("");
		
		System.out.println("");
		System.out.println(" --------------------------------------- ");
		System.out.println("");
		
		GameManager gameManager = new GameManager();
		gameManager.sell(gamer1, campaign1, game1);
		
	}
}
