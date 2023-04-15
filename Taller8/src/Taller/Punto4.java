package Taller;


public class Punto4 {
	private static final Object[] Estudiante = null;

	public Punto4() {
		Estudiante[] students = new Estudiante[3];

		students[0] = new Estudiante("Mary Jones", 14, 46);
		students[1] = new Estudiante("John Stiner", 60, 173);
		students[2] = new Estudiante("Ari Samala", 31, 69);
		
		
		int credits = ((Taller.Estudiante) Estudiante[2]).getCredits();
		int qualityPoints = ((Taller.Estudiante) Estudiante[2]).getQualityPoints();;
		((Taller.Estudiante) Estudiante[2]).setCredits(credits + 3);
		((Taller.Estudiante) Estudiante[2]).setQualityPoints(qualityPoints + 52);
		
		((Taller.Estudiante) Estudiante[2]).inputCreditsAndQualityPoints();
	}
}