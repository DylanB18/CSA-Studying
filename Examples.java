import java.util.ArrayList;

public class Examples {
		public static void main(String[]args) {
			//Searching
        String ELS = "DECA 2021 ELS is in DC";
        System.out.println(ELS);
        System.out.println(ELS.indexOf("2"));

			//Gotta remember it's boolean not bool from C++
			boolean a = true;
			System.out.println("a is " + a);

			int[] numbers = new int[4];
			int[][] moreNumbers = new int[4][4];
			int[][] presetNumbers = {{9, 5, 4},
															 {3, 0, 0},
															 {6, 4, 0}
														 };

		 	Print2DArray(presetNumbers);


			//ArrayLists
			ArrayList<String> container = new ArrayList<String>();
			container.add("Frank Ocean");
			container.add("Andre 3000");
			System.out.println("Size: " + container.size());
			System.out.println(container.get(0));
			System.out.println(container.get(1));
			container.remove(1);
			System.out.println("Size: " + container.size());
			container.set(0, "Kendrick Lamar");
			System.out.println(container.get(0));
			System.out.println(container);

			//Wrapper Classes
			ArrayList<Integer> intStorage = new ArrayList<Integer>();
			intStorage.add(1);
			System.out.println(intStorage);

			//Storing anything in ArrayLists
			ArrayList<Object> allStore = new ArrayList<Object>();
			allStore.add("Test");
			allStore.add(1);

			//Math Stuff
			System.out.println("Random: " + Math.random());
			System.out.println("Sqrt of 25: " + Math.sqrt(25));
			System.out.println("Abs. Val. of -5: " + Math.abs(-5));

			//While Loops
			int x = 0;

			while(x < 10) {
				System.out.print(x);
				x++;
			}
			System.out.print("\n");

			//Enhanced for loops
			container.add("Frank Ocean");
			container.add("Andre 3000");
			for(String s : container) {
				System.out.println(s);
			}

			//Object Instantiation and Inheritance Examples
			DECAOfficer Dylan = new DECAOfficer(16, "Dylan", 4000);
			System.out.println("Dylan Name: " + Dylan.getName());
			System.out.println("Dylan Age: " + Dylan.getAge());
			System.out.println("Updating...");
			Dylan.setAge(17);
			System.out.println("Dylan Age: " + Dylan.getAge());

			//Polymorphism Test
			Person Bob = new Person(25, "Bob");
			System.out.println(Bob);
			System.out.println(Dylan);
    }

		//Making a static method
		static void Print2DArray(int[][] arr) {
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.print("\n");
			}
		}
}
