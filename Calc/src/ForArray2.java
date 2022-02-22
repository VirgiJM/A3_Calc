/* Este Java Class nos generar� 10 n�meros aleatorios y a continuaci�n, los ordenar� de menor a mayor. This java class will generate 10 random numbers. */	
import java.util.Random;

	 public class ForArray2 {
	 
public static void main(String[] args) {
				int[] numbers = generateNumbers();
				print2Console("N�meros sorteados: ", numbers);
				numbers = sort(numbers);
				print2Console("N�meros ordenados: ", numbers);
			}


			private static int[] sort(int[] numbers) {
				for (int i = 0; i < numbers.length - 1; i++) {
					for (int j = i + 1; j < numbers.length; j++) {
						if (numbers[i] > numbers[j]) {
							int auxiliary = numbers[i];
							numbers[i] = numbers[j];
							numbers[j] = auxiliary;
						}
					}
				}
				return numbers;
			}

			private static int[] generateNumbers() {
				Random random = new Random();
				int[] numbers = new int[10];
				for (int i = 0; i < numbers.length; i++) {
					numbers[i] = random.nextInt(100);
				}
				return numbers;
			}

			private static void print2Console(String message, int[] numbers) {
				System.out.print(message);
				for (int number : numbers) {
					System.out.print(number + " ");
				}
				System.out.println();
			}
		}

