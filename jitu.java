import java.util.*;


public class jitu {
    String username;
    String pass;
    int seat;
    int No= (int) (Math.random() * 10000000);
    String from;
    String to;
    String date;
    String Name;
    int Age;
//    double pnr;

    //    Registration form
    public void Registration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("************** Registration *************");
        System.out.print("First Name : ");
        String first = sc.nextLine();
        System.out.print("Last Name : ");
        String last = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        System.out.print("Gender : ");
        String gender = sc.nextLine();
        System.out.print("UserName : ");
        this.username = sc.nextLine();
        System.out.print("Password : ");
        this.pass = sc.nextLine();
        System.out.println("*****************************************");
    }
    public void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("************** LOGIN *************");
        boolean islogin = false;
        while (!islogin) {
            System.out.print("UserName : ");
            String Username = sc.nextLine();
            System.out.print("Password : ");
            String Pass = sc.nextLine();
            System.out.println("******************************");
            if (Username.equals(username)) {
//                pass is Password
                if (Pass.equals(pass)) {
                    System.out.println();
                    System.out.println("**********************");
                    System.out.println("** Login successful **");
                    System.out.println("**********************");
                    break;
                } else {
                    System.out.println("Incorrect Password");
                }
            } else {
                System.out.println("Incorrect Username");
            }
        }
    }
    public void Book_Ticket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("******* Book Ticket *******");
        System.out.print("From : ");
        this.from = sc.nextLine();
        System.out.print("To : ");
        this.to = sc.nextLine();
        System.out.print("Date : ");
        this.date = sc.next();
        System.out.print("Passenger full Name : ");
        this.Name = sc.next();
        System.out.print("Passenger Age :- ");
        this.Age = sc.nextInt();
        System.out.println("Class type");
        System.out.println("1: 1 AC (1A)");
        System.out.println("2: 2 AC (2A)");
        System.out.println("3: 3 AC (3A)");
        System.out.println("4: Sleeper (SL)");
        System.out.println("5: General (2S))");
        System.out.println("----------------------------");
        System.out.println("Enter your choice of class: ");
        seat = sc.nextInt();
        System.out.println("----------------------------");
        switch (seat) {
            case 1: {
                System.out.println("1 AC (1A)");
                break;
            }
            case 2: {
                System.out.println("2 AC (2A)");
                break;
            }
            case 3: {
                System.out.println("3 AC (3A)");
                break;
            }
            case 4: {
                System.out.println("Sleeper (SL)");
                break;
            }
            case 5: {
                System.out.println("General Class (2S)");

                break;
            }
        }
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("**** You ticket has successful book. ****");
        System.out.println("************ Happy Journey **************");
        System.out.println("*****************************************");
    }
   
         public void  My_Bookings() {
                System.out.println("********** My Bookings **********");
                System.out.println();
                System.out.println("--- My Booking Details ---");
                System.out.println("PNR NO :- " + No);
                System.out.println("FORM :-  " + from);
                System.out.println("To :- " + to);
                System.out.println("DATE :- " + date);
                System.out.println("NAME :- " + Name);
                System.out.println("AGE :- " + Age);
                System.out.print("CLASS :- ");
                switch (seat) {
                    case 1: {
        
                        System.out.println("1 AC (1A)");
                        break;
                    }
                    case 2: {
                        System.out.println("2 AC (2A)");
                        break;
                    }
                    case 3: {
                        System.out.println("3 AC (3A)");
                        break;
                    }
                    case 4: {
                        System.out.println("Sleeper (SL)");
                        break;
                    }
                    case 5: {
                        System.out.println("General Class (2S)");
                        break;
                    }
                }
                System.out.println("---------------------------------");
            }
        
            public void Cancel_Ticket() {
                Scanner sc = new Scanner(System.in);
                System.out.println("******** Cancel_Ticket ********");
                System.out.println();
                boolean isCancel_Ticket = false;
                while (!isCancel_Ticket){
                    System.out.println("-----------------------");
                    System.out.print("Enter the PNR No :");
                    int pnr = sc.nextInt();
                    if (pnr==No){
                        System.out.println("-------------------------");
                        System.out.println("Your PNR is Verified");
                        System.out.println("-------------------------");
                        break;
                    } else {
                        System.out.println("Incorrect PNR No");
                    }
                }
                System.out.println("--------------------------------");
                System.out.println("Sure to cancel a ticket?.");
                System.out.println(" TO Cancel write 'Y'");
                System.out.println("To Not Cancel write 'N'");
                System.out.println("-------------------------------");
                System.out.println("Enter your choice Y/N");
                String cart = sc.next();
                System.out.println("--------------------------------");
                switch (cart) {
                    case "Y": {
                        System.out.println("-------------------------------");
                        System.out.println("Your ticket canceled successful");
                        System.out.println("-------------------------------");
                        break;
                    }
                    case "N": {
                        System.out.println("Not canceled");
                        break;
                    }
                }
                System.out.println("--------------------------------");
    
        }
    
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
              jitu os = new jitu ();
             int num = 0;
    
            System.out.println("******** INDIAN RAILWAY ********");
            System.out.println();
             while (num < 3) {
                 System.out.println("----------------------");
                 System.out.println("1. Registration");
                 System.out.println("2. Login");
                 System.out.println("3. Exit");
                 System.out.println("-----------------------");
                 System.out.println();
                 System.out.println("-----------------------");
                 System.out.println("   Enter your choice   ");
                 int number = s.nextInt();
                 System.out.println("-----------------------");
                 switch (number) {
                     case 1: {
                         os.Registration();
                         break;
                    }
                     case 2: {
                         os.Login();
                         break;
                     }
                    case 3:{
                        
                         break;
                     }
                 }
             
        
                
             }
             int con=0;
             int nums;
            while (con<4){
                        
                System.out.println("-----------------------------");
                 System.out.println("1. Book Ticket");
                 System.out.println("2. My Bookings");
                 System.out.println("3. Cancel Ticket");
                 System.out.println("4. Exit");
                 System.out.println("-----------------------------");
                 System.out.println();
                 System.out.println("---------------------");
                 System.out.println("  Enter your choice  ");
                 nums=s.nextInt();
                 System.out.println("---------------------");
                 switch (nums){
                     case 1:{
                            os.Book_Ticket();
                            break;
                     }
                     case 2: {
                         os.My_Bookings();
                         break;
                     }
                     case 3:{
                       os.Cancel_Ticket();
                     break;
                     }
                    case 4:{
                       break;
                     }
                 }
                 con++;
                }
                 System.out.println("*************************");
                 System.out.println("** Thank You For Using **");
                 System.out.println("*************************");
            }
        }        
