// import java.util.ArrayList;

// class ParkingSlot 
// {
//     private String ownerName;
//     private int carNumber;
//     private int token;
//     private int level;
//     private int section;
//     private int slot;

//     public ParkingSlot
//     (
//         String ownerName,
//         int carNumber,
//         int token,
//         int level,
//         int section,
//         int slot
//     )
//     {
//         super();
//         this.ownerName = ownerName;
//         this.carNumber = carNumber;
//         this.token     = token;
//         this.level     = level;
//         this.section   = section;
//         this.slot      = slot;

//     }
//     public String getName()
//     {
//         return ownerName;
//     }
//     public void setName(String ownerName)
//     {
//         this.ownerName = ownerName;
//     }
//     public int getcarNumber()
//     {
//         return carNumber;
//     }
//     public void setcarNumber(int carNumber)
//     {
//         this.carNumber = carNumber;
//     }

//     public int getToken()
//     {
//         return token;
//     }
//     public void setToken(int token)
//     {
//         this.token = token;
//     }
//     public int getLevel()
//     {
//         return level;
//     }
//     public void setLevel(int level)
//     {
//         this.level = level;
//     }
//     public int getSection()
//     {
//         return section;
//     }
//     public void setSection(int section)
//     {
//         this.section = section;
//     }
//     public int getsLot()
//     {
//         return slot;
//     }
//     public void setsLot(int slot)
//     {
//         this.slot = slot;
//     }


// }

// class Parked_CarOwenerList
// {
    
//     ArrayList<Assignment3Q7> list= new ArrayList<Assignment3Q7>();
    

//     int levels = 3;
//     int sections = 4;
//     int slots = 20;
//     public void add_new_car(Assignment3Q7 obj)
//     {
//         list.add(obj);
//     }
//     public void remove_car(String name,int carNo)
//     {
//         list.remove(carNo);
//     }
//     public String get_parked_car_location(int token)
//     {
//         int yetoken = 0;
//         for(int i= 0;i<list.size();i++)
//         {
            
//         }

//     }
// }

// public class Assignment3Q7{
//     private String name;
//     private String carModel;
//     private int carNo;
//     private int mobileNumber;
//     private String address;

//     public Assignment3Q7
//     (
//         String name,
//         String carModel,
//         int carNo,
//         int mobileNumber,
//         String address
//     )
//     {
//         super();
//         this.name         = name;
//         this.carModel     = carModel;
//         this.carNo        = carNo;
//         this.mobileNumber = mobileNumber;
//         this.address      = address;
//     }
//     public String getName()
//     {
//         return name;
//     }
//     public void setName(String name)
//     {
//         this.name = name;
//     }
//     public String getcarModel()
//     {
//         return carModel;
//     }
//     public void setcarModel(String carModel)
//     {
//         this.carModel = carModel;
//     }
//     public int getcarNo()
//     {
//         return carNo;
//     }
//     public void setcarNo(int carNo)
//     {
//         this.carNo = carNo;
//     }
//     public int getmobileNumber()
//     {
//         return mobileNumber;
//     }
//     public void setmobileNumber(int mobileNumber)
//     {
//         this.mobileNumber = mobileNumber;
//     }
//     public String getAddress()
//     {
//         return address;
//     }
//     public void setAddress(String address)
//     {
//         this.address = address;
//     }




//     public static void main(String[] args)
//     {
//         Assignment3Q7 assign1 = new Assignment3Q7("jeep", "compass", 101, 99975, "LA");
//         Assignment3Q7 assign2 = new Assignment3Q7("hydudai", "i10", 104, 99945, "LAS VAGAS");
//     }
// }

