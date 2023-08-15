package telran.measure;

public enum LengthUnit {
	MM(1), CM(10), IN(25.4f), M(1000), KM(1_000_000);

	float value;

	LengthUnit(float value) {
		this.value = value;
	}

	public Length between(Length l1, Length l2) {
		// TODO
		// returns Length object as length between l1 and l2 in "this" units
		// Example: LengthUnit.M.between (new Length(200, LengthUnit.CM), new Length(1,
		// LengthUnit.M))
		// returns Length(1, LengthUnit.M)
		Length length1 = l1.convert(this);
		Length length2 = l2.convert(this);
		return new Length(length2.getAmount() - length1.getAmount(), this);
	}

	public float getValue() {
		return value;
	}
 
}
 