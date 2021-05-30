class DECAOfficer extends Person {
		final static int stateMembers = 7000;
		int districtMembers;

		DECAOfficer() {
			this.districtMembers = 0;
		}

		DECAOfficer(int age, String name, int districtMembers) {
			super(age, name);
			this.districtMembers = districtMembers;
		}

		public String toString() {
			return getName() + " is a DECA Officer age " + getAge() + " with " + districtMembers + " district members";
		}
}
