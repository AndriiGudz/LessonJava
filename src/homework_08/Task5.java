package homework_08;

public class Task5 {
    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Twenty", "Hell", "world"};

        String longesStr = strings[0];

        int i = 0;
        while (i < strings.length){
            String currentElem = strings[i];
            if (currentElem.length() > longesStr.length()){
                longesStr = currentElem;
            }
            i++;
        }

        System.out.println(longesStr);
    }
}
