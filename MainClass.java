

import java.util.Scanner;
public class MainClass{
	double Balance;

    public void viewBalance()
				{
					System.out.println("Available Balance is: "+Balance);
	            }
	public void withdraw(double withAmount)
					{
						System.out.println(withAmount+" Withdrwed SuccessFully !!");
						Balance=Balance-withAmount;
                        viewBalance();

	             }
	public void deposite(double depositeAmount)
					{
                       System.out.println(depositeAmount+" Deposited SuccessFully !!");
                       Balance=Balance+depositeAmount;
                       viewBalance();
	                }

	public static void main(String[] args)
	{


		MainClass m=new MainClass();

		int atmnumber=12345;
		int atmpin=123;
        int ch;
        int val=4;

		Scanner in=new Scanner(System.in);
		System.out.println("!!!!!!!   Welcome To Ashwini's ATM Machine  !!!!!!!\n");
		System.out.print("Enter UserId: ");
		int atmNumber=in.nextInt();
		System.out.print("Enter Pin: ");
		int pin=in.nextInt();

		if((atmnumber==atmNumber)&&(atmpin==pin))
		{

            do{
		    System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.Exit\n");
		    System.out.print("Enter Your Choice: ");
		    ch=in.nextInt();

		    if(ch==1)
		    {
				m.viewBalance();
		    }
		    else if(ch==2)
		    {
				System.out.print("Enter Amount to Withdraw: ");
				double withAmount=in.nextDouble();
				m.withdraw(withAmount);
			}
			else if(ch==3)
	        {
				System.out.print("Enter Amount to Deposite: ");
				double depositeAmount=in.nextDouble();
				m.deposite(depositeAmount);
			}
			else if(ch==4)
			{
				System.out.println("\nPlease Collect your ATM card....Thank you For Using This ATM Machine!");
				System.exit(0);
			}
	    }while(val>=3);
	}

		else{
		System.out.println("\nInvalid ATM Number or Pin!...Enter Valid Details!\n");

	    }

	}



}