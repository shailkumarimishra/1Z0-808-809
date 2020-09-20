package enumeration;

public enum Level {
	HIGH{

		@Override
		public String asLowerCase() {
			return HIGH.toString().toLowerCase();
		}},
		MEDIUM{
			@Override
			public String asLowerCase() {
				return MEDIUM.toString().toLowerCase();
			}
		};
public abstract String asLowerCase();
}
