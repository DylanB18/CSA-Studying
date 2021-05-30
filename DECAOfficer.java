class DECAOfficer extends Person {
		final static int stateMembers = 7000;
		int districtMembers;

		DECAOfficer(int age, String name, int districtMembers) {
			super(age, name);
			this.districtMembers = districtMembers;
		}
}
