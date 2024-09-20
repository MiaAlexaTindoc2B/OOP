class Activity {
public static void main(String[] args) {
    
  Dog puppy = new Dog();

  puppy.setName("Snowball");

  System.out.println(puppy.showName());
  System.out.println();

  puppy.isMale = true;

  System.out.print(puppy.showName() + " is a MAle: " + puppy.isMale);

  System.out.println();

  puppy.bark();
  System.out.println();

  puppy.setListOfPuppies(new String[] {"Max","Buddy","Cooper","Cohen","Ace"})

  puppy.setNumOfPuppies(numofPuppy:4);

  System.out.println(" My Dog " + puppy.showName() + " friends are " + puppy.showNumberOfPuppies());
  puppy.showPuppies();
  System.out.println();

   }
}