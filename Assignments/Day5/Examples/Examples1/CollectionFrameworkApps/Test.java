package CollectionFrameworkApps;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			LinkedHashMap<String, ShareX> shareMap = new LinkedHashMap<String, ShareX>();
		//HashMap<String, ShareX> shareMap=new HashMap<String, ShareX>();	
			for (int i = 0; i < 10; ++i)
			{
				ShareX s = new ShareX();
				
				shareMap.put("Share "+(i+1), s);	
			}
			//System.out.println(shareMap);
			
			Set<Entry<String, ShareX>> s1=shareMap.entrySet();
			//you can create iterator object by this set interface object
		//	for (Entry<String, ShareX> e : shareMap.entrySet())
			for (Entry<String, ShareX> e : s1)
			{
				
				System.out.println("Stock: " + e.getKey());
				System.out.println("====================");
				
				for (int j = 0; j < 10; ++j)
				{
					System.out.println("Day " + (j+1) + ": " + e.getValue().getSharePrice(new Date()));
				}
				
				System.out.println("********************");
				System.out.println("");
				
			}

		}

	}


