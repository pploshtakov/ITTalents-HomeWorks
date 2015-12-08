
public class CallDemo {

	public static void main(String[] args) {
		GSM peshoGsm = new GSM();
		peshoGsm.simMobileNumber = "0888887777";
		peshoGsm.insertSimCard();
		peshoGsm.model = "Galaxy S4";
		GSM ivanGsm = new GSM();
		ivanGsm.simMobileNumber = "0877777777";
		ivanGsm.insertSimCard();
		ivanGsm.model = "Galxy S4";
		Call call = new Call();
		call.caller = peshoGsm.simMobileNumber;
		call.receiver = ivanGsm.simMobileNumber;
		call.duration = 2;
		//peshoGsm.call(ivanGsm, call);
		Call call1 = new Call();
		call1.caller = ivanGsm.simMobileNumber;
		call1.receiver = peshoGsm.simMobileNumber;
		call1.duration = 3.5;
		ivanGsm.call(peshoGsm, call1);
		Call call2 = new Call();
		call2.caller = peshoGsm.simMobileNumber;
		call2.receiver = ivanGsm.simMobileNumber;
		call2.duration = 5;
		//peshoGsm.call(ivanGsm, call2);
		System.out.println("Price of all outgoing calls on pesho " + peshoGsm.getSumForCall());
		System.out.println("Info pesho last Outgoing call.");
		peshoGsm.printInfoForTheLastOutgoingCall();
		System.out.println("Info pesho last incoming call.");
		peshoGsm.printInfoForTheLastIncomingCall();
		System.out.println("Price of all outgoing calls on ivan " + ivanGsm.getSumForCall());
		System.out.println("Info ivan last Outgoing call.");
		ivanGsm.printInfoForTheLastOutgoingCall();
		System.out.println("Info ivan last incoming call.");
		ivanGsm.printInfoForTheLastIncomingCall();

		// TODO Auto-generated method stub

	}

}
