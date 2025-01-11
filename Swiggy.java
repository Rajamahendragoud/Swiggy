import java.util.*;
import java.io.*;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class SignUp
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";
	public static Scanner sc = new Scanner(System.in);
	private String username = "Thanveer@123";
	private String password = "Thanveer@123";
	private long phone = 9876543210L;
	private String address = "";
	
	public String pattern;
		
	public void setUsername(String username)
	{
		pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@_])[A-Za-z0-9@_]{8,}$";

		if(username.matches(pattern))
		{
			this.username = username;
		}
		else
		{
			System.out.println(red+"Invalid Username : "+ username +reset);
			if (!username.matches(".*[A-Z].*")) 
			{
				System.out.println(purple+"Username must contain 1 Uppercase Alphabet"+reset);
        		}
	        	if (!username.matches(".*[a-z].*")) 
			{
		            System.out.println(purple+"Username must contain 1 Lowercase Alphabet"+reset);
        		}
		        if (!username.matches(".*\\d.*")) 
			{
		            System.out.println(purple+"Username name must contain atleast 1 Digit"+reset);
	        	}
		        if (!username.matches(".*[@_].*")) 
			{
	        	    System.out.println(purple+"Username must contain Special Character either '@' OR '_'"+reset);
		        }
		        if (username.length() < 8) 
			{
		            System.out.println(purple+"Username must contain atleast 8 Characters"+reset);
		        }
			System.out.println(yellow+"Enter a valid Username: "+cyan);
			setUsername(sc.next());
		}
	}
	public void setPassword(String password)
	{
		pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*?])[A-Za-z0-9!@#$%^&*?]{8,20}$";
		
		if(password.matches(pattern))
		{
			this.password = password;
		}
		else
		{
			System.out.println(red+"Invalid Password : "+password+reset);
			if (!password.matches(".*[A-Z].*")) 
			{
           			 System.out.println(purple+"Password must contain 1 Uppercase Alphabet"+reset);
		        }
		        if (!password.matches(".*[a-z].*")) 
			{
		            System.out.println(purple+"Password must contain 1 Lowercase Alphabet"+reset);
		        }
		        if (!password.matches(".*\\d.*")) 
			{
		            System.out.println(purple+"Passowrd name must contain atleast 1 Digit"+reset);
	        	}
	        	if (!password.matches(".*[!@#$%^&*?].*")) 
			{
	        	    System.out.println(purple+"Password must contain Special characters like '@' or '!' or '$' ..."+reset);
	        	}
		        if (password.length() < 8) 	
			{
		            System.out.println(purple+"Password must contain atleast 8 Characters"+reset);
		        }
			else if(password.length() > 20) 
			{
			    System.out.println(purple+"Password can contain maximum 20 Characters"+reset);
			}
			System.out.println(yellow+"Enter a valid Password : "+cyan);
			setPassword(sc.next());
			//System.out.print(reset);

	
		}
	}
	void setPhone(long phone)
	{
		pattern = "^[6-9][0-9]{9}$";
		
		if((phone+"").matches(pattern))
		{
			this.phone = phone;
		}
		else
		{
			
			System.out.println(red+"Invalid Phone Number : "+ phone +reset);
			if(!(phone+"").matches("[6-9].*")) 
			{
		            System.out.println(purple+"Phone Number must start with the digits 6 to 9"+reset);
		        }
		        if((phone+"").length()!=10)
			{
				System.out.println(purple+"Phone must contain exactly 10 digits"+reset);
			}
			System.out.println(yellow+"Enter a valid Phone Number : "+cyan);
			setPhone(sc.nextLong());

		}
	}
	void setAddress(String address)
	{
		
		if(address.isEmpty())
		{
			System.out.println(purple+"Address should not be empty"+reset);
			System.out.println(yellow+"Enter a valid Address: "+cyan);
			setAddress(sc.nextLine());
		}
		else
		{
			this.address = address;
		}
	}
	String getUsername()
	{
		return this.username;
	}
	String getPassword()
	{
		return this.password;
	}
	long getPhone()
	{
		return this.phone;
	}
	String getAddress()
	{
		return this.address;
	}
	
	SignUp(String username, String password, long phone)
	{
		setUsername(username);
		setPassword(password);
		setPhone(phone);
		//sc.nextLine();
		setAddress(sc.nextLine());

	}
	SignUp()
	{
		
	}
	
        abstract void login();     
	

}

class User extends SignUp
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";


	public User(String username, String password, long phone)
	{
		super(username, password, phone);
	}
	public User()
	{
	
	}
	int generateOTP()
	{
		Random random = new Random();
		return random.nextInt(9)+8999;
	}
	void login()
	{
		System.out.println(yellow+"Enter Username and Password"+cyan);
		String username = sc.next();
		String password = sc.next();
		int otp = generateOTP();
		
		
		if(username.equals(getUsername()) && password.equals(getPassword()))
		{
			System.out.print(green+"Logging in"+reset);
			try{
				for(int i=1;i<=3;i++)
				{
					Thread.sleep(1000);
					System.out.print(".");							
				}
			}catch(InterruptedException e){ }
			System.out.println();
			System.out.println(green+"Login Successfull"+reset);
		}
		else if(!username.equals(getUsername()) && !password.equals(getPassword()))
		{
			while(true)
			{
				System.out.println(red+"Login Failed! \n Incorrect Username and Password"+reset);
				System.out.println(yellow+"Enter Phone Number to see Username"+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green + "Your OTP is : "+ otp);
					System.out.println(cyan+"Enter OTP: ");
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Your Username is : "+getUsername()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorrect OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter Phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{

					}
					else
					{
						System.out.println(green+"Exit Successfull!"+reset);
						System.exit(0);
					}
				
				}
			}
			
		}
		else if(!username.equals(getUsername()) && password.equals(getPassword()))
		{
			while(true)
			{
				System.out.println(red+"Login Failed! \n Incorrect Username"+reset);
				System.out.println(yellow+"Enter Phone Number"+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green+"Your OTP is : "+otp+reset);
					System.out.println(yellow+"Enter OTP : "+cyan);
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Resetting the Username"+reset);
						System.out.println(yellow+"Enter New Username"+cyan);
						setUsername(sc.next());
						System.out.println(blue+"Updated Username: "+getUsername()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorret OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{
						
					}
					else
					{
						System.out.println(green+"Exit Successfull!"+reset);
						System.exit(0);
					}
				}
			}

		}
		else
		{
			while(true)
			{
				System.out.println(red+"Login Failed! Invalid Passowrd"+reset);
				System.out.println(yellow+"Enter Phone Number"+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green+"Your OTP is : "+ otp);
					System.out.println(yellow+"Enter OTP : "+cyan);
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Resetting the Password"+reset);
						System.out.println(yellow+"Enter New Password"+cyan);
						setPassword(sc.next());
						System.out.println(green+"Updated Password: "+getPassword()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorrect OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{
						
					}
					else
					{
						System.out.println(green+"Exit Successfull!"+reset);
						System.exit(0);
					}
				}
			}
		}
		
	}


}


class Vendor extends SignUp
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";
	static String[] items = new String[100];
	public Vendor(String username, String password, long phone)
	{
		super(username, password, phone);
	}
	public Vendor()
	{
	
	}
	int generateOTP()
	{
		Random random = new Random();
		return random.nextInt(9)+8999;
	}
	void login()
	{
		System.out.println(yellow+"Enter Username and Password"+cyan);
		String username = sc.next();
		String password = sc.next();
		int otp = generateOTP();
		
		if(username.equals(getUsername()) && password.equals(getPassword()))
		{
			System.out.print(green+"Logging in"+reset);
			try{
				for(int i=1;i<=3;i++)
				{
					Thread.sleep(1000);
					System.out.print(".");							
				}
			}catch(InterruptedException e){ }
			System.out.println();
			System.out.println(green+"Login Successfull"+reset);
		}
		else if(!username.equals(getUsername()) && !password.equals(getPassword()))
		{
			while(true)
			{
				System.out.println(red+"Login Failed! \n Incorrect Username and Password"+reset);
				System.out.println(yellow+"Enter Phone Number to see Username"+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green+"Your OTP is : "+otp+reset);
					System.out.println(yellow+"Enter OTP: "+cyan);
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Your Username is : "+getUsername()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorrect OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter Phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{

					}
					else
					{
						System.out.println(green+"Exit Successfull!"+green);
						System.exit(0);
					}
				
				}
			}
			
		}
		else if(!username.equals(getUsername()) && password.equals(getPassword()))
		{
			while(true)
			{
				System.out.println(red+"Login Failed! \n Incorrect Username"+reset);
				System.out.println(yellow+"Enter Phone Number : "+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green+"Your OTP is : "+otp+cyan);
					System.out.println("Enter OTP : ");
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Resetting the Username"+reset);
						System.out.println(yellow+"Enter New Username : "+cyan);
						setUsername(sc.next());
						System.out.println(green+"Updated Username: "+getUsername()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorret OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{
						
					}
					else
					{
						System.out.println(green+"Exit Successfull!"+reset);
						System.exit(0);
					}
				}
			}

		}
		else
		{
			while(true)
			{
				System.out.println(red+"Login Failed! Invalid Passowrd"+reset);
				System.out.println(yellow+"Enter Phone Number : "+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green+"Your OTP is : "+ otp+reset);
					System.out.println(yellow+"Enter OTP : "+cyan);
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Resetting the Password...");
						System.out.println(yellow+"Enter New Password : "+cyan);
						setPassword(sc.next());
						System.out.println(green+"Updated Password: "+getPassword()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorrect OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{
						
					}
					else
					{
						System.out.println(green+"Exit Successfull!"+reset);
						System.exit(0);
					}
				}
			}
		}
		
	}
	
	void addBiryani(int nBiryanis)
	{

		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("biryanis.txt",true));
	        	sc.nextLine();
			for(int i=1;i<=nBiryanis;i++)
		        {
			    System.out.println(yellow+"Enter Biryani Name "+i+" to Add : "+cyan);
			
        		    String s = sc.nextLine();
		            s = s+"\n";
	        	    bw.write(s);
	        	}
		        bw.close();
		}
		catch(Exception e){ }
	}
	void addStarter(int nStarters)
	{

		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("starters.txt",true));
	        	sc.nextLine();
			for(int i=1;i<=nStarters;i++)
		        {
			    System.out.println(yellow+"Enter Starter Name "+i+" to Add : "+cyan);
        		    String s = sc.nextLine();
		            s = s+"\n";
	        	    bw.write(s);
	        	}
		        bw.close();
		}
		catch(Exception e){ }
	}
	void addCurry(int nCurries)
	{

		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("curries.txt",true));
	        	sc.nextLine();
			for(int i=1;i<=nCurries;i++)
		        {
			    System.out.println(yellow+"Enter Curry Name "+i+" to Add : "+cyan);
        		    String s = sc.nextLine();
		            s = s+"\n";
	        	    bw.write(s);
	        	}
		        bw.close();
		}
		catch(Exception e){ }
	}
	void addNaan(int nNaans)
	{

		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("naans.txt",true));
	        	sc.nextLine();
			for(int i=1;i<=nNaans;i++)
		        {
			    System.out.println(yellow+"Enter Naan Name "+i+" to Add : "+cyan);
        		    String s = sc.nextLine();
		            s = s+"\n";
	        	    bw.write(s);
	        	}
		        bw.close();
		}
		catch(Exception e){ }
	}
	void addSweet(int nSweets)
	{

		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("sweets.txt",true));
	        	sc.nextLine();
			for(int i=1;i<=nSweets;i++)
		        {
			    System.out.println(yellow+"Enter Sweet Name "+i+" to Add : "+cyan);
        		    String s = sc.nextLine();
		            s = s+"\n";
	        	    bw.write(s);
	        	}
		        bw.close();
		}
		catch(Exception e){ }
	}


	void editItem(String filename, int itemNum, String newItem)
	{
		try 
		{
	       	    File file = new File(filename);
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	            String line;
	            StringBuilder content = new StringBuilder();
			int c = 0;
	            while ((line = reader.readLine()) != null) 
		    {
			c++;
	                if(c==itemNum) 
			{
	                    content.append(newItem).append("\n");

	                } 
			else 
			{
	                    content.append(line).append("\n");
	                }
	            }
	            reader.close();
	
	            FileWriter writer = new FileWriter(file);
	            writer.write(content.toString());
	            writer.close();
	

	        } 
		catch (IOException e){ }
	}





	void deleteItem(String filename)
	{
        	String[] lines = readFileToArray(filename); // Read file into array

	        // Print the content of the array
	        for (String line : lines) 
		{
	            System.out.println(blue+line+reset);
	        }
	        //System.out.println();

	        writeArrayToFile(lines, filename); 
		
	}
	

	// Method to read content of a file into a string array
    	String[] readFileToArray(String filename) 
	{
        	StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) 
		{
	            String line;
	            int count = 0;
        	    while ((line = reader.readLine()) != null) 
	            {
		    	content.append(line).append("\n");
	                count++;
            	    }
	            String[] lines = new String[count];
	            try (BufferedReader newReader = new BufferedReader(new FileReader(filename))) 
		    {
        		   int index = 0;
	                   while ((line = newReader.readLine()) != null) 
			   {
        	           	lines[index++] = line;
                	   }
	            }
            	   return lines;
        	} 
		catch (IOException e) 
		{
	            e.printStackTrace();
        	    return new String[0]; // Return an empty array if an error occurs
        	}
 	}

    	void writeArrayToFile(String[] lines, String filename) 
	{
        	try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
		{
		    System.out.println(yellow+"Enter Item Number to delete : "+cyan);
	            int input = sc.nextInt()-1;
        	    sc.nextLine(); // Consume newline character from previous input
	            for(int i=0;i<lines.length-1;i++)
	            {
	                if(i >= input)
	                {
	                    lines[i] = lines[i+1];
			    String[] parts = lines[i].split("-");
			    int itemNum = Integer.parseInt(parts[0])-1;
			    lines[i] = itemNum+"-"+parts[1]+"-"+parts[2];
	                }        
			
			

        	    }
	            lines[lines.length - 1] = null;
	            for (String line : lines) 
		    {
	                if(line == null)
			{
	                    continue;
			}
	                writer.write(line);
        	        writer.newLine();
            	    }
		    //System.out.println("Array content written to file successfully.");
		} 
		catch (IOException e) 
		{
           		e.printStackTrace();
        	}

    	}

}




class Admin extends SignUp
{

	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";	//static String[] items = new String[100];
	public Admin(String username, String password, long phone)
	{
		super(username, password, phone);
	}
	public Admin()
	{
	
	}
	int generateOTP()
	{
		Random random = new Random();
		return random.nextInt(9)+8999;
	}
	void login()
	{
		System.out.println("Enter Username and Password");
		String username = sc.next();
		String password = sc.next();
		int otp = generateOTP();
		
		if(username.equals(getUsername()) && password.equals(getPassword()))
		{
			System.out.print(green+"Logging in"+reset);
			try{
				for(int i=1;i<=3;i++)
				{
					Thread.sleep(1000);
					System.out.print(green+"."+reset);							
				}
			}catch(InterruptedException e){ }
			System.out.println();
			System.out.println(green+"Login Successfull"+reset);
		}
		else if(!username.equals(getUsername()) && !password.equals(getPassword()))
		{
			while(true)
			{
				System.out.println(red+"Login Failed! \n Incorrect Username and Password"+reset);
				System.out.println(yellow+"Enter Phone Number to see Username"+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green+"Your OTP is : "+otp+reset);
					System.out.println(yellow+"Enter OTP: "+cyan);
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Your Username is : "+getUsername()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorrect OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter Phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{

					}
					else
					{
						System.out.println(green+"Exit Successfull!"+reset);
						System.exit(0);
					}
				
				}
			}
			
		}
		else if(!username.equals(getUsername()) && password.equals(getPassword()))
		{
			while(true)
			{
				System.out.println(red+"Login Failed! \n Incorrect Username"+reset);
				System.out.println(yellow+"Enter Phone Number : "+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green+"Your OTP is : "+otp+reset);
					System.out.println(yellow+"Enter OTP : "+cyan);
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Resetting the Username"+reset);
						System.out.println(yellow+"Enter New Username : "+cyan);
						setUsername(sc.next());
						System.out.println(green+"Updated Username: "+getUsername()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorret OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{
						
					}
					else
					{
						System.out.println(green+"Exit Successfull!"+reset);
						System.exit(0);
					}
				}
			}

		}
		else
		{
			while(true)
			{
				System.out.println(red+"Login Failed! Invalid Passowrd"+reset);
				System.out.println(yellow+"Enter Phone Number : "+cyan);
				long phone = sc.nextLong();
				if(phone==getPhone())
				{
					System.out.println(green+"Your OTP is : "+ otp +reset);
					System.out.println(yellow+"Enter OTP : "+cyan);
					if(otp==sc.nextInt())
					{
						System.out.println(green+"Resetting the Password"+reset);
						System.out.println(yellow+"Enter New Password : "+cyan);
						setPassword(sc.next());
						System.out.println(green+"Updated Password: "+getPassword()+reset);
						login();
						break;
					}
					else
					{
						System.out.println(red+"Incorrect OTP"+reset);
					}
				}
				else
				{
					System.out.println(red+"User Not Found"+reset);
					System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
					int n = sc.nextInt();
					if(n==1)
					{
						
					}
					else
					{
						System.out.println(green+"Exit Successfull!"+reset);
						System.exit(0);
					}
				}
			}
		}
		
	}
	
	void addRestaurants(int nRest)
	{

		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("restaurants.txt",true));
	        	sc.nextLine();
			for(int i=1;i<=nRest;i++)
		        {
			    System.out.println(yellow+"Enter Restaurant Name "+i+" to Add : "+cyan);
        		    String s = sc.nextLine();
		            s = s+"\n";
	        	    bw.write(s);
	        	}
		        bw.close();
		}
		catch(Exception e){ }
	}
	void editRestaurant(String oldRest, String newRest)
	{
		try 
		{
	       	    File file = new File("restaurants.txt");
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	            String line;
	            StringBuilder content = new StringBuilder();
	
	            while ((line = reader.readLine()) != null) 
		    {
	                if (line.equals(oldRest)) 
			{
	                    content.append(newRest).append("\n");
	                } 
			else 
			{
	                    content.append(line).append("\n");
	                }
	            }
	            reader.close();
	
	            FileWriter writer = new FileWriter(file);
	            writer.write(content.toString());
	            writer.close();
	

	        } 
		catch (IOException e){ }
	}
	void deleteRestaurant()
	{
		String filename = "restaurants.txt"; // File name
        	String[] lines = readFileToArray(filename); // Read file into array

	        // Print the content of the array
	        for (int i=0;i<lines.length;i++) 
		{
	            System.out.println(blue +(i+1)+" "+lines[i]+ reset);
	        }
	        System.out.println(yellow+"Enter Restaurant Number to Delete: "+cyan);


        	//String[] lines1 = {"Hello", "World", "Java", "is", "awesome!"};
	        writeArrayToFile(lines, filename); 
	}
	

	// Method to read content of a file into a string array
    	String[] readFileToArray(String filename) 
	{
        	StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) 
		{
	            String line;
	            int count = 0;
        	    while ((line = reader.readLine()) != null) 
	            {
		    	content.append(line).append("\n");
	                count++;
            	    }
	            String[] lines = new String[count];
	            try (BufferedReader newReader = new BufferedReader(new FileReader(filename))) 
		    {
        		   int index = 0;
	                   while ((line = newReader.readLine()) != null) 
			   {
        	           	lines[index++] = line;
                	   }
	            }
            	   return lines;
        	} 
		catch (IOException e) 
		{
	            e.printStackTrace();
        	    return new String[0]; // Return an empty array if an error occurs
        	}
 	}

    	void writeArrayToFile(String[] lines, String filename) 
	{
        	try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
		{
	            int input = sc.nextInt()-1;
        	    sc.nextLine(); // Consume newline character from previous input
	            for(int i=0;i<lines.length-1;i++)
	            {
	                if(i >= input)
	                {
	                    lines[i] = lines[i+1];
	                }        

        	    }
	            lines[lines.length - 1] = null;
	            for (String line : lines) 
		    {
	                if(line == null)
			{
	                    continue;
			}
	                writer.write(line);
        	        writer.newLine();
            	    }
		    //deleted restaurant
		} 
		catch (IOException e) 
		{
           		e.printStackTrace();
        	}
    	}
	
}


abstract class DineOut
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";
	public static final Scanner sc = new Scanner(System.in);
	
	public static String restName = "";
	public static int tables = 0;
	public static LocalDateTime userDateTime = null;
	//LocalDateTime userDateTime, int tables, String restName
	public static void generateBill(LocalDateTime userDateTime, int tables, String restName)
	{
		System.out.println("************************************");
		System.out.println("		APP NAME		");
		System.out.println("************************************");
		System.out.println();
		System.out.println("              PISTA HOUSE             ");
		System.out.println();
		System.out.println("  Bill No: "+ ((new java.util.Random().nextInt(9)+8999)-5893) +"    "+ "Date: " + java.time.LocalDate.now());
		//System.out.println("--------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("   Tables Booked :  "+ tables);
		System.out.println("   Amount Paid   :  Rs."+(tables*100)+"/-");
		System.out.println("   Transaction id:  T"+(((long)new java.util.Random().nextInt(9))+48439573927745l));
		System.out.println();
		System.out.println();
		System.out.println("*************THANK YOU**************");


	}
	public abstract void bookTable(LocalDateTime dateAndTime, int nTables, String rest);
	public static void booking()
	{
		DineOut dine = new DineOut(){

				public void bookTable(LocalDateTime dateAndTime, int nTables, String rest)
				{
					System.out.println(green+"You are Booking "+ nTables +" Tables"+reset);
					System.out.println(yellow+"Please make an advance payment of Rs.100/- for each table to confirm Booking"+reset);
					System.out.println(blue+"Select \n1 for Payment \n2 for cancel"+reset);
					int choice = sc.nextInt();
					if(choice == 1)
					{
						//implement payment
						System.out.println(green+"Booking Table in Restaurant : "+ rest + reset);
						Payment.paymentMode(100);
						
					}
					else
					{
						System.out.println(green+"Table Booking cancelled successfully!"+reset);
					}	
				}
			};




		System.out.println(yellow+"Restaurants available for Table Booking : "+reset);
		try
		{
			FileReader fr = new FileReader("restaurants.txt");
		        BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int i=0;
			while(line!=null)
	       		{
		            System.out.println(cyan + ++i +" "+line + reset);
		            line=br.readLine();
		        }
	        	br.close();
		}
		catch(Exception e){ }
		System.out.println(yellow+"Enter Restaurant Number to Book Table : "+ cyan);
		int restSelect = sc.nextInt();
		sc.nextLine();
		
		try
		{
			FileReader fr = new FileReader("restaurants.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int c=0;
			while(line!=null)
			{
			    c++;
			    if(c==restSelect)
			    {
			       	System.out.println(green+"You have selected Restaurant : "+line + reset);
				restName = line;
				break;
			    }
			    line=br.readLine();
			    }
			    br.close();
		}
		catch(Exception e){ }


		System.out.println(purple+"Each table can sit maximum of 4 persons"+reset);
		System.out.println(yellow+"Enter Number tables to Book: "+cyan);
		tables = sc.nextInt();
		sc.nextLine();
		dine.bookTable(dateAndTimeInput(), tables, restName);
	}

	public static LocalDateTime dateAndTimeInput()
	{
		// Get current date and time
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        
	        // Calculate minimum and maximum allowed dates
		        LocalDateTime minDateTime = currentDateTime.plusHours(1);
	        LocalDateTime maxDateTime = currentDateTime.plusDays(7);
	        
	        // Prompt the user to enter a date and time
	        Scanner scanner = new Scanner(System.in);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
	        LocalDateTime userDateTime = null;
	        boolean isValidDateTime = false;
		        
	        while (!isValidDateTime) 
		{
	        	System.out.print(yellow+"Enter a date and time (yyyy-MM-dd HH:mm): "+cyan);
	        	String input = scanner.nextLine();
	            
	        	try 
		    	{
	                	userDateTime = LocalDateTime.parse(input, formatter);
		                // Check if userDateTime is within the allowed range
		                if (userDateTime.isAfter(minDateTime) && userDateTime.isBefore(maxDateTime)) 
				{
	                		// Check if entered time is between 10 and 23 hours
		                	int hour = userDateTime.getHour();
		                	if (hour >= 10 && hour <= 23) 
					{
			       			isValidDateTime = true;
	       				}
			    		else 
			    		{
			                        System.out.println(red+"Entered time should be between 10 and 23 hours."+reset);
	        		        }
	               		} 
				else 
				{
		                	System.out.println(yellow+"Please enter a date and time between " + formatter.format(minDateTime) +
	                            	" and " + formatter.format(maxDateTime) + "."+ cyan);
		                }
	            	} 
			catch(Exception e) 
			{
		                System.out.println(red+"Invalid date or time format."+yellow+" Please enter in the format yyyy-MM-dd HH:mm."+cyan);
	            	}
	        }
	        
	        // Output the valid date and time entered by the user
	        System.out.println(green+"Valid date and time entered: " + formatter.format(userDateTime)+reset);
		
		return userDateTime;
	}

}



class HDFC
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";
	static Scanner sc = new Scanner(System.in);
	static double balance = 2000;
	private static int pin = 1234;
	static void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println(red+"Insufficient Balance!"+reset);
			System.out.println(blue+"Select \n1 for Transfer amount"+reset);
			System.out.println(blue+"2 for cancel Order"+reset);
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1)
			{
				Object fromBank = null;
				Object toBank = null;
				if(HDFC.viewBalance() + KOTAK.viewBalance() + SBI.viewBalance() > amount)
				{
					
				
					while(true)
					{
						while(true)
						{
							
							System.out.println(white+"Select Bank Name to Transfer from : "+blue);
							System.out.println("1 for HDFC");
							System.out.println("2 for KOTAK");
							System.out.println("3 for SBI"+reset);
							int input = sc.nextInt();
							sc.nextLine();
							
							if(input==1)
							{
								fromBank = new HDFC();
								break;
							}
							else if(input==2)
							{
								fromBank = new KOTAK();
								break;
							}
							else if(input==3)
							{
								fromBank = new SBI();
								break;
							}
							else
							{	
								System.out.println(red+"Invalid Bank Selected"+reset);
							}
						}
						while(true)
						{
	
							
							System.out.println(white+"Select Bank Name to Transfer to : "+blue);
							System.out.println("1 for HDFC");
							System.out.println("2 for KOTAK");
							System.out.println("3 for SBI"+reset);
							int input = sc.nextInt();
							sc.nextLine();
							if(input==1)
							{
								toBank = new HDFC();
								break;
							}
							else if(input==2)
							{	
								toBank = new KOTAK();
								break;
							}
							else if(input==3)
							{	
								toBank = new SBI();
								break;
							}
							else
							{
								System.out.println(red+"Invalid Bank Selected"+reset);
							}
							
						}
						if(fromBank.getClass().getName().equals(toBank.getClass().getName()))
						{
							System.out.println(red+"You have Selected same From Bank and To Bank"+reset);
							System.out.println(green+"Please select different Banks"+reset);
							continue;
						}
						Payment.transfer(amount, fromBank, toBank);

					}
						
				}
				else
				{
					System.out.println(red+"Insufficient Balacnce in your Accounts"+reset);
					System.out.println(red+"Cancelling Order"+reset);
					System.exit(0);
				}
			}
			else
			{
				System.out.println(red+"Order Cancelled"+reset);
			}
		}
		else
		{
			balance = balance - amount;
		}
	}
	static void deposit(double amount)
	{
		balance = balance + amount;
	}
	static double viewBalance()
	{
		return balance;
	}
	int getPIN()
	{
		return pin;
	}
	
}

class KOTAK
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";
	static Scanner sc = new Scanner(System.in);
	static double balance = 2000;
	private static int pin = 1234;

	static void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println(red+"Insufficient Balance!"+reset);
			System.out.println(blue+"Select \n1 for Transfer amount");
			System.out.println("2 for cancel Order"+reset);
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1)
			{
				Object fromBank = null;
				Object toBank = null;
				if(HDFC.viewBalance() + KOTAK.viewBalance() + SBI.viewBalance() > amount)
				{
					
					while(true)
					{
						while(true)
						{
							
							System.out.println(white+"Select Bank Name to Transfer from : "+blue);
							System.out.println("1 for HDFC");
							System.out.println("2 for KOTAK");
							System.out.println("3 for SBI"+reset);
							int input = sc.nextInt();
							sc.nextLine();
							
							if(input==1)
							{
								fromBank = new HDFC();
								break;
							}
							else if(input==2)
							{
								fromBank = new KOTAK();
								break;
							}
							else if(input==3)
							{
								fromBank = new SBI();
								break;
							}
							else
							{
								System.out.println(red+"Invalid Bank Selected"+reset);
							}
						}
						while(true)
						{
							
							System.out.println(white+"Select Bank Name to Transfer to : "+blue);
							System.out.println("1 for HDFC");
							System.out.println("2 for KOTAK");
							System.out.println("3 for SBI"+reset);
							int input = sc.nextInt();
							sc.nextLine();
							if(input==1)
							{
								toBank = new HDFC();
								break;
							}
							else if(input==2)
							{	
								toBank = new KOTAK();
								break;
							}
							else if(input==3)
							{	
								toBank = new SBI();
								break;
							}
							else
							{
								System.out.println(red+"Invalid Bank Selected"+reset);
							}
						
						}
						if(fromBank.getClass().getName().equals(toBank.getClass().getName()))
						{
							System.out.println(red+"You have Selected same From Bank and To Bank"+reset);
							System.out.println(green+"Please select different Banks"+reset);
							continue;
						}

						Payment.transfer(amount, fromBank, toBank);
					}
					
				}
				else
				{
					System.out.println(red+"Insufficient Balacnce in your Accounts"+reset);
					System.out.println(red+"Cancelling Order"+reset);
					System.exit(0);
				}
			}
			else
			{
				System.out.println(red+"Order Cancelled"+reset);
			}
		}
		else
		{
			balance = balance - amount;
		}
	}
	static void deposit(double amount)
	{
		balance = balance + amount;
	}
	static double viewBalance()
	{
		return balance;
	}
	int getPIN()
	{
		return pin;
	}
	
}

class SBI
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";
	static Scanner sc = new Scanner(System.in);
	static double balance = 2000;
	private static int pin = 1234;

	static void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println(red+"Insufficient Balance!"+reset);
			System.out.println(blue+"Select \n1 for Transfer amount");
			System.out.println("2 for cancel Order"+reset);
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1)
			{
				Object fromBank = null;
				Object toBank = null;
				if(HDFC.viewBalance() + KOTAK.viewBalance() + SBI.viewBalance() > amount)
				{
					
					while(true)
					{
						while(true)
						{
							
	
							System.out.println(white+"Select Bank Name to Transfer from : "+blue);
							System.out.println("1 for HDFC");
							System.out.println("2 for KOTAK");
							System.out.println("3 for SBI"+blue);
							int input = sc.nextInt();
							sc.nextLine();
							
							if(input==1)
							{
								fromBank = new HDFC();
								break;
							}
							else if(input==2)
							{
								fromBank = new KOTAK();
								break;
							}
							else if(input==3)
							{
								fromBank = new SBI();
								break;
							}
							else
							{
								System.out.println(red+"Invalid Bank Selected"+reset);
							}
						}
						while(true)
						{
							
							System.out.println(white+"Select Bank Name to Transfer to : "+blue);
							System.out.println("1 for HDFC");
							System.out.println("2 for KOTAK");
							System.out.println("3 for SBI"+reset);
							int input = sc.nextInt();
							sc.nextLine();
							if(input==1)
							{
								toBank = new HDFC();
								break;
							}
							else if(input==2)
							{	
								toBank = new KOTAK();
								break;
							}
							else if(input==3)
							{	
								toBank = new SBI();
								break;
							}
							else
							{
								System.out.println(red+"Invalid Bank Selected"+reset);
							}
									
						}
						if(fromBank.getClass().getName().equals(toBank.getClass().getName()))
						{
							System.out.println(red+"You have Selected same From Bank and To Bank"+reset);
							System.out.println(green+"Please select different Banks"+reset);
							continue;
						}
						
						Payment.transfer(amount, fromBank, toBank);
					}
					
				}
				else
				{
					System.out.println(red+"Insufficient Balacnce in your Accounts");
					System.out.println("Cancelling Order"+reset);
					System.exit(0);
				}
			}
			else
			{
				System.out.println(red+"Order Cancelled"+reset);
			}
		}
		else
		{
			balance = balance - amount;
		}
	}
	static void deposit(double amount)
	{
		balance = balance + amount;
	}
	static double viewBalance()
	{
		return balance;
	}
	int getPIN()
	{
		return pin;
	}
	
}
class Payment extends SignUp
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";

	static SignUp obj = new Payment();
	static Scanner sc = new Scanner(System.in);
	static void transfer(double bill, Object fromBank, Object toBank)
	{

			if(fromBank.getClass().getName().equals("HDFC") && toBank.getClass().getName().equals("KOTAK"))
			{
				HDFC fromHDFC = (HDFC)fromBank;
				KOTAK toKOTAK = (KOTAK)toBank;
				System.out.println(yellow+"Enter amount to Transfer from "+ fromBank.getClass().getName() +" to "+ green+toBank.getClass().getName() +cyan+" Rs.");
				double amount = sc.nextDouble();
				sc.nextLine();
				if(amount<=fromHDFC.viewBalance())
				{
					fromHDFC.withdraw(amount);
					toKOTAK.deposit(amount);
					System.out.println(green+"Amount Trasnfer Successfull "+purple+"Rs."+amount+" from "+ fromHDFC.getClass().getName() +" to "+ toKOTAK.getClass().getName()+reset);
					System.out.println(green+"KOTAK balance : "+toKOTAK.viewBalance());
					System.out.println(purple+"Proceeding for Payment...."+reset);
					Payment.paymentMode(bill);
				}
				else
				{
					System.out.println(red+"Insufficient Funds"+reset);
					double Tamount = fromHDFC.viewBalance();
					System.out.println(green+"Your Account has Rs."+Tamount);
					System.out.println("Adding Amount Rs."+ Tamount +" from "+ fromHDFC.getClass().getName() +" to "+ toKOTAK.getClass().getName()+reset);
					System.out.println(green+"Amount Transfer Successful Rs."+Tamount+reset);
					fromHDFC.withdraw(Tamount);
					toKOTAK.deposit(Tamount);
					Payment.paymentMode(bill);
					System.out.println(purple+"Total Balance in "+toKOTAK.getClass().getName()+" is Rs."+toKOTAK.viewBalance()+reset);
				}
			}
			else if(fromBank.getClass().getName().equals("HDFC") && toBank.getClass().getName().equals("SBI"))
			{
				HDFC fromHDFC = (HDFC)fromBank;
				SBI toSBI = (SBI)toBank;
				System.out.println(yellow+"Enter amount to Transfer from "+ fromBank.getClass().getName() +" to "+ toBank.getClass().getName() +" Rs."+cyan);
				double amount = sc.nextDouble();
				sc.nextLine();
				if(amount<=fromHDFC.viewBalance())
				{
					fromHDFC.withdraw(amount);
					toSBI.deposit(amount);
					System.out.println(green+"Amount Trasnfer Successfull Rs."+amount+" from "+ fromHDFC.getClass().getName() +" to "+ toSBI.getClass().getName());
					System.out.println("SBI balance : "+toSBI.viewBalance()+reset);
					System.out.println(purple+"Proceeding for Payment...."+reset);
					Payment.paymentMode(bill);
				}
				else
				{
					System.out.println(red+"Insufficient Funds"+reset);
					double Tamount = fromHDFC.viewBalance();
					System.out.println(green+"Your Account has Rs."+Tamount);
					System.out.println("Adding Amount Rs."+ Tamount +" from "+ fromHDFC.getClass().getName() +" to "+ toSBI.getClass().getName());
					System.out.println("Amount Transfer Successful Rs."+Tamount+reset);
					fromHDFC.withdraw(Tamount);
					toSBI.deposit(Tamount);
					Payment.paymentMode(bill);
					System.out.println(purple+"Total Balance in "+toSBI.getClass().getName()+" is Rs."+toSBI.viewBalance()+reset);
				}
			}
			else if(fromBank.getClass().getName().equals("KOTAK") && toBank.getClass().getName().equals("HDFC"))
			{
				KOTAK fromKOTAK = (KOTAK)fromBank;
				HDFC toHDFC= (HDFC)toBank;
				System.out.println(yellow+"Enter amount to Transfer from "+ fromBank.getClass().getName() +" to "+ toBank.getClass().getName() +" Rs."+cyan);
				double amount = sc.nextDouble();
				sc.nextLine();
				if(amount<=fromKOTAK.viewBalance())
				{
					fromKOTAK.withdraw(amount);
					toHDFC.deposit(amount);
					System.out.println(green+"Amount Trasnfer Successfull Rs."+amount+" from "+ fromKOTAK.getClass().getName() +" to "+ toHDFC.getClass().getName());
					System.out.println("HDFC balance : "+toHDFC.viewBalance()+reset);
					System.out.println(purple+"Proceeding for Payment...."+reset);
					Payment.paymentMode(bill);
				}
				else
				{
					System.out.println(red+"Insufficient Funds"+reset);
					double Tamount = fromKOTAK.viewBalance();
					System.out.println(green+"Your Account has Rs."+Tamount);
					System.out.println("Adding Amount Rs."+ Tamount +" from "+ fromKOTAK.getClass().getName() +" to "+ toHDFC.getClass().getName());
					System.out.println("Amount Transfer Successful Rs."+Tamount+reset);
					fromKOTAK.withdraw(Tamount);
					toHDFC.deposit(Tamount);
					Payment.paymentMode(bill);
					System.out.println(purple+"Total Balance in "+toHDFC.getClass().getName()+" is Rs."+toHDFC.viewBalance()+reset);
				}
			}
			else if(fromBank.getClass().getName().equals("KOTAK") && toBank.getClass().getName().equals("SBI"))
			{
				KOTAK fromKOTAK = (KOTAK)fromBank;
				SBI toSBI = (SBI)toBank;
				System.out.println(yellow+"Enter amount to Transfer from "+ fromBank.getClass().getName() +" to "+ toBank.getClass().getName() +" Rs."+cyan);
				double amount = sc.nextDouble();
				sc.nextLine();
				if(amount<=fromKOTAK.viewBalance())
				{
					fromKOTAK.withdraw(amount);
					toSBI.deposit(amount);
					System.out.println(green+"Amount Trasnfer Successfull Rs."+amount+" from "+ fromKOTAK.getClass().getName() +" to "+ toSBI.getClass().getName());
					System.out.println("SBI balance : "+toSBI.viewBalance()+reset);
					System.out.println(purple+"Proceeding for Payment...."+reset);
					Payment.paymentMode(bill);
				}
				else
				{
					System.out.println(red+"Insufficient Funds"+reset);
					double Tamount = fromKOTAK.viewBalance();
					System.out.println(green+"Your Account has Rs."+Tamount);
					System.out.println("Adding Amount Rs."+ Tamount +" from "+ fromKOTAK.getClass().getName() +" to "+ toSBI.getClass().getName());
					System.out.println("Amount Transfer Successful Rs."+Tamount+reset);
					fromKOTAK.withdraw(Tamount);
					toSBI.deposit(Tamount);
					Payment.paymentMode(bill);
					System.out.println(purple+"Total Balance in "+toSBI.getClass().getName()+" is Rs."+toSBI.viewBalance()+reset);
				}
			}
			else if(fromBank.getClass().getName().equals("SBI") && toBank.getClass().getName().equals("HDFC"))
			{
				SBI fromSBI = (SBI)fromBank;
				HDFC toHDFC= (HDFC)toBank;
				System.out.println(yellow+"Enter amount to Transfer from "+ fromBank.getClass().getName() +" to "+ toBank.getClass().getName() +" Rs."+cyan);
				double amount = sc.nextDouble();
				sc.nextLine();
				if(amount<=fromSBI.viewBalance())
				{
					fromSBI.withdraw(amount);
					toHDFC.deposit(amount);
					System.out.println(green+"Amount Trasnfer Successfull Rs."+amount+" from "+ fromSBI.getClass().getName() +" to "+ toHDFC.getClass().getName());
					System.out.println("HDFC balance : "+toHDFC.viewBalance()+reset);
					System.out.println(purple+"Proceeding for Payment...."+reset);
					Payment.paymentMode(bill);
				}
				else
				{
					System.out.println(red+"Insufficient Funds"+reset);
					double Tamount = fromSBI.viewBalance();
					System.out.println(green+"Your Account has Rs."+Tamount);
					System.out.println("Adding Amount Rs."+ Tamount +" from "+ fromSBI.getClass().getName() +" to "+ toHDFC.getClass().getName());
					System.out.println("Amount Transfer Successful Rs."+Tamount+reset);
					fromSBI.withdraw(Tamount);
					toHDFC.deposit(Tamount);
					Payment.paymentMode(bill);
					System.out.println(purple+"Total Balance in "+toHDFC.getClass().getName()+" is Rs."+toHDFC.viewBalance()+reset);
				}
			}
			else if(fromBank.getClass().getName().equals("SBI") && toBank.getClass().getName().equals("KOTAK"))
			{
				SBI fromSBI = (SBI)fromBank;
				KOTAK toKOTAK= (KOTAK)toBank;
				System.out.println(yellow+"Enter amount to Transfer from "+ fromBank.getClass().getName() +" to "+ toBank.getClass().getName() +" Rs."+cyan);
				double amount = sc.nextDouble();
				sc.nextLine();
				if(amount<=fromSBI.viewBalance())
				{
					fromSBI.withdraw(amount);
					toKOTAK.deposit(amount);
					System.out.println(green+"Amount Trasnfer Successfull Rs."+amount+" from "+ fromSBI.getClass().getName() +" to "+ toKOTAK.getClass().getName());
					System.out.println("KOTAK balance : "+toKOTAK.viewBalance()+reset);
					System.out.println(purple+"Proceeding for Payment...."+reset);
					Payment.paymentMode(bill);
				}
				else
				{
					System.out.println(red+"Insufficient Funds"+reset);
					double Tamount = fromSBI.viewBalance();
					System.out.println(green+"Your Account has Rs."+Tamount);
					System.out.println("Adding Amount Rs."+ Tamount +" from "+ fromSBI.getClass().getName() +" to "+ toKOTAK.getClass().getName());
					System.out.println("Amount Transfer Successful Rs."+Tamount+reset);
					fromSBI.withdraw(Tamount);
					toKOTAK.deposit(Tamount);
					Payment.paymentMode(bill);
					System.out.println(purple+"Total Balance in "+toKOTAK.getClass().getName()+" is Rs."+toKOTAK.viewBalance()+reset);
				}
			}


	}
	public static void paymentMode(double amount)
	{
		while(true)
		{
			System.out.println(blue+"Select Mode of Payment");
			System.out.println("1 for Debit Card");
			System.out.println("2 for UPI");
			System.out.println("3 for Cancel Order"+reset);
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1)
			{
				debitcard(amount);
				break;
			}
			else if(n==2)
			{
				upi(amount);
				break;
			}
			else if(n==3)
			{
				System.out.println(red+"Order Cancelled"+reset);
				return;
			}
			else
			{
				System.out.println(red+"Invalid Payment Option"+reset);
			}
		}
	}
	
	void login(){ }
	static int generateOTP()
	{
		Random random = new Random();
		return random.nextInt(9)+8999;
	}
	static void debitcard(double amount)
	{
		System.out.println(blue+"Select Bank Account");
		System.out.println("Enter \n1 for HDFC");
		System.out.println("2 for KOTAK");
		System.out.println("3 for SBI"+reset);
		int n = sc.nextInt();
		sc.nextLine();
		String pattern = "";
		
		if(n==1)
		{
			System.out.println(purple+"Selected HDFC"+reset);
			HDFC hdfc = new HDFC();

			while(true)
			{
				System.out.println(yellow+"Enter Debit Card Number"+cyan);
				long debitNum = sc.nextLong();
				sc.nextLine();
				
				pattern = "^[1-9][0-9]{11}$";
				if((debitNum+"").matches(pattern))
				{
					while(true)
					{
						System.out.println(yellow+"Enter CVV : "+cyan);
						int cvv = sc.nextInt();
						sc.nextLine();
	
						pattern = "^[1-9][0-9]{2}$";
					
						if((cvv+"").matches(pattern))
						{
							int otp = Payment.generateOTP();
							while(true)
							{
								System.out.println(purple+"You OTP is : "+otp+reset);
								System.out.println(yellow+"Enter OTP : "+cyan);
								int inputOTP = sc.nextInt();
								sc.nextLine();
								if(inputOTP==otp)
								{
									
									//make payment
									HDFC.withdraw(amount);
									System.out.println(green+"Payment successcull");
									System.out.println("Debited from HDFC...! Rs."+amount);
									System.out.println("Total balance in HDFC : "+HDFC.viewBalance()+reset);
									System.out.println();
									System.out.println();
									System.out.println(purple+"Generating Bill......"+reset);
									System.out.println();
									if(DineOut.tables==0)
									{
										Restaurant.generateBill(Restaurant.cart);
									}		
									else
									{
										DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
									}
									try
									{
										Test.main(new String[5]);
										break;
									}catch(Exception e){ }
								}
								else
								{
									System.out.println(red+"Incorrect OTP!"+reset);
								}
							}	
							
							
						
							break; //break for correct cvv 	
						}
						else
						{
							System.out.println(red+"Invalid CVV : "+cvv+reset);
							System.out.println(purple+"CVV must contain exactly 3 digits and should not start with 0"+reset);
		
						}
					}
					break;//break for correct debit number
					
				}
				else 
				{
					System.out.println(red+"Invalid Debit Card Number : "+debitNum+reset);
					System.out.println(purple+"Debit Card Number must contain exactly 12 digits and should not start with 0"+reset);
				}
			}	
			
		}
		else if(n==2)
		{
			System.out.println(purple+"Selected KOTAK"+reset);
			KOTAK kotak = new KOTAK();

			while(true)
			{
				System.out.println(yellow+"Enter Debit Card Number : "+cyan);
				long debitNum = sc.nextLong();
				sc.nextLine();
				
				pattern = "^[1-9][0-9]{11}$";
				if((debitNum+"").matches(pattern))
				{
					while(true)
					{
						System.out.println(yellow+"Enter CVV : "+cyan);
						int cvv = sc.nextInt();
						sc.nextLine();
	
						pattern = "^[1-9][0-9]{2}$";
					
						if((cvv+"").matches(pattern))
						{
							int otp = Payment.generateOTP();
							while(true)
							{
								System.out.println(green+"You OTP is : "+otp+reset);
								System.out.println(yellow+"Enter OTP : "+cyan);
								int inputOTP = sc.nextInt();
								sc.nextLine();
								if(inputOTP==otp)
								{
									
									//make payment
									KOTAK.withdraw(amount);
									System.out.println(green+"Payment successcull");
									System.out.println("Debited from KOTAK...! Rs."+amount);
									System.out.println("Total balance KOTAK : "+KOTAK.viewBalance()+reset);
									System.out.println();
									System.out.println();
									System.out.println(purple+"Generating Bill......"+reset);
									System.out.println();
									if(DineOut.tables==0)
									{
										Restaurant.generateBill(Restaurant.cart);
									}
									else
									{
										DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
									}
									try
									{
										Test.main(new String[5]);
										break;
									}catch(Exception e){ }
									break;
								}
								else
								{
									System.out.println(red+"Incorrect OTP!"+reset);
								}
							}
													
							break; //break for correct cvv 	
						}
						else
						{
							System.out.println(red+"Invalid CVV : "+cvv+reset);
							System.out.println(purple+"CVV must contain exactly 3 digits and should not start with 0"+reset);
		
						}
					}
					break;//break for correct debit number
					
				}
				else 
				{
					System.out.println(red+"Invalid Debit Card Number : "+debitNum+reset);
					System.out.println(purple+"Debit Card Number must contain exactly 12 digits and should not start with 0"+reset);
				}
			}	
			
		}
		else if(n==3)
		{
			System.out.println(purple+"Selected SBI"+reset);
			SBI sbi = new SBI();

			while(true)
			{
				System.out.println(yellow+"Enter Debit Card Number : "+cyan);
				long debitNum = sc.nextLong();
				sc.nextLine();
				
				pattern = "^[1-9][0-9]{11}$";
				if((debitNum+"").matches(pattern))
				{
					while(true)
					{
						System.out.println(yellow+"Enter CVV : "+cyan);
						int cvv = sc.nextInt();
						sc.nextLine();
	
						pattern = "^[1-9][0-9]{2}$";
					
						if((cvv+"").matches(pattern))
						{
							int otp = Payment.generateOTP();
							while(true)
							{
								System.out.println(green+"You OTP is : "+otp+reset);
								System.out.println(yellow+"Enter OTP : "+cyan);
								int inputOTP = sc.nextInt();
								sc.nextLine();
								if(inputOTP==otp)
								{
									
									//make payment
									SBI.withdraw(amount);
									System.out.println(green+"Payment successcull");
									System.out.println("Debited from SBI...! Rs."+amount);
									System.out.println("Total balance SBI : "+SBI.viewBalance()+reset);
									System.out.println();
									System.out.println();
									System.out.println(purple+"Generating Bill......"+reset);
									System.out.println();
									if(DineOut.tables==0)
									{
										Restaurant.generateBill(Restaurant.cart);
									}
									else
									{
										DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);			
									}
									try
									{
										Test.main(new String[5]);
										break;
									}catch(Exception e){ }
									break;
								}
								else
								{
									System.out.println(red+"Incorrect OTP!"+reset);
								}
							}

						
							break; //break for correct cvv 	
						}
						else
						{
							System.out.println(red+"Invalid CVV : "+cvv+reset);
							System.out.println(purple+"CVV must contain exactly 3 digits and should not start with 0"+reset);
		
						}
					}
					break;//break for correct debit number
					
				}
				else 
				{
					System.out.println(red+"Invalid Debit Card Number : "+debitNum+reset);
					System.out.println(purple+"Debit Card Number must contain exactly 12 digits and should not start with 0"+reset);
				}
			}	
			
		}
		else
		{
			System.out.println(red+"Invalid Bank Coice"+reset);
			Payment.debitcard(amount);
		}
		System.exit(0);
	}

	static void upi(double amount)
	{
		while(true)
		{
			System.out.println(blue+"Select UPI Platform");
			System.out.println("1 for PhonePe");
			System.out.println("2 for GPay");
			System.out.println("3 for PayTM"+reset);
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1)
			{
					System.out.println(purple+"Select UPI Platform : "+green+"PhonePe"+reset);
					Payment.phonepe(amount);
					break;
			}
			else if(n==2)
			{
					System.out.println(purple+"Select UPI Platform : "+green+"GPay"+reset);
					Payment.gpay(amount);
					break;
			}
			else if(n==3)
			{
					System.out.println(purple+"Select UPI Platform : "+green+"PayTM"+reset);
					Payment.paytm(amount);
					break;
			}
			else
			{
				System.out.println(red+"Invalid UPI Platform!"+reset);
			}
		}
		
		
	}

	static void phonepe(double amount)
	{
		while(true)
		{
			System.out.println(blue+"Select Bank");
			System.out.println("Enter \n1 for HDFC");
			System.out.println("2 for KOTAK");
			System.out.println("3 for SBI"+reset);
			int n = sc.nextInt();
			sc.nextLine();
			String pattern = "";
		
			if(n==1)
			{
				int count = 0;
				System.out.println(purple+"Selected HDFC"+reset);
				HDFC hdfc = new HDFC();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==hdfc.getPIN())
					{
						//make payment
						HDFC.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from HDFC...! Rs."+amount);
						System.out.println("Total balance HDFC : "+HDFC.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println(purple+"Generating Bill......"+reset);
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+cyan);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+hdfc.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+hdfc.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else if(n==2)
			{
				int count = 0;
				System.out.println(purple+"Selected KOTAK"+reset);
				KOTAK kotak = new KOTAK();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==kotak.getPIN())
					{
						//make payment
						KOTAK.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from KOTAK...! Rs."+amount);
						System.out.println("Total balance KOTAK : "+KOTAK.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println(purple+"Generating Bill......"+reset);
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+cyan);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+kotak.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+kotak.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else if(n==3)
			{
				int count = 0;
				System.out.println(purple+"Selected SBI"+reset);
				SBI sbi = new SBI();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==sbi.getPIN())
					{
						//make payment
						SBI.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from SBI...! Rs."+amount);
						System.out.println("Total balance SBI : "+SBI.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println(purple+"Generating Bill......"+reset);
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+cyan);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+sbi.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+sbi.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else
			{
				System.out.println(red+"Invalid Bank"+reset);
			}
		}
		System.exit(0);
	}

	static void gpay(double amount)
	{
		while(true)
		{
			System.out.println(blue+"Select Bank");
			System.out.println("Enter \n1 for HDFC");
			System.out.println("2 for KOTAK");
			System.out.println("3 for SBI"+reset);
			int n = sc.nextInt();
			sc.nextLine();
			String pattern = "";
		
			if(n==1)
			{
				int count = 0;
				System.out.println(purple+"Selected HDFC"+reset);
				HDFC hdfc = new HDFC();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==hdfc.getPIN())
					{
						//make payment
						HDFC.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from HDFC...! Rs."+amount);
						System.out.println("Total balance HDFC : "+HDFC.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println(purple+"Generating Bill......"+reset);
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+cyan);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+hdfc.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+hdfc.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else if(n==2)
			{
				int count = 0;
				System.out.println(purple+"Selected KOTAK"+reset);
				KOTAK kotak = new KOTAK();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==kotak.getPIN())
					{
						//make payment
						KOTAK.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from KOTAK...! Rs."+amount);
						System.out.println("Total balance KOTAK : "+KOTAK.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println("Generating Bill......");
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+cyan);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+kotak.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+kotak.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else if(n==3)
			{
				int count = 0;
				System.out.println(purple+"Selected SBI"+reset);
				SBI sbi = new SBI();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==sbi.getPIN())
					{
						//make payment
						SBI.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from SBI...! Rs."+amount);
						System.out.println("Total balance SBI : "+SBI.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println(purple+"Generating Bill......"+reset);
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+cyan);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+sbi.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+sbi.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else
			{
				System.out.println(red+"Invalid Bank"+reset);
			}
		}
		System.exit(0);
	}

	static void paytm(double amount)
	{
		while(true)
		{
			System.out.println(blue+"Select Bank");
			System.out.println("Enter \n1 for HDFC");
			System.out.println("2 for KOTAK");
			System.out.println("3 for SBI"+reset);
			int n = sc.nextInt();
			sc.nextLine();
			String pattern = "";
		
			if(n==1)
			{
				int count = 0;
				System.out.println(purple+"Selected HDFC"+reset);
				HDFC hdfc = new HDFC();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==hdfc.getPIN())
					{
						//make payment
						HDFC.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from HDFC...! Rs."+amount);
						System.out.println("Total balance HDFC : "+HDFC.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println(purple+"Generating Bill......"+reset);
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+cyan);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+hdfc.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+hdfc.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else if(n==2)
			{
				int count = 0;
				System.out.println(purple+"Selected KOTAK"+reset);
				KOTAK kotak = new KOTAK();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==kotak.getPIN())
					{
						//make payment
						KOTAK.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from KOTAK...! Rs."+amount);
						System.out.println("Total balance KOTAK : "+KOTAK.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println(purple+"Generating Bill......"+reset);
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+cyan);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+kotak.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+kotak.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else if(n==3)
			{
				int count = 0;
				System.out.println(purple+"Selected SBI"+reset);
				SBI sbi = new SBI();
				
				while(true)
				{
					System.out.println(yellow+"Enter PIN : "+cyan);
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==sbi.getPIN())
					{
						//make payment
						SBI.withdraw(amount);
						System.out.println(green+"Payment successcull");
						System.out.println("Debited from SBI...! Rs."+amount);
						System.out.println("Total balance SBI : "+SBI.viewBalance()+reset);
						System.out.println();
						System.out.println();
						System.out.println(purple+"Generating Bill......"+reset);
						System.out.println();
						if(DineOut.tables==0)
						{
							Restaurant.generateBill(Restaurant.cart);
						}
						else
						{
							DineOut.generateBill(DineOut.userDateTime, DineOut.tables, DineOut.restName);
						}
						try
						{
							Test.main(new String[5]);
							break;
						}catch(Exception e){ }
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println(red+"Invalid PIN: "+pin+reset);
								System.out.println(yellow+"Enter Phone Number : "+reset);
								long phone = sc.nextLong();
								if(phone==obj.getPhone())
								{
									while(true)
									{
										System.out.println(purple+"Your OTP is : "+ otp+reset);
										System.out.println(yellow+"Enter OTP : "+cyan);
										if(otp==sc.nextInt())
										{
											System.out.println(purple+"Your PIN is : "+sbi.getPIN()+reset);
											break;
										}
										else
										{
											System.out.println(red+"Incorrect OTP"+reset);
										}
									}
									break;
								}
								else
								{
									System.out.println(red+"User Not Found"+reset);
									System.out.println(blue+"Enter \n 1. for Re-enter phone Number \n 2. for exit"+reset);
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println(green+"Exit Successfull!"+reset);
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println(purple+"Your PIN is : "+sbi.getPIN()+reset);
						
						}
					}
					
				}
	
				break;
			}
			else
			{
				System.out.println(red+"Invalid Bank"+reset);
			}
		}
		System.exit(0);
	}

	
}




class Restaurant
{
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";

	static double bill, gst;
	static String restName = "";
	static String[] cart = new String[50];
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	//LocalDateTime userDateTime, int tables, String restName
	public static void generateBill(String[] cart)
	{
		System.out.println("*********************************************************");
		System.out.println("		       APP NAME		");
		System.out.println("*********************************************************");
		System.out.println();
		System.out.println("                       "+Restaurant.restName+"             ");
		System.out.println();
		System.out.println("  Bill No: "+ ((new java.util.Random().nextInt(9)+8999)-5893) +"      		  "+ "Date: " + java.time.LocalDate.now());
		System.out.println();
		System.out.println();
		System.out.println("           		ORDER DETAILS");
		System.out.println();
		for(int i=0;i<cart.length;i++)
		{
			
			if(cart[i]==null)
			{
				break;
			}
			String[] parts = cart[i].split("-");
			System.out.println((i+1)+" "+ parts[1] + parts[2]);
		}
		System.out.println();
		System.out.println();
		System.out.println("   Amount Paid    :  Rs."+ bill +"/-   (inc. all taxes)");
		System.out.println("   Transaction id :  T"+(((long)new java.util.Random().nextInt(9))+48439573927745l));
		System.out.println();
		System.out.println();
		System.out.println("**************************THANK YOU***********************");

	}

	static void restSelection() throws Exception
	{
		count++;
		System.out.println("count: "+count);
		if(count>1)
		{
			for(int i=0;i<cart.length;i++)
			{
				cart[i] = null;
			}
		}
		System.out.println(yellow+"Enter Restaurant Number from below : "+reset);
		System.out.println(green+"*******************RESTAURANTS*******************"+reset);
		FileReader fr = new FileReader("restaurants.txt");
	        BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int c = 0;
		while(line!=null)
       		{
	            System.out.println(cyan+ ++c +" "+ line+reset);
	            line=br.readLine();
	        }
	        br.close();
		
		int restNo = sc.nextInt();
		sc.nextLine();
		int c1 = 0;
		FileReader fr1 = new FileReader("restaurants.txt");
	        BufferedReader br1 = new BufferedReader(fr1);
		String line1 = br1.readLine();
		
		while(line1!=null)
       		{
			c1++;
		    	if(c1==restNo)
			{
	            		System.out.println(purple+line1+reset);
				restName = line1;
				
				//order(restName, itemName);			
				break;
			}
	            	line1=br1.readLine();
	        }
	        br.close();
		System.out.println(purple+"You have selected Restaurant : "+restName+reset);
		itemSelection(restName);//selected restaurant going to item selection
	}
	static void itemSelection(String restName) throws Exception
	{
		
		System.out.println(blue+"Select \n1 for Biryanis");
		System.out.println("2 for Starters");
		System.out.println("3 for Curries");
		System.out.println("4 for Naans");
		System.out.println("5 for Sweets"+reset);
		int n = sc.nextInt();
		sc.nextLine();
	
		if(n==1)
		{
			System.out.println(purple+"You have selected 1 Biryanis!"+reset);
			System.out.println(yellow+"Enter Item Number from below : "+cyan);
			System.out.println(green+"\n***********HYDERABAD DUM BIRYANI***********\n"+reset);
			FileReader fr = new FileReader("biryanis.txt");
		        BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int c = 0;
			while(line!=null)
        		{
			    c++;
		            System.out.println(cyan+line+reset);
		            line=br.readLine();
		        }
		        br.close();
			while(true)
			{
				System.out.println(yellow+"Enter Biryani Number : "+cyan);
				int itemNo = sc.nextInt();
				sc.nextLine();
				if(itemNo<=0 || itemNo>c)
				{
					continue;
				}
				System.out.println(yellow+"Enter quantity : "+cyan);
				int quantity = sc.nextInt();
				sc.nextLine();
				int c1 = 0;
				FileReader fr1 = new FileReader("biryanis.txt");
			        BufferedReader br1 = new BufferedReader(fr1);
				String line1 = br1.readLine();
				while(line1!=null)
	        		{
					c1++;
				    	if(c1==itemNo)
					{
			            		System.out.println(line1);
						String[] items = line1.split("-");
						String itemName = items[1].trim();
						double price = Double.parseDouble(items[2]);
						System.out.println(blue+"Select \n1 for More Items \n2 for Bill"+reset);
						int n1 = sc.nextInt();
						sc.nextLine();
						if(n1==1)
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1+" x "+quantity;
									break;
								}
							}
							itemSelection(restName);
						}
						else
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1 +" x "+quantity;;
									break;
								}
							}
	
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									break;
								}
								System.out.println(purple+cart[i]+reset);
							}
							
							order(restName, itemName, price);
						}
									
						break;
					}
			            	line1=br1.readLine();
			        }
			        br.close();
				break;
			}
		}
		else if(n==2)
		{
			System.out.println(purple+"You have selected 2 Starters!"+reset);
			System.out.println(yellow+"Enter Item Number from below : "+cyan);
			System.out.println(green+"\n***********STARTERS***********\n"+reset);
			FileReader fr = new FileReader("starters.txt");
		        BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int c = 0;
			while(line!=null)
        		{
			    c++;
		            System.out.println(cyan+line+reset);
		            line=br.readLine();
		        }
		        br.close();
			
			
			while(true)
			{
				System.out.println(yellow+"Enter Starter Number : "+cyan);
				int itemNo = sc.nextInt();
				sc.nextLine();
				if(itemNo<=0 || itemNo>c)
				{
					continue;
				}
				System.out.println(yellow+"Enter quantity : "+cyan);
				int quantity = sc.nextInt();
				sc.nextLine();
				int c1 = 0;
				FileReader fr1 = new FileReader("starters.txt");
			        BufferedReader br1 = new BufferedReader(fr1);
				String line1 = br1.readLine();
				while(line1!=null)
	        		{
					c1++;
				    	if(c1==itemNo)
					{
			            		System.out.println(purple+line1+reset);
						String[] items = line1.split("-");
						String itemName = items[1].trim();
						double price = Double.parseDouble(items[2]);
						System.out.println(blue+"Select \n1 for More Items \n2 for Bill"+reset);
						int n1 = sc.nextInt();
						sc.nextLine();
						if(n1==1)
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1+" x "+quantity;
									break;
								}
							}
							itemSelection(restName);
						}
						else
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1 +" x "+quantity;;
									break;
								}
							}
	
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									break;
								}
								System.out.println(purple+cart[i]+reset);
							}
							
							order(restName, itemName, price);
						}
									
						break;
					}
			            	line1=br1.readLine();
			        }
			        br.close();
				break;
			}
		}
		else if(n==3)
		{
			System.out.println(purple+"You have selected 3 Curries!"+reset);
			System.out.println(yellow+"Enter Item Number from below : "+cyan);
			System.out.println(green+"\n***********CURRIES***********\n"+reset);
			FileReader fr = new FileReader("curries.txt");
		        BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int c = 0;
			while(line!=null)
        		{
			    c++;
		            System.out.println(cyan+line+reset);
		            line=br.readLine();
		        }
		        br.close();
			
			while(true)
			{
				System.out.println(yellow+"Enter Curry Number : "+cyan);
				int itemNo = sc.nextInt();
				sc.nextLine();
				if(itemNo<=0 || itemNo>c)
				{
					continue;
				}
				System.out.println(yellow+"Enter quantity : "+cyan);
				int quantity = sc.nextInt();
				sc.nextLine();
				int c1 = 0;
				FileReader fr1 = new FileReader("curries.txt");
			        BufferedReader br1 = new BufferedReader(fr1);
				String line1 = br1.readLine();
				while(line1!=null)
	        		{
					c1++;
				    	if(c1==itemNo)
					{
			            		System.out.println(purple +line1+ reset);
						String[] items = line1.split("-");
						String itemName = items[1].trim();
						double price = Double.parseDouble(items[2]);
						System.out.println(blue+"Select \n1 for More Items \n2 for Bill"+reset);
						int n1 = sc.nextInt();
						sc.nextLine();
						if(n1==1)
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1+" x "+quantity;
									break;
								}
							}
							itemSelection(restName);
						}
						else
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1 +" x "+quantity;;
									break;
								}
							}
	
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									break;
								}
								System.out.println(purple+cart[i]+reset);
							}
							
							order(restName, itemName, price);
						}
									
						break;
					}
			            	line1=br1.readLine();
			        }
			        br.close();
				break;
			}
		}
		else if(n==4)
		{
			System.out.println(purple+"You have selected 4 Naans!"+reset);
			System.out.println(yellow+"Enter Item Number from below : "+cyan);
			System.out.println(green+"\n***********NAANS***********\n"+reset);
			FileReader fr = new FileReader("naans.txt");
		        BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int c = 0;
			while(line!=null)
        		{
			    c++;
		            System.out.println(cyan+line+reset);
		            line=br.readLine();
		        }
		        br.close();
			
			while(true)
			{
				System.out.println(yellow+"Enter Naan Number : "+cyan);
				int itemNo = sc.nextInt();
				sc.nextLine();
				if(itemNo<=0 || itemNo>c)
				{
					continue;
				}
				System.out.println(yellow+"Enter quantity : "+cyan);
				int quantity = sc.nextInt();
				sc.nextLine();
				int c1 = 0;
				FileReader fr1 = new FileReader("naans.txt");
			        BufferedReader br1 = new BufferedReader(fr1);
				String line1 = br1.readLine();
				while(line1!=null)
	        		{
					c1++;
				    	if(c1==itemNo)
					{
			            		System.out.println(purple+line1+reset);
						String[] items = line1.split("-");
						String itemName = items[1].trim();
						double price = Double.parseDouble(items[2]);
						System.out.println(blue+"Select \n1 for More Items \n2 for Bill"+reset);
						int n1 = sc.nextInt();
						sc.nextLine();
						if(n1==1)
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1+" x "+quantity;
									break;
								}
							}
							itemSelection(restName);
						}
						else
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1 +" x "+quantity;;
									break;
								}
							}
	
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									break;
								}
								System.out.println(purple+cart[i]+reset);
							}
							
							order(restName, itemName, price);
						}
									
						break;
					}
			            	line1=br1.readLine();
			        }
			        br.close();
				break;
			}
		}
		else if(n==5)
		{
			System.out.println(purple+"You have selected 5 Sweets!"+reset);
			System.out.println(yellow+"Enter Item Number from below : "+reset);
			System.out.println(green+"\n***********SWEETS***********\n"+reset);
			FileReader fr = new FileReader("sweets.txt");
		        BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int c = 0;
			while(line!=null)
        		{
			    c++;
		            System.out.println(cyan+line+reset);
		            line=br.readLine();
		        }
		        br.close();
			
			while(true)
			{
				System.out.println(yellow+"Enter Sweet Number : "+cyan);
				int itemNo = sc.nextInt();
				sc.nextLine();
				if(itemNo<=0 || itemNo>c)
				{
					continue;
				}
				System.out.println(yellow+"Enter quantity : "+reset);
				int quantity = sc.nextInt();
				sc.nextLine();
				int c1 = 0;
				FileReader fr1 = new FileReader("sweets.txt");
			        BufferedReader br1 = new BufferedReader(fr1);
				String line1 = br1.readLine();
				while(line1!=null)
	        		{
					c1++;
				    	if(c1==itemNo)
					{
			            		System.out.println(purple+line1+reset);
						String[] items = line1.split("-");
						String itemName = items[1].trim();
						double price = Double.parseDouble(items[2]);
						System.out.println(blue+"Select \n1 for More Items \n2 for Bill"+reset);
						int n1 = sc.nextInt();
						sc.nextLine();
						if(n1==1)
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1+" x "+quantity;
									break;
								}
							}
							itemSelection(restName);
						}
						else
						{
							bill = bill + (price * quantity);
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									cart[i] = line1 +" x "+quantity;;
									break;
								}
							}
	
							for(int i=0;i<cart.length;i++)
							{
								if(cart[i]==null)
								{
									break;
								}
								System.out.println(green+cart[i]+reset);
							}
							
							order(restName, itemName, price);
						}
									
						break;
					}
			            	line1=br1.readLine();
			        }
			        br.close();
				break;
			}
		}
	}
	static void order(String restName, String itemName, double price)
	{
		gst = bill*((double)3/100);
		System.out.println(cyan+"Your order amount is Rs. "+bill);
		System.out.printf("GST 		     Rs. %.2f ",(float)gst);
		System.out.println(reset);
		bill = bill + gst;
		System.out.printf(purple+"Your bill amount is  Rs. ",bill);
		System.out.println(reset);
		Payment.paymentMode(bill);
	}
}


class Test
{
	static int count = 0;
	static int userType = 0;
	static Scanner sc = new Scanner(System.in);
	
	static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";
	public static void main(String[] args) throws Exception
	{
		count++;
		System.out.println(blink+yellow+"				* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("				");
		System.out.println("				*	 	"+reset+green+"W E L C O M E   T O  ***********"+reset+"	"+blink+yellow+"	*");				
		System.out.println("				");
		System.out.println("				* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *"+reset);

		while(true)
		{
			if(count==1)
			{
				System.out.println();
				System.out.println();
				System.out.println("						       "+bgcyan+white+"Select Type of User"+reset);
				System.out.println();
				System.out.println(blue+"							   1 for User");
				System.out.println("							   2 for Vendor");
				System.out.println("							   3 for Admin");
				System.out.println("							   4 for Exit"+reset);
			
				userType = sc.nextInt();
				sc.nextLine();
			}
			if(userType==1)
			{
				User user = new User();
				if(count==1)
				{
					while(true)
					{
						System.out.println(yellow+"Enter Username, Password, Phone Number and Address "+cyan);
						try
						{
							SignUp up = new User(sc.nextLine(), sc.nextLine(), sc.nextLong());///registration
							up.login();
							break;//correct details break
						}
						catch(InputMismatchException e)
						{
							sc.nextLine();
							System.out.println(red+"Invalid Username or Password or Address"+reset);
						}
	
					}
				}
				while(true)
				{
					System.out.println(blue+"Select \n1 for Order Online");
					System.out.println("2 for Dineout");
					System.out.println("3 for Exit"+reset);
					int input = sc.nextInt();
					sc.nextLine();
					if(input==1)
					{
						System.out.println(purple+"You have selected : Order Online"+reset);
						Restaurant.restSelection();
						break;//break after order
					}
					else if(input==2)
					{
						System.out.println(purple+"Your have selected : Dineout"+reset);
						DineOut.booking();
												
						break;//break after order
					}
					else if(input==3)
					{
						System.out.println(green+blink+"Thank You for choosing *******!"+reset);
						return;
					}
					else
					{
						System.out.println(red+"Invalid Selection!"+reset);
					}
				}
				break;//user type break
			}
			else if(userType==2)
			{
				Vendor vendor = new Vendor();
				
				if(count==1)
				{
					while(true)
					{
						System.out.println(yellow+"Enter Username, Password, Phone Number and Address "+cyan);
						try
						{
							SignUp up = new User(sc.nextLine(), sc.nextLine(), sc.nextLong());///registration
							up.login();
							break;//correct details break
						}
						catch(InputMismatchException e)
						{
							sc.nextLine();
							System.out.println(red+"Invalid Username or Password or Address"+reset);
						}
	
					}
				}
				
				while(true)
				{
					System.out.println(blue+"Select Task : ");
					System.out.println("1 to Add Item");
					System.out.println("2 to Edit Item");
					System.out.println("3 to Delete Item");
					System.out.println("4 to Exit"+reset);
					System.out.println();
					int n = sc.nextInt();
					sc.nextLine();
					int c=0;
					if(n==1)
					{
						while(true)
						{
							System.out.println(blue+"Enter \n1 to Add Biryani");
							System.out.println("2 to Add Starters");
							System.out.println("3 to Add Curries");
							System.out.println("4 to Add Naans");
							System.out.println("5 to Add Sweets"+reset);
							int category = sc.nextInt();
							sc.nextLine();
							if(category==1)
							{
								System.out.println(purple+"You have opt to Add Biryani"+reset);

								System.out.println(yellow+"Current items"+reset);
								try
								{
									FileReader fr = new FileReader("biryanis.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }

								System.out.println(yellow+"Enter Number of Biryanis to Add : "+reset);
								int nBiryanis = sc.nextInt();
								sc.nextLine();
								vendor.addBiryani(nBiryanis);
								
								System.out.print(green+"Adding Biryani");
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println(reset);
								System.out.println(cyan+"Biryani Added Successfully"+reset);
						
								System.out.println();
								System.out.println();
								System.out.println(purple+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("biryanis.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();

								System.out.println(blue+"Select 1 to do More Tasks \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//Task break
							}
							else if(category==2)
							{
								System.out.println(purple+"You have opt to Add Starter"+reset);

								System.out.println(yellow+"Current items");
								try
								{
									FileReader fr = new FileReader("starters.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println(yellow+"Enter Number of Starters to Add : "+reset);
								int nStarters = sc.nextInt();
								sc.nextLine();
								vendor.addStarter(nStarters);
								System.out.print(green+"Adding Starter"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println();
								System.out.println(cyan+"Starter Added Successfully"+reset);

								System.out.println();
								System.out.println();
								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("starters.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();
						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
								break;//Task break
							}
							else if(category==3)
							{
								System.out.println(purple+"You have opt to Add Curries"+reset);

								System.out.println(yellow+"Current items"+reset);
								try
								{
									FileReader fr = new FileReader("curries.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println(yellow+"Enter Number of Curries to Add : "+reset);
								int nCurries = sc.nextInt();
								sc.nextLine();
								vendor.addCurry(nCurries);
								System.out.print(green+"Adding Curry"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
				
								System.out.println(cyan+"Curry Added Successfully"+reset);

								System.out.println();
								System.out.println();
								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("curries.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();

						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
								break;//task break
							}
							else if(category==4)
							{
								System.out.println(purple+"You have opt to Add Naans"+reset);

								System.out.println(yellow+"Current items"+reset);
								try
								{
									FileReader fr = new FileReader("naans.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println(yellow+"Enter Number of Naans to Add : "+reset);
								int nNaans = sc.nextInt();
								sc.nextLine();
								vendor.addNaan(nNaans);
								System.out.print(green+"Adding Naan"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);			
									}
								}catch(InterruptedException e){ }
								System.out.println(cyan+"Naans Added Successfully"+reset);

								System.out.println();
								System.out.println();
								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("naans.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();
						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
								break;//Task break
							}
							else if(category==5)
							{
								System.out.println(purple+"You have opt to Add Sweets"+reset);

								System.out.println(yellow+"Current items"+reset);
								try
								{
									FileReader fr = new FileReader("sweets.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println(yellow+"Enter Number of Sweets to Add : "+reset);
								int nSweets = sc.nextInt();
								sc.nextLine();
								vendor.addSweet(nSweets);
								System.out.print(green+"Adding Sweet"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
				
								System.out.println(cyan+"Sweets Added Successfully"+reset);

								System.out.println();
								System.out.println();
								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("sweets.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();
						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
								break;//Task break
							}
							else
							{
								System.out.println(red+"Invalid Category selected"+reset);
							}
							break;//admin task break
						}

					}
					else if(n==2)
					{
						while(true)
						{
							System.out.println(blue+"Enter \n1 to Edit Biryani");
							System.out.println("2 to Edit Starters");
							System.out.println("3 to Edit Curries");
							System.out.println("4 to Edit Naans");
							System.out.println("5 to Edit Sweets"+reset);
							int category = sc.nextInt();
							sc.nextLine();
							if(category==1)
							{
								System.out.println(purple+"You have opt to Edit Biryani"+reset);
								try
								{
									FileReader fr = new FileReader("biryanis.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println(yellow+"Enter Biryani Number to Edit : "+reset);
								int input  = sc.nextInt();
								sc.nextLine();
								
								System.out.println(yellow+"Enter Updated Biryani Name : "+cyan);
								String newBiryani = sc.nextLine();
								vendor.editItem("biryanis.txt", input, newBiryani);

								System.out.print(green+"Updating Biryani"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);			
									}
								}catch(InterruptedException e){ }
								System.out.println();

								System.out.println(cyan+"Biryani Updated Successfully"+reset);
								System.out.println();
								System.out.println();

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("biryanis.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();

								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break
							}
							else if(category==2)
							{
								System.out.println(purple+"You have opt to Edit Starters"+reset);
								try
								{
									FileReader fr = new FileReader("starters.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println();

								System.out.println(yellow+"Enter Starter Number to Edit : "+reset);
								int input  = sc.nextInt();
								sc.nextLine();
								
								System.out.println(yellow+"Enter Updated Starter Name : "+reset);
								String newStarter = sc.nextLine();
								vendor.editItem("starters.txt", input, newStarter);

								System.out.print(green+"Updating Starter"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println(cyan+"Starter Updated Successfully"+reset);

								System.out.println();
								System.out.println();

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("starters.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();

						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break

							}
							else if(category==3)
							{
								System.out.println(purple+"You have opt to Edit Curries"+reset);
								try
								{
									FileReader fr = new FileReader("curries.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println();

								System.out.println(yellow+"Enter Curry Number to Edit : "+reset);
								int input  = sc.nextInt();
								sc.nextLine();
								
								System.out.println(yellow+"Enter Updated Curry Name : "+reset);
								String newCurry = sc.nextLine();
								vendor.editItem("curries.txt", input, newCurry);
								System.out.print(green+"Updating Curry"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
				
								System.out.println(cyan+"Curry Updated Successfully"+reset);

								System.out.println();
								System.out.println();

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("curries.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();
						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break

							}
							else if(category==4)
							{
								System.out.println(purple+"You have opt to Edit Naans"+reset);
								try
								{
									FileReader fr = new FileReader("naans.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println();

								System.out.println(yellow+"Enter Naan Number to Edit : "+reset);
								int input  = sc.nextInt();
								sc.nextLine();
								
								System.out.println(yellow+"Enter Updated Naan Name : "+reset);
								String newNaan = sc.nextLine();
								vendor.editItem("naans.txt", input, newNaan);

								System.out.print(green+"Updating Naan"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println(cyan+"Naan Updated Successfully"+reset);

								System.out.println();
								System.out.println();

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("naans.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();
						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break

							}
							else if(category==5)
							{
								System.out.println(purple+"You have opt to Edit Sweets"+reset);
								try
								{
									FileReader fr = new FileReader("sweets.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(purple+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println(yellow+"Enter Sweet Number to Edit : "+reset);
								int input  = sc.nextInt();
								sc.nextLine();
								
								System.out.println(yellow+"Enter Updated Sweet Name : "+reset);
								String newSweet = sc.nextLine();
								vendor.editItem("sweets.txt", input, newSweet);

								System.out.print(green+"Updating Sweet"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println();

								System.out.println(cyan+"Sweet Updated Successfully"+reset);

								System.out.println();
								System.out.println();

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("sweets.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						

								System.out.println();
								System.out.println();
						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break

							}
							else
							{
								System.out.println(red+"Invalid Category selected"+reset);
							}
							break;//vendor task break
						}
						
					}
					else if(n==3)
					{


						while(true)
						{
							System.out.println(blue+"Enter \n1 to Delete Biryani");
							System.out.println("2 to Delete Starters");
							System.out.println("3 to Delete Curries");
							System.out.println("4 to Delete Naans");
							System.out.println("5 to Delete Sweets"+reset);
							int category = sc.nextInt();
							sc.nextLine();
							if(category==1)
							{
								System.out.println(purple+"You have opt to Delete Biryani"+reset);
														
								vendor.deleteItem("biryanis.txt");
								System.out.print(green+"Deleting Biryani"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println();
								System.out.println(cyan+"Biryani Deleted Successfully"+reset);
						
								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("biryanis.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }

								System.out.println();
								System.out.println();
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break
							}
							else if(category==2)
							{
								System.out.println(purple+"You have opt to Delete Starter"+reset);
																
								vendor.deleteItem("starters.txt");
								System.out.print(green+"Deleting Starter"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println();

								System.out.println(cyan+"Starter Deleted Successfully"+reset);

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("starters.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
								System.out.println();
								System.out.println();
						
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break


							}
							else if(category==3)
							{
								System.out.println(purple+"You have opt to Delete Curries"+reset);
								
								
								vendor.deleteItem("curries.txt");
								System.out.print(green+"Deleting Curry"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println();

								System.out.println(cyan+"Curry Deleted Successfully"+reset);

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("curries.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						
								System.out.println();
								System.out.println();
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break


							}
							else if(category==4)
							{
								System.out.println(purple+"You have opt to Delete Naans"+reset);
								
								
								vendor.deleteItem("naans.txt");
								System.out.print(green+"Deleting Naan"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println();

								System.out.println(cyan+"Naan Deleted Successfully"+reset);

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("naans.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						
								System.out.println();
								System.out.println();
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break


							}
							else if(category==5)
							{
								System.out.println(purple+"You have opt to Delete Sweets"+reset);
								
								
								vendor.deleteItem("sweets.txt");
								System.out.print(green+"Deleting Sweet"+reset);
								try{
									for(int i=1;i<=3;i++)
									{
										Thread.sleep(1000);
										System.out.print(green+"."+reset);							
									}
								}catch(InterruptedException e){ }
								System.out.println();

								System.out.println(cyan+"Sweet Deleted Successfully"+reset);

								System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("sweets.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						
								System.out.println();
								System.out.println();
								System.out.println(blue+"Select 1 to do More Items \n2 to exit"+reset);
								if(sc.nextInt()==1)
								{
									break;//category break
								}
																

								break;//task break

							}
							else
							{
								System.out.println(red+"Invalid Category selected"+reset);
							}
							break;//vendor task break
						}

					}
					else if(n==4)
					{
						System.out.println(green+"Exit Successful"+reset);
						return;
					}
					else
					{
						
						c++;
						if(c>1)
							System.out.println(red+"Invalid choice"+reset);
						else
							break;
					}
				}

				break;//user type break
			}
			else if(userType==3)
			{
				Admin admin = new Admin();
				if(count==1)
				{
					while(true)
					{
						System.out.println(yellow+"Enter Username, Password, Phone Number and Address "+cyan);
						try
						{
							SignUp up = new User(sc.nextLine(), sc.nextLine(), sc.nextLong());///registration
							up.login();
							break;//correct details break
						}
						catch(InputMismatchException e)
						{
							sc.nextLine();
							System.out.println(red+"Invalid Username or Password or Address"+reset);
						}
	
					}
				}
				while(true)
				{
					System.out.println(blue+"Select Task : ");
					System.out.println("1 to Add Restaurant");
					System.out.println("2 to Edit Restaurant");
					System.out.println("3 to Delete Restaurant");
					System.out.println("4 to Exit"+reset);
					int n = sc.nextInt();
					sc.nextLine();
					if(n==1)
					{
						System.out.println(yellow+"Enter Number of Restaurants to Add : "+reset);
						int nRest = sc.nextInt();
						sc.nextLine();
						admin.addRestaurants(nRest);
						System.out.print(green+"Adding Restaurant"+reset);
						try{
							for(int i=1;i<=3;i++)
							{
								Thread.sleep(1000);
								System.out.print(green+"."+reset);							
							}
						}catch(InterruptedException e){ }

						System.out.println();
						System.out.println(cyan+"Restaurant Added Successfully"+reset);
						System.out.println();
						System.out.println();
						System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("restaurants.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						
								System.out.println();
								System.out.println();
						System.out.println(blue+"Select 1 to do More Tasks \n2 to exit"+reset);
						if(sc.nextInt()==1)
						{
							continue;
						}
						break;//admin task break
					}
					else if(n==2)
					{
						try
						{
							FileReader fr = new FileReader("restaurants.txt");
						        BufferedReader br = new BufferedReader(fr);
							String line = br.readLine();
							while(line!=null)
					       		{
						            System.out.println(purple+line+reset);
						            line=br.readLine();
						        }
					        	br.close();
						}
						catch(Exception e){ }
						
						System.out.println(yellow+"Enter Restaurant Name to Edit from above Restaurants : "+cyan);
						String oldRest = sc.nextLine();
						System.out.println(yellow+"Enter Updated Restaurant Name : "+cyan);
						String newRest = sc.nextLine();
						admin.editRestaurant(oldRest, newRest);
						System.out.print(green+"Editing Restaurant"+reset);
						try{
							for(int i=1;i<=3;i++)
							{
								Thread.sleep(1000);
								System.out.print(green+"."+reset);							
							}
						}catch(InterruptedException e){ }
						System.out.println();
						System.out.println(cyan+"Restuarant Edit Successful...!"+reset);

						System.out.println();
						System.out.println();
						System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("restaurants.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						
								System.out.println();
								System.out.println();
						System.out.println(blue+"Select 1 to do More Tasks \n2 to exit"+reset);
						if(sc.nextInt()==1)
						{
							continue;
						}
						break;//admin task break
					}
					else if(n==3)
					{
						admin.deleteRestaurant();
						System.out.print(green+"Deleting Restaurant"+reset);
						try{
							for(int i=1;i<=3;i++)
							{
								Thread.sleep(1000);
								System.out.print(green+"."+reset);							
							}
						}catch(InterruptedException e){ }
						System.out.println();
						System.out.println(cyan+"Restaurant Deleted Sucessfully...!"+reset);

						System.out.println();
						System.out.println();
						System.out.println(yellow+"Updated List"+reset);
								try
								{
									FileReader fr = new FileReader("restaurants.txt");
								        BufferedReader br = new BufferedReader(fr);
									String line = br.readLine();
									while(line!=null)
							       		{
								            System.out.println(green+line+reset);
								            line=br.readLine();
								        }
							        	br.close();
								}
								catch(Exception e){ }
						
								System.out.println();
								System.out.println();
						System.out.println(blue+"Select 1 to do More Tasks \n2 to exit"+reset);
						if(sc.nextInt()==1)
						{
							continue;
						}
						break;//admin task break
					}
					else if(n==4)
					{
						System.out.println(green+"Exit Successful"+reset);
						return;
					}
					else
					{
						System.out.println(green+"Invalid Choice"+reset);
					}
				}
				
				break;//user type break
			}
			else if(userType==4)
			{
				System.out.println(yellow+blink+"Thank You...!"+reset);
				return;
			}
			else
			{
				System.out.println(red+"Invalid choice"+reset);
			}
		}
	}
}
		