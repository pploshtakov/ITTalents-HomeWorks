
public class CallDemo {
	/*
	 * Задача 2: Да се създадат класовете Call и GSM, представящи съответно
	 * телефонно обаждане и телефон. Класът Call да съдържа следните полета:
	 * priceForAMinute – статично поле, което показва цената на разговор за
	 * минута caller - показва телефона, от който е направено повикването
	 * receiver - показва телефона, към който е направено повикването duration -
	 * дължината на разговора (в минути) Класът GSM да съдържа полетата: model –
	 * модел на телефона hasSimCard – дали в телефона е заредена SIM карта
	 * simMobileNumber – номер на SIM картата(телефонен номер), ако е заредена
	 * такава. outgoingCallsDuration – общото време (в минути) на изходящите
	 * повиквания lastIncomingCall – последното входящо повикване
	 * lastOutgoingCall – последното изходящо повикване Да се напишат следните
	 * методи за класа GSM: - insertSimCard(simMobileNumber) – метода задава
	 * номер(сим карта) на телефона. Да се провери дали подаденият номер е
	 * валиден (започва с 08 и се състои от 10 цифри). Ако номерът е валиден, го
	 * задава на телефона и задава стойност true на полето hasSimCard -
	 * removeSimCard() - премахва сим картата от телефона (задава false на
	 * полето hasSimCard) - call( receiver, duration) – В тялото му да се
	 * направят проверки за: • дали въведената дължина на разговора е валидна •
	 * дали двата телефона (този за който се извиква метода и този към който се
	 * прави обаждането) не са един и същ телефон • дали и двата телефона имат
	 * сим карта Ако всички проверки преминат успешно, метода прави обаждане с
	 * продължителност duration към телефона, подаден като параметър. Задава
	 * това обаждане като последно изходящо повикване на телефона от който се
	 * прави повикването (телефона за който се извиква метода) и задава същото
	 * обаждане като последно входящо за телефона към който се прави обаждането.
	 * Осен това увеличава стойността на outgoingCallsDuration със дължината на
	 * разговора за телефона от който се прави обаждането. Да се направи и метод
	 * getSumForCall(), който връща сумата, начислена за изходящите повиквания
	 * на телефона (общото време на изходящите повиквания по цената за минута -
	 * priceForAMinute). Да се направят два метода
	 * printInfoForTheLastOutgoingCall() и printInfoForTheLastIncomingCall()
	 * които извеждат информация за последното изходящо/входящо повиквана на
	 * телефона (ако има такова)
	 */
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
		peshoGsm.call(ivanGsm, call);
		Call call1 = new Call();
		call1.caller = ivanGsm.simMobileNumber;
		call1.receiver = peshoGsm.simMobileNumber;
		call1.duration = 3.5;
		ivanGsm.call(peshoGsm, call1);
		Call call2 = new Call();
		call2.caller = peshoGsm.simMobileNumber;
		call2.receiver = ivanGsm.simMobileNumber;
		call2.duration = 5;
		peshoGsm.call(ivanGsm, call2);
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
