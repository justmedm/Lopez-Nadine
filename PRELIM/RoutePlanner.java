import java.util.Scanner;

public class RoutePlanner {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String[] locations = {
"Cebu City (South Bus Terminal)",
"Minglanilla (route 1)",
"San Fernando (route 2)",
"Carcar (route 3)",
"Barili (route 4.1)",
"Dumanjug (route 4.1.1)",
"Alcantara (route 4.1.2)",
"Moalboal (end)"
};

System.out.println("ROUTES TO MOALBOAL");
System.out.println("\nDefault Routes:");
for (String location : locations) System.out.println(location);

int speed = getIntInput(input, "\nInput your travel speed (in km/hr): ");
boolean isBariliBlocked = getYesNoInput(input, "Is Barili obstructed? (YES / NO): ");
boolean isDumanjugBlocked = isBariliBlocked && getYesNoInput(input, "Is Dumanjug obstructed? (YES / NO): ");

int selectedRoute = isBariliBlocked ? (isDumanjugBlocked ? 3 : 2) : 1;

double distance = selectedRoute == 3 ? 92.2 : (selectedRoute == 2 ? 93.9 : 84.9);


System.out.println("Recommended Route: " + "\nCebu City (South Bus Terminal)"
+ "\nMinglanilla - Route 1 \nSan Fernando - Route 2 \nCarcar - Route 3 \n"
+ (selectedRoute == 3 ? "Sibonga - Route 4.2\nArgao - Route 5 \nRonda - Route 5.1 \nAlcantara - Route 5.2"
: (selectedRoute == 2 ? "Sibonga - Route 4.2\nDumanjug - Route 4.2.1 \nAlcantara - Route 4.2.2"
: "Barili - Route 4.1\nDumanjug - Route 4.1.1 \nAlcantara - Route 4.1.2"))
+ "\nMoalboal");
System.out.println("Vehicle Speed: " + speed + " km/hr");
System.out.println("Distance: " + distance + " km");

int hours = (int) (distance / speed);
int minutes = (int) ((distance / speed * 60) % 60);
System.out.println("Estimated Time of Arrival (ETA): " + hours + " Hour(s) " + minutes + " Minute(s)");
}

public static int getIntInput(Scanner input, String prompt) {
int value;
while (true) {
System.out.print(prompt);
if (input.hasNextInt()) {
value = input.nextInt();
break;
} else {
System.out.println("Provide a valid whole number.");
input.next();
}
}
return value;
}

public static boolean getYesNoInput(Scanner input, String prompt) {
boolean choice;
while (true) {
System.out.print(prompt);
String response = input.next().toLowerCase();
if (response.equals("yes")) {
choice = true;
break;
} else if (response.equals("no")) {
choice = false;
break;
} else {
System.out.println("Enter 'yes' or 'no'.");
}
}
return choice;
}
}
