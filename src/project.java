public class project {
    public static void main(String[] args) {
        final int programmer = 10;
        final int tester = 2;
        final int serviceDesc = 3;

        final int allTester = programmer * tester;
        final int allServiceDesc = programmer * serviceDesc;

        final int allSotrudniki = programmer + allTester + serviceDesc;

        System.out.println("programmer = " + programmer);
        System.out.println("tester = " + tester);
        System.out.println("serviceDesc = " + serviceDesc);

        System.out.println("allTester = " + allTester);
        System.out.println("allServiceDesc = " + allServiceDesc);

        System.out.println("allSotrudniki = " + allSotrudniki);
    }
}
