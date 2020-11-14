/**
 * @ClassName: Test
 * @Description: TODO
 * @Create by: 房文辉
 * @Date: 2020/11/14 22:33
 */


public class Test {
    public void reOrderArray(int[] array) {
        int k = 0;
        int len = array.length-1;
        for(int i = 0;i <= len; i++) {
            while(i < len && array[i]%2 == 1) {
                i++;
            }
            // i 找到偶数
            k = i+1;
            while(k < len && array[k]%2 == 1) {
                i++;
            }
            if(i < len) {
                int tmp = array[i];
                array[i] = array[len];
                array[len] = tmp;
            }
        }
    }
    public static void main(String[] args) {

    }
}
