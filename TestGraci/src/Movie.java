
public class Movie {
	private String title;
	private int year;
	private Actor[] actors;
	public Movie(String title, int year, Actor[] actors) {
		super();
		this.title = title;
		this.year = year;
		this.actors = actors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Actor[] getActors() {
		return actors;
	}
	public void setActors(Actor[] actors) {
		this.actors = actors;
	}
	public int getActorsAverageAge() {
		int sumAge = 0;
		for (int i = 0; i < this.actors.length; i++) {
			sumAge += this.actors[i].getAge();
		}
		return sumAge/this.actors.length;
	}
	
	
	
	
	
	
	
	
	
}
