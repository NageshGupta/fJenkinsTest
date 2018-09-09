import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Codechef {

	public static void main(String[] args) throws java.lang.Exception {
		
		Map<String, CityNames> cityMap = new HashMap<>();
		String array[] = { "Chennai Velachery", "Chennai Adyar", "Chennai Vadapalani", "Chennai Avadi",
				"Kovai peelamedu", "Kovai Gandhipuram", "Kovai singanallur", "Erode SathyaMangalam", "Erode Bhavani", "Erode gopi" };
		List<String> strList= null;
		for (String str : array) {
			String[] strArray = str.split(" ");
			if (cityMap.containsKey(strArray[0])) {
				strList = cityMap.get(strArray[0]).getCityName();
				strList.add(str);
				cityMap.get(strArray[0]).setCityName(strList);
				cityMap.get(strArray[0]).setCount(cityMap.get(strArray[0]).getCount() + 1);
				cityMap.put(strArray[0], cityMap.get(strArray[0]));
			} else {
				CityNames cityObj = new CityNames();
				strList = new ArrayList<>();
				strList.add(str);
				cityObj.setCityName(strList);
				cityObj.setCount(1);
				cityMap.put(strArray[0], cityObj);
			}
		}

		for (Map.Entry<String, CityNames> cityMap1 : cityMap.entrySet()) {
			System.out.println(" Key is :: " + cityMap1.getKey() + " city values " + cityMap1.getValue().getCityName()
					+ " count " + cityMap1.getValue().getCount());
		}

	}
}

class CityNames {
	private List<String> cityName;
	private int count;

	public int getCount() {
		return this.count;
	}

	public void setCityName(List<String> cityName) {
		this.cityName = cityName;
	}

	public List<String> getCityName() {
		return this.cityName;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
