public class Algorithms {


    /*
    --- Сортировка пузырьком ---
Алгоритм пузыря - это простой алгоритм сортировки, который работает следующим образом:

Сравниваются два соседних элемента.
Если левый элемент больше правого, то элементы меняются местами.
Процесс сравнения и перестановки повторяется до тех пор, пока не будет сделано ни одного обмена.

    Алгоритм пузыря имеет следующие преимущества:

    Простота реализации.
    Эффективность для небольших массивов.
    Однако алгоритм пузыря имеет и следующие недостатки:

    Низкая эффективность для больших массивов.
    Нестабильность.
    Стабильность алгоритма сортировки означает, что элементы, равные между собой, сохраняют свой порядок после сортировки.

    Алгоритм пузыря не является стабильным.
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /*
Алгоритм сортировки выбором - это простой алгоритм сортировки, который работает следующим образом:

На каждом шаге алгоритма находится минимальный элемент в неотсортированной части массива.
Минимальный элемент меняется местами с первым элементом неотсортированной части массива.
Шаги 1 и 2 повторяются до тех пор, пока весь массив не будет отсортирован.
Алгоритм сортировки выбором имеет следующие преимущества:

Простота реализации.
Эффективность для небольших массивов.
Однако алгоритм сортировки выбором имеет и следующие недостатки:

Низкая эффективность для больших массивов.
Нестабильность.
Стабильность алгоритма сортировки означает, что элементы, равные между собой, сохраняют свой порядок после сортировки.

Алгоритм сортировки выбором не является стабильным.
     */
    public static int[] choiceSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    /*

    Алгоритм сортировки вставками - это простой алгоритм сортировки, который работает следующим образом:

На каждом шаге алгоритма берется один элемент из неотсортированной части массива.
Этот элемент вставляется в отсортированную часть массива на его место.
Шаги 1 и 2 повторяются до тех пор, пока весь массив не будет отсортирован.

Алгоритм сортировки вставками имеет следующие преимущества:

Простота реализации.
Эффективность для небольших массивов.
Стабильность.
Стабильность алгоритма сортировки означает, что элементы, равные между собой, сохраняют свой порядок после сортировки.

Алгоритм сортировки вставками является стабильным.

     */

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    int gap = array.length / 2;

    // Сортировка Шелла
    public static int[] shellSort(int[] arr) {
        int[] array = arr;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
               for (int c = right - gap; c >= 0; c -= gap) {
                   if (array[c] > array[c + gap]) {
                       swap(array, c, c + gap);
                   }
                }
            }
    
            gap = gap / 2;
        }
        return array;
    }

    public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            
            if (leftMarker <= rightMarker) {
                
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

}
