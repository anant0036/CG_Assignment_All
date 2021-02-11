// import java.util.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;
// import static java.util.stream.Collectors.toList;
// import static java.util.Comparator.comparing;

// class Trader {
//     private String name;
//     private String city;

//     public Trader(String name,String city)
//     {
//         this.name = name;
//         this.city = city;
//     }


//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getCity() {
//         return this.city;
//     }

//     public void setCity(String city) {
//         this.city = city;
//     }



// }

// public class Assignment5Q9 {
//     public static List<String> printUniqueCities (List <Trader> traders) 
//     {
//         List<?> cities = traders.stream().map(trader -> trader.getName().getClass()).distinct()
//                 .collect(Collectors.toList());

//                 System.out.println(cities);

//         return (List<String>) cities;
//     }

//     public static List<String> tradersFromPuneSortByName(List<Trader> traders)
//     {
//         List<Trader> traders = 
//         traders.stream()
//                         .map(trader::getTrader)
//                         .filter(trader -> trader.getCity().equals("pune"))
//                         .distinct()
//                         .sorted(comparing(Trader::getName))
//                         .collect(toList());
//         System.out.println(traders);
//         return traders;
//     }
// 	}

// 	public static String allTrader3Names(List<Trader> traders) 
//     {
//         String traderStr = 
//         traders.stream().map(transaction -> transaction.getCity().getName())
//                         .distinct()
//                         .sorted()
//                         .reduce("", (n1, n2) -> n1 + n2);
//         System.out.println(traderStr);

//         return traderStr;
//     }
//     public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) 
//     {
//         traders.stream()
//                         .anyMatch(transaction -> transaction.getCity()
//                                                             .equals("indore"));
//     }
    
//     public static void main(String[] args) 
//     {
//         Trader t1 = new Trader("Lana","pune");
//         Trader t2 = new Trader("Digi","indore");
//         Trader t3 = new Trader("Ana","pune");
//         Trader t4 = new Trader("Zack","Pune");
//         Trader t5 = new Trader("joe","Delhi");

//         List<Trader> traders = new ArrayList<Trader>();
//         traders.add(t1);
//         traders.add(t2);
//         traders.add(t3);
//         traders.add(t4);
//         traders.add(t5);

//     }
// }

