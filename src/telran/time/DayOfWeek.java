package telran.time;

public enum DayOfWeek {
	MON("Mon#Mondey"), TUE("Tue#Tuesday"), WED("Wed#Wednesday"), THU("Thu#Thursday"), FRI("Fri#Friday"),
	SAT("Sat#Saturday"), SUN("Sun#Sunday");

	String shortName;
	String fullName;

	DayOfWeek(String name) {
		String[] tokens = name.split("#");
		shortName = tokens[0];
		fullName = tokens[1];
	}

	public String displayName(TypeDisplay type) {
		return type == TypeDisplay.SHORT ? shortName : fullName;
	}
}
