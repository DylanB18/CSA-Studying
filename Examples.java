import java.util.List;
import java.util.ArrayList;

public class Examples {
		public static void main(String[]args) {
			//Searching
        String ELS = "DECA 2021 ELS is in DC";
        System.out.println(ELS);
        System.out.println(ELS.indexOf("2"));

				DECAOfficer Dylan = new DECAOfficer(17, "Dylan", 4000);
				System.out.println(Dylan.getAge());
				System.out.println(Dylan.getName());


			boolean a = true;
			System.out.println(a);

			int[] numbers = new int[4];
			int[][] moreNumbers = new int[4][4];
			int[][] presetNumbers = {{9, 5, 4},
															 {3, 0, 0},
															 {6, 4, 0}
														 };

		 	Print2DArray(presetNumbers);
    }

		static void Print2DArray(int[][] arr) {
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.print("\n");
			}
		}
}
