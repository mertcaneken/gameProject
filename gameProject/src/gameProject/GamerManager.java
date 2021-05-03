package gameProject;

public class GamerManager implements GamerService {

	private ValidationManager validationManager;

	public GamerManager(ValidationManager validationManager) {
		this.validationManager = validationManager;
	}
	
	@Override
	public void register(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Kaydiniz basarili bir sekilde tamamlandi.");
		}else
			System.out.println(" Hatal� Kay�t");
		
		
	}

	@Override
	public void login(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Basarili giris");
		}else
			System.out.println(" Hatali giris ");
	
	}

	@Override
	public void update(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println("Basariyla G�ncellendi :  " + gamer.getFirstName());
		}else
			System.out.println(" Hatali G�ncelleme ");
		
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println("Basariyla Silindi :  " + gamer.getFirstName());
		}else
			System.out.println(" Hatali, Silme Islemi Basarizi ");
		
	}

}
