public class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public boolean isAdult() {
            return age >= 18;
        }

        public String getName() {
            return name;
        }
    }

