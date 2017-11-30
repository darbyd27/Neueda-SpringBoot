package Building.domain;

public class Building {

		private String name;
		private String cat;
		private String label;
		private String value;
		private String image;

		public Building(String name, String cat, String label, String value, String image) {
			super();
			this.name = name;
			this.cat = cat;
			this.label = label;
			this.value = value;
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
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.cat = value;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
}