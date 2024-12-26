import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	    public static void main(String[] args) {
	        List<IceCreamParlour> parlours = Arrays.asList(
	            new IceCreamParlour("Amul", Arrays.asList("Vanilla", "Chocolate", "Strawberry")),
	            new IceCreamParlour("CreamStone", Arrays.asList("Mint", "Pista", "Chocolate")),
	            new IceCreamParlour("Naturals", Arrays.asList("Mango", "Pineapple", "Coconut"))
	        );

	        // Using map
	        List<List<String>> flavoursList = parlours.stream()
	                                              .map(IceCreamParlour::getFlavours) // Returns a stream //
	                                              .collect(Collectors.toList());

	        System.out.println("IceCream flavours using map:");
	        flavoursList.forEach(System.out::println);
	        
	        
	        // ************************************ //
	        List<IceCreamParlour> iceParlours = Arrays.asList(
		            new IceCreamParlour("Amul", Arrays.asList("Vanilla", "Chocolate", "Strawberry")),
		            new IceCreamParlour("CreamStone", Arrays.asList("Mint", "Pista", "Chocolate")),
		            new IceCreamParlour("Naturals", Arrays.asList("Mango", "Pineapple", "Coconut"))
	            );

	            // Using flatMap
	            List<String> flavours = iceParlours.stream()
	                                        .flatMap(cream -> cream.getFlavours().stream())
	                                        .collect(Collectors.toList());

	            System.out.println("IceCream flavours using flatMap:");
	            flavours.forEach(System.out::println);
	            
	        }
	    }


	class IceCreamParlour {
	    private String name;
	    private List<String> flavours;

		public IceCreamParlour(String name, List<String> flavours) {
	        this.name = name;
	        this.flavours = flavours;
	    }

	    public List<String> getFlavours() {
	        return flavours;
	    }
	    
	    public String getName() {
			return name;
		}
	}

