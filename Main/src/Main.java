import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) 
    {
        
        try {
            while (true) 
            {
                
                
        System.out.println("**********   welcome to library managemnt   ******");
        System.out.println(" ");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("+                 L O G I N                           +");
        System.out.println("+                                                     +");
        System.out.println("+                 1.Admin                             +");
        System.out.println("+                 2.librarian                         +");
        System.out.println("+                 3.user                              +");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Enter your choice: ");
        
        Scanner sc =new Scanner(System.in);
        int s=sc.nextInt();
        
        if(s == 1){
            System.out.println("Enter Admin name: ");
            String name = sc.next();
            System.out.println("Enter Admin password: ");
            String password = sc.next();

      
            if (Admpass.authenticate(name, password)) 
            
            {
               
                System.out.println("Login successful. Welcome, Admin!");
                System.out.println("**********   welcome to Admin page   ******");
                System.out.println(" ");
                System.out.println("1.readAdm");
                System.out.println("2.Addemp");
                System.out.println("3.reademp");
                System.out.println("4.delemp");
                System.out.println("5.exit");
                System.out.println(" ");
                System.out.println("Enter your choice");
                Adm ad=new Adm();
                employee emp=new employee(); 
               int ch=sc.nextInt();
                switch(ch) {
                    case 1:
                    ad.read();
                    break;
                    
                    case 2:
                    emp.reademp();
                    emp.addemp();
                    break;
                
                    case 3:
                    emp.reademp();
                    break;
                   
                   case 4:
                   System.out.println("Enter the valid id to be deleted :");
                   int staff_id=sc.nextInt();
                   employeedetails emp1=new employeedetails(staff_id);
                   emp.delemp(emp1);
                   emp.reademp();
                   System.out.println("deleted successfully....");
                   break;
        
                   case 5:
                   return;
                
                default:
                System.out.println("enter a valid choice");
                
            } 
            
        }
        else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
    
        else if(s == 2)
    {
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter librarian password: ");
        String password = sc.next();

  
        if (libpass.authenticate(name, password)) 
        
        {
           
        System.out.println("Login successful. Welcome, librarian!");
        System.out.println("**********   welcome to librarian page   ******");
        System.out.println(" ");
        System.out.println("1.readuser");
        System.out.println("2.insertuser");
        System.out.println("3.insertbook");
        System.out.println("4.deleteuser");
        System.out.println("5.delbook");
        System.out.println("6.transaction");
        System.out.println("7.readborrow");
        System.out.println("8.exit");
        System.out.println(" ");
        System.out.println("Enter your choice");
        
        book bk=new book();
        transaction t=new transaction();
        user us=new user();
        int ch1=sc.nextInt();
        switch(ch1) {
            case 1:
            us.readuser();
            break;
            
            case 2:
            us.readuser();
            us.userinsert();
            break;
            
            case 3:
            bk.insertbook();
            break;
            
            case 4:
            us.readuser();
            System.out.println("Enter the valid name to be deleted :");
            String use_name=sc.next();
            userdetails user=new userdetails(use_name);
            us.deluser(user);
            System.out.println("deleted successfully....");
            break;
            
            case 5:
            bk.readbook();
            System.out.println("Enter the valid name to be deleted :");
            String bok_nam =sc.next();
            bookdetails book =new bookdetails(bok_nam);
            bk.delbook(book);
            System.out.println("deleted successfully....");
            break;
            
            case 6:
            us.readuser();
            bk.readbook();
            t.insertTransaction();
            t.readtransaction();
            break;

            case 7:
            bk.readborrow();
            break;

            case 8:
            return;

            default:
            System.out.println("enter a valid choice");
            
        } 
    }
        else {
            System.out.println("Invalid username or password. Please try again.");
        }
       
       // sc.close();
    }
    else if(s == 3)
    {
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter user password: ");
        String password = sc.next();

  
        if (userpass.authenticate(name, password)) 
        
        {
           
        System.out.println("Login successful. Welcome, user!");
        System.out.println("**********   welcome to user page   ******");
        System.out.println(" ");
        System.out.println("1.readbook");
        System.out.println("2.borrowBook");
        System.out.println("3.returnBook");
        System.out.println("4.exit");
        System.out.println(" ");
        System.out.println("Enter your choice");
        book bk=new book();
      
        int cho=sc.nextInt();
        switch(cho) 
         {
            case 1:
            bk.readbook();
            break;
            
            case 2:
            bk.borrowBook();
            break;
            
            case 3:
            bk.readbook();
            System.out.println("enter the bookname");
            String bok_nam =sc.next();
            bookdetails book =new bookdetails(bok_nam);
            bk.returnBook(book);
          //  bk.delbook(book);
            System.out.println("returned successfully....");
            break;

            case 4:
            return;
            
            default:
            System.out.println("enter a valid choice");
        }
            
        } 
        else {
            System.out.println("Invalid username or password. Please try again.");
        }
      
    }
    else
    {
        System.out.println("enter the valid choice: ");
    }
}

//sc.close();
}
catch(Exception e)
{
    e.printStackTrace();
}
}
}

