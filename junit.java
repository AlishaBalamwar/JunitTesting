import java.util.Scanner;
public class junit {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the change to be returned: Change");
		int Change = s.nextInt();
		int FivehundredrsNotes = 0;
		int ThousandrsNotes = 0;
		int HundredrsNotes = 0;
		int  FiftyrsNotes = 0;
		int TenrsNotes = 0;
		int TworsCoins = 0;
		int OnersCoin=0;
		while(Change>=1000) {
		ThousandrsNotes = ThousandrsNotes + 1;
		Change=Change - 1000;
		}
		while(Change>=500){
		FivehundredrsNotes = FivehundredrsNotes + 1;
		Change =Change - 500;
		}
		while(Change>=100) {
		HundredrsNotes = HundredrsNotes + 1;	
		Change = Change  - 100;
		}
		while(Change>=50) {
		FiftyrsNotes= FiftyrsNotes + 1;
		Change = Change - 50;
		}
		while(Change>=10) {
		TenrsNotes = TenrsNotes + 1;
		Change = Change - 10;
		}
		while(Change>=2) {
		TworsCoins = TworsCoins + 1;
		Change = Change -2;
		}
		while(Change>=1) {
		OnersCoin = OnersCoin + 1;	
		Change = Change - 1;	
		}
		int TotalNotes = ThousandrsNotes  + FivehundredrsNotes + HundredrsNotes + FiftyrsNotes + TenrsNotes ;
		int TotalCoins = TworsCoins + OnersCoin;
		System.out.println("Here is your change = " + "500rsNotes = " +FivehundredrsNotes + " " + "1000rsNotes = " +ThousandrsNotes + " " + "100rsNotes = " +HundredrsNotes + " " + "50rsNotes = " +FiftyrsNotes + " " + "10rsNotes = " +TenrsNotes + " " + "2rsCoin = " +TworsCoins + " " + "1rsCoins = " +OnersCoin );
		System.out.println("Total Notes recieved = " +TotalNotes);
		System.out.println("Total coins recieved = " +TotalCoins);
		}
}
