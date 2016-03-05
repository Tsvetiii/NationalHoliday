import java.util.Date;
@SuppressWarnings("serial")

public class NationalHoliday extends Date {

	Date today = new Date();

	@SuppressWarnings("deprecation")
	public boolean isNatHol() {
		if (today.getMonth() == 2 && today.getDate() == 2) {
			return true;
		}
		return false;
	}

}
