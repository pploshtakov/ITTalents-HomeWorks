
public class GSM {
	String model;
	boolean hasSimCard = false;
	String simMobileNumber;
	double outgoingCallsDuration;
	double lastOutgoingCallTime;
	double lastIncomingCallTime;
	String lastIncomingCall;
	String lastOutgoingCall;

	/*- insertSimCard(simMobileNumber) – метода задава номер(сим карта)
	на телефона. Да се провери дали подаденият номер е валиден
	(започва с 08 и се състои от 10 цифри). Ако номерът е валиден, го
	задава на телефона и задава стойност true на полето hasSimCard
	*/
	void insertSimCard(String number) {
		if (number.charAt(0) == '0' && number.charAt(1) == '8' && number.length() == 10) {
			hasSimCard = true;
			simMobileNumber = number;
		} else {
			System.out.println("Invalid number!");
		}
	}

	/*- removeSimCard() - премахва сим картата от телефона (задава false
	на полето hasSimCard)
	*/
	void removeSimCard() {
		hasSimCard = false;
	}

	// - call( receiver, duration) – В тялото му да се направят проверки за:
	void call(GSM reciver, double duration) {
		Call call = new Call();
		call.caller = simMobileNumber;
		call.receiver = reciver.simMobileNumber;
		call.duration = duration;
		// • дали и двата телефона имат сим карта
		if (hasSimCard && reciver.hasSimCard) {
			// • дали въведената дължина на разговора е валидна
			if (call.duration <= 0) {
				System.out.println("Duration time must be greater than 0!");
			}
			// • дали двата телефона (този за който се извиква метода и
			// този към който се прави обаждането) не са един и същ телефон
			else if (simMobileNumber.equals(reciver.simMobileNumber)) {
				System.out.println("Error , call on your own phone!");
			} else {
				/*
				 * Ако всички проверки преминат успешно, метода прави обаждане с
				 * продължителност duration към телефона, подаден като
				 * параметър. Задава това обаждане като последно изходящо
				 * повикване на телефона от който се прави повикването (телефона
				 * за който се извиква метода) и задава същото обаждане като
				 * последно входящо за телефона към който се прави обаждането.
				 */
				lastOutgoingCall = reciver.simMobileNumber;
				/*
				 * Осен това увеличава стойността на outgoingCallsDuration със
				 * дължината на разговора за телефона от който се прави
				 * обаждането.
				 */
				outgoingCallsDuration += call.duration;
				lastOutgoingCallTime = call.duration;
				reciver.lastIncomingCall = simMobileNumber;
				reciver.lastIncomingCallTime = call.duration;
			}
		} else {
			System.out.println("Caller or reciver no SIM card!");
		}
	}

	/*
	 * Да се направи и метод getSumForCall(), който връща сумата, начислена за
	 * изходящите повиквания на телефона (общото време на изходящите повиквания
	 * по цената за минута - priceForAMinute).
	 */
	double getSumForCall() {
		double sumForCall = outgoingCallsDuration * Call.priceForAMinute;
		return sumForCall;
	}

	/*
	 * Да се направят два метода printInfoForTheLastOutgoingCall() и
	 * printInfoForTheLastIncomingCall() които извеждат информация за последното
	 * изходящо/входящо повиквана на телефона (ако има такова)
	 */
	void printInfoForTheLastOutgoingCall() {
		if (outgoingCallsDuration > 0) {
			System.out.println("Last call to " + lastOutgoingCall);
			System.out.println("Time " + lastOutgoingCallTime);
			System.out.println("Price " + (lastOutgoingCallTime * Call.priceForAMinute));
		} else {
			System.out.println("No outgoing calls.");
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCallTime > 0) {
			System.out.println("Last incoming call from " + lastIncomingCall);
			System.out.println("Last incoming call time " + lastIncomingCallTime);
		} else {
			System.out.println("No incoming calls.");
		}
	}
}
