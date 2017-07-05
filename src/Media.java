
public class Media {
	private String titre;
	private String description;
	private boolean isActive;
	
	public Media(){}
	
	public Media(String titre, String description, boolean isActive) {
		super();
		this.titre = titre;
		this.description = description;
		this.isActive = isActive;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Media [titre=" + titre + ", description=" + description + ", isActive=" + isActive + "]";
	}
	
	
}
