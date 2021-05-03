package gameProject;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " icin gecerli " +	" %" + campaign.getCampaignRate()
		+ " oraninda kampanya eklenmistir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() + " id numarasına sahip kampanya bilgileri güncellenmistir.");
		System.out.println("*********************");
		System.out.println("Kampanya adi: " + campaign.getName() + "\n" + "Kampanya orani: %"
				+ campaign.getCampaignRate() + "\n");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getName() + " isimli kampanya basarili bir sekilde silinmistir");
		
	}

	
}
