public class pesquisa {
    public static void main(String[] args){
        int odd, even, male, female = 0;
        for (int i = 0; i < 100; i++);
            if (i % 2 == 0){
                even += 1;
                female += 1;
            } else {
                odd += 1;
                male += 1;
            }

        System.out.printf("Male: %d \n Female: %d", male, female);
        System.out.printf("Liked: %d \n Didnt Liked: %d", even, odd);
    }
}
