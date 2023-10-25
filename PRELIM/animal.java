import java.util.Scanner;
public class Animal

{
public static void main (String a[])
{
Scanner scan = new Scanner(System.in);

System.out.println ("WHAT DOES THE ANIMAL SAYS?????");

System.out.println ("CHOOSE AN ANIMAL BELOW: ");

System.out.println("1. puppy\n2. kitty\n3. cow\n4. fox\n INPUT NUNBER: ");

int response = scan.nextInt();

switch(response)
{
case 1:
response =1;
puppy dog= new puppy();
dog.displayName();
break;

case 2:
response =2;
kitty cat= new kitty();
cat.displayName();
break;

case 3:
response =3;
cow cows= new cow();
cows.displayName();
break;

case 4:
response =4;
fox foxies= new fox();
foxies.displayName();
break;

default:
System.out.println("Invalid");
return;
}
}
}
class puppy
{
public void displayName()
{
System.out.println("Animal: puppy \nSound: Aw Aw");
}
}
class kitty extends puppy
{
public void displayName ()
{
System.out.println("Animal: kitty \nSound: meowww meoww");
}
}
class cow extends puppy
{
public void displayName ()
{
System.out.println("Animal: cow \nSound: moo moo");
}
}

class fox extends puppy
{
public void displayName ()
{
System.out.println("Animal: fox \nSound: ding ding");
}
}
