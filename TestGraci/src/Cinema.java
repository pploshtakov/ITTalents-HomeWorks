

public class Cinema {

	public static void main(String[] args) {
		Actor[] actors = new Actor[3];
		actors[0] = new Actor("Daysy", "Ridley", "female", 23);
		actors[1] = new Actor("Oscar", "Isaac", "male", 35);
		actors[2] = new Actor("Mark", "Hamill", "male", 64);
		Movie starWars = new Movie("Star Wars", 2015, actors);
		System.out.println(starWars.getTitle());
		for (int i = 0; i < 3; i++) {
			System.out.println(actors[i].getFirstName() + " " + actors[i].getLastName());
		}
		System.out.println(starWars.getActorsAverageAge());
		// TODO Auto-generated method stub

	}

}
