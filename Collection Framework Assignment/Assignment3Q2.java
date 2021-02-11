// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.LinkedHashSet;

// public class Assignment3Q2 
// {
//     public static void main(String[] args)
//     {
//         Assignment3Q2.ordered(null);
//         System.out.println("-----------------------");
//         Assignment3Q2.unordered(null);
//     }
//     public static LinkedHashSet ordered(LinkedHashSet linkedHashSet)
//     {
//         LinkedHashSet<String> ord = new LinkedHashSet<>();
//         ord.add("A");
//         ord.add("B");
//         ord.add("C");
//         ord.add("D");
//         ord.add("E");

//         Iterator<String> j = ord.iterator();
//         while(j.hasNext())
//         {
//             System.out.println(j.next());
//         }

//         return ord;

//     }

//     public static HashSet unordered(HashSet hashSet)
//     {
//         HashSet<String> unord = new HashSet<>();
//         unord.add("A");
//         unord.add("B");
//         unord.add("C");
//         unord.add("D");
//         unord.add("E");

//         Iterator<String> i = unord.iterator();

//         while(i.hasNext())
//         {
//             System.out.println(i.next());
//         }

//         return unord;
//     }
// }

