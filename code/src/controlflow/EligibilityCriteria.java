package controlflow;

public class EligibilityCriteria {
	public boolean isEligible(Student s) {
		if (s.getTenthPercentage() >= 60) {
			if (s.getTwelthPercentage() >= 60) {
				if (s.getCgpa() >= 8.0) {
					if (s.getBacklog() == 0) {
						return true;
					} else {
						return false;
					}

				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}