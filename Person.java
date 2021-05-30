class Person {
		Person() {
			age = 0;
			name = "Generic";
		}

		Person(int newAge, String newName) {
			this.age = newAge;
			this.name = newName;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}

		public void setAge(int newAge) {
			age = newAge;
		}

		public void setName(String newName) {
			name = newName;
		}

		public String toString() {
			return name + " is a Person age " + age;
		}

		private int age;
		private String name;
}
