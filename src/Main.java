import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int intArr[] = { 10, 20, 15, 22, 35 };
        System.out.println("Integer Array as List: "
                + Arrays.asList(intArr)+"\n");


        int intArr2[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(intArr2); // 10 15 20 22 35

        int intKey = 22;
        System.out.println(
                intKey + " найдено по индексу = "
                        + Arrays.binarySearch(intArr2, intKey)+"\n");


        int intArr3[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(intArr3); // 10 15 20 22 35

        int intKey3 = 22;
        System.out.println(
                intKey3
                        + " найдено по индексу = "
                        + Arrays
                        .binarySearch(intArr3, 1, 3, intKey3)+"\n");


        int intArr4[] = { 10, 20, 15, 22, 35 };
        int intArra4[] = { 10, 15, 22 };
        System.out.println("Целочисленные массивы при сравнении: "
                + Arrays.compare(intArr4, intArra4)+"\n");


        int intArr5[] = { 10, 20, 15, 22, 35 };
        int intArra5[] = { 10, 15, 22 };
        System.out.println("Целочисленные массивы при сравнении: "
                + Arrays.compareUnsigned(intArr5, intArra5)+"\n");


        int intArr6[] = { 10, 20, 15, 22, 35 };
        System.out.println("Integer Array: "
                + Arrays.toString(intArr6));

        System.out.println("\nNew Arrays by copyOf:\n");

        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOf(intArr6, 10))+"\n");


        int intArr7[] = { 10, 20, 15, 22, 35 };
        System.out.println("method copyOfRange(): " +
                "Integer Array: "
                + Arrays.toString(intArr7));

        System.out.println("\nNew Arrays by copyOfRange: ");
        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOfRange(intArr7, 1, 3))+"\n");


        int intArr8[][] = { { 10, 20, 15, 22, 35 } };
        int intArray8[][] = { { 10, 15, 22 } };
        System.out.println("method deepEquals(): ");
        System.out.println("Целочисленные массивы при сравнении: "
                + Arrays.deepEquals(intArr8, intArray8)+"\n");


        int intArr9[][] = { { 10, 20, 15, 22, 35 } };
        System.out.println("method deepHashCode: ");
        System.out.println("Integer Array: "
                + Arrays.deepHashCode(intArr9)+"\n");


        int intArr10[][] = { { 10, 20, 15, 22, 35 } };
        System.out.println("method deepToString(): ");
        System.out.println("Integer Array: "
                + Arrays.deepToString(intArr10)+"\n");


        int intArr11[] = { 10, 20, 15, 22, 35 };
        int intArra11[] = { 10, 15, 22 };
        System.out.println("method equals(): ");
        System.out.println("Целочисленные массивы при сравнении: "
                + Arrays.equals(intArr11, intArra11)+"\n");


        int intArr12[] = { 10, 20, 15, 22, 35 };
        int intKey12 = 22;

        Arrays.fill(intArr12, intKey12);
        System.out.println("method fill(): ");
        System.out.println("Целочисленный массив при заполнении: "
                + Arrays.toString(intArr12)+"\n");


        int intArr13[] = { 10, 20, 15, 22, 35 };
        System.out.println("method hashCode(): ");
        System.out.println("Integer Array: "
                + Arrays.hashCode(intArr13)+"\n");


        int intArr14[] = { 10, 20, 15, 22, 35 };
        int intArra14[] = { 10, 15, 22 };
        System.out.println("method mismath(): ");
        System.out.println("The element mismatched at index: "
                + Arrays.mismatch(intArr14, intArra14)+"\n");


        int intArr15[] = { 10, 20, 15, 22, 35 };
        Arrays.parallelSort(intArr15);
        System.out.println("method parallelSort(): ");
        System.out.println("Integer Array: "
                + Arrays.toString(intArr15)+"\n");


        int intArr16[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(intArr16);
        System.out.println("method sort(): ");
        System.out.println("Integer Array: "
                + Arrays.toString(intArr16)+"\n");


        int intArr17[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(intArr17, 1, 3);
        System.out.println("method sort(originalArray, fromIndex, endIndex): ");
        System.out.println("Integer Array: "
                + Arrays.toString(intArr17)+"\n");
    }
}