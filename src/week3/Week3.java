package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if (m >= n) return m;

        else

            return n;
    }

    public static int minOfArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        return array[0];
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     *
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá

        double bmi;
        bmi = weight / (height * height);
        if (bmi < 18.5)
            return "Thieu can";
        if (18.5 < bmi && bmi < 23)
            return "Binh thuong";
        else if (23 <= bmi && bmi < 24.99)
            return "Thua can";
        else
            return "Beo phi";
    }
}
