class Main {
    public static void main(String[] args) {

        Person daniel = new Person();
        System.out.println(String.format("Hello my name is %s", daniel.name));
        System.out.println(String.format("I am %d", daniel.age));
        System.out.println(String.format("My hometown is %s", daniel.home));
    }

}