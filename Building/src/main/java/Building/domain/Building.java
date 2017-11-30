package Building.domain;

public class Building {

		private String name;
		private String cat;
		private String image;
		
		

		public Building(String name, String cat, String image) {
			super();
			this.name = name;
			this.cat = cat;
			this.image = image;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCat() {
			return cat;
		}
		public void setAuthor(String author) {
			this.cat = author;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
}